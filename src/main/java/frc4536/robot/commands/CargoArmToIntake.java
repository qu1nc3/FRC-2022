package frc4536.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc4536.robot.Constants.CargoArmInfo;
import frc4536.robot.subsystems.CargoArm;

public class CargoArmToIntake extends CommandBase {

  private final CargoArm m_cargoArm;

  public CargoArmToIntake(CargoArm cargoArm) {
    m_cargoArm = cargoArm;
    addRequirements(m_cargoArm);
  }

  @Override
  public void execute() {
    double currentShoulderPos = m_cargoArm.getShoulderPosition();
    double currentElbowPos = m_cargoArm.getElbowPosition();
    double targetElbowPos = 
        (currentShoulderPos - CargoArmInfo.CARGOARM_SHOULDER_INTERMEDIATE_POSITION)
        * CargoArmInfo.CARGO_ARM_ELBOW_TO_SHOULDER_RATIO_ABOVE_INTERMEDIATE
        + CargoArmInfo.CARGOARM_ELBOW_INTERMEDIATE_POSITION;

    if (currentShoulderPos > CargoArmInfo.CARGOARM_SHOULDER_INTERMEDIATE_POSITION) {
      m_cargoArm.moveShoulder(-CargoArmInfo.CARGO_ARM_SHOULDER_DEFAULT_POWER);
      m_cargoArm.moveElbow(CargoArmInfo.CARGO_ARM_ELBOW_DEFAULT_POWER * ((targetElbowPos - currentElbowPos) / (3000)));
    } else if (currentShoulderPos > CargoArmInfo.CARGOARM_SHOULDER_RESTING_POSITION) {
      if (currentElbowPos > CargoArmInfo.CARGOARM_ELBOW_RESTING_POSITION) {
        m_cargoArm.moveElbow(-CargoArmInfo.CARGO_ARM_ELBOW_DEFAULT_POWER);
      } else
        m_cargoArm.moveElbow(0.0);
      m_cargoArm.moveShoulder((-CargoArmInfo.CARGO_ARM_SHOULDER_DEFAULT_POWER) / 2);
    } else {
      m_cargoArm.moveShoulder(0.0);
      if (currentElbowPos < CargoArmInfo.CARGOARM_ELBOW_INTAKE_ELBOW_POSITION) {
        m_cargoArm.moveElbow(CargoArmInfo.CARGO_ARM_ELBOW_DEFAULT_POWER);
      } else {
        m_cargoArm.moveElbow(0.0);
      }
    }
  }

  @Override
  public void end(boolean interrupted) {
    m_cargoArm.moveElbow(0.0);
    m_cargoArm.moveShoulder(0.0);
  }
}

package frc4536.robot.commands.autos;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc4536.robot.commands.CargoArmToResting;
import frc4536.robot.commands.CargoArmToUpper;
import frc4536.robot.commands.DriveBackwards;
import frc4536.robot.commands.CargoArmToIntake;
import frc4536.robot.commands.DriveForward;
import frc4536.robot.commands.OutputCargo;
import frc4536.robot.commands.TurnRobot;
import frc4536.robot.subsystems.CargoArm;
import frc4536.robot.subsystems.CargoHandler;
import frc4536.robot.subsystems.DriveTrain;
import frc4536.robot.subsystems.Gyroscope;

public class autosTest extends SequentialCommandGroup {

    public autosTest  (DriveTrain driveTrain, CargoArm cargoArm, CargoHandler cargoHandler, Gyroscope gyroscope) {

        addCommands(/*new CargoArmToUpper(cargoArm).deadlineWith(getDontMove(driveTrain)),
                    new OutputCargo(cargoHandler).withTimeout(4).deadlineWith(getDontMove(driveTrain)),
                    new CargoArmToResting(cargoArm).deadlineWith(getDontMove(driveTrain)),
                    new TurnRobot(driveTrain, 90, gyroscope));*/
                    new DriveForward(driveTrain, 4, gyroscope),
                    new DriveBackwards(driveTrain, gyroscope, 4));

    }

    private Command getDontMove(DriveTrain driveTrain){
        return new RunCommand(()->driveTrain.stopDriving(),driveTrain);
    }
}
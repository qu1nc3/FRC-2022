// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc4536.robot;

import java.util.ArrayList;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.trajectory.TrajectoryGenerator;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.Command;
import frc4536.robot.commands.ExampleCommand;
import frc4536.robot.subsystems.ExampleSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {


    // Configure the button bindings
    configureButtonBindings();
    generatePoseCheckTrajectory();

    ShuffleboardTab auto = Shuffleboard.getTab("Autonomous");

  
  }
  private void generatePoseCheckTrajectory(){
    var poseCheckWaypoints = new ArrayList<Pose2d>();
    poseCheckWaypoints.add(Poses.SCORE_ONE);
    poseCheckWaypoints.add(Poses.BALL_ONE);
    poseCheckWaypoints.add(Poses.BALL_TWO);
    poseCheckWaypoints.add(Poses.BALL_THREE);
    poseCheckWaypoints.add(Poses.BALL_FOUR);
    poseCheckWaypoints.add(Poses.SCORE_TWO);
    poseCheckWaypoints.add(Poses.BALL_FIVE);
    poseCheckWaypoints.add(Poses.BALL_SIX);
    poseCheckWaypoints.add(Poses.BALL_SEVEN);
    poseCheckWaypoints.add(Poses.BALL_EIGHT);
    poseCheckWaypoints.add(Poses.SCORE_THREE);
    poseCheckWaypoints.add(Poses.BALL_NINE);
    poseCheckWaypoints.add(Poses.BALL_TEN);
    poseCheckWaypoints.add(Poses.SCORE_FOUR);
    poseCheckWaypoints.add(Poses.BALL_ELEVEN);
    poseCheckWaypoints.add(Poses.BALL_TWELVE);
    //TODO: add drive train to robot containor to finish generating trajectory 
    //t_poseCheck = TrajectoryGenerator.generateTrajectory(poseCheckWaypoints, m_driveTrain);
  }

  private void generateBlueAuto1Trajectory1(){
    var blueOneOneWaypoints = new ArrayList<Pose2d>();
    blueOneOneWaypoints.add(Poses.BALL_TWO);
    blueOneOneWaypoints.add(Poses.BALL_THREE);
    blueOneOneWaypoints.add(Poses.SCORE_ONE);
    //t_blueAutoOneOne = Trajectorygenerator.generateTrajectory(blueOneOneWaypoints, m_driveTrain);
  }


  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}

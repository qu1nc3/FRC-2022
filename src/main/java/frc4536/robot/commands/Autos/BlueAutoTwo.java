package frc4536.robot.commands.Autos;

import frc4536.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.trajectory.Trajectory;

public class BlueAutoTwo extends SequentialCommandGroup {
   //TODO: add input and output subsytem
    public BlueAutoTwo(DriveTrain driveTrain, Pose2d initialPose, Trajectory blueAutoTwoTrajectoryOne){
    //TODO: add intake and output command 
        addCommands(
            driveTrain.scurveTo(blueAutoTwoTrajectoryOne)
        );
    }
    @Override
    public String getName() {
        return "Blue Auto Two";
    }
}
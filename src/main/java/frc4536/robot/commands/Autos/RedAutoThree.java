package frc4536.robot.commands.Autos;

import frc4536.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.trajectory.Trajectory;

public class RedAutoThree extends SequentialCommandGroup {
    public RedAutoThree(DriveTrain driveTrain, Pose2d initialPose, Trajectory redAutoThreeTrajectoryOne, Trajectory redAutoThreeTrajectoryTwo){
        addCommands(
            driveTrain.scurveTo(redAutoThreeTrajectoryOne),
            driveTrain.scurveTo(redAutoThreeTrajectoryTwo)
        );
    }
    
}
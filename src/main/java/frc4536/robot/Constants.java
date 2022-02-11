// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc4536.robot;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

// TODO: find clicks per wheel rotation to calculate clicks per inch and clicks per degree

    public static final class RobotInfo{
        private static final double DRIVE_WHEEL_DIAMETER = 6.0;
        public static final double WHEEL_CIRCUMFERENCE_IN_INCHES = DRIVE_WHEEL_DIAMETER * Math.PI;
        private static final double DRIVE_ENCODER_CLICKS_PER_ROTATION = 1.0;
        public static final double CLICKS_PER_INCH = WHEEL_CIRCUMFERENCE_IN_INCHES / DRIVE_ENCODER_CLICKS_PER_ROTATION;

       private static final double INCHES_WIDTH_OF_AXLE = 22.0;
       private static final double INCHES_LENGTH_OF_AXLE = 24.0;
        private static final double DIAGONAL_INCHES_BETWEEN_AXES = Math.sqrt((INCHES_WIDTH_OF_AXLE * INCHES_WIDTH_OF_AXLE) + (INCHES_LENGTH_OF_AXLE * INCHES_LENGTH_OF_AXLE)) ;
        private static final double ROBOT_ROTATION_CIRCUMFERENCE = DIAGONAL_INCHES_BETWEEN_AXES * Math.PI;
        public static final double DRIVE_ENCODER_CLICKS_PER_DEGREE = ROBOT_ROTATION_CIRCUMFERENCE / CLICKS_PER_INCH / 360;
    }
    
   public static final class DriveInfo {
      //TODO: add max acceleration and max velocity
      public static final int LEFT_FRONT_DRIVE_MOTOR_ID = 1;
      public static final int LEFT_REAR_DRIVE_MOTOR_ID = 2;
      public static final int RIGHT_FRONT_DRIVE_MOTOR_ID = 4;
      public static final int RIGHT_REAR_DRIVE_MOTOR_ID = 3;

      public static final MotorType DRIVE_MOTOR_BRUSHED_TYPE = MotorType.kBrushed;

      public static final boolean LEFT_DRIVE_MOTORS_ARE_INVERTED = true;
      public static final boolean RIGHT_DRIVE_MOTORS_ARE_INVERTED = false;

      public static final double DIFFERENTIAL_DRIVE_DEADBAND = 0.08;

      public static final int LEFT_DRIVE_ENCODER_CHANNEL_A = 0;
      public static final int LEFT_DRIVE_ENCODER_CHANNEL_B = 1;
      public static final int RIGHT_DRIVE_ENCODER_CHANNEL_A = 2;
      public static final int RIGHT_DRIVE_ENCODER_CHANNEL_B = 3;

      public static final EncodingType DRIVE_MOTOR_ENCODER_ENCODINGTYPE = EncodingType.k2X;
      
      public static final double RAMSETE_B_TUNING_PARAMETER = 2.0;
      public static final double RAMSETE_ZETA_TUNING_PARAMETER = 0.7;

      public static final double SCURVE_TO_KS = 0.5;
      public static final double SCURVE_TO_KV = 0.5;
      public static final double SCURVE_TO_KA = 0.5;
      
   }
}


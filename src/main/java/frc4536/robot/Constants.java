// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc4536.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final static class CargoMoverInfo{
        public final static int CARGO_MOVER_ELBOW_ID = 1;
        public final static int CARGO_MOVER_SHOULDER_ID = 2;
        public final static int CHANNEL_A_CARGO_MOVER_SHOULDER_ENCODER = 4;
        public final static int CHANNEL_B_CARGO_MOVER_SHOULDER_ENCODER = 5;
        public final static boolean CARGO_MOVER_SHOULDER_ENCODER_INVERT = true ;
        public final static int CHANNEL_A_CARGO_MOVER_ELBOW_ENCODER = 9;
        public final static int CHANNEL_B_CARGO_MOVER_ELBOW_ENCODER = 10;
        public final static boolean CARGO_MOVER_ELBOW_ENCODER_INVERT = true; 


    }
 
}

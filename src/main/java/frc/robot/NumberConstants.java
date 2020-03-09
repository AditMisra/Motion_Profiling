package frc.robot;

public class NumberConstants {
    //Drivetrain Constants
    public static final double SLOWING_CONSTANT = 2;
    public static final double TURNING_CONSTANT = 1.3;
    //Encoder Constants
    public static final int kSlotIdx = 0;
    public static final int kPIDLoopIdx = 0;
    public static final int kTimeoutMs = 30;
    public static final Gains kGains = new Gains(1.7, 0.01, 30, .5, 50, 0.0);
    //motion profiling constants
    public static final int inch_to_ticks=233;//233*distance in inches produces distance in encoder ticks
    public static final int deg_to_ticks=11;//running both motors in opposite direction at 11 ticks produces a 1 degree rotation
}
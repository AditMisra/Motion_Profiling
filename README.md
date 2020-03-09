# Motion_Profiling
A sample of "motion magic" source code used for FIRST Robotics programming. 

### Overview of Motion Profiling-Specific Code ###
[DriveTrain](https://github.com/AditMisra/Motion_Profiling/blob/master/src/main/java/frc/robot/subsystems/DriveTrain)
The DriveTrain code runs the drive train subsystem of the robot. This sample allows the user to operate manual control of the drivebase `drive() method`,  move forward under a defined motion profile `moveForward() method`, and turn under a defined motion profile `turn() method`. For the motion profiled movements, the user enters either the intended distance in inches (straight line motion) or the intended rotation in degrees (turning). Upon initialization, the DriveTrain code initializes the motor controllers and the magnetic encoders, as well as the motion profiling parameters to be used throughout the game. The encoders are initialized and configured, and the motion profiling constants are imported. These constants include the gains (kP, kF, kI and kD constants, experimentally defined), the acceleration and cruise velocities (to serve as a maximum acceleration and speed in the motion profiles, experimentally defined), and the strength of the S-curve (the smoothness of the motion profile). 
When the motion magic methods are called (imported from the `com.ctre.phoenix library`) these constants are used to calculate the motion curve (smoothed trapezoidal motion) and sent to the motor controllers. This calculation is done directly on the roboRio.

[Gains](https://github.com/AditMisra/Motion_Profiling/blob/master/src/main/java/frc/robot/Gains.java)
The Gains class is a placeholder for the kP, kI, kF, and kD constants used in motion profiling. These constants are set to fine-tune the closed loop accuracy of the motion profiling and reduce any overshoot caused by the physics acting on the robot. They can change depending on the motors used, the surface driven on (friction), and the shape/balance of the robot. In our case, they were determined experimentally, through testing and fine-tuning. 

[NumberConstants](https://github.com/AditMisra/Motion_Profiling/blob/master/src/main/java/frc/robot/NumberConstants.java)
The NumberConstants class holds the constants used during the robot drive. Drivetrain constants are used for manual drive. Encoder Constants are used in motion profiling (see `Gains`). Motion magic constants are used to convert distance (inches) and turns (degrees) into the units used by the magnetic encoders to allow for code readability. 

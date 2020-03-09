
package frc.robot.robotModes;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.TeleDrive;

public class Teleop extends CommandGroup {

    public Teleop() {
        addParallel(new TeleDrive());
    }
    
}
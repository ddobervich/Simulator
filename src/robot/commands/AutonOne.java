package robot.commands;

import simulator.CommandGroup;

public class AutonOne extends CommandGroup {

	public AutonOne() {
		this.addSequential(new DriveDistance(3));
		this.addSequential(new ContinuousTurn(Math.PI/8));
	}
}

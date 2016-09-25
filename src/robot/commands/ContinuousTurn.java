package robot.commands;

import robot.Robot;
import simulator.Command;

public class ContinuousTurn extends Command {
	private double turnAngle;
	
	public ContinuousTurn(double angle) {
		this.turnAngle = angle;
	}

	@Override
	public void initialize() {
		Robot.driveTrain.setMotorSpeeds(1, -1);
	}

	@Override
	public void execute() {
	}

	@Override
	public boolean isFinished() {
		return true;
	}

	@Override
	public void end() {
	
	}

}
package robot.commands;

import robot.Robot;
import robot.RobotMap;
import simulator.Command;

/*
 * Drives a certain distance in inches
 */
public class DriveDistance extends Command {
	private double desiredDistance = 0;
	private double initialDistance;
	// debug constants
	private int count;
	
	/*
	 * @param Distance must be in inches
	 */
	public DriveDistance(double distance) {
		requires(Robot.driveTrain);
		initialDistance = Robot.driveTrain.getAverageDistance();
		this.desiredDistance = distance + initialDistance;
		this.count = 0;
	}

	protected void initialize() {
		RobotMap.debug(2, "move-initialize()");
		Robot.driveTrain.setMotorSpeeds(0.6, 0.6);
	}

	protected void execute() {
		
	}

	protected boolean isFinished() {
		return (Robot.driveTrain.getAverageDistance() - initialDistance) >= desiredDistance;
	}

	protected void end() {
		Robot.driveTrain.setMotorSpeeds(0, 0);
		RobotMap.debug(1, "move-end()" + "\tcommand ended");
	}
}
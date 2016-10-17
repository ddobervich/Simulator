package robot;

import robot.RobotMap.Direction;
import robot.commands.AutonOne;
import robot.commands.DriveFor;
import robot.subsystems.DriveTrain;
import simulator.Scheduler;

public class Robot {
	public static DriveTrain driveTrain;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		RobotMap.init();
		driveTrain = new DriveTrain();
	}

	public void autonomousInit() {
			
		Scheduler.getInstance().add(new DriveFor(5, RobotMap.Direction.BACKWARD));
		
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		
	}

	public void teleopInit() {
	
	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
	
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {
		
	}
}
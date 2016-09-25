package robot.subsystems;

import robot.RobotMap;
import simulator.DoubleSolenoid;
import simulator.Subsystem;

public class Intake extends Subsystem {
	DoubleSolenoid solenoid = RobotMap.intakeSolenoid;

	public double currentSpeed = 0.3;
	public boolean isOpen = true; 
	public boolean toggleOn=false;

	public void initDefaultCommand() {

	}

	public void closeClaw() {
		solenoid.set(RobotMap.close);
		isOpen = false;
	}

	public void openClaw() {
		solenoid.set(RobotMap.open);
		isOpen = true;
	}

	public boolean isOpen() {
		return (solenoid.get()==RobotMap.open);
	}

	public void setIntakeRollers() {
		
	}
}
package simulator;

import processing.core.PApplet;
import processing.core.PVector;
import robot.Robot;

public class Sim extends PApplet {
	private static Sim sim;
	
	private float dt = 1.0f/25f;
	private Robot robot;
	
	private double time = 0;
	
	public void setup() {
		size(800, 800);
		sim = this;
		
		robot = new Robot();
		robot.robotInit();
		robot.autonomousInit();
	}
	
	public void draw() {
		time += dt;
		
		background(255);
		robot.autonomousPeriodic();
		
		RobotModel.getInstance().update();
		RobotModel.getInstance().draw();
	}
	
	public float dt() {
		return dt;
	}
	
	public double getTime() {
		return time;
	}

	public static Sim getInstance() {
		return sim;
	}
}
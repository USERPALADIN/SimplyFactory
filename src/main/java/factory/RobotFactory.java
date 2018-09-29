package factory;

import robot.Robot;
import robotImpl.Galiaf;
import robotImpl.R2D2;

public class RobotFactory {
	
	public static Robot createRobot(int kind){
		switch (kind){
			case 0: return new R2D2();
			case 1: return new Galiaf();
			default: return null;
		}
	}
}

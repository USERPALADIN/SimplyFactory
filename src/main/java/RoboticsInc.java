import factory.RobotFactory;
import robot.Robot;

public class RoboticsInc {
	
	public void makeRobot(int kind) {
		Robot robot = RobotFactory.createRobot(kind);
		generateSerialNumber(robot);
		boxing(robot);
		sendToClient(robot);
	}
	
	public void generateSerialNumber(Robot robot) {
		robot.setSerialNumber((int) (Math.random() * 100));
	}
	
	public void boxing(Robot robot) {
		robot.setBox("Paper box");
	}
	
	public void sendToClient(Robot robot) {
		System.out.println("Robot name is " + robot.getName());
		System.out.println("Boxing in " + robot.getBox());
		System.out.println("Factory serial number: " + robot.getSerialNumber());
		System.out.println();
	}
}

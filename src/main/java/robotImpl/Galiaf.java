package robotImpl;

import robot.Robot;

public class Galiaf implements Robot {
	
	String box;
	Integer sn;
	
	@Override
	public String getName() {
		return "Galiaf";
	}
	
	@Override
	public void setBox(String box) {
		this.box = box;
	}
	
	@Override
	public String getBox() {
		return box;
	}
	
	@Override
	public void setSerialNumber(Integer sn) {
		this.sn = sn;
	}
	
	@Override
	public Integer getSerialNumber() {
		return sn;
	}
}

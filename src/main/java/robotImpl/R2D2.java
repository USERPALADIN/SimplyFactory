package robotImpl;

import robot.Robot;

public class R2D2 implements Robot {
	
	Integer sn;
	String box;
	
	@Override
	public String getName() {
		return "R2D2";
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

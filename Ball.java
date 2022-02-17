// Tevfik Tarýk Alim 042001033 16/02/2022 Instructor: Mustafa Ersen COMP110 LAB 1 ASSIGNMENT
public class Ball {

	private double x;
	private double y;
	private double vx;
	private double vy;
	private double r;

	public Ball(double x, double y, double vx, double vy, double r) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.r = r;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getR() {
		return r;
	}

	public void move() {
		x = vx + x;
		y = vy + y;
	}

}

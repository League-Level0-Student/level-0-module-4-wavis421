import org.jointheleague.graphical.robot.Robot;

public class ModuloRingSolution {
	Robot rob = new Robot();
	
	void go() {
		rob.penDown();
		rob.setSpeed(100);
		rob.moveTo(200, 300);
		rob.hide();
		for (int i = 0; i < 72; i++) {
			if (i%6 == 0)
				rob.setRandomPenColor();
			drawShape(5);
			rob.move(20);
			rob.turn(5);
		}
	}
	
	void drawShape(int numSides) {
		for (int i = 0; i < numSides; i++) {
			rob.move(100);
			rob.turn(360/numSides);
		}
	}

	public static void main(String[] args) {
		new ModuloRingSolution().go();
	}
}

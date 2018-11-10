import org.jointheleague.graphical.robot.Robot;

public class ModuloRing {
	// 1. Create a new Robot
	
	void go() {
		// 2. Move robot to 200, 300 (you may need to adjust this)
		//    Hint: use moveTo or setX, setY
		
		// 3. Hide your robot (optional)
		
		// 7. Do the following steps (7, 4, 5) 72 times

			// 8. Use MODULO to set a new random pen color every 6 shapes

			// 5. Call the drawShape method; choose the number of sides for your shape
			
			// 6. Move the robot 20 pixels, then turn 5 degrees

	}
	
	void drawShape(int numSides) {
		// 4. Write a for loop that will draw a shape with 'numSides' sides
		//    Hint: turn 360/numSides
	}

	public static void main(String[] args) {
		new ModuloRing().go();
	}
}


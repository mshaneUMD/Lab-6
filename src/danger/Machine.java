package danger;

public class Machine {
	String name;
	Goods g;

	/**
	 * Checks if the name of the good signifies that it is a danger.
	 * 
	 * @param name the name of the good
	 * @return <code>true</code> if the good is a danger, or <code>false</code> if
	 *         not.
	 */
	public boolean isDanger(String name) {
		String score[] = { "bomb", "poison", "knife", "gun" };
		boolean flag = false;
		for (int i = 0; i < score.length; i++) {
			if (name.equals(score[i])) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	void checkBag(Goods g) {
		this.g = g;
		name = g.getName();
		// add code here starting
		try {
			// Check if the good is a danger based on its name and throw a DangerException if it is.
			if(isDanger(name)) throw new DangerException(String.format("%s is found to be a danger!", name));
		} catch(DangerException e) {
			// Show the caught DangerException.
			e.toShow();
		} finally {
			// Log to the console that the finally block has been reached.
			System.out.println("Finally block reached!");
		}
		// add code here ending
	}
}

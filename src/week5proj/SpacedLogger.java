package week5proj;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String msg = "";
		for (int i = 0; i < log.length(); i++) {
			msg += log.charAt(i);
			msg += " ";
		}
		System.out.println(msg);
	}

	@Override
	public void error(String error) {
		String msg = "ERROR: ";
		for (int i = 0; i <= error.length() - 1; i++) {
			msg += error.charAt(i);
			msg += " ";
			
		}
		System.out.println(msg);
	}

}
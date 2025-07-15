package simpleProject;

public class Browser {
	public void lunchBrowser() {
		System.out.println("Browser launched successfully");
	}

	public void loadURL() {
		System.out.println("application urlloaded successfully");
	}

	public static void main(String[] args) {
		Browser obj = new Browser();
		obj.lunchBrowser();
		obj.loadURL();
	}
}

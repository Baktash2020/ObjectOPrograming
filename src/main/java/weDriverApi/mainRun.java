package weDriverApi;

public class mainRun {

	public static void main(String[] args) {


		webDriver driver2 = new chromeDriver();
		
		
		webDriver driver1 = new fireFoxDriver();
		
		driver2.findElements();
		
		driver1.findElements();

	}

}

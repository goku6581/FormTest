package commandLineRunner;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class commandLineTestRunner {

	public static void main(String[] args) {
		JUnitCore jCore = new JUnitCore();
		jCore.addListener(new TextListener(System.out));
	}
}



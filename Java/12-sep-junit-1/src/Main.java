import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MathematicsTest.class);
		List<Failure> failures = result.getFailures();
		if(result.getFailureCount()==0)
		{
			System.out.println("All test(s) passed");
		}
		for(Failure failure:failures)
		{
			System.out.println(failure);
		}
	}

}

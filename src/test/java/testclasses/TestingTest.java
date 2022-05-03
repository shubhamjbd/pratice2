package testclasses;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

 
public class TestingTest {

  @Test(timeOut=1000)
public void test1Test() throws InterruptedException {
    System.out.println("test case is runninhg");
   Thread.sleep(2000);
  }
}

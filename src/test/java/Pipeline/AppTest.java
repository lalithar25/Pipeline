package Pipeline;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void apptest() {
    	
        String expectedOutput = "Maven Application and pipeline has been Started Successfully";
        
        App.main(null);
        
        String consoleOutput = getConsoleOutput();
        
        Assert.assertEquals(consoleOutput.trim(), expectedOutput);
    }
    
    private String getConsoleOutput() {
    	
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        java.io.PrintStream printStream = new java.io.PrintStream(out);
        System.setOut(printStream);
        
        App.main(null);

        System.setOut(System.out);

        return out.toString();
    }
}

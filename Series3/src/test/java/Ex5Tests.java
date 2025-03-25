import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex5Tests {
    @Test
    public void testSolution() {
        // Redirect standard output
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(buffer, true);
        System.setOut(printStream);

        // initial test for the test to pass without implementation (as delivered to Jetbrains)
        // could be removed in the case that the solution could be entirely hidden
        String[] initargs = {"10"};
        Ex5.main(initargs);
        String initoutput = buffer.toString();
        if (initoutput.contains("Not yet implemented!")) {
            return;
        }
        buffer.reset();

        // n divisible by 5
        String[] args = {"10"};
        Ex5.main(args);
        // get output message
        String output = buffer.toString();
        final String mult5String = "n is divisible by 5";
        Assert.assertTrue("Expected solution for n == 10 should contain \"" + mult5String + "\"",
                output.contains(mult5String));
        buffer.reset();

        // n divisible by 6
        args = new String[]{"12"};
        Ex5.main(args);
        // get output message
        output = buffer.toString();
        final String mult6String = "n is divisible by 6";
        Assert.assertTrue("Expected solution for n == 12 should contain \"" + mult6String + "\"",
                output.contains(mult6String));
        buffer.reset();

        // n divisible by 5 and 6
        args = new String[]{"30"};
        Ex5.main(args);
        // get output message
        output = buffer.toString();
        final String mult5and6String = "n is divisible by 5 and by 6";
        Assert.assertTrue("Expected solution for n == 30 should contain \"" + mult5and6String + "\"",
                output.contains(mult5and6String));
        buffer.reset();

        args = new String[]{"31"};
        Ex5.main(args);
        // get output message
        output = buffer.toString();
        final String multneither5nor6String = "n is divisible by neither 5 nor 6";
        Assert.assertTrue("Expected solution for n == 31 should contain \"" + multneither5nor6String + "\"",
                output.contains(multneither5nor6String));
        buffer.reset();

    }
}

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Ex6Tests {
    @Test
    public void testSolution() {
        // Redirect standard output
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(buffer, true);
        System.setOut(printStream);

        // initial test for the test to pass without implementation (as delivered to Jetbrains)
        // could be removed in the case that the solution could be entirely hidden
        String[] initargs = {"100", "8", "2"};
        Ex6.main(initargs);
        String initoutput = buffer.toString();
        if (initoutput.contains("Not yet implemented!")) {
            return;
        }
        buffer.reset();

        // a is the biggest number
        String[] args = {"100", "8", "2"};
        Ex6.main(args);
        // get output message
        String output = buffer.toString();
        final String amaxString = "Maximum is: 100";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + amaxString + "\"",
                output.contains(amaxString));
        buffer.reset();

        // b is the biggest number
        args = new String[]{"8", "100", "2"};
        Ex6.main(args);
        // get output message
        output = buffer.toString();
        final String bmaxString = "Maximum is: 100";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + bmaxString + "\"",
                output.contains(bmaxString));
        buffer.reset();

        // c is the biggest number
        args = new String[]{"1", "2", "20"};
        Ex6.main(args);
        // get output message
        output = buffer.toString();
        final String cmaxString = "Maximum is: 20";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + cmaxString + "\"",
                output.contains(cmaxString));
        buffer.reset();

        // b is the biggest number with negative numbers
        args = new String[]{"-1", "2", "-20"};
        Ex6.main(args);
        // get output message
        output = buffer.toString();
        final String bnegmaxString = "Maximum is: 2";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + bnegmaxString + "\"",
                output.contains(bnegmaxString));
        buffer.reset();

        // c is the biggest number with only negative numbers
        args = new String[]{"-6", "-3", "-2"};
        Ex6.main(args);
        // get output message
        output = buffer.toString();
        final String negmaxString = "Maximum is: -2";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + negmaxString + "\"",
                output.contains(negmaxString));
        buffer.reset();

        // two same values
        args = new String[]{"-2", "-3", "-2"};
        Ex6.main(args);
        // get output message
        output = buffer.toString();
        final String sameValString = "Maximum is: -2";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + sameValString + "\"",
                output.contains(sameValString));
        buffer.reset();

    }
}
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Ex1Tests {
    @Test
    public void testSolution() {
        // Redirect standard output
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(buffer, true);
        System.setOut(printStream);

        // initial test for the test to pass without implementation (as delivered to Jetbrains)
        // could be removed in the case that the solution could be entirely hidden
        String[] initargs = {"10", "0", "0"};
        Ex1.main(initargs);
        String initoutput = buffer.toString();
        String[] initsplitOutput = initoutput.split("\n");
        if (initsplitOutput != null && initsplitOutput.length > 1) {
            initoutput = initsplitOutput[1];
        }
        // no '\r' on Linux
        if (initoutput.contains("Not yet implemented!")) {
            return;
        }
        buffer.reset();

        // infinite number of solutions
        String[] args = {"0", "0", "0"};
        Ex1.main(args);
        // get and check the output message
        String output = buffer.toString();
        final String infiniteString = "Infinitely many solutions";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + infiniteString + "\"",
                output.contains(infiniteString));
        buffer.reset();

        // no solution
        args = new String[]{"0", "0", "1"};
        Ex1.main(args);
        // get and check the output message
        output = buffer.toString();
        final String noSolutionString = "No solution, as : 1.0 != 0";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + noSolutionString + "\"",
                output.contains(noSolutionString));
        buffer.reset();

        // 1st degree
        args = new String[]{"0", "2", "4"};
        Ex1.main(args);
        // get and check the output message
        output = buffer.toString();
        final String firstDegreeString = "1st degree equation: x = -2.0";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + firstDegreeString + "\"",
                output.contains(firstDegreeString));
        buffer.reset();

        // discriminant == 0
        args = new String[]{"1", "2", "1"};
        Ex1.main(args);
        // get and check the output message
        output = buffer.toString();
        final String zeroDiscriminantString = "Single solution: x = -1.0";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + zeroDiscriminantString + "\"",
                output.contains(zeroDiscriminantString));
        buffer.reset();

        // discriminant > 0
        args = new String[]{"1", "3", "2"};
        Ex1.main(args);
        // get and check the output message
        output = buffer.toString();
        final String positiveDiscriminantString = "Two real solutions: x1 = -1.0, x2 = -2.0";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + positiveDiscriminantString + "\"",
                output.trim().contains(positiveDiscriminantString));
        buffer.reset();

        // discriminant < 0
        args = new String[]{"1", "2", "2"};
        Ex1.main(args);
        // get and check the output message
        output = buffer.toString();
        final String complexString1 = "Two complex solutions :";
        final String complexString2 = "x1 = (-1.0) + (1.0)i";
        final String complexString3 = "x2 = (-1.0) - (1.0)i";
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + complexString1 + "\"",
                output.contains(complexString1));
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + complexString2 + "\"",
                output.contains(complexString2));
        Assert.assertTrue("Expected solution for " + Arrays.toString(args) + " should contain \"" + complexString3 + "\"",
                output.contains(complexString3));
        buffer.reset();
    }
}
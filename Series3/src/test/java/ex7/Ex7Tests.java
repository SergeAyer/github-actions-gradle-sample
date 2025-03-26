package ex7;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex7Tests {
    @Test
    public void testSolution() {
        // Redirect standard output
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(buffer, true);
        System.setOut(printStream);

        String[] initargs = {"0"};
        MainVarA.main(initargs);
        String initoutputa = buffer.toString();
        buffer.reset();
        MainVarB.main(initargs);
        String initoutputb = buffer.toString();
        if (initoutputa.contains("Not yet implemented!") && initoutputb.contains("Not yet implemented!")) {
            return;
        }
        buffer.reset();

        // Variant A
        String[][] argsArray = {{"1"}, {"2"}, {"3"}, {"4"}, {"5"}, {"6"}, {"7"}, {"8"}};
        String[] resArray = {"Working day", "Working day", "Working day", "Working day", "Working day", "Week-end", "Week-end", "Invalid day number [1..7]"};
        for (int i = 0; i < resArray.length; i++) {
            String value = argsArray[i][0];
            // Variant A
            MainVarA.main(argsArray[i]);
            // get output message
            String output = buffer.toString();
            Assert.assertTrue("Expected solution for Variant A with value " + value + " should contain \"" + resArray[i] + "\"",
                    output.contains(resArray[i]));
            buffer.reset();

            // Variant B
            MainVarB.main(argsArray[i]);
            // get output message
            output = buffer.toString();
            Assert.assertTrue("Expected solution for Variant B with value " + value + " should contain \"" + resArray[i] + "\"",
                    output.contains(resArray[i]));
            buffer.reset();
        }
    }
}
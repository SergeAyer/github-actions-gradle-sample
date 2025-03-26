public class Ex4 {
    //----------------------------------------------------------------------------
    // Values a, b and c can be given as program arguments, otherwise they
    // will be read in dialog boxes.
    //
    // In this example, SimpleIO is not used and you have to enter arguments
    // as parameters to the main method.
    //
    // Note: with IntelliJ IDEA, program arguments can be passed via the
    //       corresponding field of the "Run/Debug configuration"
    //       (e.g. menu Run -> Edit configurations...)
    //----------------------------------------------------------------------------
    public static void main(String[] args) {
        double a = 0.0, b = 0.0, c = 0.0;
        if (args.length == 3) {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
        }

        System.out.println("Equation: ("+a+")x\u00B2 + ("+b+")x + ("+c+") == 0");
        double x1, x2, xj, discriminant;  // xj : imaginary part of the complex solution
        System.out.println("Fail");
    }
}
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
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("Infinitely many solutions");
                } else {
                    System.out.println("No solution, as : "+c+" != 0");
                }
            } else {
                x1 = -c/(double)b;
                System.out.println("1st degree equation: x = " + x1);
            }
        } else {
            discriminant = b*b-4*a*c;
            if (discriminant>0) {
                x1 = (-b + Math.sqrt(discriminant))/(2*a);
                x2 = (-b - Math.sqrt(discriminant))/(2*a);
                System.out.println("Two real solutions: x1 = " + x1 +", x2 = " + x2);
            } else if (discriminant==0) {
                x1 = -b /(double)(2*a);
                System.out.println("Single solution: x = " + x1);
            } else {
                x1 = -b/(double)(2*a);
                xj = Math.sqrt(-discriminant)/(2*a);
                System.out.println("Two complex solutions : ");
                System.out.println("x1 = ("+ x1 + ") + (" + xj + ")i, ");
                System.out.println("x2 = ("+ x1 + ") - (" + xj + ")i"  );
            }
        }
    }
}
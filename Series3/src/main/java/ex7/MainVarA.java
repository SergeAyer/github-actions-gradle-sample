package ex7;

public class MainVarA {
    //A variant
    public static void main(String[] args) {
        int n = 0;
        if (args.length == 1) {
            n = Integer.parseInt(args[0]);
        }
        //--------------------------------------------------------------------------
        //----- Variant (a) with 'if' -----
        if (n<1 || n>7) {
            System.out.println("Invalid day number [1..7]");
        } else if (n>=6) {
            System.out.println("Week-end");
        } else {
            System.out.println("Working day");
        }
    }
}
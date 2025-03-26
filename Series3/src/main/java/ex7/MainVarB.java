package ex7;

public class MainVarB {
    //B variant
    public static void main(String[] args) {
        int n = 0;
        if (args.length == 1) {
            n = Integer.parseInt(args[0]);
        }
        //--------------------------------------------------------------------------
        //----- Variant (b) with 'switch' -----
        switch (n) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Working day");
                break;

            case 6 :
            case 7 :
                System.out.println("Week-end");
                break;

            default :
                System.out.println("Invalid day number [1..7]");
                break;
        }
    }
}


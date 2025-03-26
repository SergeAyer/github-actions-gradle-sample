public class Ex6 {
    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }
        int r;
        //-----------------------------------------------
        r = a;
        if (b>r) r = b;
        if (c>r) r = c;

        System.out.println("Maximum is: " + r);
    }
}

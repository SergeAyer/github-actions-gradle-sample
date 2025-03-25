public class Ex5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        //-----------------------------------------------
        if (n%5==0  && n%6==0) {
            System.out.println("n is divisible by 5 and by 6");
        } else if (n%5==0) {
            System.out.println("n is divisible by 5");
        } else if (n%6==0) {
            System.out.println("n is divisible by 6");
        } else {
            System.out.println("n is divisible by neither 5 nor 6");
        }
    }
}

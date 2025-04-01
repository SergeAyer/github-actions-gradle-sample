public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }

        int n_teeth = Integer.parseInt(args[0]);
        int max_height = Integer.parseInt(args[1]);

        for (int teeth = 1; teeth <= n_teeth; teeth++) {
            for (int line = 1; line <= max_height; line++) {
                for (int star = 1; star <= line; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
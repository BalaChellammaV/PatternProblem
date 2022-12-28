// print pattern using two for loops
public class Pattern {
    public static void main(String[] args) {
        System.out.println("\n");
        int row, column;
        for (row = 1; row <= 6; row++) {
            for (column = 1; column <= row; column++) {

                if (row % 2 == 0)
                    System.out.print(" " + row + " ");
                else
                    System.out.print(" * ");
            }
            System.out.println("\n");
        }

    }
}
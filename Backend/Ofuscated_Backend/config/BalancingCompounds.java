import java.util.Scanner;

public class BalancingCompounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the unbalanced compound
        String compound = scanner.nextLine();

        // Input the equivalent point
        int equivalentPoint = scanner.nextInt();

        // Calculate the valencies
        int valency1 = calculateValency(compound.charAt(0));
        int valency2 = calculateValency(compound.charAt(1));

        // Find the combinations and check if they are equal to the equivalent point
        for (int i = 0; i <= equivalentPoint / valency1; i++) {
            int j = (equivalentPoint - (i * valency1)) / valency2;
            if (i * valency1 + j * valency2 == equivalentPoint) {
                System.out.println(compound.charAt(0) + i + " " + compound.charAt(1) + j);
            }
        }

        // If no combination is found
        System.out.println("Not Possible");
    }

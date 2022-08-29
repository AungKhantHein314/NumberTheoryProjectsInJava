import java.util.Scanner;

public class SumOfGeometricSeries {
    int answer;
    public static void main(String[] args) {
        new SumOfGeometricSeries().getInput();
    }

    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumberA = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Ratio Value: ");
        int ratioR = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter length of sequence: ");
        int lengthN = Integer.parseInt(scanner.nextLine());
        chooseMethod(firstNumberA, ratioR, lengthN, scanner);
    }

    void chooseMethod(int a, int r, int n, Scanner scanner) {
        System.out.println("\n*Choose Calculation Method*\n" +
                "Press 1 to Calculate Simply\n" +
                "Press 2 to Calculate By Equation");
        String method = scanner.nextLine();
        if ("1".equals(method)) {
            answer = calculateByEquation(a, r, n);
            output();
        } else if ("2".equals(method)) {
            answer = calculateSimply(a, r, n);
            output();
        } else {
            chooseMethod(a, r, n, scanner);
        }
        scanner.close();
    }

    int calculateSimply(int a, int r, int n) {
        int ans = a;
        for (int i = 1; i < n; i++) {
            ans += a * Math.pow(r, i);
        }
        return ans;
    }

    int calculateByEquation(int a, int r, int n) {
        int ans = 0;
        ans += (a * Math.pow(r, n) - a) / (r - 1);
        return ans;
    }

    void output() {
        System.out.println("\n Answer: " + answer);
    }
}
import java.util.Scanner;

public class BinomialCoefficients {
    Nfactorial factorial = new Nfactorial();
    public static void main(String[] args) {
        new BinomialCoefficients().getInput();
    }

    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fixed set number(n): ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Sub set number(k): ");
        int k = Integer.parseInt(scanner.nextLine());
        scanner.close();
        output(calculate(n, k));
    }

    int calculate(int n, int k) {
        int nfactorial = factorial.calculate(n);
        int kfactorial = factorial.calculate(k);
        int d = n - k;
        int dfactorial = factorial.calculate(d);
        return nfactorial/(kfactorial * dfactorial);
    }

    void output(int ans) {
        System.out.println("\n Answer: " + ans);
    }
}

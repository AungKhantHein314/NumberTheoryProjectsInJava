
import java.util.Scanner;

public class Nfactorial {
    public static void main(String[] args) {
        new Nfactorial().getInput();    
    }

    public Nfactorial() {
        
    }

    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n for n!");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        output(calculate(n));
    }

    int calculate(int n) {
        checkN(n);
        int answer = 1;
        for(int i = 1; i <= n; i++) {
            answer *= i;
        }
        return answer;
    }

    void checkN(int n) {
        if(n < 0) {
            System.out.println("n must be greater than or equal 0 (n >= 0)");
            System.exit(0);
        }
    }

    void output(int answer) {
        System.out.println("\n Answer: " + answer);
    }
}

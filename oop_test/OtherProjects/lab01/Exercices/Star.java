import java.util.Scanner;

public class Star {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int n = sc.nextInt();

        for (int i=n;i>=1;i--){
            for (int j=0;j<=i-1;j++){
                System.out.print(" ");
            }
            for (int k=1 ; k<= 2*(n-i) + 1 ; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

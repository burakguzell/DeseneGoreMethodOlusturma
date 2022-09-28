import java.util.Scanner;

public class Main {
    static void minusFive(int n,int tempN,int x) {

        if (tempN > 0 && x == 0) {
            System.out.print(tempN + " ");
            tempN -= 5;
            minusFive(n,tempN,0);
        } else if ((tempN == 0) || tempN <0) {

            System.out.print(tempN + " ");
            tempN += 5;
            minusFive(n,tempN,1);
        } else if (tempN >0 && tempN <= n && x == 1) {
            System.out.print(tempN + " ");
            tempN +=5;
            minusFive(n,tempN,1);
        }
    }

    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        n = input.nextInt();

        minusFive(n,n,0);
    }
}

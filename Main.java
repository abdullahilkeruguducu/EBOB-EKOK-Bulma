import java.util.Scanner;
//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz :");
        int n1 = input.nextInt();
        System.out.print("n2 sayisini giriniz :");
        int n2 = input.nextInt();
        int ebob = 1, ekok = 1;
        int i = 1;

        if (n1 < n2) {

            do {
                i++;
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                }
            } while (i <= n1);
            System.out.println("EBOB : " + ebob);
        } else {
            do {
                i++;
                if ((n2 % i == 0) && (n1 % i == 0)) {
                    ebob = i;
                }
            } while (i <= n2);
            System.out.println("EBOB : " + ebob);
        }
        do {
            i++;
            if ((i % n1 == 0) && (i % n2 == 0)) {
                ekok = i;
                break;
            }
        } while (i <= n1 * n2);
        System.out.println("EKOK : " + ekok);


    }
}
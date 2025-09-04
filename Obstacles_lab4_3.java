import java.util.Scanner;
import java.util.Random;

public class Obstacles_lab4_3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time steps : ");
        int n = sc.nextInt();
        int nn;
        int p = 0;
        int q = 0;

        System.out.println("Ali's Starting point" + 0 + "," + 0);
        System.out.println("Hasan's Starting position : " + p + "," + q);
        Random r = new Random();
        for (int i = 1; i <= n; i++){
            nn = r.nextInt(4);
            if (nn == 0)
                p++;
            if (nn == 1)
                p--;
            if (nn == 2)
                q++;
            if (nn == 3)
                q--;
            System.out.println("Hasan's Current position : " + p + "," + q);


        int[][] hurdles = {{0, 1}, {2, 2}, {3, 3}, {4, 4}, {3, 4}};
        int x = 0;
        int y = 0;

        System.out.println("press 1 for north");
        System.out.println("press 2 for south");
        System.out.println("press 3 for east");
        System.out.println("press 4 for west");

            int b = sc.nextInt();
            if (b == 1) {
                y++;
                for (int j = 0; j < 5; j++) {
                    if (hurdles[j][0] == x && hurdles[j][1] == y) {
                        System.out.println("there is hurdle");
                        y--;
                    }
                }
            }
            if (b == 2) {
                y--;
                for (int j = 0; j < 5; j++) {
                    if (hurdles[j][0] == x && hurdles[j][1] == y) {
                        System.out.println("there is hurdle");
                        y++;
                    }
                }

            }
            if (b == 3) {

                x++;
                for (int j = 0; j < 5; j++) {
                    if (hurdles[j][0] == x && hurdles[j][1] == y) {
                        System.out.println("there is hurdle");
                        x--;
                    }
                }

            }
            if (b == 4) {

                x--;
                for (int j = 0; j < 5; j++) {
                    if (hurdles[j][0] == x && hurdles[j][1] == y) {
                        System.out.println("there is hurdle");
                        x++;
                    }
                }
            }
            System.out.printf("Ali's Current Position:(%d,%d)\n", x, y);

        }


    }
}




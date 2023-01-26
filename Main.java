import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a;
        out.println("2 den bulmak istediğiniz sayıya kadar Asal sayı bulma.");
        out.print("Sayıyı giriniz : ");
        a = input.nextInt();

        if (a<=10){
            out.print("2,");
            for (int b=2;b<=10;b++){
                if (b%2==1){
                    if (b%9==0) continue;
                    out.print(b+",");
                }
            }
        }else if (a>10) {
            out.print("2,");
            for (int b=2;b<10;b++){
                if (b%2==1){
                    if (b%9==0) continue;
                    out.print(b+",");
                }
            }
            for (int i = 2; i < a; i++) {
                if (i % 2 == 1 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                    out.print(i + ",");
                }
            }
        }






    }

}


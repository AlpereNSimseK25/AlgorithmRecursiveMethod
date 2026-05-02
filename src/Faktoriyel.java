import java.util.Scanner;

public class Faktoriyel {

    public static void faktoriyel() {

        System.out.print("Faktöriyel hesabı için sayı giriniz: ");
        Scanner sc = new Scanner(System.in);
        int sayi1 = sc.nextInt();

        int f = 1;
        if (sayi1 == 0 || sayi1 == 1) {
            f = 1;
        } else if (sayi1 < 0) {
            System.out.println(sayi1 + " Faktoriyel hesaplanamaz");
        } else {
            for (int i = 1; i <= sayi1; i++) {
                f = f * i;
            }
        }
        System.out.println(sayi1 + "! = " + f);
    }

    public static void main(String[] args){

        faktoriyel();

    }


}

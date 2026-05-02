public class RecursiveMethod {
    public static int toplam(int n) {
        //base case    oncelikli olarak base case yazmak onemlidir daha sonra recursive case yazilir.
        if(n==0) {
            return 0;
        }
        // recursive case
        return n + toplam(n-1);
    }

    public static int cift_toplam(int n) {
        //base case
        if(n==0){
            return n;
        }
        //recursive case
        if(n%2 == 0) { // n cift sayiysa
            return n + cift_toplam(n-1); // n sarti sagladigi icin toplama dahil edilir ve fonksiyon dondurulur.
        }
        else { // n'in cift sayi olmadigi yani n'in tek sayi olmasi
            return cift_toplam(n-1);  // n tek sayi oldugu icin n'i bir eksiltip fonksiyonu tekrar dondurecek.
        }
    }

    public static int yazdir(int n) {
        System.out.print(n + " ");
        // base case
        if(n==1) {
            return n;
        }
        // recursive case
        return yazdir(n-1);
    }

    public static void yazdir2(int n){
        System.out.print(n + " ");
        if(n==1) {
            return;
        /* Normal kullanimlarda Void fonksiyonlarda return kullanilmaz. return bir deger dondurmek icin kullanilir .
            Burada return kullanilma sebebi programi sonlandirmak icin.
         */
        }
        yazdir2(n-1);
    }

    public static int kuvvet_al(int x, int y) {
        //base case
        if(y==0) {
            return 1;
        }
        // recursive case
        return x * kuvvet_al(x, y-1);
    }

    // Derste fibonacci sayi dizisinin 0'dan basladigini kabul ettik.
    public static int fibonacci(int n) {
        // Base Case
        if (n == 0 || n==1) {
            return n;
        }
        // recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int minRest = findMin(arr, index + 1);

        if (arr[index] < minRest) {
            return arr[index];
        } else {
            return minRest;
        }
    }

    public static void main(String[] args) {

        // Ornek1 :
        int toplam = toplam(10);
        System.out.println("10'a kadar olan sayıların toplamı : "+toplam);

        // Ornek2 :
        int result2 = cift_toplam(10);
        System.out.println("10'a kadar olan çift sayıların toplamı : "+result2);

        // Ornek3 :
        System.out.print("10'a kadar olan sayıların sırasıyla yazılışı : ");
        yazdir2(10); //System.out.println(yazdir2(10)); hatalidir cunku void fonksiyonunda deger donmuyor.
        //System.out.println(sum(10));
        System.out.println();  // Bir satir bosluk birakmak icin yapildi.

        // Ornek4 :
        int result = kuvvet_al(2,5);
        System.out.println("2^5 işleminin sonucu : "+result);

        // Ornek5 :
        int num = fibonacci(10);
        System.out.println("Fibonacci 10'un sonucu : "+num);

        // Ornek6 : 0'dan itibaren N kadar olan fibonacci serisini yazdirma.
        for(int i = 1; i <= 20; i++) {
            int fibnum = fibonacci(i);
            System.out.print("Fibonacci sayı dizisini 20 elemanını sırasıyla yazılışı : "+fibnum + " ");
        }
    }
}


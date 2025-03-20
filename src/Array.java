import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sayilar = new int[5];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("Bir sayı girin: ");
            sayilar[i] = input.nextInt();
        }
        
        System.out.println("Girilen sayılar:");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");
        }
    }
}


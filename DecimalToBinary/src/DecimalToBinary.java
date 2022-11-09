import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int number, bolum, kalan;
        System.out.print("Tamsayı giriniz: ");
        number = read.nextInt();
        bolum = number;
        int[] binaryList = new int[100];
        int i = 0;

        while (bolum != 0) {
            bolum = bolum / 2;
            kalan = number - bolum * 2;
            binaryList[i] = kalan;
            i++;
            number = bolum;
        }

        for (int m = i - 1; m >= 0; m--) {
            System.out.print(binaryList[m]);
        }
    }
}
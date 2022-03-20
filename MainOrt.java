import java.util.Scanner;

public class MainOrt {
    public static void main(String[] args) {
        Scanner not=new Scanner(System.in);

        System.out.print("Mat not gir:");
        int mat= not.nextInt();

        System.out.print("Fiz not gir:");
        int fiz = not.nextInt();

        System.out.print("Kim not gir:");
        int kim = not.nextInt();

        System.out.print("Turk not gir:");
        int turk=not.nextInt();

        System.out.print("Tar not gir:");
        int tar=not.nextInt();

        System.out.print("Muz not gir:");
        int muz= not.nextInt();

        int top = mat+fiz+kim+turk+tar+muz;

        double ort= top/6;


        System.out.println("Ortalamanız :" + ort);

        String sonuc = (ort>60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.print(sonuc);
    }
}
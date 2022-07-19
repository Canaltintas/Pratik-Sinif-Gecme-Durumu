import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat=input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik=input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce=input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya=input.nextInt();
        System.out.print("Muzik Notunuzu Giriniz : ");
        muzik=input.nextInt();



        if ((mat>100 || mat < 0)){
            System.out.println("Matematik Notu Geçersiz !");
            ort=(fizik+turkce+kimya+muzik)/4;
            System.out.println("Not Ortalamanız = " + ort);
        }else if ((fizik>100 || fizik < 0)){
            System.out.println("Fizik Notu Geçersiz !");
            ort=(mat+turkce+kimya+muzik)/4;
            System.out.println("Not Ortalamanız = " + ort);
        }else if ((turkce>100 || turkce < 0)){
            System.out.println("Türkçe Notu Geçersiz !");
            ort=(mat+fizik+kimya+muzik)/4;
            System.out.println("Not Ortalamanız = " + ort);
        }else if ((kimya>100 || kimya < 0)){
            System.out.println("Kimya Notu Geçersiz !");
            ort=(mat+fizik+turkce+muzik)/4;
            System.out.println("Not Ortalamanız = " + ort);
        }else if ((muzik>100 || muzik < 0)){
            System.out.println("Muzik Notu Geçersiz !");
            ort=(mat+fizik+kimya+turkce)/4;
            System.out.println("Not Ortalamanız = " + ort);
        }else {
            ort=(mat+fizik+turkce+kimya+muzik)/5;
            System.out.println("Not Ortalamanız = " + ort);
        }
    }
}

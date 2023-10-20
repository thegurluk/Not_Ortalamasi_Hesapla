import java.util.Scanner;
public class Hesapla {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("1.Matematik sınav notunuzu giriniz: ");
        int mat1=input.nextInt();
        System.out.println("2.Matematik sınav notunuzu giriniz: ");
        int mat2=input.nextInt();
        System.out.println("3.Matematik sınav notunuzu giriniz: ");
        int mat3=input.nextInt();
        double matTop=(mat1+mat2+mat3);
        double matOrt=matTop/3;
        System.out.println("Matematik not Ortalamanız: "+matOrt);

        System.out.println("1.Türkçe sınav notunuzu giriniz: ");
        int turkce1=input.nextInt();
        System.out.println("2.Türkçe sınav notunuzu giriniz: ");
        int turkce2=input.nextInt();
        System.out.println("3.Türkçe sınav notunuzu giriniz: ");
        int turkce3=input.nextInt();
        double turkceTop=(turkce1+turkce2+turkce3);
        double turkceOrt=turkceTop/3;
        System.out.println("Türkçe not Ortalamanız: "+turkceOrt);

        System.out.println("1.Fizik sınav notunuzu giriniz: ");
        int fizik1=input.nextInt();
        System.out.println("2.Fizik sınav notunuzu giriniz: ");
        int fizik2=input.nextInt();
        double fizikTop=(fizik1+fizik2);
        double fizikOrt=fizikTop/2;
        System.out.println("Fizik not Ortalamanız: "+fizikOrt);

        System.out.println("1.Kimya sınav notunuzu giriniz: ");
        int kimya1=input.nextInt();
        System.out.println("2.Kimya sınav notunuzu giriniz: ");
        int kimya2=input.nextInt();
        double kimyaTop=(kimya1+kimya2);
        double kimyaOrt=kimyaTop/2;
        System.out.println("Kimya not Ortalamanız: "+kimyaOrt);

        System.out.println("1.Tarih sınav notunuzu giriniz: ");
        int tarih1=input.nextInt();
        System.out.println("2.tarih sınav notunuzu giriniz: ");
        int tarih2=input.nextInt();
        double tarihTop=(tarih1+tarih2);
        double tarihOrt=tarihTop/2;
        System.out.println("Tarih not Ortalamanız: "+tarihOrt);

        System.out.println("Müzik sınav notunuzu giriniz: ");
        double muzik=input.nextDouble();
        System.out.println("müzik not ortalamanız: "+muzik);
        System.out.println("");
        System.out.println("Ortalmanız hesaplanırken Matematik ve türkçenin katsayısı 3 olarak alınacak , müziğinki 1 ve diğer derslerinki 2 olacaktır.");

        double genelOrt=(3*matOrt+3*turkceOrt+2*kimyaOrt+2*fizikOrt+2*tarihOrt+muzik)/13;
        System.out.println("Genel Ortalamanız:"+genelOrt);

        boolean gecti=genelOrt>=60;
        System.out.println("Eğer ekranda True yazarsa geçtiniz demektir, eğer false yazarsa sınıf tekarı yapmanız gerekecektir.");
        System.out.println(gecti);





    }
}

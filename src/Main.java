
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double kdv, kdvsizFiyat;
        System.out.print("Ucret tutatrini giriniz? : ");
        Scanner scanner = new Scanner(System.in);
        
        kdvsizFiyat = scanner.nextDouble();
        
        kdv = (kdvsizFiyat > 0 && kdvsizFiyat < 1000) ? 0.18 : 0.08;
        
        double kdvTutari = (kdvsizFiyat * kdv);
        
        double kdvliFiyat = (kdvsizFiyat + kdvTutari);
        
        System.out.println("KDV\'li fiyati : " + kdvliFiyat);
        System.out.println("KDV tutari : " + kdvTutari);
        
    }
}

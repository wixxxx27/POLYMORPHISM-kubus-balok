package POLYMORPHISM;

public class Output {
    public static void main(String[] args) {
        
        Balok balok = new Balok(5, 3, 2);

        Kubus kubus = new Kubus(4);

        System.out.println("============"); 
        System.out.println("    BALOK   "); 
        System.out.println("============");
        System.out.println("Volume Balok : " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok : " + balok.hitungLuasPermukaan());

        System.out.println("================"); 
        System.out.println("     KUBUS      "); 
        System.out.println("================");
        System.out.println("Volume Kubus : " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus : " + kubus.hitungLuasPermukaan());
    }
}


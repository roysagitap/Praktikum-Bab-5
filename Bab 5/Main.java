import java.util.Scanner;

class jaket {
    final private String jaketA = "Jaket A";
    final private String jaketB = "Jaket B";
    final private String jaketC = "Jaket C";
    final private int hargaA = 100000;
    final private int hargaB = 125000;
    final private int hargaC = 175000;

    public String getJaketA() {
        return jaketA;
    }

    public String getJaketB() {
        return jaketB;
    }

    public String getJaketC() {
        return jaketC;
    }

    public int getHargaA() {
        return hargaA;
    }

    public int getHargaB() {
        return hargaB;
    }

    public int getHargaC() {
        return hargaC;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        jaket jaket = new jaket();
        int total=0;

        System.out.println("- Program belanja -");
        System.out.println("Masukan quantity");
        System.out.print("Jaket A :");
        int qtyA = scan.nextInt();
        System.out.print("Jaket B :");
        int qtyB = scan.nextInt();
        System.out.print("Jaket C :");
        int qtyC = scan.nextInt();

        if(qtyA>100){
            total = (jaket.getHargaA()-5000)*qtyA;
        }else{
            total = jaket.getHargaA()*qtyA;
        }

        if(qtyB>100){
            total += (jaket.getHargaB()-5000)*qtyB;
        }else{
            total += jaket.getHargaB()*qtyB;
        }

        if(qtyC>100){
            total += (jaket.getHargaC()-15000)*qtyC;
        }else{
            total += jaket.getHargaC()*qtyC;
        }

        System.out.println("Total belanja : "+total);
    }
}
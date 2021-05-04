package untils;

import java.util.Scanner;

public class CisloDavac {

    Scanner sc = new Scanner(System.in);

    public int getCislo (){
        while (true){
            try {
                return sc.nextInt();
            }catch (Exception e){
                System.out.println("musis zadat cislo");
            }
        }}
        public void scannerEnd (){
        sc.close();
        }
}

package calculoenergia;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat; 
public class Main{
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float total= 0.0f;
       // String resp= "";
        Menu m = new Menu();
	   // do{
	     System.out.println(" Programa calculo de consumo \n"+
	     " de energia em (***Java***) ");    
         total = m.corrige();
          // System.out.print("\n Quer continuar? (s/n):");
          // resp = ler.next();
           System.out.println("-----------------------------");
       
      //  }while(resp.equals("s"));
     System.out.println(" Operação finalizada!!");
     System.out.printf(" Total: €u "+"%.2f",total);
    }
}


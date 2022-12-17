
can you deimport java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ArrayList;
import java.text.DecimalFormat; 

public class Menu{
    private boolean v2;
    private String res = "";
    
    public float corrige(){
       float valor=0.0f;
       float totvalor = 0.0f;
       int i;
       Scanner in = new Scanner(System.in);
       GetData v = new GetData();
	  
	  Meu_item lis = new Meu_item(v.getNome(),valor);
	  ArrayList<Meu_item>item = new ArrayList();
	  
	  System.out.println("-----CALCULO-ENERGIA-KW-----");
	  do{
	     System.out.print(" Nome do item: ");
	            v.setNome(in);
	     System.out.print(" Digite a potência(Watts): ");
	            v.setWatts(in);
	     System.out.print(" Digite o tempo (mint)");
	             v.setTempo(in);
	     System.out.print(" Digite quant. de dias:");
	             v.setDia(in);
	        valor = v.calculo(v.getWatts(),v.getTempo(),v.getDia(),v.getVkwh());
	        
            DecimalFormat df = new DecimalFormat("0.##");
            float vf = Float.parseFloat(df.format(valor));
            
	        item.add(new Meu_item(v.getNome(),vf));
	        totvalor += valor;
	        
	        System.out.print(" Adicionar mais?[s/n]: ");
	        do{
            res = in.next();
           
             switch(res){
                 case "s":
                    v2 = true;
                    break;
                 case "n":
                     v2=true;
                     break;
                 case "S":
                     v2= true;
                     res="s";
                     break;
                 case "N":
                     v2= true;
                     res= "n";
                     break;
            default:
                v2 = false;
            System.out.print(" Resposta Inválida! ");
            }
            }while(v2==false);    
	  }while(res.equals("s"));
	  System.out.println("-----------------------------");
        int n = item.size();
        for (i = 0; i < n; i++){
            for(Meu_item contato:item){
                i++;
	            System.out.printf (" Item: %d-%s\n",i,contato);
	        }
        }
        return totvalor;
    }
}
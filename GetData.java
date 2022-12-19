 
import java.util.Scanner;

 public class GetData{
  private   String nome;   
  private   float vKwh;
  private   float watts;
  private   int tempo;
  private   int dia;
  private boolean x;
   
    public GetData(){
       this.vKwh = 0.81f;
      
    }
    public void setNome(Scanner n){
      this.nome= n.next().toUpperCase().trim();
    }
    public String getNome(){
        return this.nome;
    }
    public void setVKwh(float v){
       this.vKwh= v; 
    } 
    public float getVkwh(){
     return this.vKwh; 
    }
    public void setWatts(Scanner w){
        do{
            try {
              x=true;
              this.watts = Float.parseFloat(w.next());
            } catch(Exception e) {
                x=false;
                System.out.print(" Digite novamente: ");
            }
        }while(x==false); 
    }
    public float getWatts(){
      return  this.watts;
    }
    public void setTempo(Scanner t){
       do{
           try {
               x=true;
               this.tempo= Integer.parseInt(t.next());
           } catch(Exception e) {
               x=false;
               System.out.print(" Digite novamente: ");
           }
       }while(x==false);
    }
    public int getTempo(){
      return this.tempo;
    }
    public void setDia(Scanner d){
       do{
           try {
              x=true;
              this.dia=Integer.parseInt(d.next());
           } catch(Exception e) {
               x=false;
               System.out.print(" Digite novamente: ");
           }
       }while(x==false);
    }
    public int getDia(){
      return this.dia;
    }
    public float calculo(float w,int t,int d,float vkwh){
      float totkwh = (w*((t/60.0f)*d)/1000)*vkwh;
      return totkwh;
    }
 }

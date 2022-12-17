
public class Meu_item{
    private String nome;
    private float valor;
    
    public Meu_item(String n,float v){
        this.nome = n;
        this.valor= v;
    }
    
    public void setNome(String n){
        this.nome= n;
    }
    public String getNome(){
        return this.nome;
    }
    public void setValor(float v){
        this.valor = v;
    }
    public float getValor(){
        return this.valor;
    }
    public String toString(){
        return ""+this.getNome()+
        " Valor: "+this.getValor();
    }
}
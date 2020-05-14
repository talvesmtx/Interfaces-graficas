public class Mostrador{
   private int valor;
   private int limite;

   public Mostrador(int limite){
      this.limite = limite;
      valor = 0;
   }

   public int getValor(){
      return this.valor;
   }

   public void incrementa(){
      this.valor = (this.valor + 1) %  this.limite;
   }

   public String mostra(){
      if(this.valor < 10){
         return "0" + valor;
      }else{
         return "" + valor;
      }
   }
} 

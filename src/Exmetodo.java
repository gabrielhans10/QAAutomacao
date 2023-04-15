public class Exmetodo {
    public static void soma(){
        int soma1 = 20;
        int soma2 =5;
        System.out.println(soma1+soma2);        
    }
    
    public static void mais (String [] args){
        soma();
    }
    
    public static int multiplicacao (){
        int multi1 = 2;
        int multi2 = 3;
        int resultado = multi1 * multi2;
        return resultado;

    }    
    public static void main(String [] args) {  
        soma();
        String nome1 = "Gabriel";
        String sobrenome = "Hans";
        String completo = nome1+sobrenome;
        System.out.println("Qual seu nome completo: " + completo);


     

}

}

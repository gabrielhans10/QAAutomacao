public class Exparametro {
    public static String texto (String nome1, String sobrenome){
        String resultado = nome1 + sobrenome;
        return resultado;
  
    }

    public static boolean maiorQueCem(int valor1, int valor2){
        int resultado = valor1 + valor2;
        if(resultado>=100){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String [] args) {  
        String nome1 = "Gabriel";
        String sobrenome = "Hans";
        String completo = nome1+sobrenome;
        int valor1 = 60;
        int valor2= 30;
        System.out.println("Qual seu nome completo: " + completo);
        System.out.println(maiorQueCem(valor1, valor2));
    }    
   
    
}

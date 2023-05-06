public class ExCasa2 {
    public static int valoresTrocados(int valor1, int valor2){
        int num = valor1;
        valor1 = valor2;
        valor2 = num;

        int[] valores = new int[2];
        valores[0] = valor1;
        valores[1] = valor2;

        return valores
    }

     /**
     * @param args
     */
    public static void main(String[] args) {
       int primeiroValor = 15;
       int segundoValor = 25;

       System.out.println("O primeiro valor é: "+valoresTrocados(primeiroValor, segundoValor) [0] +
       " \n O segundo valor é: "+valoresTrocados(primeiroValor, segundoValor)[1] ); 
    }

    @Override
    public String toString() {
        return "ExCasa2 []";
    }
}

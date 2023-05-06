public class ExCasa3 {
    public static boolean numDiviPorDois (int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int meuValor = 1234;
        System.out.println(numDiviPorDois(meuValor));
    }
}

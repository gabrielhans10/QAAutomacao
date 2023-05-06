public class ExCasa4 {
    public static void aumentarPalavrar(String palavra){
        int i = 0;
        
        while(i<5){
            System.out.println(palavra);
            i++;
        }
    }
    /**
     * @param arg
     */
    public static void main(String[] arg){
        aumentarPalavrar("Futebol");
    }
}

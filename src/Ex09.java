import javax.swing.JOptionPane;

public class Ex09 {
    public static void main(String [] args) {
        int i = 0;
        int valor = Integer.parseInt( JOptionPane.showInputDialog("Digite o primeiro numero"));
        int resultado = 0;

        while(i<=25){
            
            resultado = valor * i;
            System.out.println(resultado);
            i=i+1;
        }

    }
    
}

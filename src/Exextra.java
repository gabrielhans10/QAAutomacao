import javax.swing.JOptionPane;

public class Exextra {
    public static void main(String [] args) {   
        String Nome = ( JOptionPane.showInputDialog("Digite seu nome:"));
        String sobrenome = ( JOptionPane.showInputDialog("Digite seu sobrenome:"));
        String ultimonome = ( JOptionPane.showInputDialog("Digite seu ultimo nome:"));
        Nome = "Gabriel" ;
        sobrenome = "Hans";
        ultimonome = "Costa";
        System.out.println("seu nome é" + Nome);
        System.out.println("seu sobrenome é" + sobrenome);
        System.out.println("seu ultimo nome é" + ultimonome);


        
    

    }


    
}

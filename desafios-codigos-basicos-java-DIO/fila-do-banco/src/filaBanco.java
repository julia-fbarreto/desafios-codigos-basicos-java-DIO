import java.util.Scanner;

public class filaBanco {
    public static void main(String[] args) {
        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

//TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a posição do cliente na fila:

        for (int i = 0; i < 3; i++) {
            String nomeUsuario = nome.next();
            nomesFila[i] = String.valueOf(nomeUsuario);
        }

        for (int i = 0; i < nomesFila.length; i++) {
            System.out.println(nomesFila[i] + " - sua posição é:" + (i+1));
        }
    }
}
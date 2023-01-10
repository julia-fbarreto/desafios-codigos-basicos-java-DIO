import java.util.Scanner;

public class qualSeuTurno {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        char turno = leitor.next().toUpperCase().charAt(0);

        //TODO: Implemente uma solução para que seja impresso a saída correto do seu turno:
        switch (turno) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
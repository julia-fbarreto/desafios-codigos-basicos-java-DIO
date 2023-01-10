import java.util.Scanner;

public class mediaIdade {
    public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);

            System.out.println("Insira a primeira idade:");
            int idade1 = leitor.nextInt();

            System.out.println("Insira a segunda idade:");
            int idade2 = leitor.nextInt();

            System.out.println("Insira a terceira idade:");
            int idade3 = leitor.nextInt();

            int mediaIdade = (idade1 + idade2 + idade3) / 3;

            System.out.print("\nMédia das idades: ");
            if (mediaIdade >= 0 && mediaIdade <= 25) {
                System.out.print("Jovem!");
            } else if (mediaIdade >= 26 && mediaIdade <= 60) {
                System.out.print("Adulta!");
            } else {
                System.out.print("Idosa!");
            }
    }
}

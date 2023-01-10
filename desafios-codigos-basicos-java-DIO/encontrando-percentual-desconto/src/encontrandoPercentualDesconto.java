import java.util.Scanner;

public class encontrandoPercentualDesconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      deverá receber o valor marcado do produto
        int M = input.nextInt();

//      valor do produto com o desconto já aplicado
        int D = input.nextInt();

        //TODO:  Retorne o percentual de desconto que foi aplicado no produto
        //Porcentagem = (valor obtido x 100) / Valor total


        // int porcentagem = input.nextInt((D * 100) / M+D);
        // int porcentagem = (D * 100) / M;
        // int porcentagem = ((M-D) / M) *100;

        int valorDescontado = M-D;
        float resultado = (float) valorDescontado / M;
        System.out.println(resultado);
        int porcentagem = (int) (resultado * 100);

        System.out.println("O desconto foi de " + porcentagem + "%");
    }
}
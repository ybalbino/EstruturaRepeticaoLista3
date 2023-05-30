import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        Scanner emtrada = new Scanner(System.in);

        System.out.println("Defina o intervalo e vou calcular a soma de todos os números ímpares !");


        double numeroinicial = 0;
        double soma = 0;

        System.out.println("Digite o número ímpar inicial:");
        numeroinicial = emtrada.nextByte();

        System.out.println("Digite o número ímpar final");
        double numerofinal = emtrada.nextDouble();

        if (numeroinicial > numerofinal){
            System.out.println("Intervalo inválido!");
        }else {
            while (numeroinicial <= numerofinal) {
                System.out.println(numeroinicial);
                soma = soma + numeroinicial;
                numeroinicial += 2;
            }
        }
        System.out.println("A soma de todos os números ímpares é de: " + soma);
    }
}

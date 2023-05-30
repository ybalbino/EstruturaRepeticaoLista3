import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os números que você quer: ");
        int numero = entrada.nextInt();

        int contadorNumero = 1;
        int somaNumumero = 0;
        String somaNumPrint = "";

        System.out.println("Você escolheu " + numero + " números");
        System.out.println("----------------------------------------");

        int numeroDigitado = 0;

        while (contadorNumero <= numero){
            System.out.println("Digite o seu " + contadorNumero + "º número");

            numeroDigitado = entrada.nextInt();
            somaNumumero = somaNumumero + numeroDigitado;
            somaNumPrint = somaNumPrint + String.valueOf(numeroDigitado) + " ";
            contadorNumero++;
        }

        double mediaFinal = somaNumumero/numero;

        System.out.println("Os números digitados foram: " + somaNumPrint);
        System.out.println("A média é de: " + mediaFinal);
    }
}

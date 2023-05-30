import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 números e eu te falo qual é o menor e o qual é o maior!");
        System.out.println("-----------------------------------------------------------------");

        int contadorNumero = 1;
        String numeroPrint = "";

        int numeroDigitado = 1;
        int[] listaNumeros = new int[11];

        while (contadorNumero <= 10) {
            System.out.println("Digite o seu " + contadorNumero + "º número");

            numeroDigitado = entrada.nextInt();

            switch (contadorNumero){
                case 1:
                    listaNumeros[1] = numeroDigitado;
                    break;

                case 2:
                    listaNumeros[2] = numeroDigitado;
                    break;

                case 3:
                    listaNumeros[3] = numeroDigitado;
                    break;

                case 4:
                    listaNumeros[4] = numeroDigitado;
                    break;

                case 5:
                    listaNumeros[5] = numeroDigitado;
                    break;

                case 6:
                    listaNumeros[6] = numeroDigitado;
                    break;

                case 7:
                    listaNumeros[7] = numeroDigitado;
                    break;

                case 8:
                    listaNumeros[8] = numeroDigitado;
                    break;

                case 9:
                    listaNumeros[9] = numeroDigitado;
                    break;

                case 10:
                    listaNumeros[10] = numeroDigitado;
                    break;
            }

            numeroPrint = numeroPrint + String.valueOf(numeroDigitado) + " ";
            contadorNumero++;
        }

        System.out.println("Os números digitados foram: " + numeroPrint);

        int menorNumero = 1;

        for(int i = 1; i < 10; i++){
            for(int j = i + 1; j < 10; j++){
                if(listaNumeros[i] < listaNumeros[j]){
                    menorNumero = listaNumeros[i];
                    listaNumeros[i] = listaNumeros[j];
                    listaNumeros[j] = menorNumero;
                }
            }
        }
        int maiorNumero = 0;

        for(int i = 0; i < 10; i++){
            for(int j = i + 1; j < 10; j++){
                if(listaNumeros[i] > listaNumeros[j]){
                    maiorNumero = listaNumeros[i];
                    listaNumeros[i] = listaNumeros[j];
                    listaNumeros[j] = maiorNumero;
                }
            }
        }

        System.out.println("O menor valor digitado foi: " +  menorNumero );
        System.out.println("---------------------------------------------");
        System.out.println("O maior valor digitado foi: " + maiorNumero);

    }
}

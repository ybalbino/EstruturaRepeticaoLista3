import java.util.Scanner;
public class Atividade7 {
        public static void main(String[] args){

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite número e eu te falo se ele é primo ou não!");

            int numeroDig = entrada.nextInt();

            int divideEleMesmo = numeroDig % numeroDig;
            int dividePorAnterior = 0;

            int contador = numeroDig;
            int contaZeros = 0;

            while (contador >= 1){
                if((numeroDig % contador) == 0){
                    contaZeros = contaZeros + 1;
                }
                contador--;
            }

            if(contaZeros == 2){
                System.out.println("O número " + numeroDig + " é um número primo!");
            }else{
                System.out.println("O número " + numeroDig + " não é um número primo!");
            }

        }
}

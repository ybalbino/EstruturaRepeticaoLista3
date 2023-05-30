import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite qualquer número positivo: ");
        System.out.println("----------------------------------------------");

        int numeroPos = entrada.nextInt();

        int num = 0;
        String somaNumPrint = "";
        int somaNumero = 0;

        do{
            if(numeroPos < 0 || numeroPos == 0){
                System.out.println("Lembre-se o número precisa ser positivo!");
                numeroPos = entrada.nextInt();

            }else{num = 1;}
        }while(num == 0);

        somaNumero = numeroPos;
        somaNumPrint = String.valueOf(somaNumero) + " ";

        int numeroFic = 0;

        do {
            System.out.println("Digite um número positivo (para sair digite 0):");
            numeroPos = entrada.nextInt();
            somaNumero = somaNumero + numeroPos;
            numeroFic = numeroPos;
            somaNumPrint = somaNumPrint + String.valueOf(numeroFic) + " ";

        }while (numeroPos != 0);

        System.out.println("---------------------------------------------");
        System.out.println("Os números digitados são: " + somaNumPrint);
        System.out.println("-----------------------------------------------");
        System.out.println("E a soma desses números é: " + somaNumero);
    }

}

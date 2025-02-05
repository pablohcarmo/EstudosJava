import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contagemDeVotos = 0;
        int votos;
        int votosCand1 = 0, votosCand2 = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o número correspondente ao seu candidato:\nCandidato1: 15\nCandidato2: 20");
        keyboard.nextLine();
        if(keyboard.nextLine() == "15"){
        votosCand1++;
        System.out.println(votosCand1);
        } else if(keyboard.nextLine() == "20"){
            votosCand2++;
            System.out.println(votosCand1);
        } else {
            System.out.println("Digite um número válido");
        }
    }
}
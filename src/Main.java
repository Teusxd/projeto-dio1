import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao mundo RPG!");

         System.out.println("Nome do herói: ");
         String heroi = scanner.nextLine();

        System.out.println("Experiência: ");
        int nivelExperiencia = scanner.nextInt();

        String nivel;

        if (nivelExperiencia < 1000) {
            nivel = "Ferro";
        }else if (nivelExperiencia < 2000) {
            nivel = "Bronze";
        }else if (nivelExperiencia < 5000) {
            nivel = "Prata";
        }else if (nivelExperiencia < 7000) {
            nivel = "Ouro";
        }else if (nivelExperiencia < 8000) {
            nivel = "Platina";
        }else if (nivelExperiencia < 9000) {
            nivel = "Ascendente";
        }else if (nivelExperiencia < 10000) {
            nivel = "Imortal";
        }else {
            nivel = "Radiante";
        }
        System.out.println("O Nome do seu heroi é " + heroi + " está no nivel de " + nivel);
    }
}
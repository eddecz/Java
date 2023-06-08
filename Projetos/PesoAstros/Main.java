//Calcular peso em astros do espaço
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    float peso;
    Scanner leia = new Scanner(System.in); float peso1;

    System.out.print("Digite o seu peso: ");
    peso1 = leia.nextFloat();

    System.out.println("===========================================");
    System.out.print("Seu peso na Lua é: " + (peso1/9.81) * 1.622);
    System.out.println("===========================================");
    

    }
}
package Java.Projetos.CalcularNotas;
import java.util.Scanner;

public class NotasCalculo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ReceberNotas n = new ReceberNotas();

    System.out.print("Digite o nome da matéria: "); String materia = leia.nextLine();
    n.ValorNotas1();
    n.CalcularMedia();

    }
}
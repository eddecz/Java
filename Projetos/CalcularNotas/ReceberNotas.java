package Java.Projetos.CalcularNotas;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ReceberNotas {
    static float n1, n2, n3, n4;

    DecimalFormat dec = new DecimalFormat();

    void ValorNotas1() {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: "); n1 = leia.nextFloat();
        while (n1 > 10) {
            System.out.println("Digite uma nota menor ou igual a 10. Tente novamente");
            System.out.print("Digite a primeira nota: "); n1 = leia.nextFloat();
        }
        System.out.print("Digite a segunda nota: "); n2 = leia.nextFloat();
        while (n2 > 10) {
            System.out.println("Digite uma nota menor ou igual a 10. Tente novamente");
            System.out.print("Digite a segunda nota: "); n2 = leia.nextFloat();
        }
        System.out.print("Digite a terceira nota: "); n3 = leia.nextFloat();
        while (n3 > 10) {
            System.out.println("Digite uma nota menor ou igual a 10. Tente novamente");
            System.out.print("Digite a terceira nota: "); n3 = leia.nextFloat();
        }
        System.out.print("Digite a quarta nota: "); n4 = leia.nextFloat();
        while (n4 > 10) {
            System.out.println("Digite uma nota menor ou igual a 10. Tente novamente");
            System.out.print("Digite a quarta nota: "); n4 = leia.nextFloat();
        }
    }
    void CalcularMedia() {

        float media = (n1+n2+n3+n4)/4 ;
        System.out.println("A sua nota média é: " + dec.format(media));
    }
}


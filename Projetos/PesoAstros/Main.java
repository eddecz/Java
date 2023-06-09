import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
    float peso;
    Scanner leia = new Scanner(System.in);
    DecimalFormat formatador = new DecimalFormat();

    System.out.print("Digite o seu peso: ");
    peso = leia.nextFloat();

    System.out.println("===========================================");
    System.out.println("Seu peso na Lua seria: " + formatador.format((peso/9.807) * 1.622) + "Kg");
    System.out.println("------------------------------------");
    System.out.println("Seu peso no Sol seria: " + formatador.format((peso/9.807) * 274) + "Kg");
    System.out.println("------------------------------------");
    System.out.println("Seu peso em Mercúrio seria: " + formatador.format((peso/9.807) * 3.7) + "Kg");
    System.out.println("------------------------------------");
    System.out.println("Seu peso em Vênus seria: " + formatador.format((peso/9.807) * 8.87) + "Kg");
    System.out.println("------------------------------------");
    System.out.println("Seu peso em Marte seria: " + formatador.format((peso/9.807) * 3.71) + "Kg");
    System.out.println("------------------------------------");
    System.out.println("Seu peso em Júpiter seria: " + formatador.format((peso/9.807) * 24.79) + "Kg");
    System.out.println("------------------------------------");
    System.out.println("Seu peso em Saturno seria: " + formatador.format((peso/9.807) * 10.44) + "Kg");
    System.out.println("------------------------------------");
    System.out.println("Seu peso em Urano seria: " + formatador.format((peso/9.807) * 8.87) + "Kg");
    System.out.println("------------------------------------");
    System.out.println("Seu peso em Netuno seria: " + formatador.format((peso/9.807) * 11.15) + "Kg");
    System.out.println("------------------------------------");
    System.out.println("Seu peso em Plutão seria: " + formatador.format((peso/9.807) * 0.62) + "Kg");
    System.out.println("===========================================");
    }
}
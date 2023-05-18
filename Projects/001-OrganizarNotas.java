class Main {
  public static void main(String[] args) {

  String materia = "Matématica \n";
  float nota1 = 6.0f;
  float nota2 = 0.0f;
  float nota3 = 0.0f;
  float nota4 = 0.0f;

  System.out.println("DIGITE UMA MATÉRIA: " + materia);

    if (nota1 > 0 && nota2 == 0) {
    System.out.println("Sua média:     " + nota1 / 4);
    }
    else if (nota2 > 0 && nota3 == 0) {
    System.out.println("Sua média:     " + (nota1 + nota2) / 4);
    }
    else if (nota3 > 0 && nota4 == 0) {
    System.out.println("Sua média:     " + (nota1 + nota2 + nota3) / 4);
    }
  }
}

package Media;

/**
 * Aluno.Marcos
 */

public class CalculoMedia {

    public static void main(String[] args) {
        MediaDosAlunos();
    }

    private static void MediaDosAlunos() {
        System.out.println("***MediaDosAlunos***");
        int Nota1 = 15;
        int Nota2 = 19;
        int Nota3 = 17;
        int Nota4 = 12;
        int adicaoNotas = Nota1 + Nota2 + Nota3 + Nota4;
        System.out.println("adiçãoNotas: " + adicaoNotas);
        int media = adicaoNotas / 4;
        System.out.println("media: " + media);

        System.out.println("Média dos alunos está em :15 ");


    }
}
/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicações
 * Turma C
 */

class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getConceito() {
        if (nota >= 90) {
            return "A";
        } else if (nota >= 80) {
            return "B";
        } else if (nota >= 70) {
            return "C";
        } else if (nota >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota: " + nota + ", Conceito: " + getConceito();
    }
}

public class Atividade2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", 85);
        Aluno aluno2 = new Aluno("João", 92);
        
        System.out.println(aluno1);
        System.out.println(aluno2);
        
        aluno1.setNota(75);
        aluno1.setNome("Maria Silva");

        System.out.println("Após alteração:");
        System.out.println(aluno1);
    }
}

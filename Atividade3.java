/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicações
 * Turma C
 */

class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aplicarReajuste(double percentual) {
        salario += salario * (percentual / 100);
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$" + String.format("%.2f", salario);
    }
}

public class Atividade3 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Ana", "Desenvolvedora", 3000.00);
        Funcionario funcionario2 = new Funcionario("Carlos", "Gerente", 5000.00);

        System.out.println("Funcionários antes do reajuste:");
        System.out.println(funcionario1);
        System.out.println(funcionario2);

        double novoSalarioAna = funcionario1.aplicarReajuste(10); // 10% de reajuste
        System.out.println("\nNovo salário de Ana após 10% de reajuste: R$" + String.format("%.2f", novoSalarioAna));

        double novoSalarioCarlos = funcionario2.aplicarReajuste(5); // 5% de reajuste
        System.out.println("Novo salário de Carlos após 5% de reajuste: R$" + String.format("%.2f", novoSalarioCarlos));

        System.out.println("\nFuncionários após o reajuste:");
        System.out.println(funcionario1);
        System.out.println(funcionario2);
    }
}

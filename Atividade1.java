/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicações
 * Turma C
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Pessoa(int id, String nome, String cpf, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento;
    }
}

public class Atividade1 {
    private static List<Pessoa> pessoas = new ArrayList<>();
    private static int contadorId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir pessoa");
            System.out.println("2. Alterar dados da pessoa");
            System.out.println("3. Consultar dados da pessoa");
            System.out.println("4. Excluir dados da pessoa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Data de Nascimento (dd/mm/aaaa): ");
                    String dataNascimento = scanner.nextLine();
                    pessoas.add(new Pessoa(contadorId++, nome, cpf, dataNascimento));
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o ID da pessoa a ser alterada: ");
                    int idAlterar = scanner.nextInt();
                    scanner.nextLine();
                    Pessoa pessoaAlterar = encontrarPessoaPorId(idAlterar);
                    if (pessoaAlterar != null) {
                        System.out.print("Novo Nome: ");
                        pessoaAlterar.setNome(scanner.nextLine());
                        System.out.print("Novo CPF: ");
                        pessoaAlterar.setCpf(scanner.nextLine());
                        System.out.print("Nova Data de Nascimento: ");
                        pessoaAlterar.setDataNascimento(scanner.nextLine());
                        System.out.println("Dados alterados com sucesso!");
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID da pessoa a ser consultada: ");
                    int idConsultar = scanner.nextInt();
                    Pessoa pessoaConsultar = encontrarPessoaPorId(idConsultar);
                    if (pessoaConsultar != null) {
                        System.out.println(pessoaConsultar);
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID da pessoa a ser excluída: ");
                    int idExcluir = scanner.nextInt();
                    Pessoa pessoaExcluir = encontrarPessoaPorId(idExcluir);
                    if (pessoaExcluir != null) {
                        pessoas.remove(pessoaExcluir);
                        System.out.println("Pessoa excluída com sucesso!");
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);
    }

    private static Pessoa encontrarPessoaPorId(int id) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }
}

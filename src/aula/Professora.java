package aula;

//A classe Professora herda de Pessoa e implementa a interface Pagavel
public class Professora extends Pessoa implements Pagavel {
    private double salario;
    private String disciplina;

    //Construtor da classe Professora
    public Professora(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    // Implementação do método abstrato exibirInfo da classe Pessoa
    @Override
    public void exibirInfo() {
        System.out.println("Professora: " + nome + ", Idade: " + idade + ", Disciplina: " + disciplina);
    }

    // Implementação do método calcularPagamento da interface Pagavel
    @Override
    public double calcularPagamento() {
        return salario;
    }
}

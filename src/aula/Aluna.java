package aula;

//A classe Aluna herda de Pessoa e implementa a interface Pagavel
public class Aluna extends Pessoa implements Pagavel {
    private String curso;
    private double mensalidade;

    //Construtor da classe Aluna
    public Aluna(String nome, int idade, String curso, double mensalidade) {
        super(nome, idade);
        this.curso = curso;
        this.mensalidade = mensalidade;
    }

    // Implementação do método abstrato exibirInfo da classe Pessoa
    @Override
    public void exibirInfo() {
        System.out.println("Aluna: " + nome + ", Idade: " + idade + ", Curso: " + curso);
    }

    // Implementação do método calcularPagamento da interface Pagavel
    @Override
    public double calcularPagamento() {
        return mensalidade;
    }
}

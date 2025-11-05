package aula;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //metodo abstrato - deve ser implementado nas classes filhas
    public abstract void exibirInfo();

    //getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

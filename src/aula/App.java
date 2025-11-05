package aula;

// Classe principal para executar o programa
public class App {
    // Método main
    public static void main(String[] args) {
        // Criando objetos das classes Aluna e Professora
        Pessoa aluna = new Aluna("Sthefany", 27, "Redes de Computadores", 1200);
        Pessoa professora = new Professora("Andreia", 40, "Programação Java", 5000);

        // Exibindo informações
        aluna.exibirInfo();
        professora.exibirInfo();

        // Polimorfismo em ação:
        Pagavel p1 = (Pagavel) aluna;
        Pagavel p2 = (Pagavel) professora;

        // Calculando e exibindo pagamentos
        System.out.println("Mensalidade da aluna: R$ " + p1.calcularPagamento());
        System.out.println("Salário da professora: R$ " + p2.calcularPagamento());
    }
}

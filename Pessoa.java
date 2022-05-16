public class Pessoa {
    private String nome;
    private int idade;
    private Double altura;

    public Pessoa(String nome, int idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public Double getAltura() {
        return altura;
    }
}

package maven.locadora;

/**
 *
 * @author gcall
 */
public class Carro {
    private String categoria;
    private String descricao;
    private String nome;
    private String marca;
    private double preco;

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }
    
    
    
    public Carro(String categoria, 
            String descricao, 
            String nome,
            String marca,
            double preco){
        this.categoria = categoria;
        this.descricao = descricao;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
}

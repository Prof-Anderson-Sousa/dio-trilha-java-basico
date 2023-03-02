package maven.locadora;

/**
 *
 * @author gcall
 */
public class Alugar {
    private Carro carro;
    String data_ent;
    String data_sai;
    
    public Alugar(Carro carro){
        this.carro = carro;
    }
    
    public void RealizarAluguel(String data_ent, String data_sai){
       this.data_ent = data_ent;
       this.data_sai = data_sai;
    }
    
    public void RealizarDevolucao(String data_sai){
       this.data_sai = data_sai;
    }
    
    public double pagamento(){
        int diarias = Integer.parseInt(data_sai) - Integer.parseInt(data_ent);
        return carro.getPreco() * diarias;
    }
    
}

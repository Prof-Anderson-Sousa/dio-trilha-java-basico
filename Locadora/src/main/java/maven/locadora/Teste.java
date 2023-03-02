package maven.locadora;

/**
 *
 * @author gcall
 */
public class Teste {

    public static void main(String[] args) {
        
        System.out.println(args[1]);

        Carro carro1 = new Carro("prem", "comp", "uno", "fiat", 120);
        Carro carro2 = new Carro("int", "comp", "celta", "gm", 100);
        Carro carro3 = new Carro("ent", "comp", "punto", "fiat", 80);

        Alugar alugar1 = new Alugar(carro1);
        alugar1.RealizarAluguel("1", "3");
        alugar1.RealizarDevolucao("3");
        System.out.println(alugar1.pagamento());
    }
}

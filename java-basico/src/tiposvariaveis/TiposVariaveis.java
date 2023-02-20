package tiposvariaveis;

/**
 *
 * @author Anderson
 */
public class TiposVariaveis {
    public static void main(String[] args) {
        // Dados Primitivos em Java
        String _string = "Deus é Fiel"; // Armazena uma sequência de caracteres
        boolean _boolean = true; // O tipo de dado boolean é usado para armazenar somente dois possíveis valores: verdadeiro e falso
        byte _byte = -128; // Sua faixa de valor está entre -128 até 127
        short _short = -32768; // Sua faixa de valor está entre -32.768 até 32.767
        int _int = 214748; // Sua faixa de valor está entre -2.147.483.648 até 2.147.483.647
        long _long = 922337203; // Sua faixa de valor está entre -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807
        float _float = 87630519; // O tipo de dado float é um ponto flutuante IEEE 754 de 32 bits de precisão única
        double _double = 87682847; // O tipo de dado double é um ponto flutuante IEEE 754 de 64 bits de precisão dupla
        char _char = 'a'; // O tipo de dado char é um único caractere unicode de 16 bits.
        
        // Armazenando Dados Pessoais
        String nome = "Anderson de Sousa Soares";
        String endereco = "Rua Desportista Waldomiro Silva, 450";
        byte idade = 22;
        char estadoCivil = 'S';
        float salario = 1302.00f;
        System.out.println("Nome:" + nome);
        System.out.println("Endereco:" + endereco);
        System.out.println("Idade:" + idade);
        System.out.println("Estado Civil:" + estadoCivil);
        System.out.println("Salario:" + salario);    
    }
    
}

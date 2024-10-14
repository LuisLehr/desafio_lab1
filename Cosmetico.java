public class Cosmetico extends Loja {

    // Atributos da Classe Comestico
    private double taxaComercializacao;

    // Método construtor da classe Cosmetico
    public Cosmetico (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double taxaComercializacao, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos); // Importando os atributos da classe Loja
        this.taxaComercializacao = taxaComercializacao;
    }

    // Métodos getters
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }

    // Métodos setters
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao; 
    } 
    
    // Método toString da classe Cosmetico
    public String toString(){
        return (super.toString()) + "\nTaxa de comercialização: " + taxaComercializacao;
    }
}

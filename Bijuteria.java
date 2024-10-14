public class Bijuteria extends Loja {
    
    // Atributos da Classe Bijuteria
    private double metaVendas;

    // Método construtor da Classe Bijuteria
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double metaVendas, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;
    }

    // Métodos getters
    public double getMetaVendas(){
        return metaVendas;
    }

    // Métodos setters
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    // Método toString da classe Bijuteria
    public String toString(){
        return (super.toString()) + "\nMeta de vendas: " + metaVendas;
    }
}

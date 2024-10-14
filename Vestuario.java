public class Vestuario extends Loja {

    // Atributos da Classe Vestuario
    private boolean produtosImportados;

    // Método construtor da Classe Vestuario
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, boolean produtosImportados, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos); // Importando os atributos da Classe Loja
        this.produtosImportados = produtosImportados;
    }

    // Métodos getters
    public boolean getProdutosImportados(){
        return produtosImportados;
    }

    // Métodos setters
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    // Método toString da classe Vestuario
    public String toString(){
        return (super.toString()) + "\nProdutos importados: " + produtosImportados;
    }
}

public class Alimentacao extends Loja {

    // Atributos da Classe Alimentacao
    private Data dataAlvara;

    // Método Construtor da Classe Alimetacao
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, Data dataAlvara, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos); // Importando os atributos da Classe Loja
        this.dataAlvara = dataAlvara;
    }

    // Métodos getters
    public Data getDataAlvara(){
        return dataAlvara;
    }

    // Métodos setters
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    // Método toString da classe Alimentacao
    public String toString(){
        return (super.toString()) + "\nData do alvará: " + dataAlvara;
    }
}

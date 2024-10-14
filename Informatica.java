public class Informatica extends Loja{

    // Atributos da Classe Informatica
    double seguroEletronicos;
    
    // Método construtor da Classe Informatica
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double seguroEletronicos, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos); // Importando os atributos da Classe Loja
        this.seguroEletronicos = seguroEletronicos;
    }

    // Métodos getters
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    // Métodos setters
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    // Método toString da Classe Informatica
    public String toString(){
        return (super.toString()) + "\nSeguro eletrônico: " + seguroEletronicos;
    }
}
public class Loja {
    
    // Atributos da classe Loja
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;
    private Produto[] estoqueProdutos;

    // Primeiro construtor, inicia todos os atributos da classe Loja
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int quantidadeMaximaProdutos){
        this.nome= nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    // Segundo construtor, inicia Nome e define salarioBaseFuncionario como -1
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataDeFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public Loja(Object nome2, int quantidadeFuncionarios2, Object object, Object endereco2, Object dataDeFundacao2,
            Object object2) {
    }

    // Métodos getters
    public String getNome(){
        return nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public Data getDataFundacao(){
        return dataDeFundacao;
    }

    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    // Métodos setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataDeFundacao){
        this.dataDeFundacao = dataDeFundacao;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }

    // Método que calcula o gasto com salário da loja
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        else{
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }
    
    // Método que retorna o tamanho da loja de acordo com a quantidade de funcionários
    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';
        }

        if (quantidadeFuncionarios < 31){
            return 'M';
        }

        else {
            return 'G';
        }
    }

    // Método que imprime os dados dos Produtos da loja
    public void imprimeProdutos(){
        for (Produto produto : estoqueProdutos){
            if (produto != null){
                System.out.println(produto.toString());
            }
        }
    }

    // Método que insere um produto em um posição vazia do array
    public boolean insereProduto(Produto produtoTeclado){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null){
                estoqueProdutos[i] = produtoTeclado;
                return true;
            }
        }
        return false;
    }

    // Método que remove um produto do array
    public boolean removeProduto(String produtoParaRemover){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(produtoParaRemover)){
                estoqueProdutos[i] = null;
                return true;
            }
        }
    return false;
    }

    // Método toString da primeira classe Loja
    public String toString(){
        return "INFORMAÇÕES DA LOJA" + "\nNome: " + this.nome + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios + "\nSalário base dos funcionários: " + this.salarioBaseFuncionario +
        "\nEndereço: " + this.endereco.toString() + "\nData de fundação: " + this.dataDeFundacao + "\nProdutos:" + this.estoqueProdutos;
    }
}

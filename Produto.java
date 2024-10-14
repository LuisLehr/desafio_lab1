public class Produto {
    
    // Atributos da classe Produto
    private String nome;
    private double preco;
    private Data dataValidade;

    // Construtor da classe Produto
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;  
        this.dataValidade = dataValidade;
    }

    // Métodos getters
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public Data getDataValidade(){
        return dataValidade;
    }

    // Métodos setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDataValidade(Data dataDeValidae){
        this.dataValidade = dataDeValidae;
    }

    // Método que verifica se o produto está vencido ou não
    public boolean estaVencido(Data dataRecebida){

        if (dataRecebida.getAno() < dataValidade.getAno()){
            return false;
        }

        else if (dataRecebida.getAno() == dataValidade.getAno()){
            if (dataRecebida.getMes() < dataValidade.getMes()){
                    return false;    
            }
            else if (dataRecebida.getMes() == dataValidade.getMes()){
                if (dataRecebida.getDia() <= dataValidade.getDia()){
                    return false;
                }
            }
        }
            
        return true;  
    }

    // Método toString da classe produto
    public String toString(){
        return "INFORMAÇÕES DO PRODUTO" + "\nNome: " + nome + "\nValor: R$ " + preco + "\nData de Validade: " + dataValidade;
    }
}

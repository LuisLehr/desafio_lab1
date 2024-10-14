public class Shopping {

    // Atributos da classe Shopping
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Método construtor que inicia todos os atributos da classe
    public Shopping (String nome, Endereco endereco, int quantidadeMaximaLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    // Métodos getters
    public String getNome (){
        return nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public Loja[] getLojas(){
        return lojas;
    }
    
    // Métodos setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }

    // Método que insere uma loja no array Loja[] lojas
    public boolean insereLoja(Loja lojaTeclado){
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] == null){
                lojas[i] = lojaTeclado;
                return true;
            }
        }
    return false; 
    }

    // Método que remove uma loja do array Loja[] lojas
    public boolean removeLoja(String lojaParaRemover){
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] != null && lojas[i].getNome().equals(lojaParaRemover)){
            lojas[i] = null;
            return true;
            }
        }
    return false;    
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int total = 0;
        switch(tipoLoja){

            case "Cosmético":
            for (int i = 0; i < lojas.length; i++){
                if (lojas[i] instanceof Cosmetico) total++;
            }
            break;

            case "Informática":
            for (int i = 0; i < lojas.length; i++){
                if (lojas[i] instanceof Informatica) total++;
            }
            break;
            
            case "Bijuteria":
            for (int i = 0; i < lojas.length; i++){
                if (lojas[i] instanceof Bijuteria) total++;
            }
            break;

            case "Alimentação":
            for (int i = 0; i < lojas.length; i++){
                if (lojas[i] instanceof Alimentacao) total++;
            }
            break;

            case "Vestuário":
            for (int i = 0; i < lojas.length; i++){
                if (lojas[i] instanceof Vestuario) total++;
            }
            break;
        }    
        return total;
    }

    public Informatica lojaSeguroMaisCaro(){
        double maiorValor = 0.0;
        Informatica lojaInformatica = null;
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] instanceof Informatica && ((Informatica)lojas[i]).getSeguroEletronicos() > maiorValor){
                    lojaInformatica = (Informatica)lojas[i];
                    maiorValor = lojaInformatica.getSeguroEletronicos();
            }
        }
    return lojaInformatica;    
    }   

    @Override
    public String toString(){
        return "INFORMAÇÕES DO SHOPPING" + "\nNome: " + this.nome + "\nEndereço: " + this.endereco + "\nLojas: " + this.lojas;
    }

}
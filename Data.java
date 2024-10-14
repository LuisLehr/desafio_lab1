public class Data {

    // Atributos da classe Data
    private int dia;
    private int mes;
    private int ano;

    // Método construtor da classe Data
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

            // Verificando se a data é válida
            if ((mes < 1 || mes > 12)){
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
                System.out.println("ERRO! Data inválida!");
            }

            else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)){
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
                System.out.println("ERRO! Data inválida!");
            }

            else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 1 || dia > 31)){
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
                System.out.println("ERRO! Data inválida!");
            }

            if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)){
                if ((mes == 2) && (dia < 1 || dia > 29)){
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                    System.out.println("ERRO! Data inválida!");
                }
            }
      
            else {
                if ((mes == 2) && (dia < 1 || dia > 28)){
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                    System.out.println("ERRO! Data inválida!");
                }
            }
    }    
    
    // Métodos getters
    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    //Métodos setters
    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    // Método que verifica se o ano é bissexto
    public boolean verificaAnoBissexto(){
        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)){
            return true; 
        }

        else{
            return false;
        }  
    }

        // Método toString da classe Data
    public String toString(){
        return "Data: " + getDia() + "/" + getMes() + "/" + getAno();
    }
}
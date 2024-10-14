import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        // Criando umo objeto do tipo Data
        Data data1 = new Data(1, 1, 1);

        // Data utilizada como parâmetro para verificar se o produto está vencido
        Data data2 = new Data(20, 10, 2023);

        // Criando um objeto do tipo Endereço
        Endereco endereco1 = new Endereco(null, null, null, null, null, null, null);

        // Criando um objeto do tipo Loja
        Loja loja1 = new Loja(null, 0, null, null, null, null);

        // Criando um objeto do tipo Produto
        Produto produto1 = new Produto(null, 0, null);

        // Criando um variável com valor pré definido que será alterado pelo usuário
        int op = 1;

        // Iniciando a classe Scanner
        Scanner Teclado = new Scanner(System.in);

        // Iniciando o looping while
        while (op > 0 && op < 4){

            System.out.println("=========================");
            System.out.println("[1] Criar uma loja.");
            System.out.println("[2] Criar um produto.");
            System.out.println("[3] Sair");
            System.out.println("=========================");
            System.out.print("Digite a opção desejada: ");
            op = Teclado.nextInt();

            // Repetindo as perguntas caso a resposta seja inválida
            while (op < 1 || op > 3){

                System.out.println("");
                System.out.println("=========================");
                System.out.println("     Opção inválida.");
                System.out.println("=========================");
                System.out.println("[1] Criar uma loja.");
                System.out.println("[2] Criar um produto.");
                System.out.println("[3] Sair");
                System.out.println("=========================");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();
            } 

            // Cadastrando uma Loja
            if (op == 1){

                System.out.println("");
                System.out.println("Vamos cadastrar a loja!");

                System.out.print("Nome da loja: ");
                String novoNome = Teclado.nextLine();
                Teclado.nextLine();
                loja1.setNome(novoNome);

                System.out.print("Quantidade de funcionários: ");
                int novaQuantidade = Teclado.nextInt();
                loja1.setQuantidadeFuncionarios(novaQuantidade);

                System.out.print("Salário base dos funcionários: ");
                double novoSalario = Teclado.nextDouble();
                Teclado.nextLine();
                loja1.setSalarioBaseFuncionario(novoSalario);

                System.out.println("Endereço.");
                System.out.print("Rua: ");
                String novaRua = Teclado.nextLine();
                endereco1.setNomeDaRua(novaRua);

                System.out.print("Cidade: ");
                String novaCidade = Teclado.nextLine();
                endereco1.setCidade(novaCidade);

                System.out.print("Estado: ");
                String novoEstado = Teclado.nextLine();
                endereco1.setEstado(novoEstado);

                System.out.print("País: ");
                String novoPais = Teclado.nextLine();
                endereco1.setPais(novoPais);

                System.out.print("CEP: ");
                String novoCep = Teclado.nextLine();
                endereco1.setCep(novoCep);

                System.out.print("Número: ");
                String novoNumero = Teclado.nextLine();
                endereco1.setNumero(novoNumero);

                System.out.print("Complemento: ");
                String novoComplemento = Teclado.nextLine();
                endereco1.setComplemento(novoComplemento);
            } 
        
            // Cadastrando um Produto
            else if (op == 2){

                System.out.println("");
                System.out.println("Vamos cadastrar o produto!");
            
                System.out.print("Nome: ");
                String novoNome = Teclado.nextLine();
                Teclado.nextLine();
                produto1.setNome(novoNome);

                System.out.print("Preço: ");
                double novoPreco = Teclado.nextDouble();
                Teclado.nextLine();
                produto1.setPreco(novoPreco);

                System.out.println("Digite abaixo a data de validade do produto: ");
                System.out.print("Dia: ");
                int novoDia = Teclado.nextInt();
                data1.setDia(novoDia);

                System.out.print("Mês: ");
                int novoMes = Teclado.nextInt();
                data1.setMes(novoMes);

                System.out.print("Ano: ");
                int novoAno = Teclado.nextInt();
                data1.setAno(novoAno);

                produto1.setDataValidade(data1);
            }

            // Saindo do laço de repetição
            else {
                System.out.println("Saindo...");
                break;
            }
        }    

        // Verificando se o produto cadastrado está vencido ou não
        if (op == 3){

            if (produto1.estaVencido(data2) == true){
                System.out.println("PRODUTO NÃO VENCIDO");
            }

            else {
                System.out.println("PRODUTO VENCIDO");
            }
        }

        // Fechando a classe Teclado
        Teclado.close();
    }
}

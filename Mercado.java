import java.text.DecimalFormat;
import java.util.Scanner;

public class Mercado{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int loop = 10, size = 5;

        Produto produtos[] = new Produto[size];

        int i;

        produtos[0] = new Produto(101);
        produtos[1] = new Produto(202, "Jogo RPG");
        produtos[2] = new Produto(303, "Jogo FPS", 15);
        produtos[3] = new Produto(404, "Jogo Simulador", 10, "Jogo", 249.99);
        produtos[4] = new Produto(404, "Jogo Simulador", 7, "Jogo", 249.99);
        
        int cod, qtd;

        while(loop != 0){
            System.out.println("Escolha uma opção (0 para sair) :\n1 - Comprar e alterar valor\n2 - Comprar e não alterar valor\n3 - Consultar produto\n4 - Alterar produto\n5 - Verfica se igual\n6 - Vender produto\n");
            loop = Integer.parseInt(sc.nextLine());

            switch(loop){
                case 0:
                break;

                case 1:
                    System.out.println("Digite o código, a quantidade e o novo valor: ");
                    cod = Integer.parseInt(sc.nextLine());
                    qtd = Integer.parseInt(sc.nextLine());
                    int value = Integer.parseInt(sc.nextLine());

                    for(i = 0; i<size; i++){
                        if(cod == produtos[i].cod){
                            produtos[i].quant = qtd;
                            produtos[i].preco = value;
                        }
                    }
                    
                break;

                case 2:
                    System.out.println("Digite o código e a quantidade: ");
                    cod = Integer.parseInt(sc.nextLine());
                    qtd = Integer.parseInt(sc.nextLine());

                    for(i = 0; i<size; i++){
                        if(cod == produtos[i].cod){
                            produtos[i].quant = qtd;
                        }
                    }
                break;

                case 3:
                    System.out.println("Digite o código para identificação: ");
                    cod = Integer.parseInt(sc.nextLine());

                    for(i = 0; i<size; i++){
                        if(cod == produtos[i].cod){
                            System.out.println(produtos[i].toString());
                        }
                    }
                break;

                case 4:
                    System.out.println("Digite o código para identificação, o nome do produto, a quantidade, o tipo e o valor para serem modificados: ");

                    cod = Integer.parseInt(sc.nextLine());
                    String name = sc.nextLine();
                    int quantity = Integer.parseInt(sc.nextLine());
                    String type = sc.nextLine();
                    double valor = Integer.parseInt(sc.nextLine());

                    for(i = 0; i<size; i++){
                        if(cod == produtos[i].cod){
                            produtos[i].modifica(name, quantity, type, valor);
                        }
                    }

                break;

                case 5:
                    System.out.println("Digite o nome e o tipo a ser comparado: ");
                    
                    String nome = sc.nextLine();
                    String tipo = sc.nextLine();

                    for(i = 0; i<size; i++){
                        if(nome == produtos[i].nome || tipo == produtos[i].tipo){
                            System.out.println("Encontrado produto repetido, código " + produtos[i].cod + "\n");
                        }
                        else if(i == size-1){
                            System.out.println("Nenhum produto repetido encontrado.");
                        }
                    }
                break;
        
                case 6:
                    System.out.println("Digite o código e a quantidade a ser vendida: ");

                    int codigo = Integer.parseInt(sc.nextLine());
                    qtd = Integer.parseInt(sc.nextLine());
                    
                    for(i = 0; i<size; i++){
                        if(codigo == produtos[i].cod){
                            System.out.println(produtos[i].vender(qtd));
                            break;
                        }
                        else if(i == size-1){
                            System.out.println("Código não encontrado ou inválido.\n");
                        }
                    }
                break;

                default:
                    System.out.println("Opção inválida! \n");
                break;
            }
        }
    }
}
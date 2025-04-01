public class Produto{
    int cod;
    String nome;
    int quant;
    String tipo;
    double preco;

    Produto(int cod){
        this.cod = cod;
    }

    Produto(int cod, String nome){
        this.cod = cod;
        this.nome = nome;
    }

    Produto(int cod, String nome, int quant){
        this.cod = cod;
        this.nome = nome;
        this.quant = quant;
    }

    Produto(int cod, String nome, int quant, String tipo, double preco){
        this.cod = cod;
        this.nome = nome;
        this.quant = quant;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String vender(int num){
        if(quant < num){
            return "Não há estoque suficiente.";
        }
        double x = preco * num;
        quant--;
        return "Valor da venda: " + x;
    }

    public void modifica(String name, int quantity, String type, double valor){
        nome =  name;
        quant = quantity;
        tipo = type;
        preco = valor;
    }

    public String toString(){
        return "Código: " + cod + "\n" + "Nome: " + nome + "\n" + "Quantidade: " + quant + "\n" + "Tipo: " + tipo + "\n" + "Preço: " + preco;
    }

}

import java.util.Scanner;

public class Menu {
    Scanner valor = new Scanner(System.in);
    public void getMenu(){
        System.out.println("""
                     Olá! Escolha uma das opções abaixo:
                     1 - USD -> BRL |  2 - USD -> EUR |  3 - USD -> CNY
                     4 - BRL -> USD |  5 - BRL -> EUR |  6 - BRL -> CNY
                     0 - finalizar  |  7 - expandir para mais moedas
                    """);
    }

    public void getFinalizar() {
        System.out.println("""
                Gostaria de fazer uma nova operação?
                1 - Nova operação
                0 - Finalizar
                """);
    }

    public void getExpandir(){
        System.out.println("Gostaria de ver todas as opções disponíveis?");
        System.out.println("""
                            0 - Visualizar todas as opções
                            1 - Não visualizar
                            """);
    }

    public void getFinalizarText() {
        System.out.println("Finalizando a operação");
    }

    public void getInvalido(){
        System.out.println("Operação inválida.");
    }

    public void getNovaOperacao(){
        System.out.println("Nova operação");
    }

    public void getValor(){
        System.out.println("Valor: ");
    }

    public String getNextValor() {
        return valor.next();
    }

    public int getIntValor(){
        return valor.nextInt();
    }
}

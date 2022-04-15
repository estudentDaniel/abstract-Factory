import java.util.Scanner;

public class Cliente{

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    boolean condicao = true;

    System.out.println("Seja bem vindo");
     
       
        while(condicao){
            System.out.println("------------------------------------------");
            System.out.println("Opções De Chocolate");
            System.out.println("1) Garoto, 2)Nestle, 3) Lacta, 0) sair");
            int entrada =  scan.nextInt();
        switch (entrada) {
            case 1:
            Fabrica g = new Garoto();
            ProductAbstract produto = g.criarOvo();
            produto.exibirProduto();
                break;
            case 2:
            Fabrica n = new Nestle();
            ProductAbstract prodNestle = n.criarOvo();
            prodNestle.exibirProduto();
                break;
            case 3:
            Fabrica l = new Lacta();
            ProductAbstract prodLacta = l.criarOvo();
            prodLacta.exibirProduto();
                break;
            case 0:
            System.out.println("404 found ");
            condicao = false;
            break;
        }
     }
       scan.close();
    }
}
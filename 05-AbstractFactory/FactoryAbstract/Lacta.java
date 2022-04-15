import java.util.Scanner;

public class Lacta implements Fabrica{

    public ProductAbstract criarOvo() {    

        System.out.println("Opções p/ escolha de chocolate");
        System.out.println("1) baton ao leite");
        System.out.println("2) Oreo");
        System.out.println("3) Sonho de valsa");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        switch (i) {
            case 1:
            return new AoLeite();
            case 2:
            return new Oreo();
        }
         return new SonhoValsa();

    }

}
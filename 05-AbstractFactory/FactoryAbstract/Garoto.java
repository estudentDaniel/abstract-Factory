import java.util.Scanner;

public class Garoto implements Fabrica {
    
    @Override
    public ProductAbstract criarOvo() {
        

        System.out.println("Opções p/ escolha de chocolate");
        System.out.println("1) baton ao leite");
        System.out.println("2) Crocante");
        System.out.println("3) Talento");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        switch (i) {
            case 1:
            return new Baton();
            case 2:
            return new Crocante();
             
        }
         return new Talento();
    }
    
}

import java.util.Scanner;

public class Nestle implements Fabrica{

    @Override
    public ProductAbstract criarOvo() {
    
            System.out.println("Opções p/ escolha de chocolate");
            System.out.println("1) ALPINO");
            System.out.println("2) CLASSIC");
            System.out.println("3) KIT KAT");
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            switch (i) {
                case 1:
                return new Alpino();
                case 2:
                return new Classic();
                 
            }
             return new KitKat();
        
    }

  
   
    
}

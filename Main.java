import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

Animal Anim1 = new Animal(scanner.next(), scanner.nextInt(), scanner.next(),
        scanner.next(), scanner.next());
            System.out.println(Anim1);
        Animal Anim2 = new Animal("Lilith", 8,"Lili",
                "rawr","bege&brown stripes");
            System.out.println(Anim2);


    }
}

//Rian Florentino
import java.util.Scanner;
public class TriPrismDemo {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        TriPrism<Integer> tp1 = new TriPrism<>();
        TriPrism<Double> tp2 = new TriPrism<>();

        System.out.println("Welcome to TriPrism Calculator");
        System.out.println("Enter a Integer Length: ");
        int le = sc.nextInt();
        tp1.setLength(le);

        System.out.println("Enter a Integer base: ");
        int ba = sc.nextInt();
        tp1.setBase(ba);

        System.out.println("Enter a Integer height: ");
        int he = sc.nextInt();
        tp1.setHeight(he);

        System.out.println("Enter a Double Length: ");
        double le1 = sc.nextDouble();
        tp2.setLength(le1);

        System.out.println("Enter a Double base: ");
        double ba1 = sc.nextDouble();
        tp2.setBase(ba1);

        System.out.println("Enter a Double height: ");
        double he1 = sc.nextDouble();
        tp2.setHeight(he1);

        Double tp1Volume = tp1.Volume();
        Double tp2Volume = tp2.Volume();

        System.out.println("TriPrism 1");
        System.out.println("Length: "+ tp1.getLength());
        System.out.println("Base: "+ tp1.getBase());
        System.out.println("Height: "+ tp1.getHeight());
        System.out.println("The volume for prism 1 with integer is: "+ tp1Volume);

        System.out.println("TriPrism 2");
        System.out.println("Length: "+ tp2.getLength());
        System.out.println("Base: "+ tp2.getBase());
        System.out.println("Height: "+ tp2.getHeight());
        System.out.printf("The volume for prism 2 with Double is: "+ "%.4f", tp2Volume);

        sc.close();


    }

}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
       double result =  sqrt();
        System.out.println("Квадратный корень случайного числа : "+"("+result+")");


    }
    public static double sqrt (){
        Random random = new Random();
        int sun = random.nextInt(100);
        double summa = Math.sqrt(sun);
        return summa;
    }
}
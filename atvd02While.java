/*2)Gere cinquenta números aleatórios usando os métodos da classe Random */
import java.util.Random;
public class atvd02While {
    public static void main (String[] args) throws Exception {
        Random r = new Random();
        int i = 0;
        while (i < 50) {
            int num = r.nextInt(50);
            System.out.println(num);
            i++;
        }
}
}
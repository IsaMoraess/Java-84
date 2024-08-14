/*2)Gere cinquenta números aleatórios usando os métodos da classe Random */
import java.util.Random;
public class atvd02For {
    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 0; i < 50; i++){
            int numero = rd.nextInt(50);
            System.out.println(numero);
        }
}
}
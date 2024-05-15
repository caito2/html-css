import java.util.Scanner;

public class Fisica {
   public Fisica() {
   }

   public static void main(String[] args) {
      System.out.println("Vamos fazer a famosa formula do sorvete ?");
      Scanner entrada = new Scanner(System.in);
      System.out.println("Insira aqui embaixo o valor do Espa\u00e7o inicial (SO): ");
      float espaço = entrada.nextFloat();
      System.out.println("Agora insira a velocidade (V): ");
      float velocidade = entrada.nextFloat();
      System.out.println("Para finalizar insira aqui o tempo(T): ");
      float tempo = entrada.nextFloat();
      float conta = espaço + velocidade * tempo;
      System.out.println("Aqui esta o resultado da sua formula:" + conta);
   }
}
package metematicaAplicada;

import java.util.*;

public class baskara {

        Scanner read  = new Scanner(System.in);

        int a, b, c;

        double delta , x1, x2;
        public baskara(){
            deltacalculo();
        }

        public void  deltacalculo(){
            System.out.println("Digite o valor A, B ,C respectivamente: ");
            a = Integer.parseInt(read.next());
            b = Integer.parseInt(read.next());
            c = Integer.parseInt(read.next());

            delta = (b * b) + (-4 *(a * c));

            System.out.println("delta " + delta);

            if (delta > 0){
                calculaX();
            }else{
                System.out.println("Delta não possuí raiz");
                System.exit(0);
            }




        }

    private void calculaX() {
        x1 = (double)  ((-(b) + Math.sqrt(delta))/ (2*a));
        x2 = (double)  ((-(b) - Math.sqrt(delta))/ (2*a));

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    public static void main(String[] args) {
        new baskara();
    }



}

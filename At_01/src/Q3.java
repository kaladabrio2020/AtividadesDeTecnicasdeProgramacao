import java.util.Scanner;
import java.util.ArrayList;

public class Q3 {
  static delta val   = new delta();
  static Scanner scn = new Scanner(System.in);
  static char[] letras = {'a','b','c'}       ;
  public void run() {
    double delta,valor;
    double[] xix = new double[2];
    double[] valores = new double[3];


    System.out.println("Equacao ax^2 + bx + c = 0");
    for (int i = 0; i <= 2; i++) {
      System.out.print(letras[i] + " = ");
      valores[i] = scn.nextDouble();
    }

    if (valores[0] != 0 && valores[1] != 0 && valores[2] != 0) {
      delta = val.delta_a(valores[0], valores[1], valores[2]);
      xix   = val.equacao_1(delta, valores[0], valores[1]);
      System.out.println( xix[0] + " - " + xix[1] );

    } else if (valores[0] != 0 && valores[1] != 0 && valores[2] == 0) {
      xix = val.equacao_2( valores[0], valores[1] );
      System.out.println( xix[0] + " - " + xix[1] );

    } else if (valores[0] != 0 && valores[1] == 0 && valores[2] != 0) {
      valor = val.equacao_3( valores[0], valores[2] );
      System.out.println( " -+ "+ valor );

    } else if (valores[0] == 0 && valores[1] != 0 && valores[2] !=0) {
      valor = ( -1*valores[2] )/ valores[1] ;
      System.out.println("+-" + valor);


    }else for(double i : valores) System.out.print( "Invalido ?" + i );

  }

}

class delta{
  static double[] valores_x = new double[2];
  static double delta , parte1 , parte2 , parte3 , parte1_1 , parte1_2;

  double delta_a(double a , double b , double c){
    delta = Math.pow(b , 2) - ( 4 * a * c );
    delta = Math.sqrt(delta);
    return  delta;
  }



  double[] equacao_1(double delta , double a , double b){
    b = -1*b;
    a =  2*a;
    parte1_1 = b - delta ;
    parte1_2 = b + delta ;
    parte2   = parte1_1/a;
    parte3   = parte1_2/a;

    valores_x[0] = parte2 ;
    valores_x[1] = parte3 ;

    return  valores_x;
  }


  double[] equacao_2(double a , double b){
    parte1       = b / a;
    valores_x[0] = 0;
    valores_x[1] = parte1;

    return  valores_x;
  }


  double equacao_3(double a , double c){
    parte1 = Math.sqrt( -1 * c );
    parte2 = parte1 / a  ;

    return  parte2;
  }
}
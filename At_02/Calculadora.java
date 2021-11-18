import java.lang.Math;

public class Calculadora {
	public Calculadora(){

	}
	public double adcionar   ( double operadorA , double operadorB ){ return ( operadorA + operadorB );  }
	public double subtrair   ( double operadorA , double operadorB ){ return ( operadorA - operadorB );  }
	public double multiplicar( double operadorA , double operadorB ){ return ( operadorA * operadorB );  }
	public double dividir    ( double operadorA , double operadorB ){ return ( operadorA / operadorB );  }
	public double potenciar  ( double base      , int    inteiro   ){ return ( Math.pow( base , inteiro)); }
	public double raiz       ( double numero )                      { return ( Math.sqrt( numero ));     }
	public double seno       ( double angulo )                      { return ( Math.sin ( angulo ));     }
	public double coseno     ( double angulo )                      { return ( Math.cos ( angulo ));     }
	public double tagente    ( double angulo )                      { return ( Math.tan ( angulo ));     }

}
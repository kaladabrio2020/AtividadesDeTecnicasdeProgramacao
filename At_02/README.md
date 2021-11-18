### **Universidade Federal do Ceará**
### **Departamento de Computação**
### **Disciplina: Técnicas de Programação I - CK0112** 
### **Professor: Lincoln Souza Rocha**

**Prática de Programação 02 (Classes e Objetos em Java)**

1) Criar uma classe chamada Calculadora e um método para cada uma das operações: adicionar, subtrair, multiplicar, dividir, potência, raiz quadrada, seno, cosseno e tangente. (Dica! Utilize a biblioteca de classe `java.lang.Math` para o cálculo da potência, raiz quadrada, seno, cosseno e tangente). Além disso, você deve escrever um código que teste todas as operações da `Calculadora` dentro do método `testaCalculadora()` da classe `Main`.


```
public class Calculadora{
  public Calculadora(){...} 
  public double adicionar(double operandoA, double operandoB){...}
  public double subtrair(double operandoA, double operandoB){...}
  public double multiplicar(double operandoA, double operandoB){...}
  public double dividir(double operandoA, double operandoB){...}
  public double potencia(double base, int expoente) {...}
  public double raiz(double radicando) {...}
  public double seno(double angulo) {...}
  public double coseno(double angulo) {...}
  public double tangente(double angulo) {...}
} 
```

2) Complete a implementação da classe `Banco` (descrita nas notas de aulas passadas) com os métodos `cadastrar()`,  `procurar()`, `creditar()`, `debitar()`, `transferir()` e `saldo()`.  Além disso, você deve escrever um código que teste todas as operações do `Banco` e da `Conta` dentro dos métodos `testaBanco()` e `testaConta()` da classe `Main`.
 

```
public class Conta {
  public Conta (String numero){...} 
  public void creditar(double valor){...}
  public void debitar(double valor){...}
  public String getNumero(){...}
  public double getSaldo(){...}
}
```

```
public class Banco {
  public Banco(){...} 
  public void cadastrar(Conta conta){...}
  private Conta procurar(String numero){...}
  public void creditar(String numero, double valor){...}
  public void debitar(String numero, double valor){...}
  public double saldo(String numero) {...}
  public void transferir(String origem, String destino, double valor){...} 
}
```
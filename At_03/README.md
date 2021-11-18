### **Universidade Federal do Ceará**
### **Departamento de Computação**
### **Disciplina: Técnicas de Programação I - CK0112** 
### **Professor: Lincoln Souza Rocha**

**Prática de Programação 03 (Herança em Java)**

1) Implemente a classe `BancoVector` usando a classe `Vector` do pacote `java.util` como repositório de contas ao invés de um `array`. OBS. a classe `Banco` do PP02 foi renomeada para `BancoArray`, caracterizando sua forma de de armazenar contas.

```
public class BancoVector {   

  public BancoVector(){...}   

  public void cadastrar(Conta conta){...}   

  private Conta procurar(String numero){...}   

  public void creditar(String numero, double valor){...}   

  public void debitar(String numero, double valor){...}   

  public double saldo(String numero) {...}   

  public void transferir(String origem, String destino, double valor){...}  

}
```


2)  Implemente a classe `ContaPoupanca`. Modifique as classes `BancoArray` e `BancoVector` para que seja possível render juros de uma poupança, isto é, implemente o método  `public void renderJuros(String numero)`. A taxa de juros corrente deve ser guardado no atributo `double taxa` das classes `BancoArray` e `BancoVector`. Em ambas as classes, `BancoArray` e `BancoVector`, implemente os métodos para atribuir e recuperar o valor  da taxa de juros `public void setTaxa(double valor)` e `public double getTaxa()`.
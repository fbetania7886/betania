package carro;

public class CalculaSalario {

	Scanner  = new Scanner(System.in); 
}
	  
    private double salario = 500;  
    private double item1 = 30.5, item2 = 100.0, item3 = 70.2;  
  
    public void recebeItens() {  
        int valor = 0;  
  
    System.out.printf("Digite:\n\n1 - Se o item vendido custar 30,50.\n"  
    + "2 - Se o item custar 100,00.\n"  
    + "3 - Se o item custar 70,20.\n\n"  
    + "-1 - Nenhum item vendido.\n");  
  
    while (valor != -1) {  
    System.out.println(": ");  
    valor = input.nextInt();  
  
    if (valor == 1) {  
    item1 += item1;  
    } else if (valor == 2) {  
    item2 += item2;  
    } else  
    item3 += item3;  
    }  
    }  
 
    public void calculaSalario() {  
        this.salario += (0.09 * item1) + (0.09 * item2) + (0.09 * item3);  
    }  
  
    public void mostraSalario() {  
        System.out.println("O salário do fucionario é: %.2f");  
    }  
  
}  


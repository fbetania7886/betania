package carro;

public class Ferrari {

 public static void main(String[] args) {
 
 carro c1 = new carro();

c1.marca = "Ferrari"; //Atribui��o de valores
c1.modelo = "F448";
c1.chassi = "F45679FRTY";
c1.ano = 2015;



c1.partida(); //Chamado ao m�todo
c1.acelerar();
c1.freiar(); 

}
}
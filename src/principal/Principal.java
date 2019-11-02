package principal;

import vehiculos.Auto;

public class Principal {
 
	public static void main(String[] args) {
		Auto miAuto	 = new Auto("Chevrolet", "Corsa",2012,4,"Azul", 140);
		//miAuto.setMarca("Chevrolet");
		//miAuto.setModelo("Corsa");
		System.out.println(miAuto.getMarca());
		System.out.println(miAuto.getModelo());
		System.out.println(miAuto.getColor());
		
		Auto tuAuto = new Auto ("Ferrari","Testarosa",2016,2,"Violeta",276);
		System.out.println(tuAuto.getMarca());
		System.out.println(tuAuto.getModelo());
		System.out.println(tuAuto.getColor());
		
		System.out.println(miAuto.estaEncendido());
		miAuto.encender();
		System.out.println(miAuto.estaEncendido());
		System.out.println(miAuto.getVelocidadActual());
		miAuto.acelerar(20);
		System.out.println(miAuto.getVelocidadActual());
		miAuto.acelerar(121);

		System.out.println(miAuto.getVelocidadActual());
	}

}

package vehiculos;

public class Auto {
	private String marca;
	private String modelo;
	private int fechaConstruccion;
	private int puertas;
	private String color;
	private int velocidadMaxima; 
	private int velocidadActual;
	private boolean encendido;
	
	//CONSTRUCTOR
	public Auto(String marca, String modelo, int fechaConstruccion, int puertas, String color, int velocidadMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.fechaConstruccion = fechaConstruccion;
		this.puertas = puertas;
		this.color = color;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = 0;
		this.encendido = false;
		
	}
	
	//GETTERS Y SETTERS 
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getFechaConstruccion() {
		return fechaConstruccion;
	}
	public void setFechaConstruccion(int fechaConstruccion) {
		this.fechaConstruccion = fechaConstruccion;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public String getColor() {
		String color = "Algo ";
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public void encender () {
		this.encendido = true;
	}
	public String estaEncendido() {
		if (this.encendido == true ) {
			return "Esta encendido";
		}else {
			return "El auto no está encendido";
		}
				
	}
	
	public void acelerar (int velocidad) {
		if (this.encendido==true) {
				if(velocidadActual + velocidad > velocidadMaxima) {
			this.velocidadActual = velocidad;	
		}else {
			System.out.println("No se puede acelerar");
		}
	}else {
		System.out.println("Debe encender el auto");
	}
		
	}	
	
	
}

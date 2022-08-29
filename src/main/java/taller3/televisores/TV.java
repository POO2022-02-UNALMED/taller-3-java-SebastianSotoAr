package talle3.televisores;

class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV = 0;

	TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV += 1;
		
	}

	void setMarca(Marca marca) {
		this.marca = marca;
		
	}
	
	void setControl(Control control) {
		this.control = control;
	
	}
	
	void setPrecio(int precio) {
		this.precio = precio;
	
	}
	
	void setVolumen(int volumen) {
		if ((volumen <= 7) && (volumen >= 0) && (this.estado == true)) {
			this.volumen = volumen;
			
		}	
		
	}
	
	void setCanal(int canal) {
		if ((canal <= 120) && (canal >= 1) && (this.estado == true)) {
			this.canal = canal;
			
		}
		
	}
	
	Marca getMarca() {
		return this.marca;
		
	}
	
	Control getControl() {
		return this.control;
		
	}
	
	int getPrecio() {
		return this.precio;
		
	}
	
	int getVolumen() {
		return this.volumen;
		
	}
	
	int getCanal() {
		return this.canal;
		
	}
	
	int getNumTV() {
		return numTV;
	}
	
	void turnOn() {
		this.estado = true;
			
	}
	
	void turnOff () {
		this.estado = false;
		
	}
	
	boolean getEstado() {
		return this.estado;
		
	}
	
	void canalUp() {
		if (this.estado == true) {
			if (this.canal != 120) {
				this.canal += 1;
				
			}
			
		}
		
	}
	
	void canalDown() {
		if (this.estado == true) {
			if (this.canal != 1) {
				this.canal -= 1;
				
			}
			
		}
		
	}
	
	
	void volumenUp() {
		if (this.estado == true) {
			if (this.volumen != 7) {
				this.volumen += 1;
				
			}
			
		}
		
	}
	
	void volumenDown() {
		if (this.estado == true) {
			if (this.volumen != 0) {
				this.volumen -= 1;
				
			}
			
		}
		
	}
	
	
	
}

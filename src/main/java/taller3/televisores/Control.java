package talle3.televisores;

class Control {
	private TV tv;
	
	void setTV(TV tv) {
		this.tv = tv;
	
	}
	
	TV getTV() {
		return this.tv;
		
	}

	void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
		
	}
	
	void turnOn() {
		this.tv.turnOn();
		
	}
	
	void turnOff() {
		this.tv.turnOff();
		
	}
	
	void canalUp() {
		this.tv.canalUp();
		
	}
	
	void canalDown() {
		this.tv.canalDown();
		
	}
	
	void volumenUp() {
		this.tv.volumenUp();
		
	}
	
	void volumenDown() {
		this.tv.volumenDown();
		
	}
	
	void setCanal(int canal) {
		this.tv.setCanal(canal);
		
	}
}

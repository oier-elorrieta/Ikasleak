package Modelo;

public class autoa {
	private int gurpilak;
	private String modelo;
//-------------------------------------------------------------
	public autoa (int gur, String marka) {
		this.gurpilak = gur;
		this.modelo = marka;
	}
//--------------------------------------------------------------
	public int getGurpilak() {
		return gurpilak;
	}
	public void setGurpilak(int gurpilak) {
		this.gurpilak = gurpilak;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
//-------------------------------------------------------------
	@Override
	public String toString() {
		return "autoa [gurpilak=" + gurpilak + ", modelo=" + modelo + "]";
	}
	
	
}
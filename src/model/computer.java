package model;

public class computer {
	private int ram;
	private String gpu;
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public computer(int ram, String gpu) {
		super();
		this.ram = ram;
		this.gpu = gpu;
	}
	
	
	
	
}

package questao_2;

public class Computador {
	
	private PlacaMae placaMae;
	private MemoriaRam memoriaRam;
	private Cpu cpu;
	
	public Computador() {
		
	this.placaMae = new PlacaMae();
	this.memoriaRam = new MemoriaRam();
	this.cpu = new Cpu();
		
	}
	
	
	public void desMemoriaRam() {
		this.memoriaRam.componentes();
	}
	
	public void desPlacaMae() {
		this.placaMae.componentes();
	}
	
	public void desCpu() {
		this.cpu.componentes();
	}
}

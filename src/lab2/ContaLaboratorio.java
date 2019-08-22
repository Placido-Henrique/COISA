package lab2;

public class ContaLaboratorio {
	private int cota;
	private int consumo;
	private String nome;
	
	
	public ContaLaboratorio(String nome) {
		this.nome = nome;
		this.cota = 2000;
	}
	public ContaLaboratorio(String nome,int cota) {
		this.nome = nome;
		this.cota = cota;
		
	}
	
	public void consomeEspaco(int mbytes) {
		this.consumo += mbytes;
	}
		
	
	public void liberaEspaco(int mbytes) {
		this.consumo -= mbytes;
		
	}
	public boolean atingiuCota() {
		return this.consumo >= this.cota;
		
	}
	public String toString() {
		return nome +" "+ consumo + "/"+cota;
		
	}
}
		
	 




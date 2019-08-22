package lab2;

public class Disciplina {
	private String nomeDisciplina;
	private double[] notas = {0,0,0,0};
	private int horas = 0;
	
	public Disciplina (String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
    public void cadastraHoras(int horas) {
    	this.horas += horas;
    	
    }
    public void cadastraNota(int nota, double valorNota) {
    	this.notas[nota-1] = valorNota;
        	
    }
    private double calculaMedia() {
    	double soma = 0;
    	int elementos = notas.length; 
    	for (int i = 0;i < notas.length;i ++) {
    		soma += notas[i];
    	}
    	
    	return soma/elementos;
    		
    		
    	}
    	
    	
    }
    public boolean aprovado( ) {
    	
    }
    public String toString( ) {
    	
    }

}

package Aula_2108;

public class Aluno extends Pessoa{
	private String curso;
	private float nota;
	private float nota1;
	
	Aluno(){
		super();
	}
	public Aluno(String curso, float nota) {
		this.curso = curso;
		this.nota = nota;
	}
	
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public float getNota1() {
		return nota;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	
	//metodos especiais
	public float media;
	public void CalcularMedia(){
		media = ((nota + nota1) / 2) ;	
	}
	public void SituacaoFinal() {
		if(media < 7) {
			System.out.println("Reprovado!!!!!!!!!!!!!!!!");
		}else {
			System.out.println("Aprovado!!!!!!!!!!!!!!!!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

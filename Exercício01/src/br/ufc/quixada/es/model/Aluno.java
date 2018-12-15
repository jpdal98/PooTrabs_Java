package br.ufc.quixada.es.model;

public class Aluno {
	// Atributos
		private String nome;
		private int idade;
		private String curso;
		private float ira;
		
	// Métodos e ações
		public Aluno(String n, int i, String c, float ir) {
			this.nome = n;
			this.idade = i;
			this.curso = c;
			this.ira = ir;
		}
		
		public Aluno() {}
		
		public String toString() {
			String modelo = "";
			modelo = "O nome do aluno: "+this.nome+"\n"+"A idade do aluno: "+this.idade+"\nO curso do aluno: "+
			this.curso+"\nO IRA do aluno: "+this.ira+".";
			return modelo;
		}
		
		public void estudar(String materia){
			System.out.println("O aluno "+this.nome+" está estudando "+materia);
		}
		public void matricular(String diciplina) {
			System.out.println("O aluno "+this.nome+" se matriculou em "+diciplina);
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			if(nome.startsWith("https://")) {
				System.out.println("String maliciosa detectada.");
			}else {
				this.nome = nome;
			}
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			if(idade < 0) {
				System.out.println("Valor inválido.");
			}else {
				this.idade = idade;
			}
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			if(curso.startsWith("https://")) {
				System.out.println("String maliciosa detectada.");
			}else {
				if(curso.equals("ES") || curso.equals("SI")|| 
						curso.equals("EC")|| curso.equals("CC")||curso.equals("Redes")) {
					this.curso = curso;
				}else {
					System.out.println("String inválida.");
				}
			}
		}
		public float getIra() {
			return ira;
		}
		public void setIra(float ira) {
			if(ira < 0 || ira > 10) {
				System.out.println("Valor inválido");
			}
			else {
				this.ira = ira;
			}
		}
		
		

}

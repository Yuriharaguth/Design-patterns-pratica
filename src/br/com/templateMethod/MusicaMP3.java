package br.com.templateMethod;

public class MusicaMP3 {
	    String nome;
	    String autor;
	    String ano;
	    int estrelas;
	 
	    public MusicaMP3(String nome, String autor, String ano, int estrela) {
	        this.nome = nome;
	        this.autor = autor;
	        this.ano = ano;
	        this.estrelas = estrela;
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getAno() {
			return ano;
		}

		public void setAno(String ano) {
			this.ano = ano;
		}

		public int getEstrelas() {
			return estrelas;
		}

		public void setEstrelas(int estrelas) {
			this.estrelas = estrelas;
		}
	    
	    
}

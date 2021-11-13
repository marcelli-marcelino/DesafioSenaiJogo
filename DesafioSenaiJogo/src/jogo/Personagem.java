package jogo;

import enuns.TiposArmas;
import enuns.TiposClasses;
import enuns.TiposSexo;

abstract public class Personagem {
	 protected String nome;
	    protected TiposSexo sexo;
	    protected TiposClasses classe;
	    protected int pontosDeVida;
	    public int pontosDeDefesa;
	    protected int danoAtaque;
	    protected TiposArmas arma;
	    protected String nomeArma;
	    protected int danoArma;
	    protected int danoTotal;
	    
	    

	    public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public TiposSexo getSexo() {
			return sexo;
		}

		public void setSexo(TiposSexo sexo) {
			this.sexo = sexo;
		}

		public TiposClasses getClasse() {
			return classe;
		}

		public void setClasse(TiposClasses classe) {
			this.classe = classe;
		}

		public int getPontosDeVida() {
			return pontosDeVida;
		}

		public void setPontosDeVida(int pontosDeVida) {
			this.pontosDeVida = pontosDeVida;
		}

		public int getPontosDeDefesa() {
			return pontosDeDefesa;
		}

		public void setPontosDeDefesa(int pontosDeDefesa) {
			this.pontosDeDefesa = pontosDeDefesa;
		}

		public int getDanoAtaque() {
			return danoAtaque;
		}

		public void setDanoAtaque(int danoAtaque) {
			this.danoAtaque = danoAtaque;
		}

		public TiposArmas getArma() {
			return arma;
		}

		public void setArma(TiposArmas arma) {
			this.arma = arma;
		}

		public String getNomeArma() {
			return nomeArma;
		}

		public void setNomeArma(String nomeArma) {
			this.nomeArma = nomeArma;
		}

		public int getDanoArma() {
			return danoArma;
		}

		public void setDanoArma(int danoArma) {
			this.danoArma = danoArma;
		}

		public int getDanoTotal() {
			return danoTotal;
		}

		public void setDanoTotal(int danoTotal) {
			this.danoTotal = danoTotal;
		}

		public abstract void atacar(Combate combate);

	    public void diminuirVida(int danoRecebido) {
	        this.pontosDeVida -= danoRecebido;
	    }

	    public boolean estaVivo() {
	        return this.pontosDeVida > 0;
	    }
}

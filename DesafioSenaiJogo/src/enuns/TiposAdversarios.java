package enuns;

public enum TiposAdversarios {
	ARMEIRO("ARMEIRO", TiposSexo.FEMININO, 100, 10, 20, TiposArmas.ESPADA),
    ALQUIMISTA("ALQUIMISTA",TiposSexo.FEMININO, 120, 10, 25, TiposArmas.CAJADO),
    LIDER("LIDER",TiposSexo.FEMININO, 140, 14, 35, TiposArmas.MACHADO);

    public final String nome;
    public final TiposSexo sexo;
    public final int pontosDeVida;
   	public final int pontosDeDefesa;
    public final int danoAtaque;
    public final TiposArmas tiposArmas;

    
    public String getNome() {
		return nome;
	}


	public TiposSexo getSexo() {
		return sexo;
	}


	public int getPontosDeVida() {
		return pontosDeVida;
	}


	public int getPontosDeDefesa() {
		return pontosDeDefesa;
	}


	public int getDanoAtaque() {
		return danoAtaque;
	}


	public TiposArmas getTiposArmas() {
		return tiposArmas;
	}


	TiposAdversarios(String nome, TiposSexo sexo, int pontosDeVida, int danoAtaque, int pontosDeDefesa, TiposArmas tipoArma) {
        this.nome = nome;
        this.sexo = sexo;
        this.pontosDeVida = pontosDeVida;
        this.danoAtaque = danoAtaque;
        this.pontosDeDefesa = pontosDeDefesa;
        this.tiposArmas = tipoArma;
    }
}

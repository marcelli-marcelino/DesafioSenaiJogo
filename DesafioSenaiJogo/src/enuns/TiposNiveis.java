package enuns;

public enum TiposNiveis {
	FACIL(1),MEDIO(2), DIFICIL(3);
	
	   public int getNivel() {
		return nivel;
	}

	private final int nivel;

	    TiposNiveis(int nivel) {
	        this.nivel = nivel;
	    }
}

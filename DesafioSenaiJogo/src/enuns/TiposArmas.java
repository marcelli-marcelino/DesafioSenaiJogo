package enuns;

public enum TiposArmas {
	ESPADA ("espada", 20),
	MACHADO ("machado", 15),
	ARCOFLECHA("arcoflecha", 18),
	LANÇA("lança", 20),
	CAJADO ("cajado",20),
	CHICOTE("chicote", 18),
	MAGIA("magia", 15),
	VARINHA("varinha", 18);
	
public final String nomeArma;
public String getNomeArma() {
	return nomeArma;
}

public int getDanoArma() {
	return danoArma;
}

public final int danoArma;

    TiposArmas(String nomeArma, int danoArma) {
        this.nomeArma = nomeArma;
        this.danoArma = danoArma;
    }
}

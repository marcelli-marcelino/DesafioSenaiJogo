package enuns;

import java.util.ArrayList;
import java.util.Arrays;

public enum TiposClasses {

	GUERREIRA(130, 12, 10, new ArrayList<>(Arrays.asList(TiposArmas.MACHADO, TiposArmas.ESPADA))),
    CAÇADORA(120, 10, 15, new ArrayList<>(Arrays.asList(TiposArmas.ARCOFLECHA, TiposArmas.LANÇA))),
    FEITICEIRA(120, 5, 20, new ArrayList<>(Arrays.asList(TiposArmas.MAGIA, TiposArmas.VARINHA))),
    MISTICA(150, 5, 20, new ArrayList<>(Arrays.asList(TiposArmas.CAJADO, TiposArmas.CHICOTE)));
    
    public final int pontosDeVida;
    public final int pontosDeDefesa;
    public final int danoAtaque;
    public final ArrayList<TiposArmas> tiposArmas;
    

    public int getPontosDeVida() {
		return pontosDeVida;
	}


	public int getPontosDeDefesa() {
		return pontosDeDefesa;
	}


	public int getDanoAtaque() {
		return danoAtaque;
	}


	public ArrayList<TiposArmas> getTiposArmas() {
		return tiposArmas;
	}


	TiposClasses(int pontosDeVida, int pontosDeDefesa, int danoAtaque, ArrayList<TiposArmas> tipoArma) {
        this.pontosDeVida = pontosDeVida;
        this.pontosDeDefesa = pontosDeDefesa;
        this.danoAtaque = danoAtaque;
        this.tiposArmas = tipoArma;
    }
}

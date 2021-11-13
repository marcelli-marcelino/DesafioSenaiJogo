package enuns;

public enum TiposMotivacoes {
	VINGANCA ("VINGAN�A",
			" Imagens daquela noite tr�gica invadem sua mente. Voc� nem precisa se esfor�ar\r\n"
			+ "para lembrar, pois essas mem�rias est�o sempre presentes, mesmo que de pano de fundo,\r\n"
			+ "quando voc� tem outros pensamentos em foco, elas nunca o deixaram. Elas s�o o combust�vel\r\n"
			+ "que te fizeram chegar at� aqui. E voc� sabe que n�o ir� desistir at� ter vingado a morte daqueles\r\n"
			+ "que foram - e pra sempre ser�o - sua fonte de amor e desejo de continuar vivo. O maldito l�der\r\n"
			+ "finalmente pagar� por tanto mal causado na vida de tantos (e principalmente na sua).",
			"Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma\r\n"
			+ "sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. Agora voc�\r\n"
			+ "pode seguir sua vida.\r\n",
			 "N�o foi poss�vel concluir sua vingan�a, e\r\n"
			+ "agora resta saber se algu�m se vingar� por voc�"
			),
	
	GLORIA ("GL�RIA",
			"Voc� j� consegue visualizar na sua mente o povo da cidade te recebendo de bra�os\r\n"
			+ "abertos, bardos criando can��es sobre seus feitos her�icos, nobres te presenteando com j�ias e\r\n"
			+ "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilan�as. Desde\r\n"
			+ "j�, voc� sente o amor do p�blico, te louvando a cada passo que d� pelas ruas, depois de destruir\r\n"
			+ "o vil�o que tanto assombrou a paz de todos. Por�m, voc� sabe que ainda falta o �ltimo ato dessa\r\n"
			+ "hist�ria. Voc� se concentra na miss�o. A gl�ria o aguarda, mas n�o antes da �ltima batalha.",
			"O �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de\r\n"
			+ "alegria. A gl�ria o aguarda, voc� a conquistou.\r\n",
			"A gl�ria que buscavas n�o ser� sua,\r\n"
			+ "e a cidade aguarda por seu(sua) pr�ximo(a) her�i(na)." );
	
	
    public final String motivacao;
    public final String textoMotivacao;
    public final String mensagemVitoria;
    public String getMotivacao() {
		return motivacao;
	}


	public String getTextoMotivacao() {
		return textoMotivacao;
	}


	public String getMensagemVitoria() {
		return mensagemVitoria;
	}


	public String getMensagemMorte() {
		return mensagemMorte;
	}


	public final String mensagemMorte;


    TiposMotivacoes(String motivacao, String textoMotivacao, String mensagemVitoria, String mensagemMorte) {
        this.motivacao = motivacao;
        this.textoMotivacao = textoMotivacao;
        this.mensagemVitoria = mensagemVitoria;
        this.mensagemMorte = mensagemMorte;
    }
}
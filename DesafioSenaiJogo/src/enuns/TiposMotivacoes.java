package enuns;

public enum TiposMotivacoes {
	VINGANCA ("VINGANÇA",
			" Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar\r\n"
			+ "para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,\r\n"
			+ "quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível\r\n"
			+ "que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles\r\n"
			+ "que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder\r\n"
			+ "finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).",
			"Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma\r\n"
			+ "sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você\r\n"
			+ "pode seguir sua vida.\r\n",
			 "Não foi possível concluir sua vingança, e\r\n"
			+ "agora resta saber se alguém se vingará por você"
			),
	
	GLORIA ("GLÓRIA",
			"Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços\r\n"
			+ "abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e\r\n"
			+ "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde\r\n"
			+ "já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir\r\n"
			+ "o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa\r\n"
			+ "história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.",
			"O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de\r\n"
			+ "alegria. A glória o aguarda, você a conquistou.\r\n",
			"A glória que buscavas não será sua,\r\n"
			+ "e a cidade aguarda por seu(sua) próximo(a) herói(na)." );
	
	
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
package jogo;

public class Roteiro {

	 public static void RoteiroJogo() {
	        Acoes.criacaoPersonagem();
	        System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você\r\n"
	    			+ "está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e sabe que\r\n"
	    			+ "a partir desse ponto, sua vida mudará para sempre.");
	        System.out.println( " \nMemórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os\r\n"
	        		+ "inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate,\r\n"
	        		+ "já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal."
	                );
	        Acoes.enterSeguirAdiante();
	        System.out.println("\nBuscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui. \n");
	        System.out.println(Acoes.getMotivacaoPersonagem());
	        Acoes.enterSeguirAdiante();
	        System.out.println( "\nInspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas mãos formigarem \n" +
	                "em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. Você avança pelo portal. \n");
	        Acoes.enterSeguirAdiante();
	        
	        System.out.println("A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente,\r\n"
	        		+ "só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou\r\n"
	        		+ "desistir."
	                );
	        Acoes.opcaoSeguirDesistir();
	        Acoes.enterSeguirAdiante();
	        System.out.println("\nVocê se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como \n" +
	                "passar pela porta.");
	        Acoes.opcaoSaltarAndarCorrer();
	        Acoes.enterSeguirAdiante();
	        System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela\r\n"
	        		+ "pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta à sua frente é a maior\r\n"
	        		+ "das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, mas reconhece como sendo a\r\n"
	        		+ "língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe que ela está trancada por duas\r\n"
	        		+ "fechaduras douradas, e você entende que precisará primeiro derrotar o que estiver nas outras duas portas\r\n"
	        		+ "laterais, antes de conseguir enfrentar o líder.\r\n"
	        		+ "Você se dirige para a porta à direita.  \n");
	        Acoes.enterSeguirAdiante();
	        
	        System.out.println();
	        System.out.println("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força\r\n"
	        		+ "sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala espaçosa,\r\n"
	        		+ "com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas. Você imagina que\r\n"
	        		+ "este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem\r\n"
	        		+ "para espalhar o terror nas cidades e vilas da região.\n");
	        Acoes.enterSeguirAdiante();
	        System.out.println("Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás.\r\n"
	        		+ "Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo.\r\n"
	        		+ "Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate. Ele avança em sua direção.\n" );
	        Acoes.enterSeguirAdiante();
	        Acoes.primeiroInimigo();
	        System.out.println("\n Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do\n" +
	                "líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto. \n");
	        Acoes.enterSeguirAdiante();
	        
	        System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, tentando ouvir o que\r\n"
	        		+ "acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra\r\n"
	        		+ "a porta com a outra. Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de\r\n"
	        		+ "armaduras, existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas, e você\r\n"
	        		+ "entende que o capitão que vive ali, realiza experimentos com diversos ingredientes, criando poções\r\n"
	        		+ "utilizadas pelos soldados para aterrorizar a região. \n");
	        Acoes.enterSeguirAdiante();
	        System.out.println("\nNo fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque horrendo, de \n" +
	                "armadura, cajado em punho, em posição de combate. Ele avança em sua direção. \n");
	        Acoes.enterSeguirAdiante();
	        Acoes.segundoInimigo();
	        System.out.println("\nAo lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra\r\n"
	        		+ "fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa que leva presa ao cinto. \n");
	        Acoes.enterSeguirAdiante();
	        
	        System.out.println("De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a porta se\r\n"
	        		+ "abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você percebe que está\r\n"
	        		+ "muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que você sabe que\r\n"
	        		+ "irá se seguir, e adentra a porta. \n");
	        Acoes.enterSeguirAdiante();
	        System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros\r\n"
	        		+ "acorrentados às paredes.");
	        System.out.println("\nEle percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de\r\n"
	        		+ "lâmina dupla.\r\n");
	        Acoes.inimigoLider();
	        System.out.println(Acoes.pessoa.getTipoMotivacao().getMensagemVitoria());
	        Acoes.enterSeguirAdiante();
	         System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em direção \n" +
	                "à noite, retornando à cidade. Seu dever está cumprido.");
	    }
}

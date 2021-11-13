package jogo;

public class Roteiro {

	 public static void RoteiroJogo() {
	        Acoes.criacaoPersonagem();
	        System.out.println("A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, e sob a luz do crep�sculo voc�\r\n"
	    			+ "est� prestes a entrar na fase final da sua miss�o. Voc� olha para o portal � sua frente, e sabe que\r\n"
	    			+ "a partir desse ponto, sua vida mudar� para sempre.");
	        System.out.println( " \nMem�rias do caminho percorrido para chegar at� aqui invadem sua mente. Voc� se lembra de todos os\r\n"
	        		+ "inimigos j� derrotados para alcan�ar o covil do l�der maligno. Olha para seu equipamento de combate,\r\n"
	        		+ "j� danificado e desgastado depois de tantas lutas. Voc� est� a um passo de encerrar para sempre esse mal."
	                );
	        Acoes.enterSeguirAdiante();
	        System.out.println("\nBuscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui. \n");
	        System.out.println(Acoes.getMotivacaoPersonagem());
	        Acoes.enterSeguirAdiante();
	        System.out.println( "\nInspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, suas m�os formigarem \n" +
	                "em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado. Voc� avan�a pelo portal. \n");
	        Acoes.enterSeguirAdiante();
	        
	        System.out.println("A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua frente,\r\n"
	        		+ "s� � poss�vel perceber que voc� se encontra em um corredor extenso. Voc� s� pode ir � frente, ou\r\n"
	        		+ "desistir."
	                );
	        Acoes.opcaoSeguirDesistir();
	        Acoes.enterSeguirAdiante();
	        System.out.println("\nVoc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como \n" +
	                "passar pela porta.");
	        Acoes.opcaoSaltarAndarCorrer();
	        Acoes.enterSeguirAdiante();
	        System.out.println("Voc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela\r\n"
	        		+ "pela qual voc� entrou, que estava aberta, e as outras tr�s est�o fechadas. A porta � sua frente � a maior\r\n"
	        		+ "das quatro, com inscri��es em seu entorno em uma l�ngua que voc� n�o sabe ler, mas reconhece como sendo a\r\n"
	        		+ "l�ngua antiga utilizada pelo inimigo. Voc� se aproxima da porta e percebe que ela est� trancada por duas\r\n"
	        		+ "fechaduras douradas, e voc� entende que precisar� primeiro derrotar o que estiver nas outras duas portas\r\n"
	        		+ "laterais, antes de conseguir enfrentar o l�der.\r\n"
	        		+ "Voc� se dirige para a porta � direita.  \n");
	        Acoes.enterSeguirAdiante();
	        
	        System.out.println();
	        System.out.println("Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais for�a\r\n"
	        		+ "sua arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� se depara com uma sala espa�osa,\r\n"
	        		+ "com v�rios equipamentos de batalha pendurados nas paredes e dispostos em arm�rios e mesas. Voc� imagina que\r\n"
	        		+ "este seja o arsenal do inimigo, onde est�o guardados os equipamentos que seus soldados utilizam quando saem\r\n"
	        		+ "para espalhar o terror nas cidades e vilas da regi�o.\n");
	        Acoes.enterSeguirAdiante();
	        System.out.println("Enquanto seu olhar percorre a sala, voc� ouve a porta se fechando e gira rapidamente para olhar para tr�s.\r\n"
	        		+ "Ali, de p� entre voc� e a porta fechada, bloqueando o caminho do seu destino, est� um dos capit�es do inimigo.\r\n"
	        		+ "Um orque horrendo, de armadura, capacete e espada em punho, em posi��o de combate. Ele avan�a em sua dire��o.\n" );
	        Acoes.enterSeguirAdiante();
	        Acoes.primeiroInimigo();
	        System.out.println("\n Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do\n" +
	                "l�der inimigo. Voc� pega a chave e guarda numa pequena bolsa que leva presa ao cinto. \n");
	        Acoes.enterSeguirAdiante();
	        
	        System.out.println("Voc� retorna � sala anterior e se dirige � porta da esquerda. Voc� se aproxima, tentando ouvir o que\r\n"
	        		+ "acontece porta adentro, mas n�o escuta nada. Segura com mais for�a sua arma com uma m�o, enquanto empurra\r\n"
	        		+ "a porta com a outra. Ao entrar, voc� se depara com uma sala parecida com a do arsenal, mas em vez de\r\n"
	        		+ "armaduras, existem v�rios potes e garrafas de vidro com conte�dos misteriosos e de cores diversas, e voc�\r\n"
	        		+ "entende que o capit�o que vive ali, realiza experimentos com diversos ingredientes, criando po��es\r\n"
	        		+ "utilizadas pelos soldados para aterrorizar a regi�o. \n");
	        Acoes.enterSeguirAdiante();
	        System.out.println("\nNo fundo da sala, olhando em sua dire��o, est� outro dos capit�es do inimigo. Um orque horrendo, de \n" +
	                "armadura, cajado em punho, em posi��o de combate. Ele avan�a em sua dire��o. \n");
	        Acoes.enterSeguirAdiante();
	        Acoes.segundoInimigo();
	        System.out.println("\nAo lado da porta, voc� v� uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra\r\n"
	        		+ "fechadura da porta do l�der inimigo. Voc� pega a chave e guarda na pequena bolsa que leva presa ao cinto. \n");
	        Acoes.enterSeguirAdiante();
	        
	        System.out.println("De volta � sala das portas, voc� se dirige � porta final. Coloca as chaves nas fechaduras, e a porta se\r\n"
	        		+ "abre. Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente, e voc� percebe que est�\r\n"
	        		+ "muito pr�ximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que voc� sabe que\r\n"
	        		+ "ir� se seguir, e adentra a porta. \n");
	        Acoes.enterSeguirAdiante();
	        System.out.println("L� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros\r\n"
	        		+ "acorrentados �s paredes.");
	        System.out.println("\nEle percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de\r\n"
	        		+ "l�mina dupla.\r\n");
	        Acoes.inimigoLider();
	        System.out.println(Acoes.pessoa.getTipoMotivacao().getMensagemVitoria());
	        Acoes.enterSeguirAdiante();
	         System.out.println("Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em dire��o \n" +
	                "� noite, retornando � cidade. Seu dever est� cumprido.");
	    }
}

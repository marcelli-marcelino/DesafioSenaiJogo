package jogo;

public class Combate {

	 public PersonagemPessoa jogador;
	    public PersonagemComputador inimigo;

	    public Combate(PersonagemPessoa jogador, PersonagemComputador inimigo) {
	        this.jogador = jogador;
	        this.inimigo = inimigo;
	    }

	    public PersonagemPessoa getJogador() {
			return jogador;
		}

		public void setJogador(PersonagemPessoa jogador) {
			this.jogador = jogador;
		}

		public PersonagemComputador getInimigo() {
			return inimigo;
		}

		public void setInimigo(PersonagemComputador inimigo) {
			this.inimigo = inimigo;
		}
		
		public void acoesJogadorCombate() {

	        int escolha;
	            System.out.println("O que você deseja fazer?\r\n"
	            		+ "	                    1. ATACAR\r\n"
	            		+ "	                    2. FUGIR");
	            try {
	                escolha = Integer.parseInt(Acoes.teclado.nextLine());
	            } catch (Exception e) {
	                escolha = 3;
	            }

	            if (escolha > 2) {
	                System.out.println("Digite uma opção válida");
	            } 

	        if (escolha == 2) {
	            jogador.fugir();
	            return;
	        }

	        jogador.atacar(this);
	    }

	    public void iniciarCombate() {
	        boolean jogadorComecaPrimeiro = jogadorComecaPrimeiro();
	        do {
	            if (jogadorComecaPrimeiro) {
	                acoesJogadorCombate();
	                inimigo.atacar(this);
	            } else {
	                inimigo.atacar(this);
	                acoesJogadorCombate();
	            }
	        } while (inimigo.estaVivo());
	    }

	    public boolean jogadorComecaPrimeiro() {
	        int iniciativaJogador = Acoes.rolarDado(20);
	        int iniciativaInimigo = Acoes.rolarDado(20);

	        return iniciativaJogador > iniciativaInimigo;
	    }
}

package jogo;

import enuns.TiposAdversarios;
import enuns.TiposNiveis;

public class PersonagemComputador extends Personagem {

	public PersonagemComputador(TiposAdversarios personagem) {
        this.nome = personagem.getNome();
        this.sexo = personagem.getSexo();
        this.pontosDeVida = personagem.getPontosDeVida();
        this.danoArma = personagem.getTiposArmas().getDanoArma();
        this.pontosDeDefesa = personagem.getPontosDeDefesa();
        this.danoAtaque = personagem.getDanoAtaque();
        this.danoTotal = this.danoArma + this.danoAtaque;
    }

	public void atacar(Combate combate) {
        double modificadorDano = 1;
        if (Acoes.nivel == TiposNiveis.FACIL) {
            modificadorDano = 0.8;
        }

        PersonagemComputador atacante = combate.getInimigo();
        PersonagemPessoa defensor = combate.getJogador();

        int rolagemDados = Acoes.rolarDado(20);
        if (rolagemDados == 1) {
            System.out.println("O inimigo errou o ataque! Você não sofreu dano.");
            return;
        }
        String mensagem = null;
        if (rolagemDados == 20) {
            int danoTotal = (int) ((rolagemDados + atacante.danoTotal) * modificadorDano);
            defensor.diminuirVida(danoTotal);
            mensagem = "O inimigo acertou um ataque crítico! Você sofreu "+ danoTotal + " e agora possui " + defensor.getPontosDeVida() + " pontos de vida.";
        }
        if (rolagemDados < 20) {
            danoTotal = (int) ((danoTotal - defensor.getPontosDeDefesa()) * modificadorDano);
            defensor.diminuirVida(danoTotal);
            mensagem = "O inimigo atacou! Você sofreu "+ danoTotal + " de dano e agora possui " + defensor.getPontosDeVida() + " pontos de vida.";
        }

        if (danoTotal < defensor.getPontosDeDefesa()) {
            System.out.println("O golpe do inimigo não foi o sufuciente para passar pela sua armadura!");
            return;
        }

        defensor.diminuirVida(danoTotal);

        if (!defensor.estaVivo()) {
            System.out.println("Você não estava preparado para a força do inimigo. \n" + defensor.getTipoMotivacao().getMensagemMorte());
            System.exit(0);
        }

        System.out.println(mensagem);
	}

}

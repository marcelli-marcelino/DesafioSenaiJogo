package jogo;
import enuns.TiposArmas;
import enuns.TiposClasses;
import enuns.TiposMotivacoes;
import enuns.TiposNiveis;
import enuns.TiposSexo;

public class PersonagemPessoa extends Personagem {

	
	 private TiposMotivacoes tipoMotivacao;

   public PersonagemPessoa(String nome, TiposSexo sexo, TiposClasses classe, TiposArmas arma) {
       this.nome = nome;
       this.sexo = sexo;
       this.pontosDeDefesa = classe.getPontosDeDefesa();
       this.pontosDeVida = classe.getPontosDeVida();
       this.danoAtaque = classe.getDanoAtaque();
       this.nomeArma = arma.getNomeArma();
       this.danoArma = arma.getDanoArma();
       this.classe = classe;
       this.arma = arma;
       this.danoTotal = this.danoArma + this.danoAtaque;
       
   }
   

   public TiposMotivacoes getTipoMotivacao() {
		return tipoMotivacao;
	}


	public void setTipoMotivacao(TiposMotivacoes tipoMotivacao) {
		this.tipoMotivacao = tipoMotivacao;
	}


	public String toString() {
       return "Nome: " + nome +
               "\nSexo: " + sexo +
               "\nClasse: " + classe +
               "\nPonto de Defesa: " + pontosDeDefesa +
               "\nPonto de Vida: " + pontosDeVida +
               "\nDano de Ataque Classe: " + danoAtaque +
               "\nArma: " + arma +
               "\nNome da Arma: " + nomeArma +
               "\nDano da Arma: " + danoArma +
               "\nDano Total: " + danoTotal ;
   }

   public void fugir () {
       System.out.println(
               "Voc� n�o estava preparado para a for�a do inimigo, e decide fugir para que possa tentar novamente em uma pr�xima vez.");
       System.exit(0);
   }


@Override
public void atacar(Combate combate) {
	double modificadorDano = 1;
    if (Acoes.nivel == TiposNiveis.DIFICIL) {
        modificadorDano = 0.9;
    }
    PersonagemPessoa atacante = combate.getJogador();
    PersonagemComputador defensor = combate.getInimigo();
    int rolagemDados = Acoes.rolarDado(20);
    if (rolagemDados == 1) {
        System.out.println("Voc� errou seu ataque! O inimigo n�o sofreu dano algum.");
        return;
    }

    int danoTotal = (int) ((rolagemDados + atacante.danoTotal) * modificadorDano);
    String mensagem = "Voc� acertou um ataque cr�tico! Voc� atacou com "+ atacante.getNomeArma() + " e causou " + danoTotal + " de dano ao inimigo!";
    if (rolagemDados < 20) {
        danoTotal = (int) ((danoTotal - defensor.getPontosDeDefesa()) * modificadorDano);
        mensagem = "Voc� atacou com "+ atacante.getNomeArma() + " e causou " + danoTotal + " de dano ao inimigo!";
    }


    if (danoTotal < defensor.getPontosDeDefesa()) {
        System.out.println("O seu golpe n�o foi suficiente para passar pela armadura do inimigo!");
        return;
    }

    defensor.diminuirVida(danoTotal);

    if (!defensor.estaVivo()) {
        mensagem = "O inimigo n�o � p�reo para o seu hero�smo, e jaz im�vel aos seus p�s.";
    }

    System.out.println(mensagem);
}

}

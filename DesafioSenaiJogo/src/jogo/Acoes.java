package jogo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import enuns.*;

public class Acoes {
	
 public static void criacaoPersonagem() {
	        String nome = getNomePersonagem();
	        TiposSexo tipoSexo = getSexoPersonagem();
	        TiposClasses tipoClasse = getClassePersonagem();
	        TiposArmas tipoArma = getTipoArmaPersonagem(tipoClasse);
	        TiposNiveis tipoNivel = getTipoNivelJogo();

	        pessoa = new PersonagemPessoa(nome, tipoSexo, tipoClasse, tipoArma);
	        Acoes.nivel = tipoNivel;
	        System.out.println(pessoa);
	        enterSeguirAdiante();
 }

	public static Scanner teclado = new Scanner(System.in);
    static TiposNiveis nivel;
    static PersonagemPessoa pessoa;
    static Random random = new Random();
    

    public static String getNomePersonagem() {
        int confirmacao;
        String nome;
        do {
            System.out.println("Escolha seu nome e aperte ENTER");
            nome = teclado.nextLine();
            System.out.println("O nome do seu personagem � \"" + nome + "\"? Aperte 1 para confirmar ou 2 para digitar um novo nome.");
            confirmacao = confirmaEscolha();
        } while (confirmacao != 1);
        return nome;
    }

    public static String getJogador() {
        return pessoa.toString();
    }

    public static int rolarDado(int facesDados) {
        return 1 + Acoes.random.nextInt(facesDados);
    }
    public static TiposSexo getSexoPersonagem() {
        int confirmacao;
        int sexo = 0;
        TiposSexo tipoSexo = null;
        do {
            System.out.println("Escolha seu sexo:");
            for (TiposSexo sexoEnum : TiposSexo.values()) {
                System.out.println(sexoEnum.ordinal() + ". " + sexoEnum);
            }
            try {
                sexo = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                sexo = TiposSexo.values().length;
            }
            if (sexo >= TiposSexo.values().length) {
                System.out.println("A op��o escolhida � inv�lida!");
                confirmacao = 2;
            } else {
                tipoSexo = TiposSexo.values()[sexo];
                System.out.println("O sexo do seu personagem � \"" + tipoSexo + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);

        return tipoSexo;
    }

    public static void enterSeguirAdiante() {
        System.out.println("Pressione ENTER para seguir adiante");
        teclado.nextLine();
    }


    public static int confirmaEscolha() {
        int confirmacao;
        try {
            confirmacao = Integer.parseInt(teclado.nextLine());
        } catch (Exception exception) {
            confirmacao = 2;
            System.out.println("Por favor, digite um n�mero inteiro!");
        }
        return confirmacao;
    }

    
    public static TiposClasses getClassePersonagem() {
        int confirmacao;
        int classe;
        TiposClasses tipoClasse = null;
        do {
            System.out.println("Escolha a classe do seu personagem:");
            for (TiposClasses classeEnum : TiposClasses.values()) {
                System.out.println(classeEnum.ordinal() + ". " + classeEnum);
            }
            try {
                classe = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                classe = TiposClasses.values().length;
            }
            if (classe >= TiposClasses.values().length) {
                System.out.println("A op��o escolhida � inv�lida!");
                confirmacao = 2;
            } else {
                tipoClasse = TiposClasses.values()[classe];
                System.out.println("A classe do seu personagem � \"" + tipoClasse + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        return tipoClasse;
    }

    public static TiposArmas getTipoArmaPersonagem(TiposClasses tipoClasse) {
        int confirmacao;
        int arma;
        ArrayList<TiposArmas> armasClasse = tipoClasse.getTiposArmas();
        TiposArmas tipoArma = null;
        do {
            System.out.println("Escolha a arma que voc� ir� usar:");
            for (TiposArmas armaEnum : armasClasse) {
                System.out.println(armasClasse.indexOf(armaEnum) + ". " + armaEnum);
            }
            try {
                arma = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                arma = armasClasse.size();
            }
            if (arma >= armasClasse.size()) {
                System.out.println("A op��o escolhida � inv�lida!");
                confirmacao = 2;
            } else {
                tipoArma = armasClasse.get(arma);
                System.out.println("A arma do seu personagem � \"" + tipoArma + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        return tipoArma;
    }
    
    private static TiposNiveis getTipoNivelJogo() {
        int confirmacao;
        int nivel;
        TiposNiveis tipoNivel = null;
        do {
            System.out.println("Escolha o n�vel de dificuldade");
            for (TiposNiveis nivelEnum : TiposNiveis.values()) {
                System.out.println(nivelEnum.ordinal() + ". " + nivelEnum);
            }
            try {
                nivel = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                nivel = TiposNiveis.values().length;
            }
            if (nivel >= TiposNiveis.values().length) {
                System.out.println("A op��o escolhida � inv�lida!");
                confirmacao = 2;
            } else {
                tipoNivel = TiposNiveis.values()[nivel];
                System.out.println("A dificuldade do jogo � \"" + tipoNivel + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        return tipoNivel;
    }

    public static String getMotivacaoPersonagem() {
        int confirmacao;
        int motivacao;
        TiposMotivacoes tipoMotivacao = null;
        do {
            System.out.println("Escolha sua motiva��o:");
            for (TiposMotivacoes motivacaoEnum : TiposMotivacoes.values()) {
                System.out.println(motivacaoEnum.ordinal() + ". " + motivacaoEnum.getMotivacao());
            }
            try {
                motivacao = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                motivacao = TiposMotivacoes.values().length;
            }
            if (motivacao >= TiposMotivacoes.values().length) {
                System.out.println("A op��o escolhida � inv�lida!");
                confirmacao = 2;
            } else {
                tipoMotivacao = TiposMotivacoes.values()[motivacao];
                System.out.println("A motiva��o do seu personagem � \"" + tipoMotivacao + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        pessoa.setTipoMotivacao(tipoMotivacao);
        return tipoMotivacao.getTextoMotivacao();
    }

    public static void opcaoSeguirDesistir() {
        int escolha;
        int confirmacao;
        do {
            System.out.println("                    O que voc� ir� fazer?\r\n"
            		+ "                    1. DESISTIR\r\n"
            		+ "                    2. SEGUIR EM FRENTE");
            try {
                escolha = Integer.parseInt(teclado.nextLine());
            } catch (Exception e) {
                escolha = 3;
            }

            if (escolha > 2 || escolha < 1) {
                System.out.println("A op��o escolhida � inv�lida!");
                confirmacao = 2;
            } else {
                String acao = escolha == 1 ? "DESISTIR" : "SEGUIR EM FRENTE";
                System.out.println("Voc� ir� " + acao + "? Aperte 1 para confirmar sua a��o ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);

        if (escolha == 1) {
            System.out.println( "O medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio. Voc� se volta \n" +
                    "para a noite l� fora e corre em dire��o � seguran�a.");
            System.exit(0);
            return;
        }

        System.out.println( "Voc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente uma fonte \n" +
                "de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
    }

    public static void opcaoSaltarAndarCorrer() {
        int escolha;
        int confirmacao;
        do {
            System.out.println("Como voc� ir� passar pela porta?\r\n"
            		+ "                    1. SALTANDO\r\n"
            		+ "                    2. ANDANDO\r\n"
            		+ "                    3. CORRENDO");

            try {
                escolha = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                escolha = 4;
            }

            if (escolha > 3 || escolha < 1) {
                System.out.println("A op��o escolhida � inv�lida!");
                confirmacao = 2;
            } else {
                System.out.println("Aperte 1 para confirmar sua a��o ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);

        if (escolha == 1) {
            System.out.println("Voc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior da sala.");
            return;
        }

        if (escolha == 2) {
            System.out.println("Voc� toma cuidado e vai caminhando vagarosamente em dire��o � luz. Quando voc� pisa exatamente\r\n"
            		+ "                    embaixo da porta, voc� sente o ch�o ceder levemente, como se tivesse pisado em uma pedra solta.\r\n"
            		+ "                    Voc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se abre no teto atr�s de voc�,\r\n"
            		+ "                    no corredor. Flechas voam da escotilha em sua dire��o, e voc� salta para dentro da sala, por�m uma\r\n"
            		+ "                    delas te acerta na perna.");
            int danoRecebido = Acoes.rolarDado(10);
            pessoa.diminuirVida(danoRecebido);
            //      Acoes.linhaSeparadora();
            System.out.println("Voc� recebeu " + danoRecebido + " de dano!\n" +
                    "Sua vida atual � de " + pessoa.getPontosDeVida() + " pontos de vida.");
            return;
        }
        System.out.println("Voc� respira fundo e desata a correr em dire��o � sala. Quando passa pela porta, sente que pisou em\r\n"
        		+ "uma pedra solta, mas n�o d� muita import�ncia e segue para dentro da sala, olhando ao redor � procura\r\n"
        		+ "de inimigos. N�o tem ningu�m, mas voc� ouve sons de flechas batendo na pedra atr�s de voc�, e quando\r\n"
        		+ "se vira, v� v�rias flechas no ch�o. Espiando pela porta, voc� entende que pisou em uma armadilha que\r\n"
        		+ "                soltou flechas de uma escotilha aberta no teto, mas por sorte voc� entrou correndo e conseguiu escapar\r\n"
        		+ "                desse ataque surpresa.");
    }

    public static void primeiroInimigo() {
        Combate combate = new Combate(Acoes.pessoa, new PersonagemComputador(TiposAdversarios.ARMEIRO));
        combate.iniciarCombate();
        System.out.println("" +
                "Ap�s derrotar o Armeiro, voc� percebe que seus equipamentos est�o muito danificados, e olha \n" +
                "em volta, encarando todas aquelas pe�as de armaduras resistentes e em �timo estado.");
        int confirmacao;
        int escolha;
        do {
            System.out.println("O que voc� desejar fazer?\r\n"
            		+ "                    1. USAR ARMADURA DO INIMIGO\r\n"
            		+ "                    2. SEGUIR EM FRENTE");
            try {
                escolha = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                escolha = 3;
            }
            if (escolha > 2) {
                System.out.println("A op��o escolhida � inv�lida!");
                confirmacao = 2;
            } else {
                String tipoEscolha = escolha == 1 ? "USAR ARMADURA DO INIMIGO" : "SEGUIR EM FRENTE";
                System.out.println("Voc� ir� \"" + tipoEscolha + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        if (escolha == 1) {
            System.out.println("Voc� resolve usar os equipamentos do inimigo contra ele, e trocar algumas pe�as suas, que estavam\r\n"
            		+ "danificadas, pelas pe�as de armaduras existentes na sala. De armadura nova, voc� se sente mais\r\n"
            		+ "protegido para os desafios � sua frente.");
            int pontosDefesaAntes = pessoa.getPontosDeDefesa();
            pessoa.setPontosDeDefesa(pontosDefesaAntes + 5);
            int pontosDefesaDepois = pessoa.getPontosDeDefesa();
            System.out.println("Seus pontos de armadura subiram de " + pontosDefesaAntes + " pontos para " + pontosDefesaDepois + " pontos!");
            enterSeguirAdiante();
            return;
        }

        System.out.println("Voc� decide que n�o precisa utilizar nada que venha das m�os do inimigo.");
        enterSeguirAdiante();
    }

    public static void segundoInimigo() {
        Combate combate = new Combate(Acoes.pessoa, new PersonagemComputador(TiposAdversarios.ALQUIMISTA));
        combate.iniciarCombate();
        System.out.println("\r\n"
        		+ "                Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque do inimigo.\\s\r\n"
        		+ "                Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido levemente rosado, pega a\\s\r\n"
        		+ "                garrafa e pondera se deve beber um gole.");
        int confirmacao;
        int escolha;
        do {
            System.out.println("\r\n"
            		+ "                    O que voc� desejar fazer?\r\n"
            		+ "                    1. BEBER A PO��O\r\n"
            		+ "                    2. N�O BEBER A PO��O E SEGUIR EM FRENTE");
            try {
                escolha = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                escolha = 3;
            }
            if (escolha > 2) {
                System.out.println("A op��o escolhida � inv�lida!");
                confirmacao = 2;
            } else {
                String tipoEscolha = escolha == 1 ? "BEBER A PO��O" : "N�O BEBER A PO��O E SEGUIR EM FRENTE";
                System.out.println("Voc� ir� \"" + tipoEscolha + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        if (escolha == 1) {
            System.out.println(" Voc� se sente revigorado para seguir adiante!");
            int pontosDeVidaAntes = pessoa.getPontosDeVida();
            int pontosDeVidaClasse = pessoa.getClasse().getPontosDeVida();
            pessoa.setPontosDeVida(pontosDeVidaClasse);
            System.out.println("Seus pontos de vida subiram de " + pontosDeVidaAntes + " pontos para " + pontosDeVidaClasse + " pontos!");
            enterSeguirAdiante();
            return;
        }

        System.out.println("Voc� fica receoso de beber algo produzido pelo inimigo.");
        enterSeguirAdiante();
    }

    public static void inimigoLider() {
        int confirmacao;
        int escolha;
        do {
            System.out.println("O que voc� desejar fazer?\r\n"
            		+ "                    1. ESPERAR\r\n"
            		+ "                    2. ATACAR");
            try {
                escolha = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                escolha = 3;
            }
            if (escolha > 2) {
                System.out.println("A op��o escolhida � inv�lida!");
                confirmacao = 2;
            } else {
                String tipoEscolha = escolha == 1 ? "ESPERAR" : "ATACAR";
                System.out.println("Voc� ir� \"" + tipoEscolha + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1 || escolha == 1);

        Combate combate = new Combate(Acoes.pessoa, new PersonagemComputador(TiposAdversarios.LIDER));
        combate.iniciarCombate();
        enterSeguirAdiante();
    }
} 

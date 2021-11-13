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
            System.out.println("O nome do seu personagem é \"" + nome + "\"? Aperte 1 para confirmar ou 2 para digitar um novo nome.");
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
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                tipoSexo = TiposSexo.values()[sexo];
                System.out.println("O sexo do seu personagem é \"" + tipoSexo + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
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
            System.out.println("Por favor, digite um número inteiro!");
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
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                tipoClasse = TiposClasses.values()[classe];
                System.out.println("A classe do seu personagem é \"" + tipoClasse + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
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
            System.out.println("Escolha a arma que você irá usar:");
            for (TiposArmas armaEnum : armasClasse) {
                System.out.println(armasClasse.indexOf(armaEnum) + ". " + armaEnum);
            }
            try {
                arma = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                arma = armasClasse.size();
            }
            if (arma >= armasClasse.size()) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                tipoArma = armasClasse.get(arma);
                System.out.println("A arma do seu personagem é \"" + tipoArma + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
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
            System.out.println("Escolha o nível de dificuldade");
            for (TiposNiveis nivelEnum : TiposNiveis.values()) {
                System.out.println(nivelEnum.ordinal() + ". " + nivelEnum);
            }
            try {
                nivel = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                nivel = TiposNiveis.values().length;
            }
            if (nivel >= TiposNiveis.values().length) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                tipoNivel = TiposNiveis.values()[nivel];
                System.out.println("A dificuldade do jogo é \"" + tipoNivel + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
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
            System.out.println("Escolha sua motivação:");
            for (TiposMotivacoes motivacaoEnum : TiposMotivacoes.values()) {
                System.out.println(motivacaoEnum.ordinal() + ". " + motivacaoEnum.getMotivacao());
            }
            try {
                motivacao = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                motivacao = TiposMotivacoes.values().length;
            }
            if (motivacao >= TiposMotivacoes.values().length) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                tipoMotivacao = TiposMotivacoes.values()[motivacao];
                System.out.println("A motivação do seu personagem é \"" + tipoMotivacao + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
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
            System.out.println("                    O que você irá fazer?\r\n"
            		+ "                    1. DESISTIR\r\n"
            		+ "                    2. SEGUIR EM FRENTE");
            try {
                escolha = Integer.parseInt(teclado.nextLine());
            } catch (Exception e) {
                escolha = 3;
            }

            if (escolha > 2 || escolha < 1) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                String acao = escolha == 1 ? "DESISTIR" : "SEGUIR EM FRENTE";
                System.out.println("Você irá " + acao + "? Aperte 1 para confirmar sua ação ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);

        if (escolha == 1) {
            System.out.println( "O medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta \n" +
                    "para a noite lá fora e corre em direção à segurança.");
            System.exit(0);
            return;
        }

        System.out.println( "Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte \n" +
                "de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
    }

    public static void opcaoSaltarAndarCorrer() {
        int escolha;
        int confirmacao;
        do {
            System.out.println("Como você irá passar pela porta?\r\n"
            		+ "                    1. SALTANDO\r\n"
            		+ "                    2. ANDANDO\r\n"
            		+ "                    3. CORRENDO");

            try {
                escolha = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                escolha = 4;
            }

            if (escolha > 3 || escolha < 1) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                System.out.println("Aperte 1 para confirmar sua ação ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);

        if (escolha == 1) {
            System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
            return;
        }

        if (escolha == 2) {
            System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente\r\n"
            		+ "                    embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta.\r\n"
            		+ "                    Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você,\r\n"
            		+ "                    no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma\r\n"
            		+ "                    delas te acerta na perna.");
            int danoRecebido = Acoes.rolarDado(10);
            pessoa.diminuirVida(danoRecebido);
            //      Acoes.linhaSeparadora();
            System.out.println("Você recebeu " + danoRecebido + " de dano!\n" +
                    "Sua vida atual é de " + pessoa.getPontosDeVida() + " pontos de vida.");
            return;
        }
        System.out.println("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em\r\n"
        		+ "uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura\r\n"
        		+ "de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, e quando\r\n"
        		+ "se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que\r\n"
        		+ "                soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e conseguiu escapar\r\n"
        		+ "                desse ataque surpresa.");
    }

    public static void primeiroInimigo() {
        Combate combate = new Combate(Acoes.pessoa, new PersonagemComputador(TiposAdversarios.ARMEIRO));
        combate.iniciarCombate();
        System.out.println("" +
                "Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha \n" +
                "em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
        int confirmacao;
        int escolha;
        do {
            System.out.println("O que você desejar fazer?\r\n"
            		+ "                    1. USAR ARMADURA DO INIMIGO\r\n"
            		+ "                    2. SEGUIR EM FRENTE");
            try {
                escolha = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                escolha = 3;
            }
            if (escolha > 2) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                String tipoEscolha = escolha == 1 ? "USAR ARMADURA DO INIMIGO" : "SEGUIR EM FRENTE";
                System.out.println("Você irá \"" + tipoEscolha + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        if (escolha == 1) {
            System.out.println("Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, que estavam\r\n"
            		+ "danificadas, pelas peças de armaduras existentes na sala. De armadura nova, você se sente mais\r\n"
            		+ "protegido para os desafios à sua frente.");
            int pontosDefesaAntes = pessoa.getPontosDeDefesa();
            pessoa.setPontosDeDefesa(pontosDefesaAntes + 5);
            int pontosDefesaDepois = pessoa.getPontosDeDefesa();
            System.out.println("Seus pontos de armadura subiram de " + pontosDefesaAntes + " pontos para " + pontosDefesaDepois + " pontos!");
            enterSeguirAdiante();
            return;
        }

        System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
        enterSeguirAdiante();
    }

    public static void segundoInimigo() {
        Combate combate = new Combate(Acoes.pessoa, new PersonagemComputador(TiposAdversarios.ALQUIMISTA));
        combate.iniciarCombate();
        System.out.println("\r\n"
        		+ "                Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo.\\s\r\n"
        		+ "                Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, pega a\\s\r\n"
        		+ "                garrafa e pondera se deve beber um gole.");
        int confirmacao;
        int escolha;
        do {
            System.out.println("\r\n"
            		+ "                    O que você desejar fazer?\r\n"
            		+ "                    1. BEBER A POÇÃO\r\n"
            		+ "                    2. NÃO BEBER A POÇÃO E SEGUIR EM FRENTE");
            try {
                escolha = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                escolha = 3;
            }
            if (escolha > 2) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                String tipoEscolha = escolha == 1 ? "BEBER A POÇÃO" : "NÃO BEBER A POÇÃO E SEGUIR EM FRENTE";
                System.out.println("Você irá \"" + tipoEscolha + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        if (escolha == 1) {
            System.out.println(" Você se sente revigorado para seguir adiante!");
            int pontosDeVidaAntes = pessoa.getPontosDeVida();
            int pontosDeVidaClasse = pessoa.getClasse().getPontosDeVida();
            pessoa.setPontosDeVida(pontosDeVidaClasse);
            System.out.println("Seus pontos de vida subiram de " + pontosDeVidaAntes + " pontos para " + pontosDeVidaClasse + " pontos!");
            enterSeguirAdiante();
            return;
        }

        System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");
        enterSeguirAdiante();
    }

    public static void inimigoLider() {
        int confirmacao;
        int escolha;
        do {
            System.out.println("O que você desejar fazer?\r\n"
            		+ "                    1. ESPERAR\r\n"
            		+ "                    2. ATACAR");
            try {
                escolha = Integer.parseInt(teclado.nextLine());
            } catch (Exception exception) {
                escolha = 3;
            }
            if (escolha > 2) {
                System.out.println("A opção escolhida é inválida!");
                confirmacao = 2;
            } else {
                String tipoEscolha = escolha == 1 ? "ESPERAR" : "ATACAR";
                System.out.println("Você irá \"" + tipoEscolha + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1 || escolha == 1);

        Combate combate = new Combate(Acoes.pessoa, new PersonagemComputador(TiposAdversarios.LIDER));
        combate.iniciarCombate();
        enterSeguirAdiante();
    }
} 

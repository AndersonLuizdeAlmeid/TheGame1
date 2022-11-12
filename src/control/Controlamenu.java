package control;

import ui.ImprimeDialogs;

public class Controlamenu {

	ImprimeDialogs imprimeDialogs = new ImprimeDialogs();
	ControlaPersonagem controlePersonagem = new ControlaPersonagem();
	ControlaClasse controleClasse = new ControlaClasse();
	ControlaArma controleArma = new ControlaArma();
	ControlaBatalha controleBatalha = new ControlaBatalha();

	public Controlamenu() {
		boolean controlaWhile = true;

		while (controlaWhile) {
			controlaWhile = menuPrincipal();
		}
	}

	public boolean menuPrincipal() {
		int opcao;
		boolean whileControl = true;

		opcao = imprimeDialogs.apresentaDialogcomInputInteiro("1-Criar Personagem\n2-Batalhar\n3-Sair",
				"TheGame");

		switch (opcao) {

			case 1:
				String nomePersonagem;
				nomePersonagem = imprimeDialogs.apresentaDialogcomInputString("Digite o seu nome jogador:",
						"CriandoPersonagem");
				controlePersonagem.setName(nomePersonagem);
				menuCriacaoPersonagem();
				break;

			case 2:
				if (controlePersonagem.getPlayer().getClasse() == null
						|| controlePersonagem.getPlayer().getWeapon() == null) {
					imprimeDialogs.apresentaDialogError("Jogador voce deve criar um personagem antes de batalhar.",
							"Error");
				} else {
					controleBatalha.IniciaBatalha(controlePersonagem.getPlayer());
				}

				break;
			case 3:
				whileControl = false;
				break;
		}

		return whileControl;
	}

	public void menuCriacaoPersonagem() {
		int opcao;
		int opcao2;

		opcao = imprimeDialogs.apresentaDialogcomInputInteiro(
				"1-Selecionar Classe\n2-Selecionar Arma\n3-Selecionar Skill\n4-Mostra Personagem\n5-Sair",
				"CriacaoPersonagem");

		switch (opcao) {

			case 1:
				opcao2 = imprimeDialogs.apresentaDialogcomInputInteiro(
						"1-Soldier \n2-Guerreiro \n3-Arqueiro \n4-Mago \n5-Elfo \n6-Sair",
						"Escolha Classe");
				controleClasse.selecionaClasse(opcao2, controlePersonagem.getPlayer());
				menuCriacaoPersonagem();
				break;

			case 2:
				if (controlePersonagem.getPlayer().getClasse() == null) {
					imprimeDialogs.apresentaDialogError("Jogador você deve antes escolher uma classe.", "Error");
				} else {
					controleArma.SelecionaArma(controlePersonagem.getPlayer());
					// Object imagem = controleArma.ImagemArma();
				}
				menuCriacaoPersonagem();
				break;

			case 3:
				imprimeDialogs.apresentaDialogInformation("As habilidades ainda nao foram implementadas",
						"Escolha Skill");
				menuCriacaoPersonagem();
				break;

			case 4:
				if (controlePersonagem.getPlayer().getClasse() == null
						|| controlePersonagem.getPlayer().getWeapon() == null) {
					imprimeDialogs.apresentaDialogError("Jogador você deve antes escolher uma classe e uma arma.",
							"Error");
				} else {
					String msg = controlePersonagem.MostraDadosPlayer();
					imprimeDialogs.apresentaDialogInformation(msg, "Dados Jogador");
				}

				menuCriacaoPersonagem();
				break;

			case 5:
				System.out.printf("Saindo da Criacao Personagem");
				break;
		}
	}

}
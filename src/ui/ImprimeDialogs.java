package ui;

import javax.swing.JOptionPane;

public class ImprimeDialogs {

	public int apresentaDialogcomInputInteiro(String msg, String titulo) {
		String OpcaoMenu;
		try {
			OpcaoMenu = JOptionPane.showInputDialog(null, msg, titulo, -1);

			if (OpcaoMenu != null) {
				return (Integer.parseInt(OpcaoMenu));
			} else {
				throw new Error("Exit");
			}
		} catch (Exception e) {
			apresentaDialogError("Valor inserido é invalido!!!", "InputError");
			return 0;
		} catch (Error e) {
			apresentaDialogInformation("Finalizando o Jogo!!!", e.getMessage());
			System.exit(0);
			return 0;
		}
	}

	public String apresentaDialogcomInputString(String msg, String titulo) {
		String palavra;
		try {
			palavra = JOptionPane.showInputDialog(null, msg, titulo, -1);
			if (palavra == null) {

				throw new Error("Exit");

			} else if (palavra.equals("")) {

				throw new Error("InputError");

			} else {
				return palavra;
			}
		} catch (Error e) {

			if (e.getMessage() == "Exit") {

				apresentaDialogInformation("Finalizando o Jogo!!!", e.getMessage());
				System.exit(0);
				return "Exit";

			} else {

				apresentaDialogError("Valor inserido é invalido. Tente novamente!", "InputError");
				return palavra = apresentaDialogcomInputString(msg, titulo);

			}
		}
	}

	public void apresentaDialogError(String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
	}

	public void apresentaDialogWarning(String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.WARNING_MESSAGE);
	}

	public void apresentaDialogInformation(String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	public void apresentaDiaologImage(String msg, String titulo, String Imagem) {

	}
}
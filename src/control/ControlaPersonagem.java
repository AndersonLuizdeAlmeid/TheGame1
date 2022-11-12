package control;

import model.Player;
import model.Weapon;

public class ControlaPersonagem {

    private Player jogador1 = new Player();
    
    public void setName(String nome) {
        jogador1.setName(nome);
    }

    public void setWeapon(Weapon arma) {
        jogador1.setWeapon(arma);
    }

    public Player getPlayer() {
        return this.jogador1;
    }

    public String MostraDadosPlayer(){
        String mensagem;
        mensagem = "Dados do Jogador: " + this.jogador1.getName() + "\n\nVida: " + this.jogador1.getLife().getLife() + "\nDefesa: " + this.jogador1.getDefense().getDefense() +"\nClasse Escolhida: " + this.jogador1.getClasse().getName() +
        "\nArma Escolhida: " + this.jogador1.getWeapon().getType() + "\n"+ "Dano da Arma: "+this.jogador1.getWeapon().getDamage();
        return mensagem;
    }

}

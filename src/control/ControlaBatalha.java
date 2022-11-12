package control;

import ui.ImprimeDialogs;
import model.Weapon;
import model.Player;

import java.util.Random;

import model.Enemy;
import model.Life;

import java.util.ArrayList; // import the ArrayList class

public class ControlaBatalha{
    ImprimeDialogs imprimeDialogs = new ImprimeDialogs();

    Weapon inimigoArma1 = new Weapon("Mordida",5);
    Life inimigoVida1 = new Life(20);
    Enemy inimigo1 = new Enemy("LoboGuara",inimigoArma1,inimigoVida1);

    Weapon inimigoArma2 = new Weapon("Pedrada",10);
    Life inimigoVida2 = new Life(80);
    Enemy inimigo2 = new Enemy("Curupira",inimigoArma2,inimigoVida2);

    Weapon inimigoArma3 = new Weapon("Tornado",15);
    Life inimigoVida3 = new Life(95);
    Enemy inimigo3 = new Enemy("Saci",inimigoArma3,inimigoVida3);

    ArrayList<Enemy> Listainimigos = new ArrayList<Enemy>(); 

    private short ContadorInimigos=0;

    public ControlaBatalha(){
        Listainimigos.add(inimigo1);
        Listainimigos.add(inimigo2);
        Listainimigos.add(inimigo3);        
    }

    public void IniciaBatalha(Player jogador){
        boolean controlaDano = true;
        int opcao;

        imprimeDialogs.apresentaDialogInformation("BATALHA CONTRA "+Listainimigos.get(ContadorInimigos).getName(),"INICIANDO BATALHA");

        while (controlaDano == true){

            if(jogador.getLife().getLife() <= 0){
                controlaDano = false;
                imprimeDialogs.apresentaDialogInformation("YOU LOSEE!!!!!!!!!",
                "YOU LOSEE!!!!!!!!!");
                
            }
            opcao = imprimeDialogs.apresentaDialogcomInputInteiro("1-Atacar\n2-Defender",
            "Batalha");
            
            switch (opcao) {

                case 1:
                    AtaquePlayer(jogador,Listainimigos.get(ContadorInimigos));

                    if (Listainimigos.get(ContadorInimigos).getLife().getLife() <= 0 ){
                        controlaDano = false;
                        ContadorInimigos++;
                        imprimeDialogs.apresentaDialogInformation("You Win!","You Win!");
                    }else{
                        AtaqueInimigo(jogador,Listainimigos.get(ContadorInimigos));
                    }

                    break;
    
                case 2:
                    DefesaJogador(jogador,Listainimigos.get(ContadorInimigos));
                    break;
            }
        }
    }
    public void AtaqueInimigo(Player jogador, Enemy inimigo){

        Random gerador = new Random();
        int danoDoInimigo = inimigo.getWeapon().getDamage();

        danoDoInimigo = gerador.nextInt(danoDoInimigo);

        int vidaJogador = jogador.getLife().getLife();
        int vidaInicialJogador = vidaJogador;

        vidaJogador = (vidaJogador - danoDoInimigo); 

        jogador.getLife().setLife(vidaJogador);

        imprimeDialogs.apresentaDialogInformation("Vida do Player = "+ vidaInicialJogador + "\nVida do Inimigo = " + inimigo.getLife().getLife() + "\nDano sofrido do inimigo = " + danoDoInimigo,
        "Batalha Contra "+ inimigo.getName() + " - Ataque Inimigo");

    }

    public void AtaquePlayer(Player jogador, Enemy inimigo){
        Random gerador = new Random();
        int danoDoJogador = jogador.getWeapon().getDamage();

        danoDoJogador = gerador.nextInt(danoDoJogador);

        int vidaInimigo = inimigo.getLife().getLife();
        int vidaInicialInimigo = vidaInimigo;

        vidaInimigo = (vidaInimigo - danoDoJogador); 

        inimigo.getLife().setLife(vidaInimigo);

        imprimeDialogs.apresentaDialogInformation("Vida do Player = "+jogador.getLife().getLife() + "\nVida do Inimigo = " + vidaInicialInimigo + "\nDano causado no inimigo = " + danoDoJogador,
        "Batalha Contra "+ inimigo.getName() + " - Ataque Player");
    }

    public void DefesaJogador(Player jogador, Enemy inimigo){
        Random gerador = new Random();
        int danoDoInimigo = inimigo.getWeapon().getDamage();

        danoDoInimigo = gerador.nextInt(danoDoInimigo);

        int defesaDoJogador = jogador.getDefense().getDefense();

        if(defesaDoJogador >= danoDoInimigo){
            imprimeDialogs.apresentaDialogInformation("Ataque foi defendido, você não sofrera dano nessa rodada!", "DefesaJogador");
        }else{
            imprimeDialogs.apresentaDialogInformation("Ataque não foi defendido!", "DefesaJogador");

            int vidaJogador = jogador.getLife().getLife();
            int vidaInicialJogador = vidaJogador;
    
            vidaJogador = (vidaJogador - danoDoInimigo); 
    
            jogador.getLife().setLife(vidaJogador);
    
            imprimeDialogs.apresentaDialogInformation("Vida do Inimigo = "+ vidaInicialJogador + "\nVida do Inimigo = " + inimigo.getLife().getLife() + "\nDano causado no inimigo = " + danoDoInimigo,
            "Batalha Contra "+ inimigo.getName() + " - Ataque Inimigo");
        }
    }

}
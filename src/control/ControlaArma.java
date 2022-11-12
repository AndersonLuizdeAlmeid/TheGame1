package control;

import ui.ImprimeDialogs;
import model.Weapon;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Player;

public class ControlaArma {
    ImprimeDialogs imprimeDialogs = new ImprimeDialogs();

    private Weapon weapon = new Weapon("Pistol", 1);
    private Weapon weapon2 = new Weapon("MachineGun", 3);
    private Weapon weapon3 = new Weapon("Cannon", 5);
    private Weapon weapon4 = new Weapon("Grenade", 6);
    private Weapon weapon5 = new Weapon("FlameThrower", 15);
    private Weapon weapon6 = new Weapon("Mine", 10);
    private Weapon weapon7 = new Weapon("Sword", 5);
    private Weapon weapon8 = new Weapon("MasterSword", 12);
    private Weapon weapon9 = new Weapon("LegendarySword", 20);
    private Weapon weapon10 = new Weapon("Dagger", 1);
    private Weapon weapon11 = new Weapon("Shield", 2);
    private Weapon weapon12 = new Weapon("Spear", 5);
    private Weapon weapon13 = new Weapon("Axe", 9);
    private Weapon weapon14 = new Weapon("WoodBow", 5);
    private Weapon weapon15 = new Weapon("IronBow", 15);
    private Weapon weapon16 = new Weapon("GoldBow", 25);
    private Weapon weapon17 = new Weapon("WoodArrow", 5);
    private Weapon weapon18 = new Weapon("IronArrow", 15);
    private Weapon weapon19 = new Weapon("GoldArrow", 25);
    private Weapon weapon20 = new Weapon("Wand", 2);
    private Weapon weapon21 = new Weapon("Summon", 5);
    private Weapon weapon22 = new Weapon("DragonBreath", 15);
    private Weapon weapon23 = new Weapon("FireMagic", 14);
    private Weapon weapon24 = new Weapon("WindMagic", 13);
    private Weapon weapon25 = new Weapon("DomeShield", 6);
    private Weapon weapon26 = new Weapon("EarthMagic", 15);

    public ControlaArma() {
    }

    public void ImagemArma() throws IOException {

        BufferedImage img = ImageIO.read(new File("C://nakama.png"));
        ImageIcon icon = new ImageIcon(img);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 300);
        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void SelecionaArma(Player Jogador) {
        int opcao;
        switch (Jogador.getClasse().getName()) {
            case "SOLDIER":
                opcao = imprimeDialogs.apresentaDialogcomInputInteiro(
                        "1-Pistol\n2-MachineGun\n3-Cannon\n4-Grenade\n5-FlameThrower\n6-Mine",
                        "SelecaoDeArma");

                if (opcao == 1) {
                    Jogador.setWeapon(weapon);
                } else if (opcao == 2) {
                    Jogador.setWeapon(weapon2);
                } else if (opcao == 3) {
                    Jogador.setWeapon(weapon3);
                } else if (opcao == 4) {
                    Jogador.setWeapon(weapon4);
                } else if (opcao == 5) {
                    Jogador.setWeapon(weapon5);
                } else if (opcao == 6) {
                    Jogador.setWeapon(weapon6);
                }

                break;
            case "GUERREIRO":
                opcao = imprimeDialogs.apresentaDialogcomInputInteiro(
                        "1-Sword\n2-MasterSword\n3-LegendarySword\n4-Dagger\n5-Shield\n6-Spear\n7-Axe",
                        "SelecaoDeArma");

                if (opcao == 1) {
                    Jogador.setWeapon(weapon7);
                } else if (opcao == 2) {
                    Jogador.setWeapon(weapon8);
                } else if (opcao == 3) {
                    Jogador.setWeapon(weapon9);
                } else if (opcao == 4) {
                    Jogador.setWeapon(weapon10);
                } else if (opcao == 5) {
                    Jogador.setWeapon(weapon11);
                } else if (opcao == 6) {
                    Jogador.setWeapon(weapon12);
                } else if (opcao == 7) {
                    Jogador.setWeapon(weapon13);
                }

                break;
            case "ARQUEIRO":
                opcao = imprimeDialogs.apresentaDialogcomInputInteiro(
                        "1-WoodBow\n2-IronBow\n3-GoldBow\n4-WoodArrow\n5-IronArrow\n6-TripleArrow",
                        "SelecaoDeArma");

                if (opcao == 1) {
                    Jogador.setWeapon(weapon14);
                } else if (opcao == 2) {
                    Jogador.setWeapon(weapon15);
                } else if (opcao == 3) {
                    Jogador.setWeapon(weapon16);
                } else if (opcao == 4) {
                    Jogador.setWeapon(weapon17);
                } else if (opcao == 5) {
                    Jogador.setWeapon(weapon18);
                } else if (opcao == 6) {
                    Jogador.setWeapon(weapon19);
                }

                break;
            case "MAGO":
                opcao = imprimeDialogs.apresentaDialogcomInputInteiro(
                        "1-Wand\n2-Summon\n3-DragonBreath\n4-FireMagic\n5-WindMagic\n6-DomeShield",
                        "SelecaoDeArma");

                if (opcao == 1) {
                    Jogador.setWeapon(weapon20);
                } else if (opcao == 2) {
                    Jogador.setWeapon(weapon21);
                } else if (opcao == 3) {
                    Jogador.setWeapon(weapon22);
                } else if (opcao == 4) {
                    Jogador.setWeapon(weapon23);
                } else if (opcao == 5) {
                    Jogador.setWeapon(weapon24);
                } else if (opcao == 6) {
                    Jogador.setWeapon(weapon25);
                }

                break;
            case "ELFO":
                opcao = imprimeDialogs.apresentaDialogcomInputInteiro(
                        "1-EarthMagic\n2-LegendarySword\n3-IronBow\n4-Dagger\n5-Spear\n6-MasterSword\n7-DragonBreath\n8-DomeShield",
                        "SelecaoDeArma");

                if (opcao == 1) {
                    Jogador.setWeapon(weapon26);
                } else if (opcao == 2) {
                    Jogador.setWeapon(weapon9);
                } else if (opcao == 3) {
                    Jogador.setWeapon(weapon15);
                } else if (opcao == 4) {
                    Jogador.setWeapon(weapon10);
                } else if (opcao == 5) {
                    Jogador.setWeapon(weapon12);
                } else if (opcao == 6) {
                    Jogador.setWeapon(weapon8);
                } else if (opcao == 7) {
                    Jogador.setWeapon(weapon22);
                } else if (opcao == 8) {
                    Jogador.setWeapon(weapon25);
                }
                break;
            default:
                System.out.printf(
                        "Nenhuma classe foi escolhida, voce deve selecionar uma classe antes de pegar uma arma");
                break;
        }
    }
}
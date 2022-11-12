package control;

import java.io.File;
import javax.sound.sampled.*;

public class ControlaMusica {
    String PathMusica = "Null";

    public ControlaMusica(String caminhoMusicaString) {
        PathMusica = caminhoMusicaString;
        RodaMusica();
    }

    void RodaMusica() { // Método AudioAcerto para chamar na classe executavel.
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(PathMusica).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Para repetir o som.
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }
}

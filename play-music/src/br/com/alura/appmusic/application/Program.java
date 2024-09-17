package br.com.alura.appmusic.application;

import br.com.alura.appmusic.entities.Musica;
import br.com.alura.appmusic.entities.Podcasts;
import br.com.alura.appmusic.entities.TopPreferidas;

public class Program {
    public static void main(String[] args) {

        Musica play01 = new Musica();
        play01.setTitulo("Dois Tristes");

        Podcasts play02 = new Podcasts();
        play02.setTitulo("Dev Tech");

        for (int i = 0; i < 2000; i++) {
            play01.reproduzirAudio();
        }

        for (int i = 0; i < 1000; i++) {
            play01.curtirAudio();
        }


        for (int i = 0; i < 5000; i++) {
            play02.reproduzirAudio();
        }

        for (int i = 0; i < 1000; i++) {
            play02.curtirAudio();
        }


        System.out.println("Titulo: " + play01.getTitulo());
        System.out.println("Quantidade de Curtidas: " + play01.getCurtidas());
        System.out.println("Quantidade de Reprodução: " + play01.getTotalDeReproducao());
        System.out.println("-----------------------------------------------------");

        TopPreferidas tops = new TopPreferidas();
        tops.inclui(play01);
        tops.inclui(play02);

    }
}

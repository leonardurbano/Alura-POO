package br.com.alura.appmusic.entities;

public class Audio {

    private String titulo;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtirAudio(){
        this.curtidas++;
    }

    public void reproduzirAudio(){
        this.totalDeReproducao++;
    }
}

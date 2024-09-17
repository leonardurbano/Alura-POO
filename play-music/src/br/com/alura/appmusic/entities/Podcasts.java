package br.com.alura.appmusic.entities;

public class Podcasts extends Audio {
    String album;
    String artista;
    String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(super.getCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}

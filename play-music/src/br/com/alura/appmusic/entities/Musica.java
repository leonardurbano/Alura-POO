package br.com.alura.appmusic.entities;

public class Musica extends Audio{
    String host;
    String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeReproducao() > 2000){
            return 10;
        }else{
            return 7;
        }
    }
}

package br.com.alura.appmusic.entities;

public class TopPreferidas {
    public void inclui(Audio a){
        if(a.getClassificacao() >= 8){
            System.out.println(a.getClass().getSimpleName() + ": " + a.getTitulo() + ", SUCESSO ABSOLUTO, e é Preferido por todos");
        }else{
            System.out.println(a.getClass().getSimpleName() + ": " + a.getTitulo() + ", também é uma das melhores, continue ouvindo");
        }
    }
}

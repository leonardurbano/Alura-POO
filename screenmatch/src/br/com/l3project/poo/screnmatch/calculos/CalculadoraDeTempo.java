package br.com.l3project.poo.screnmatch.calculos;

import br.com.l3project.poo.screnmatch.modelos.Filme;
import br.com.l3project.poo.screnmatch.modelos.Serie;
import br.com.l3project.poo.screnmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

//    public void setTempoTotal(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void setTempoTotal(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Maratonando do " + titulo.getClass().getSimpleName() + "\t - " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}

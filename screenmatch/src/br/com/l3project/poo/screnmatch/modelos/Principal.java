package br.com.l3project.poo.screnmatch.modelos;

import br.com.l3project.poo.screnmatch.calculos.CalculadoraDeTempo;
import br.com.l3project.poo.screnmatch.calculos.FiltroRecomentacao;

public class Principal {
    public static void main(String[] args) {

        Titulo titulo = new Titulo();
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Serie serie1 = new Serie();
        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);

        filme2.setNome("Rock");
        filme2.setAnoDeLancamento(1990);
        filme2.setDuracaoEmMinutos(200);


        serie1.setNome("Lost");
        serie1.setDuracaoEmMinutos(50);
        serie1.setTemporadas(10);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpisodio(50);

        filme1.avaliaFilme(8);
        filme1.avaliaFilme(5);
        filme1.avaliaFilme(10);

        System.out.println("------------------------------------");
        filme1.exibeFichaTecnica();
        System.out.println("Avaliação do filme: ("+ String.format("%.1f",filme1.pegaMedia())+")");
        System.out.println("------------------------------------");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println("Total em minutos: " + calculadora.getTempoTotal());
        System.out.println("------------------------------------");
        FiltroRecomentacao filtro = new FiltroRecomentacao();
        filtro.filtra(filme1);
        System.out.println("------------------------------------");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        System.out.println("------------------------------------");


    }
}

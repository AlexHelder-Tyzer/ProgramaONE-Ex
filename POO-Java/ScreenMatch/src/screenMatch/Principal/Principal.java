package screenMatch.Principal;

import screenMatch.Calculos.CalculadoraDeTiempo;
import screenMatch.Calculos.FiltroRecomendacion;
import screenMatch.Models.Episodio;
import screenMatch.Models.Pelicula;
import screenMatch.Models.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Panico",2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.evalua(8.9);
        miPelicula.evalua(9.8);

        System.out.println(miPelicula.calculaMedia());

        miPelicula.fichaTecnica();

        Serie casaDragon = new Serie("La Casa del Dragon",2021);
        casaDragon.setFechaDeLanzamiento(2021);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        Pelicula otraPelicula = new Pelicula("La Casa de Papel",2022);
        otraPelicula.setDuracionEnMinutos(160);
        otraPelicula.setIncluidoEnElPlan(true);

        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var newPelicula = new Pelicula("El senhor de los Anillos", 2001);
        newPelicula.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(newPelicula);

        System.out.println("Tamanho de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());


    }
}

import screenMatch.Calculos.CalculadoraDeTiempo;
import screenMatch.Calculos.FiltroRecomendacion;
import screenMatch.Models.Episodio;
import screenMatch.Models.Pelicula;
import screenMatch.Models.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Panico");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.evalua(8.9);
        miPelicula.evalua(9.8);

        System.out.println(miPelicula.calculaMedia());

        miPelicula.fichaTecnica();

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La Casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2021);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("La Casa de Papel");
        otraPelicula.setFechaDeLanzamiento(2022);
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
    }
}

import screenMatch.Models.Pelicula;

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
    }
}

package screenMatch.Principal;

import screenMatch.Models.Pelicula;
import screenMatch.Models.Serie;
import screenMatch.Models.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Panico",2021);
        miPelicula.evalua(8);
        Pelicula otraPelicula = new Pelicula("La Casa de Papel",2022);
        otraPelicula.evalua(9);
        var newPelicula = new Pelicula("El senhor de los Anillos", 2001);
        newPelicula.evalua(10);
        Serie casaDragon = new Serie("La Casa del Dragon",2021);
        casaDragon.evalua(8);

        List<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(newPelicula);
        lista.add(casaDragon);

        for(Titulo item : lista){
            System.out.println(item.getNombre());
            if(item instanceof Pelicula pelicula){
                System.out.println(pelicula.getClasificacion());
            }
        }

        //lista.forEach(item -> System.out.println(item.getNombre()));

        // Ordenamiento de listas
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Guns and Roses");
        listaDeArtistas.add("Linkin Park");
        listaDeArtistas.add("Eminem");

        System.out.println("Lista de artistas: " + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        //lista.forEach(item -> System.out.println(item.getNombre()));

        System.out.println("Lista de Titulos Ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista de Titulos Ordenados por fecha: " + lista);

    }
}

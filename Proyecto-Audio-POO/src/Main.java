import alex.Audio.Cancion;
import alex.Audio.MisFavoritos;
import alex.Audio.PodCast;

public class Main {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        PodCast miPodcast = new PodCast();
        miPodcast.setTitulo("Las senhoras chismosas");
        miPodcast.setPresentador("Jorge Luna y Ricardo Mendoza");
        miPodcast.setDescripcion("Hablando Huevadas");

        for (int i = 0; i < 200; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.reproducir();
        }

        for (int i = 0; i < 300; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 10000; i++) {
            miPodcast.reproducir();
        }

        System.out.println("Total de Me Gusta: " + miCancion.getTotalDeMeGusta());
        System.out.println("Total de Reproducciones: " + miCancion.getTotalDeReproducciones());


        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miCancion);
        favoritos.adicione(miPodcast);
    }
}
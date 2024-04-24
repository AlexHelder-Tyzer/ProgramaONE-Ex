package alex.Audio;

public class Cancion extends Musica{
    private String album;
    private String cantante;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClasificacion() {
        if(getTotalDeMeGusta() > 200){
            return 8;
        }
        else{
            return 4;
        }
    }
}

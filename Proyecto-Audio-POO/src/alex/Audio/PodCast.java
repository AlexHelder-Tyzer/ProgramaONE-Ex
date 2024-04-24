package alex.Audio;

public class PodCast extends Audio{
    private String presentador;
    private String descripcion;

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int getClasificacion() {
        if(getTotalDeReproducciones() > 2000){
            return 8;
        }
        else{
            return 2;
        }
    }
}

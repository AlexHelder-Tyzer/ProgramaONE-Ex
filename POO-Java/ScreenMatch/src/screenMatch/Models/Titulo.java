package screenMatch.Models;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones = 0;
    private int cantidadDeEvaluaciones = 0;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getCantidadDeEvaluaciones(){
        return this.cantidadDeEvaluaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void fichaTecnica(){
        System.out.println("Nombre de la pelicula: " + this.nombre);
        System.out.println("Fecha de lanzamiento: " + this.fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + this.duracionEnMinutos);
    }

    public void evalua(double nota){
        this.cantidadDeEvaluaciones += 1;
        this.sumaDeLasEvaluaciones += nota;
    }

    public double calculaMedia(){
        return this.sumaDeLasEvaluaciones / this.cantidadDeEvaluaciones;
    }
}

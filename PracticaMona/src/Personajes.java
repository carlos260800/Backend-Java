public class Personajes extends Mona{
    private String actividad;
    private String nombre;

    public Personajes(String colorCuerpo, String colorOjos, String colorCabello, String colorPLayera, String colorPantalon, String actividad, String nombre){
        super(colorCuerpo,colorOjos,colorCabello,colorPLayera,colorPantalon);
        this.actividad=actividad;
        this.nombre=nombre;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "colorCuerpo='" + colorCuerpo + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", colorCabello='" + colorCabello + '\'' +
                ", colorPlayera='" + colorPlayera + '\'' +
                ", ColorPantalon='" + ColorPantalon + '\'' +
                ", actividad='" + actividad + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

public class Spiderman {
    private String nombre;
    private String nacionalidad;
    private String ocupacion;
    private String genero;
    private String raza;
    private String universo;

    public Spiderman() {
    }

    public Spiderman(String nombre, String nacionalidad, String ocupacion, String genero, String raza, String universo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.ocupacion = ocupacion;
        this.genero = genero;
        this.raza = raza;
        this.universo = universo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    @Override
    public String toString() {
        return "Spiderman{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", genero='" + genero + '\'' +
                ", raza='" + raza + '\'' +
                ", universo='" + universo + '\'' +
                '}';
    }
}

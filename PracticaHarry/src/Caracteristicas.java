public class Caracteristicas {
    String nombre;
    String casa;
    String genero;
    String especie;

    public void caracteristicas(){

    }

    public Caracteristicas(String nombre, String casa, String genero, String especie) {
        this.nombre = nombre;
        this.casa = casa;
        this.genero = genero;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Caracteristicas{" +
                "nombre='" + nombre + '\'' +
                ", casa='" + casa + '\'' +
                ", genero='" + genero + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}

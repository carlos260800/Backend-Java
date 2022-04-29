public class Mona {
    String colorCuerpo;
    String colorOjos;
    String colorCabello;
    String colorPlayera;
    String ColorPantalon;

    public void Mona(){

    }

    public Mona(String colorCuerpo, String colorOjos, String colorCabello, String colorPlayera, String colorPantalon) {
        this.colorCuerpo = colorCuerpo;
        this.colorOjos = colorOjos;
        this.colorCabello = colorCabello;
        this.colorPlayera = colorPlayera;
        this.ColorPantalon = colorPantalon;
    }

    public String getColorCuerpo() {
        return colorCuerpo;
    }

    public void setColorCuerpo(String colorCuerpo) {
        this.colorCuerpo = colorCuerpo;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public String getColorPlayera() {
        return colorPlayera;
    }

    public void setColorPlayera(String colorPlayera) {
        this.colorPlayera = colorPlayera;
    }

    public String getColorPantalon() {
        return ColorPantalon;
    }

    public void setColorPantalon(String colorPantalon) {
        ColorPantalon = colorPantalon;
    }

    @Override
    public String toString() {
        return "Mona{" +
                "colorCuerpo='" + colorCuerpo + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", colorCabello='" + colorCabello + '\'' +
                ", colorPlayera='" + colorPlayera + '\'' +
                ", ColorPantalon='" + ColorPantalon + '\'' +
                '}';
    }
}

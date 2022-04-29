public class Personajes {
    Caracteristicas personaje1=new Caracteristicas("Hermione Jean Granger","Gryffindor","Femenino","Humana");
    Caracteristicas personaje2=new Caracteristicas("Cedric Diggory","Hufflepuff","Masculino","Humano");
    Caracteristicas personaje3=new Caracteristicas("Maisy Reynolds","Ravenclaw","Femenino","Humana");
    Caracteristicas personaje4=new Caracteristicas("Hermione Granger","Ravenclaw","Femenino","Fantasma");
    Caracteristicas personaje5=new Caracteristicas("Queenie Goldstein","Pukwudgie","Femenino","Humana");

    public void imprimirPeronajes(){
        System.out.println(personaje1);
        System.out.println(personaje2);
        System.out.println(personaje3);
        System.out.println(personaje4);
        System.out.println(personaje5);
    }
}

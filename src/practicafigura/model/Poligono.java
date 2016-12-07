package practicafigura.model;

public abstract class Poligono extends Figura {

    int numeroLados;

    public Poligono(String nombre, int numeroLados) {
        super(nombre);
        this.numeroLados = numeroLados;

    }

}


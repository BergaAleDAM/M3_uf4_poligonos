package practicafigura.model;

public abstract class Rombe extends PoligonNoRegular {

    double  diagonal, diagonalpeque;
    
    public Rombe(String nombre, int numeroLados,double diagonal,double diagonalpeque) {
        super(nombre, numeroLados);
        this.diagonal = diagonal;
        this.diagonalpeque = diagonalpeque;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getDaigonalpeque() {
        return daigonalpeque;
    }

    public void setDaigonalpeque(double daigonalpeque) {
        this.daigonalpeque = daigonalpeque;
    }

    private double calculHipotenua(){
        return 0;
    }

    @Override
    public double calcularPerimetre() {
       return 0;
    }
    
    @Override
    public double calcularArea(){

        return (diagonal * diagonalpeque) / 2;
    }

}

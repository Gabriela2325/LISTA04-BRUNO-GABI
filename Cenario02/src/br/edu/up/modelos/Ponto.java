package br.edu.up.modelos;

public class Ponto {
    private double x;
    private double y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Ponto P) {
        double X = P.getX() - this.x;
        double Y = P.getY() - this.y;
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

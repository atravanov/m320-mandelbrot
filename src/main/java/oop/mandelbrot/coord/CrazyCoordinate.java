package oop.mandelbrot.coord;

/**
 * Die Klasse CrazyCoordinate repräsentiert eine komplexe Zahl mit Real- und Imaginärteil.
 * 
 * @author Aleksandar Travanov
 * @version 1.0
 */
public class CrazyCoordinate {
    double x; // Der Realteil der komplexen Zahl
    double y; // Der Imaginärteil der komplexen Zahl

    /**
     * Konstruiert ein neues CrazyCoordinate-Objekt mit den angegebenen Real- und Imaginärteilen.
     * @param x Der Realteil der komplexen Zahl
     * @param y Der Imaginärteil der komplexen Zahl
     */
    public CrazyCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Multipliziert diese komplexe Zahl mit einer anderen komplexen Zahl.
     * @param other Die andere komplexe Zahl
     * @return Das Ergebnis der Multiplikation als neues CrazyCoordinate-Objekt
     */
    public CrazyCoordinate mul(CrazyCoordinate other) {
        return new CrazyCoordinate(
                (this.x * other.x) - (this.y * other.y),
                this.x * other.y + this.y * other.x);
    }
    
    /**
     * Berechnet das Skalarprodukt dieser komplexen Zahl.
     * @return Das Skalarprodukt als double-Wert
     */
    public double scalar() {
        return x * x + y * y;
    }
    
    /**
     * Addiert diese komplexe Zahl mit einer anderen komplexen Zahl.
     * @param other Die andere komplexe Zahl
     * @return Das Ergebnis der Addition als neues CrazyCoordinate-Objekt
     */
    public CrazyCoordinate add(CrazyCoordinate other) {
        return new CrazyCoordinate(this.x + other.x, this.y + other.y);
    }
    
    /**
     * Gibt den Realteil der komplexen Zahl zurück.
     * @return Der Realteil der komplexen Zahl
     */
    public double getX() {
        return x;
    }

    /**
     * Gibt den Imaginärteil der komplexen Zahl zurück.
     * @return Der Imaginärteil der komplexen Zahl
     */
    public double getY() {
        return y;
    }

    /**
     * Gibt eine Zeichenfolgenrepräsentation der komplexen Zahl zurück.
     * @return Eine Zeichenfolgenrepräsentation der komplexen Zahl 
     * im Format "(Realteil, Imaginärteil)"
     */
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}


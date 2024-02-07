import java.util.ArrayList;
import java.util.Scanner;

public class Articulo {
    private int codi;
    private String descripcio;
    private double preucompra;
    private double preuventa;
    private int stock;
    Scanner teclat = new Scanner(System.in);
    public Articulo(int codi, String descripcio, double preucompra, double preuventa, int stock){
        this.codi = codi;
        this.descripcio = descripcio;
        this.preucompra = preucompra;
        this.preuventa = preuventa;
        this.stock = stock;
    }
    public Articulo(){

    }

    public void setCodi(int codi) {
        this.codi = codi;
    }
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
    public void setPreucompra(double preucompra) {
        this.preucompra = preucompra;
    }
    public void setPreuventa(double preuventa) {
        this.preuventa = preuventa;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getCodi() {
        return codi;
    }
    public String getDescripcio() {
        return descripcio;
    }
    public double getPreucompra() {
        return preucompra;
    }
    public double getPreuventa() {
        return preuventa;
    }
    public int getStock() {
        return stock;
    }
    public void llistat(){
        System.out.println(this.descripcio + " en codi " + this.codi );
    }
    public static Articulo añade(ArrayList <Articulo> tempo){
        Scanner teclat = new Scanner(System.in);
        Articulo a = new Articulo();
        System.out.println("Introduce los valores (el codigo se asignara solo):");
        a.codi = tempo.size()+1;
        System.out.println(tempo.size()+1);
        System.out.print("Nombre:");
        a.descripcio = teclat.nextLine();
        System.out.print("Preu de compra:");
        a.preucompra = teclat.nextDouble();
        System.out.print("Preu de venta:");
        a.preuventa = teclat.nextDouble();
        System.out.print("Quantitat en almacen:");
        a.stock = teclat.nextInt();
        teclat.nextLine();
        return a;
    }
}

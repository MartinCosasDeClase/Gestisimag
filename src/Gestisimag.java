import java.util.ArrayList;
import java.util.Scanner;

public class Gestisimag {
    public static void main(String[] args) {
        int menu = 0, supp = 0;
        Scanner teclat = new Scanner(System.in);
        ArrayList <Articulo> articulos = new ArrayList<Articulo>();
        articulos.add( new Articulo(1,"Portatil gaming",400,700,56));
        articulos.add( new Articulo(2,"Ordenador gaming",700,1200,36));

        System.out.println("Bienvenido al menu de interaccion de GESTISIMAG");
        do{
            System.out.println("1. Llistat\n2. Alta\n3. Baixa\n4. Modificació\n5. Entrada de mercaderia\n6. Eixida de mercaderia\n7. Eixir");
            menu = teclat.nextInt();
            switch (menu){
                case 1:
                    for(Articulo i: articulos){
                        i.llistat();
                    }
                    break;
                case 2:
                    articulos.add(Articulo.añade(articulos));
                    break;
                case 3:
                    System.out.println("Que articulo quieres eliminar de la lista:");
                    for(Articulo i: articulos){
                        i.llistat();
                    }
                    supp = teclat.nextInt();
                    boolean compro = false;
                    for(int cont = 0; cont < articulos.size(); cont++){
                        if (supp -1 == cont){
                            System.out.println("Objeto encontrado, eliminando");
                            articulos.remove(supp -1);
                            compro = true;
                        }
                    }
                    if(compro == false){
                        System.err.println("Articulo no encontrado, no se eliminara nada");
                    }
                    break;
                case 4:
                    System.out.println("Quin producte vols modificar:");
                    for(Articulo i: articulos){
                        i.llistat();
                    }
                    supp = teclat.nextInt();
                    System.out.println("Que campo deseas modificar");
                    System.out.println("1.- Nombre\n2.- Precio de Compra\n3.- Precio de Venta");
                    int menu2 = teclat.nextInt();
                    teclat.nextLine();
                    switch(menu2){
                        case 1:
                            System.out.println("Introduzca el nuevo nombre");
                            String cambio = teclat.nextLine();
                            articulos.get(supp-1).setDescripcio(cambio);
                            break;
                        case 2:
                            System.out.println("Introduzca el nuevo precio de compra");
                            double cambioprecio = teclat.nextDouble();
                            articulos.get(supp-1).setPreucompra(cambioprecio);
                            break;
                        case 3:
                            System.out.println("Introduzca el nuevo precio de venta");
                            cambioprecio = teclat.nextDouble();
                            articulos.get(supp).setPreuventa(cambioprecio);
                            break;
                        default:
                            System.out.println("Opcion no encontrada");
                            break;
                    }
                    for(Articulo i: articulos){
                        i.llistat();
                    }
                    break;
                case 5:
                    System.out.println("A quin producte vols afexir stock:");
                    for(Articulo i: articulos){
                        i.llistat();
                    }
                    supp = teclat.nextInt();

            }

        }while (menu != 7);
    }
}


//Genere un array, mostrando n productos de una tienda deportiva con sus respectivos precios.
package Arrays;

public class array_deporte {
    public static void main(String[] args) {
        String[] productos = {"Botines", "Pelota de Basquet", "Shorts deportivos", "Raqueta", "Muñequeras"};
        double[] precios = {50.99, 25.99, 35.99, 70.99, 12.99};
        
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - $" + precios[i]);
        }
    }
}   

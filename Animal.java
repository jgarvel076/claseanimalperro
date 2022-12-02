public class Animal {
    String nombre;
    Animal () {
    }
    Animal (String nombre) {
        this.nombre = nombre;
    }
    void imprime () {
        System.out.print("¡Guau! me llamo " + nombre);
    }
}
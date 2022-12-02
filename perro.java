public class perro extends Animal {
    String raza;

    public perro () {
        // Default constructor
    }

    public perro(String raza) {
        this.raza = raza;
    }

    public perro(String nombre, String raza) {
        //super.nombre = nombre; //Versión inicial
        super(nombre); // Versión modificada
        this.raza = raza;
    }

    void imprime () {
        System.out.println("¡Guau! me llamo " + super.nombre + " y soy un " + raza);
        // También se podría quitar el super, poque no hay ambiguedad. Misma lógica que con this.
        System.out.println("¡Guau! me llamo " + nombre + " y soy un " + raza);
    }

    void imprimePorPartes () {
        super.imprime();
        System.out.println(" y soy un " + raza);
    }
}
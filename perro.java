public class perro extends Animal {
    String raza;

    public perro () {

    }

    public perro(String raza) {
        this.raza = raza;
    }

    public perro(String nombre, String raza) {
       
        super(nombre); 
        this.raza = raza;
    }

    void imprime () {
        System.out.println("¡Guau! me llamo " + super.nombre + " y soy un " + raza);

        System.out.println("¡Guau! me llamo " + nombre + " y soy un " + raza);
    }

    void imprimePorPartes () {
        super.imprime();
        System.out.println(" y soy un " + raza);
    }
}

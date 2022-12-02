public class Principal {
    public static void main(String[] args) {

        perro perro = new perro();

        perro.nombre = "Mica";

        perro.raza = "Pastor aleman";
        System.out.println("¡wolf! mi nombre es " + perro.nombre + " y soy un " + perro.raza);

        perro.imprime();
        perro.imprimePorPartes();

        perro perro2 = new perro("Braco aleman");
        perro2.imprimePorPartes();

        perro perro3 = new perro("Canela", "Braco aleman");
        perro3.imprimePorPartes();
        perro2.imprimePorPartes();
        perro3.imprimePorPartes();
    }
}

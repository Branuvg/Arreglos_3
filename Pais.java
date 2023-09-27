public class Pais {
    private Recinto[] recintos;

    public Pais() {
        // Inicializar el array de recintos con 99 objetos vacíos
        recintos = new Recinto[99];
        for (int i = 0; i < 99; i++) {
            recintos[i] = new Recinto(); // Cada recinto se inicializa como vacío
        }
    }
}

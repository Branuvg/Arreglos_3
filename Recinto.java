public class RecintoModelo {
    private String ubicacion;
    private int capacidad;
    private String[][] horarios;

    public RecintoModelo(String ubicacion, int capacidad) {
        this.ubicacion = ubicacion;
        if (capacidad >= 10 && capacidad <= 150000) {
            this.capacidad = capacidad;
        } else {
            this.capacidad = 0;
        }
        this.horarios = new String[5][13];
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j == 1) {
                    this.horarios[i][j] = "fecha" + (i + 1);
                } else {
                    this.horarios[i][j] = "libre";
                }
            }
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String[][] getHorarios() {
        return horarios;
    }
}
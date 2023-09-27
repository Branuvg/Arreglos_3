

public class Evento{
    private int IDevento;
    private String artista;
    private int horario;
    private String fecha;
    private int duracion;
    private int asistentes;


    public int getIDevento() {
        return IDevento;
    }
    
    public void setIDevento(int iDevento) {
        IDevento = iDevento;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        if (asistentes >= 6 && asistentes <= 23) {
            this.horario = horario;
        } else {
            System.out.println("Error: El número de asistentes debe estar entre 10 y 20.");
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
      
        if (asistentes >= 1 && asistentes <= 12) {
            this.duracion = duracion;
        } else {
            System.out.println("Error: El número de asistentes debe estar entre 10 y 20.");
        }
    }


    public int getAsistentes() {
        return asistentes;
    }


    public void setAsistentes(int asistentes) {

        if (asistentes >= 6 && asistentes <= 23) {
            this.asistentes = asistentes;
        } else {
            System.out.println("Error: El número de asistentes debe estar entre 10 y 20.");
        }
    } 
}

package proyecto.nerpco.org.nerpco;

import org.springframework.data.annotation.Id;

public class Terminales {

    @Id
    String claveTerminal;
    String nombreTerminal;
    String estado;
    String capital;
    String marcasDisponibles;
    String instalaciones;

    public Terminales(){

    }

    public Terminales(String nombreTerminal, String estado, String capital, String marcasDisponibles, String instalaciones) {
        this.nombreTerminal = nombreTerminal;
        this.estado = estado;
        this.capital = capital;
        this.marcasDisponibles = marcasDisponibles;
        this.instalaciones = instalaciones;
    }

    public Terminales(String claveTerminal, String nombreTerminal, String estado, String capital, String marcasDisponibles, String instalaciones) {
        this.claveTerminal = claveTerminal;
        this.nombreTerminal = nombreTerminal;
        this.estado = estado;
        this.capital = capital;
        this.marcasDisponibles = marcasDisponibles;
        this.instalaciones = instalaciones;
    }

    public Terminales(String claveTerminal) {
        this.claveTerminal = claveTerminal;
    }

    public String getClaveTerminal() {
        return claveTerminal;
    }

    public void setClaveTerminal(String claveTerminal) {
        this.claveTerminal = claveTerminal;
    }

    public String getNombreTerminal() {
        return nombreTerminal;
    }

    public void setNombreTerminal(String nombreTerminal) {
        this.nombreTerminal = nombreTerminal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getMarcasDisponibles() {
        return marcasDisponibles;
    }

    public void setMarcasDisponibles(String marcasDisponibles) {
        this.marcasDisponibles = marcasDisponibles;
    }

    public String getInstalaciones() {
        return instalaciones;
    }

    public void setInstalaciones(String instalaciones) {
        this.instalaciones = instalaciones;
    }
}

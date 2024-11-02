package Condominio;

import java.util.Objects;

public class Depa {
    private int numeroDepa;
    private int numeroNivel;
    private String nombreEdificio;
    private String propietario;

    public Depa(int numeroDepa, int numeroNivel, String nombreEdificio, String propietario) {
        this.numeroDepa = numeroDepa;
        this.numeroNivel = numeroNivel;
        this.nombreEdificio = nombreEdificio;
        this.propietario = propietario;
    }

    public int getNumeroDepa() {
        return numeroDepa;
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "{" +
                "numeroDepa=" + numeroDepa +
                ", propietario='" + propietario + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depa depa = (Depa) o;
        return numeroDepa == depa.numeroDepa && numeroNivel == depa.numeroNivel && Objects.equals(nombreEdificio, depa.nombreEdificio) && Objects.equals(propietario, depa.propietario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDepa, numeroNivel, nombreEdificio, propietario);
    }
}

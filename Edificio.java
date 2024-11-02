package Condominio;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private static int contador = 0;
    private int idEdificio;
    private String nombre;
    private int cantidadNiveles;
    private int depasPorNivel;
    private List<Nivel> nivelesList;

    public Edificio(){
        this.idEdificio = ++Edificio.contador;
        this.nivelesList = new ArrayList<>();
    }

    public Edificio(int depasPorNivel, int cantidadNiveles, String nombre) {
        this();
        this.depasPorNivel = depasPorNivel;
        this.cantidadNiveles = cantidadNiveles;
        this.nombre = nombre;
        for (int i=1; i<=cantidadNiveles; i++){
           Nivel nivel = new Nivel(i, depasPorNivel, nombre);
           nivelesList.add(nivel);
        }
    }

    public Depa obtenerDepa(int numeroNivel, int numeroDepa) {
        for (Nivel nivel : nivelesList) {
            if (nivel.getIdNivel() == numeroNivel) {
                for (Depa depa : nivel.getDepasList()) {
                    if (depa.getNumeroDepa() == numeroDepa) {
                        return depa;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Edificio: ").append(nombre).append(" (ID: ").append(idEdificio).append(")\n");
        for (Nivel nivel : nivelesList) {
            sb.append(nivel).append("\n");
        }
        return sb.toString();
    }



}

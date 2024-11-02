package Condominio;

import java.util.ArrayList;
import java.util.List;

public class Nivel {
    private static int contador = 0;
    private List<Depa> depasList;
    private int idNivel;

    public Nivel(int idNivel, int cantidadDepas, String nombreEdificio) {
        this.idNivel = ++Nivel.contador;
        depasList = new ArrayList<>();
        for (int i = 1; i<=cantidadDepas; i++){
            Depa depa = new Depa(i, idNivel, nombreEdificio,"Sin propietario");
            depasList.add(depa);
        }
    }

    public int getIdNivel() {
        return idNivel;
    }

    public List<Depa> getDepasList() {
        return depasList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nivel ").append(idNivel).append(":\n");
        for (Depa depa : depasList) {
            sb.append("   ").append(depa).append("\n");
        }
        return sb.toString();
    }


}

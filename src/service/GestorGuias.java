package service;

import model.GuiaTuristico;
import java.util.ArrayList;
import java.util.List;

/** Mantiene la coleccion de guias y ofrece operaciones de consulta. */
public class GestorGuias {
    private ArrayList<GuiaTuristico> listaGuias;


    public GestorGuias() {
        listaGuias = new ArrayList<>();
    }

    public ArrayList<GuiaTuristico> getListaGuias() { return new ArrayList<>(listaGuias); }

    public void setListaGuias(List<GuiaTuristico> guias) {
        listaGuias.clear();
        if (guias == null) return;
        for (GuiaTuristico guia : guias) {
            if (guia != null && !rutExiste(guia.getRut())) {
                listaGuias.add(guia);
            } else if (guia != null) {
                System.out.println("Guia duplicado por RUT omitido: " + guia.getRut());
            }
        }
    }

    private boolean rutExiste(String rut) {
        for (GuiaTuristico guia : listaGuias) {
            if (guia.getRut().equalsIgnoreCase(rut)) return true;
        }
        return false;
    }

    public void mostrarTodos() {
        if (listaGuias.isEmpty()) {
            System.out.println("No hay guias registrados.");
            return;
        }
        for (GuiaTuristico guia : listaGuias) System.out.println(guia);
    }

    public ArrayList<GuiaTuristico> buscarPorEspecialidad(String especialidad) {
        ArrayList<GuiaTuristico> encontrados = new ArrayList<>();
        for (GuiaTuristico guia : listaGuias) {
            if (guia.getEspecialidad().equalsIgnoreCase(especialidad.trim())) encontrados.add(guia);
        }
        return encontrados;
    }

    public ArrayList<GuiaTuristico> buscarPorCiudad(String ciudad) {
        ArrayList<GuiaTuristico> encontrados = new ArrayList<>();
        for (GuiaTuristico guia : listaGuias) {
            if (guia.getDireccion().getCiudad().equalsIgnoreCase(ciudad.trim())) encontrados.add(guia);
        }
        return encontrados;
    }
}

package util;

import model.Direccion;
import model.GuiaTuristico;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/** Utilidad para leer guias desde un archivo de texto separado por punto y coma. */
public class LectorArchivos {
    public static ArrayList<GuiaTuristico> cargarGuiasDesdeTxt(String rutaArchivo) {
        ArrayList<GuiaTuristico> guias = new ArrayList<>();
        try (Scanner lector = new Scanner(new File(rutaArchivo), "UTF-8")) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine().trim();
                if (linea.isEmpty() || linea.startsWith("#")) continue;
                String[] campos = linea.split(";", -1);
                if (campos.length != 7) {
                    System.out.println("Registro omitido: formato incorrecto -> " + linea);
                    continue;
                }
                try {
                    String rut = campos[0].trim();
                    String nombre = campos[1].trim();
                    String especialidad = campos[2].trim();
                    int experiencia = Integer.parseInt(campos[3].trim());
                    Direccion direccion = new Direccion(campos[4].trim(), campos[5].trim(), campos[6].trim());
                    GuiaTuristico guia = new GuiaTuristico(rut, nombre, especialidad, experiencia, direccion);
                    guias.add(guia);
                } catch (IllegalArgumentException e) {
                    System.out.println("Registro omitido por datos invalidos: " + linea + " (" + e.getMessage() + ")");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return guias;
    }
}

package app;

import model.GuiaTuristico;
import service.GestorGuias;
import util.LectorArchivos;
import java.util.ArrayList;
import java.util.List;

/** Punto de entrada: carga, recorre y filtra la coleccion de guias. */
public class Main {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println(" LLANQUIHUE TOUR - SISTEMA DE GESTION MODULAR DE GUIAS");
        System.out.println("============================================================");

        GestorGuias gestor = new GestorGuias();
        String rutaArchivo = "src/resources/guias.txt";

        // 1. Carga de datos desde archivo externo .txt
        System.out.println("\n1. CARGANDO DATOS DESDE ARCHIVO EXTERNO:");
        List<GuiaTuristico> guiasCargados = LectorArchivos.cargarGuiasDesdeTxt(rutaArchivo);
        gestor.setListaGuias(guiasCargados);
        System.out.println("--> Se cargaron exitosamente " + guiasCargados.size() + " registros desde el archivo.");

        // 2. Catalogo completo de guias
        System.out.println("\n2. CATALOGO COMPLETO DE GUIAS REGISTRADOS:");
        System.out.println("------------------------------------------------------------");
        gestor.mostrarTodos();

        // 3. Busqueda y filtrado por especialidad
        String especialidadFiltro = "Excursiones Lacustres";
        System.out.println("\n3. BUSQUEDA Y FILTRADO POR ESPECIALIDAD: '" + especialidadFiltro.toUpperCase() + "'");
        System.out.println("------------------------------------------------------------");
        ArrayList<GuiaTuristico> porEspecialidad = gestor.buscarPorEspecialidad(especialidadFiltro);
        if (porEspecialidad.isEmpty()) System.out.println("No se encontraron guias para esta especialidad.");
        for (GuiaTuristico guia : porEspecialidad) System.out.println(guia);

        // 4. Busqueda y filtrado por ciudad (composicion: Direccion dentro de GuiaTuristico)
        String ciudadFiltro = "Puerto Varas";
        System.out.println("\n4. BUSQUEDA Y FILTRADO POR CIUDAD: '" + ciudadFiltro.toUpperCase() + "'");
        System.out.println("------------------------------------------------------------");
        ArrayList<GuiaTuristico> porCiudad = gestor.buscarPorCiudad(ciudadFiltro);
        if (porCiudad.isEmpty()) System.out.println("No se encontraron guias para esta ciudad.");
        for (GuiaTuristico guia : porCiudad) System.out.println(guia);

        System.out.println("\n============================================================");
        System.out.println("Ejecucion finalizada correctamente. Prototipo listo para integracion.");
        System.out.println("============================================================");
    }
}

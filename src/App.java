import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoController empCtrl = new EmpleadoController();

        boolean result = empCtrl.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result); 

        result = empCtrl.addEmpleado(new Empleado(4, "Carlos", "Junior"));
        System.out.println("Ingreso " + result); 

        empCtrl.addEmpleado(new Empleado(5, "Juan", "Senior"));
        empCtrl.addEmpleado(new Empleado(6, "Andres", "Senior"));

        System.out.println("\nLista de empleados:");
        empCtrl.displayEmpleados();

        System.out.println("\nSolo nombres:");
        empCtrl.displayEmpleadosSoloNombres();
        System.out.println("\nLlaves:");
        empCtrl.displayKeys();
        System.out.println("\nEmpleados:");
        empCtrl.displayEmpleadosSinEntrySet();
    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}

import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        // runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();

        runEjerccios();
    }

    private static void runEmpleadoExample() {
        // EmpleadoController empCtrl = new EmpleadoController();

        // boolean result = empCtrl.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        // System.out.println("Ingreso " + result); 

        // result = empCtrl.addEmpleado(new Empleado(4, "Carlos", "Junior"));
        // System.out.println("Ingreso " + result); 

        // empCtrl.addEmpleado(new Empleado(5, "Juan", "Senior"));
        // empCtrl.addEmpleado(new Empleado(6, "Andres", "Senior"));

        // System.out.println("\nLista de empleados:");
        // empCtrl.displayEmpleados();

        // System.out.println("\nSolo nombres:");
        // empCtrl.displayEmpleadosSoloNombres();
        // System.out.println("\nLlaves:");
        // empCtrl.displayKeys();
        // System.out.println("\nEmpleados:");
        // empCtrl.displayEmpleadosSinEntrySet();
    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();
        
        // Prueba del método areAnagrams
        System.out.println("\nEjercicio de anagramas:");
        System.out.println("Input: str1 = \"listen\", str2 = \"silent\"");
        System.out.println("Output: " + ejercicios.areAnagrams("listen", "silent"));
        
        System.out.println("Input: str1 = \"hello\", str2 = \"bello\"");
        System.out.println("Output: " + ejercicios.areAnagrams("hello", "bello"));
    
        System.out.println("Input: str1 = \"triangle\", str2 = \"integral\"");
        System.out.println("Output: " + ejercicios.areAnagrams("triangle", "integral"));
    
        // Prueba del método sumatoriaDeDos
        System.out.println("\nEjercicio de sumatoria de dos números:");
    
        int[] resultadoA = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        int[] resultadoB = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
    
        System.out.println("Input: nums = [9,2,3,6], objetivo = 5");
        System.out.println("Output: " + (resultadoA != null ? "[" + resultadoA[0] + ", " + resultadoA[1] + "]" : "null"));
    
        System.out.println("Input: nums = [9,2,3,6], objetivo = 10");
        System.out.println("Output: " + (resultadoB != null ? "[" + resultadoB[0] + ", " + resultadoB[1] + "]" : "null"));
    }
}

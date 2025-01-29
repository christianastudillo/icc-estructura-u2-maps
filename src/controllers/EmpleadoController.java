package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoController {

    private Map<Integer, Empleado> empleados; 

    public EmpleadoController() {
        empleados = new HashMap<>();
        // Inicialización de datos de ejemplo
        empleados.put(1, new Empleado(1, "John ", "Manager"));
        empleados.put(2, new Empleado(2, "Jane ", "Developer"));
        empleados.put(3, new Empleado(3, "Mike ", "Tester"));
        empleados.put(1, new Empleado(1, "John ", "Manager"));

    }

    public boolean addEmpleado(Empleado empleado) {
        // if (empleado == null || empleados.containsKey(empleado.getId())) {
        if (!empleados.containsKey(empleado.getId())) {
            return true; 
        }
        empleados.put(empleado.getId(), empleado);
        return false; 
    }

        public Empleado getEmpleadoById(int id) {
        return empleados.get(id);
    }
    public void displayEmpleados(){
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey()+ " - "+ empleadoEntry.getValue());
        }
    }
    public void displayEmpleadosSoloNombres() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado.getName()); 
        }
    }
    public void displayKeys() {
        for (Integer key : empleados.keySet()) {
            System.out.println(key);
        }
    }
    public void displayEmpleadosSinEntrySet() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }
    
}

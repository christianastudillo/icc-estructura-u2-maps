package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        hashMap();
        linkedhashMap();
        treemap();
    }
    public void hashMap(){
        System.out.println("-----------------------------------------HashMap----------------------------------------------------");
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);
        //containsKey
        System.out.println("Hay Pera" + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi" + mapa.containsKey("Kiwi"));
        //obtener
        System.out.println("Valor de Pera"+ mapa.get("Pera"));
        //eliminar
        mapa.remove("Pera");

        System.out.println(mapa);
    }
    public void linkedhashMap(){
        System.out.println("-----------------------------------------linkedhashMap----------------------------------------------------");

        Map<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);
        System.out.println(mapa);
        //containsKey
        System.out.println("Hay Pera" + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi" + mapa.containsKey("Kiwi"));
        //obtener
        System.out.println("Valor de Pera"+ mapa.get("Pera"));
        //eliminar
        mapa.remove("Pera");

        System.out.println(mapa);

    }
    public void treemap(){
        System.out.println("-----------------------------------------treemap----------------------------------------------------");

        
        Map<String, Integer> mapa = new TreeMap<>();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);
        System.out.println(mapa);
        //containsKey
        System.out.println("Hay Pera" + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi" + mapa.containsKey("Kiwi"));
        //obtener
        System.out.println("Valor de Pera"+ mapa.get("Pera"));
        //eliminar
        mapa.remove("Pera");

        System.out.println(mapa);

    }
}

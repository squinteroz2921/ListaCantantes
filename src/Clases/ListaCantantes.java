package Clases;

import javax.swing.*;
import java.util.*;
import java.util.function.Consumer;

public class ListaCantantes {
    ArrayList<Cantante> singerList=new ArrayList<Cantante>();

    // se crea el metodo para saber  si la lista se encuentra vacia
    public  Boolean emptyList() {
        if (singerList == null || singerList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // Metodo para agregar un nuevo nodo a la lista
    public void addList(String nombre, String disco) {
        Cantante newCantante = new Cantante(nombre, disco);
        singerList.add(newCantante);
        Collections.sort(singerList, new Comparator<Cantante>() {
            @Override
            public int compare(Cantante o1, Cantante o2) {
                return 0;
            }
        });
    }
    // metodo para eliminar un nodo de la lista
    public String removeList(String nombre){
        if (!emptyList()) {
            /*for (Cantante x:singerList) {
                System.out.println(x.getNombre());
                if (x.getNombre().equals(nombre)){
                    singerList.remove(x);
                    return nombre;
                }
            }*/
            singerList.removeIf(x->x.getNombre().equals(nombre));
           /**/ singerList.stream().filter(x->x.getNombre().startsWith(nombre)).map(Cantante::getNombre).forEach(System.out::println);
        }
        return " ";
    }
    public int sizeList(){
    return singerList.size();
    }
    public void clearList(){
        singerList.clear();
    }
    public void getList(){
        /*for (Cantante x:singerList) {*//**//*
            System.out.println(x.getNombre());

        }*/
        Consumer<Cantante> consumer=cantante -> System.out.println(cantante.getNombre()+" "+cantante.getDisco());
        singerList.forEach(consumer);// respeta el orden de insercion
        System.out.println("///////////////");
        singerList.stream().forEach(consumer); // el procesamiento es indefinido
        System.out.println("/////////////");
    }
}

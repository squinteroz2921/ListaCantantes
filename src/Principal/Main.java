package Principal;

import Clases.ListaCantantes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        String nodonombre, nodocancion;
        ListaCantantes listCant = new ListaCantantes();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de Opciones\n\n"
                                + "1. Insertar un nodo a la lista\n"
                                 + "2. Eliminar Nodo\n"
                                + "3.¿la lista esta vacia?\n"
                                + "4. tamaño de la lista\n"
                                + "5. Mostrar Contenido Pila\n"
                                + "6. Salir\n\n"));
                switch (opcion) {
                    case 1: // insertar nodo a la lista
                        nodonombre = JOptionPane.showInputDialog(null, "Por favor ingrese el artista");
                        nodocancion = JOptionPane.showInputDialog(null, "Por favor ingrese la cancion");
                        listCant.addList(nodonombre, nodocancion);
                        break;
                    case 2: // Eliminar nodo
                        nodonombre = JOptionPane.showInputDialog(null, "Por favor ingrese la cancion que desea eliminar");
                        listCant.removeList(nodonombre);
                        break;
                    case 3: // la lista esta vacia
                        if (listCant.emptyList()) {
                            JOptionPane.showMessageDialog(null, "la Lista se encuentra vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "la lista posee nodos");
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "el tamaño de la lista es " + listCant.sizeList());
                        break;
                    case 5:
                        listCant.getList();
                        break;
                    case 6: // salir
                        System.exit(1);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "por Favor ingrese una opcion valida");
                }

            } catch (Exception e) {

            }

        } while (opcion != 6);

    }
}

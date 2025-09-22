// Importación de clases necesarias para entrada de datos y manejo de pilas
import java.util.Scanner;
import java.util.Stack;

// Clase principal del editor de texto
public class TextEditor {
    public static void main(String[] args) {
        // Crear scanner con codificación UTF-8 para entrada de datos
        Scanner sc = new Scanner(System.in, "UTF-8");

        // Pila para almacenar acciones que se pueden deshacer
        Stack<String> undoStack = new Stack<>();
        // Pila para almacenar acciones que se pueden rehacer
        Stack<String> redoStack = new Stack<>();

        // Variable de control para el bucle principal
        boolean running = true;
        // Bucle principal del programa
        while (running) {
            // Mostrar menú de opciones
            System.out.println("\n--- MENÚ ---");
            System.out.println("1) Añadir texto");
            System.out.println("2) Deshacer (undo)");
            System.out.println("3) Rehacer (redo)");
            System.out.println("4) Mostrar texto actual");
            System.out.println("5) Salir");
            System.out.print("Elige una opción (1-5): ");

            // Leer opción del usuario y eliminar espacios en blanco
            String option = sc.nextLine().trim();
            // Evaluar la opción seleccionada
            switch (option) {
                case "1":
                    // Opción para añadir texto
                    System.out.print("\nEscribe el texto a agregar: ");
                    String toAdd = sc.nextLine();
                    // Agregar el texto a la pila de deshacer
                    undoStack.push(toAdd);
                    System.out.println("Texto agregado.");
                    break;

                case "2":
                    // Opción para deshacer
                    if (undoStack.isEmpty()) {
                        // Verificar si hay algo para deshacer
                        System.out.println("Nada para deshacer.");
                    } else {
                        // Mover el último elemento de undo a redo
                        String prev = undoStack.pop();
                        redoStack.push(prev);
                        System.out.println("Deshacer realizado.");
                    }
                    break;

                case "3":
                    // Opción para rehacer
                    if (redoStack.isEmpty()) {
                        // Verificar si hay algo para rehacer
                        System.out.println("Nada para rehacer.");
                    } else {
                        // Mover el último elemento de redo de vuelta a undo
                        String next = redoStack.pop();
                        undoStack.push(next);
                        System.out.println("Rehacer aplicado.");
                    }
                    break;

                case "4":
                    // Opción para mostrar texto actual
                    if (undoStack.isEmpty()) {
                        // Verificar si hay texto para mostrar
                        System.out.println("Nada para mostrar");
                    } else {
                        // Mostrar el texto más reciente sin eliminarlo de la pila
                        System.out.println("\n--- Texto actual ---");
                        System.out.println(undoStack.peek());
                        System.out.println("--------------------");
                    }
                    break;

                case "5":
                    // Opción para salir del programa
                    running = false;
                    System.out.println("Saliendo. ¡Hasta luego!");
                    break;

                default:
                    // Manejar opciones inválidas
                    System.out.println("Opción inválida. Intenta otra vez.");
            }
        }

        // Cerrar el scanner para liberar recursos
        sc.close();
    }
}
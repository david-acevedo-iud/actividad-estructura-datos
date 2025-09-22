import java.util.Scanner;
import java.util.Stack;

public class TextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1) Añadir texto");
            System.out.println("2) Deshacer (undo)");
            System.out.println("3) Rehacer (redo)");
            System.out.println("4) Mostrar texto actual");
            System.out.println("5) Salir");
            System.out.print("Elige una opción (1-5): ");

            String option = sc.nextLine().trim();
            switch (option) {
                case "1":
                    System.out.print("\nEscribe el texto a agregar: ");
                    String toAdd = sc.nextLine();
                    undoStack.push(toAdd);
                    System.out.println("Texto agregado.");
                    break;

                case "2":
                    if (undoStack.isEmpty()) {
                        System.out.println("Nada para deshacer.");
                    } else {
                        String prev = undoStack.pop();
                        redoStack.push(prev);
                        System.out.println("Deshacer realizado.");
                    }
                    break;

                case "3":
                    if (redoStack.isEmpty()) {
                        System.out.println("Nada para rehacer.");
                    } else {
                        String next = redoStack.pop();
                        undoStack.push(next);
                        System.out.println("Rehacer aplicado.");
                    }
                    break;

                case "4":
                    if (undoStack.isEmpty()) {
                        System.out.println("Nada para mostrar");
                    } else {
                        System.out.println("\n--- Texto actual ---");
                        System.out.println(undoStack.peek());
                        System.out.println("--------------------");
                    }
                    break;

                case "5":
                    running = false;
                    System.out.println("Saliendo. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta otra vez.");
            }
        }

        sc.close();
    }
}
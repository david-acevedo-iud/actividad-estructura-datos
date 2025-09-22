import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

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
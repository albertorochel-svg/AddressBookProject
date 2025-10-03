package addressbook;

import java.nio.file.*;
import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        Path csv = Paths.get("C:\\Users\\PPC\\Desktop\\Tecmilenio\\java\\contacts.csv");
        AddressBook addressBook = new AddressBook(csv.toString());
        addressBook.load();
        System.out.println("Agenda cargada de: " + csv.toString());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== AddressBook =====");
            System.out.println("Archivo CSV: " + csv.toString());
            System.out.println("Comandos: list | create | delete | save | load | exit");
            System.out.print("Selecciona una opcion: ");
            String cmd = scanner.nextLine().trim().toLowerCase();

            switch (cmd) {
                case "list":
                    addressBook.list();
                    break;
                case "create":
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Numero: ");
                    String number = scanner.nextLine();
                    addressBook.create(number, name);
                    break;
                case "delete":
                    System.out.print("Numero a eliminar: ");
                    String del = scanner.nextLine();
                    addressBook.delete(del);
                    break;
                case "save":
                    addressBook.save();
                    System.out.println("Agenda guardada.");
                    break;
                case "load":
                    addressBook.load();
                    System.out.println("Agenda recargada.");
                    break;
                case "exit":
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Comando no valido.");
            }
        }
    }
}

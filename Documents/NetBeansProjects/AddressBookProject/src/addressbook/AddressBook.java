package addressbook;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class AddressBook {
    private Map<String, String> contacts = new HashMap<>();
    private Path filePath;

    public AddressBook(String filePath) {
        this.filePath = Paths.get(filePath);
    }

    public void load() {
        contacts.clear();
        if (Files.exists(filePath)) {
            try (BufferedReader br = Files.newBufferedReader(filePath)) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 2) {
                        String number = parts[0].replace("\uFEFF", "").trim();
                        String name = parts[1].trim();
                        contacts.put(number, name);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al cargar: " + e.getMessage());
            }
        }
    }

    public void save() {
        try (BufferedWriter bw = Files.newBufferedWriter(filePath)) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public void list() {
        System.out.println("Contactos:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void create(String number, String name) {
        contacts.put(number.trim(), name.trim());
        System.out.println("Contacto agregado.");
    }

    public void delete(String number) {
        if (contacts.remove(number) != null) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("Numero no encontrado.");
        }
    }
}

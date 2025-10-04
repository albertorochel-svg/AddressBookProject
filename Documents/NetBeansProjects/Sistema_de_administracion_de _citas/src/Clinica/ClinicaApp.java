package Clinica;

import java.util.Scanner;

public class ClinicaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Administrador administrador = new Administrador();

        int opcion;
        do {
            System.out.println("===== Menu Clinica =====");
            System.out.println("1. Crear Doctor");
            System.out.println("2. Crear Cita");
            System.out.println("3. Listar Doctores");
            System.out.println("4. Listar Citas");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del doctor: ");
                    String nombreDoctor = scanner.nextLine();
                    System.out.print("Especialidad: ");
                    String especialidad = scanner.nextLine();
                    administrador.agregarDoctor(new Doctor(nombreDoctor, especialidad));
                    break;

                case 2:
                    System.out.print("Nombre del paciente: ");
                    String paciente = scanner.nextLine();
                    System.out.print("Fecha (dd/mm/yyyy): ");
                    String fecha = scanner.nextLine();
                    System.out.print("Hora (hh:mm): ");
                    String hora = scanner.nextLine();
                    System.out.print("Doctor asignado: ");
                    String doctor = scanner.nextLine();
                    administrador.agregarCita(new Cita(paciente, fecha, hora, doctor));
                    break;

                case 3:
                    administrador.listarDoctores();
                    break;

                case 4:
                    administrador.listarCitas();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    }
}

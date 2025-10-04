package Clinica;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Doctor> doctores;
    private List<Cita> citas;

    public Administrador() {
        this.doctores = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
        System.out.println("Doctor agregado: " + doctor.getNombre());
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
        System.out.println("Cita agregada para: " + cita.getPaciente());
    }

    public void listarDoctores() {
        System.out.println("=== Lista de Doctores ===");
        for (Doctor d : doctores) {
            System.out.println(d);
        }
    }

    public void listarCitas() {
        System.out.println("=== Lista de Citas ===");
        for (Cita c : citas) {
            System.out.println(c);
        }
    }
}

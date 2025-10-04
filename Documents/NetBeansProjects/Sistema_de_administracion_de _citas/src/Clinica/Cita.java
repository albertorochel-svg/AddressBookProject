package Clinica;

public class Cita {
    private String paciente;
    private String fecha;
    private String hora;
    private String doctor;

    public Cita(String paciente, String fecha, String hora, String doctor) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.doctor = doctor;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "Paciente: " + paciente + " | Fecha: " + fecha + " | Hora: " + hora + " | Doctor: " + doctor;
    }
}

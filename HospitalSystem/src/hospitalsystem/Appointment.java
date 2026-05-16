/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author bedo
 */
public class Appointment {
    private int appointmentId;
    private String date;
    private String time;
    
    private Patient patient;
    private Doctor doctor;
    
    Appointment(int appointmentId,
            Patient patient,
            Doctor doctor,
            String date,
            String time) {

    this.appointmentId = appointmentId;
    this.patient = patient;
    this.doctor = doctor;
    this.date = date;
    this.time = time;
}
    
     public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {

        if(appointmentId > 0) {
            this.appointmentId = appointmentId;
        }
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {

        if(patient != null) {
            this.patient = patient;
        }
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {

        if(doctor != null) {
            this.doctor = doctor;
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {

        if(!date.isEmpty()) {
            this.date = date;
        }
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {

        if(!time.isEmpty()) {
            this.time = time;
        }
    }

    public void displayAppointment() {

        System.out.println("Appointment ID: " + appointmentId);

        System.out.println("\n--- Patient Info ---");
        patient.displayinfo();

        System.out.println("\n--- Doctor Info ---");
        doctor.displayinfo();

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
    
    
    
    
}

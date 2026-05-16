/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;
import java.util.ArrayList;
/**
 *
 * @author bedo
 */
public class Hospitalsys {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Nurse> nurses;
    private ArrayList<Department> departments;
    private ArrayList<Appointment> appointments;
    private ArrayList<room> rooms;

    Hospitalsys() {

        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        nurses = new ArrayList<>();
        departments = new ArrayList<>();
        appointments = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    // =========================
    // PATIENT
    // =========================

    public void addPatient(Patient p) {
        if (p != null) patients.add(p);
    }

    public void removePatient(int id) {
        patients.removeIf(p -> p.getId() == id);
    }

    public Patient searchPatient(int id) {
        for (Patient p : patients)
            if (p.getId() == id) return p;
        return null;
    }

    public void displayPatients() {
        for (Patient p : patients) {
            p.displayinfo();
            System.out.println("----------------");
        }
    }

    // =========================
    // DOCTOR
    // =========================

    public void addDoctor(Doctor d) {
        if (d != null) doctors.add(d);
    }

    public void removeDoctor(int id) {
        doctors.removeIf(d -> d.getId() == id);
    }

    public Doctor searchDoctor(int id) {
        for (Doctor d : doctors)
            if (d.getId() == id) return d;
        return null;
    }

    public void displayDoctors() {
        for (Doctor d : doctors) {
            d.displayinfo();
            System.out.println("----------------");
        }
    }

    // =========================
    // NURSE
    // =========================

    public void addNurse(Nurse n) {
        if (n != null) nurses.add(n);
    }

    public void removeNurse(int id) {
        nurses.removeIf(n -> n.getId() == id);
    }

    public Nurse searchNurse(int id) {
        for (Nurse n : nurses)
            if (n.getId() == id) return n;
        return null;
    }

    public void displayNurses() {
        for (Nurse n : nurses) {
            n.displayinfo();
            System.out.println("----------------");
        }
    }

    // =========================
    // DEPARTMENT
    // =========================

    public void addDepartment(Department d) {
        if (d != null) departments.add(d);
    }

    public void removeDepartment(String name) {
        departments.removeIf(d ->
            d.getDepartmentName().equalsIgnoreCase(name));
    }

    public Department searchDepartment(String name) {
        for (Department d : departments)
            if (d.getDepartmentName().equalsIgnoreCase(name))
                return d;
        return null;
    }

    public void displayDepartments() {
        for (Department d : departments) {
            System.out.println("Department: " + d.getDepartmentName());
            d.displayDoctors();
            System.out.println("----------------");
        }
    }

    // =========================
    // APPOINTMENT
    // =========================

    public void createAppointment(Appointment a) {
        if (a != null) appointments.add(a);
    }

    public void displayAppointments() {
        for (Appointment a : appointments) {
            a.displayAppointment();
            System.out.println("----------------");
        }
    }

    // =========================
    // ROOM (NEW FEATURE)
    // =========================

    // ADD ROOM
    public void addRoom(room r) {
        if (r != null) rooms.add(r);
    }

    // REMOVE ROOM
    public void removeRoom(int roomNumber) {
        rooms.removeIf(r -> r.getRoomNumber() == roomNumber);
    }

    // SEARCH ROOM
    public room searchRoom(int roomNumber) {

        for (room r : rooms) {
            if (r.getRoomNumber() == roomNumber)
                return r;
        }
        return null;
    }

    // DISPLAY ROOMS
    public void displayRooms() {

        for (room r : rooms) {
            r.displayRoom();
            System.out.println("----------------");
        }
    }

    // ASSIGN PATIENT TO ROOM
    public void assignPatientToRoom(int roomNumber, int patientId) {

        room room = searchRoom(roomNumber);
        Patient patient = searchPatient(patientId);

        if (room != null && patient != null) {
            room.assignPatient(patient);
            System.out.println("Patient assigned to room.");
        } else {
            System.out.println("Invalid room or patient.");
        }
    }

    // DISCHARGE PATIENT FROM ROOM
    public void dischargeRoom(int roomNumber) {

        room room = searchRoom(roomNumber);

        if (room != null) {
            room.dischargePatient();
            System.out.println("Room discharged.");
        } else {
            System.out.println("Room not found.");
        }
    }
    
    public ArrayList<Doctor> getDoctorsList() {
    return doctors;
}

public ArrayList<Nurse> getNursesList() {
    return nurses;
}



}


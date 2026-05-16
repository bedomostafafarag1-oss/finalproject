/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalsystem;
import java.util.Scanner;
/**
 *
 * @author bedo
 */
public class HospitalSystem {

    
    public static void main(String[] args) {
      

    
        Hospitalsys hospital = new Hospitalsys();
        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== HOSPITAL SYSTEM =====");
            System.out.println("1. Doctors");
            System.out.println("2. Nurses");
            System.out.println("3. Departments");
            System.out.println("4. Appointments");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {

                // =========================
                // DOCTORS MENU
                // =========================
                case 1: {
                    int c;

                    do {
                        System.out.println("\n--- DOCTORS MENU ---");
                        System.out.println("1. Add Doctor");
                        System.out.println("2. Remove Doctor");
                        System.out.println("3. Search Doctor");
                        System.out.println("4. Display Doctors");
                        System.out.println("5. Back");

                        System.out.print("Choice: ");
                        c = input.nextInt();

                        switch (c) {

                            case 1: {
                                try {
                                    System.out.print("ID: ");
                                    int id = input.nextInt();
                                    input.nextLine();

                                    System.out.print("Name: ");
                                    String name = input.nextLine();

                                    System.out.print("Age: ");
                                    int age = input.nextInt();
                                    input.nextLine();

                                    System.out.print("Gender: ");
                                    String gender = input.nextLine();

                                    System.out.print("Specialization: ");
                                    String spec = input.nextLine();

                                    System.out.print("Salary: ");
                                    double salary = input.nextDouble();
                                    input.nextLine();

                                    System.out.print("Job Level: ");
                                    String level = input.nextLine();

                                    Doctor d = new Doctor(id, name, gender, age, spec, salary, level);
                                    hospital.addDoctor(d);

                                    System.out.println("Doctor added.");

                                } catch (Exception e) {
                                    System.out.println("Invalid input!");
                                    input.nextLine();
                                }
                                break;
                            }

                            case 2: {
                                System.out.print("Enter ID: ");
                                int id = input.nextInt();
                                hospital.removeDoctor(id);
                                break;
                            }

                            case 3: {
                                System.out.print("Enter ID: ");
                                int id = input.nextInt();

                                Doctor d = hospital.searchDoctor(id);

                                if (d != null) d.displayinfo();
                                else System.out.println("Not found.");

                                break;
                            }

                            case 4: {
                                hospital.displayDoctors();
                                break;
                            }

                        }

                    } while (c != 5);

                    break;
                }

                // =========================
                // NURSES MENU
                // =========================
                case 2: {
                    int c;

                    do {
                        System.out.println("\n--- NURSES MENU ---");
                        System.out.println("1. Add Nurse");
                        System.out.println("2. Remove Nurse");
                        System.out.println("3. Search Nurse");
                        System.out.println("4. Display Nurses");
                        System.out.println("5. Back");

                        System.out.print("Choice: ");
                        c = input.nextInt();

                        switch (c) {

                            case 1: {
                                try {
                                    System.out.print("ID: ");
                                    int id = input.nextInt();
                                    input.nextLine();

                                    System.out.print("Name: ");
                                    String name = input.nextLine();

                                    System.out.print("Age: ");
                                    int age = input.nextInt();
                                    input.nextLine();

                                    System.out.print("Gender: ");
                                    String gender = input.nextLine();

                                    System.out.print("Shift: ");
                                    String shift = input.nextLine();

                                    System.out.print("Experience: ");
                                    int exp = input.nextInt();

                                    Nurse n = new Nurse(id, name, gender, age, shift, exp);
                                    hospital.addNurse(n);

                                    System.out.println("Nurse added.");

                                } catch (Exception e) {
                                    System.out.println("Invalid input!");
                                    input.nextLine();
                                }
                                break;
                            }

                            case 2: {
                                System.out.print("Enter ID: ");
                                int id = input.nextInt();
                                hospital.removeNurse(id);
                                break;
                            }

                            case 3: {
                                System.out.print("Enter ID: ");
                                int id = input.nextInt();

                                Nurse n = hospital.searchNurse(id);

                                if (n != null) n.displayinfo();
                                else System.out.println("Not found.");

                                break;
                            }

                            case 4: {
                                hospital.displayNurses();
                                break;
                            }

                        }

                    } while (c != 5);

                    break;
                }

                // =========================
                // DEPARTMENTS MENU
                // =========================
                case 3: {
                    int c;

                    do {
                        System.out.println("\n--- DEPARTMENTS MENU ---");
                        System.out.println("1. Add Department");
                        System.out.println("2. Remove Department");
                        System.out.println("3. Search Department");
                        System.out.println("4. Display Departments");
                        System.out.println("5. Back");

                        System.out.print("Choice: ");
                        c = input.nextInt();
                        input.nextLine();

                        switch (c) {

                            case 1: {
                                System.out.print("Name: ");
                                String name = input.nextLine();

                                Department d = new Department(name);
                                hospital.addDepartment(d);

                                System.out.println("Added.");
                                break;
                            }

                            case 2: {
                                System.out.print("Name: ");
                                String name = input.nextLine();

                                hospital.removeDepartment(name);
                                break;
                            }

                            case 3: {
                                System.out.print("Name: ");
                                String name = input.nextLine();

                                Department d = hospital.searchDepartment(name);

                                if (d != null)
                                    System.out.println("Found: " + d.getDepartmentName());
                                else
                                    System.out.println("Not found.");

                                break;
                            }

                            case 4: {
                                hospital.displayDepartments();
                                break;
                            }

                        }

                    } while (c != 5);

                    break;
                }

                // =========================
                // APPOINTMENTS MENU
                // =========================
                case 4: {
                    int c;

                    do {
                        System.out.println("\n--- APPOINTMENTS MENU ---");
                        System.out.println("1. Create Appointment");
                        System.out.println("2. Display Appointments");
                        System.out.println("3. Back");

                        System.out.print("Choice: ");
                        c = input.nextInt();

                        switch (c) {

                            case 1: {
                                try {
                                    System.out.print("ID: ");
                                    int id = input.nextInt();

                                    System.out.print("Patient ID: ");
                                    int pid = input.nextInt();

                                    System.out.print("Doctor ID: ");
                                    int did = input.nextInt();
                                    input.nextLine();

                                    Patient p = hospital.searchPatient(pid);
                                    Doctor d = hospital.searchDoctor(did);

                                    if (p == null || d == null) {
                                        System.out.println("Invalid IDs!");
                                        break;
                                    }

                                    System.out.print("Date: ");
                                    String date = input.nextLine();

                                    System.out.print("Time: ");
                                    String time = input.nextLine();

                                    Appointment a = new Appointment(id, p, d, date, time);
                                    hospital.createAppointment(a);

                                    System.out.println("Created.");

                                } catch (Exception e) {
                                    System.out.println("Invalid input!");
                                    input.nextLine();
                                }
                                break;
                            }

                            case 2: {
                                hospital.displayAppointments();
                                break;
                            }

                        }

                    } while (c != 3);

                    break;
                }

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        input.close();

        
    }
}
    
    


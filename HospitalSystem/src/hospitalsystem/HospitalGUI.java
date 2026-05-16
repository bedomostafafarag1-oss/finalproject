/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

import javax.swing.*;
import java.awt.*;

public class HospitalGUI {

    private Hospitalsys hospital;

    public HospitalGUI() {

        hospital = new Hospitalsys();

        JFrame frame = new JFrame("Hospital System");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        JButton doctorsBtn = new JButton("Doctors");
        JButton nursesBtn = new JButton("Nurses");
        JButton deptBtn = new JButton("Departments");
        JButton appBtn = new JButton("Appointments");
        JButton exitBtn = new JButton("Exit");

        frame.add(doctorsBtn);
        frame.add(nursesBtn);
        frame.add(deptBtn);
        frame.add(appBtn);
        frame.add(exitBtn);

        // EXIT
        exitBtn.addActionListener(e -> System.exit(0));

        // DOCTORS WINDOW
        doctorsBtn.addActionListener(e -> openDoctorsWindow());

        // NURSES WINDOW
        nursesBtn.addActionListener(e -> openNursesWindow());

        // DEPARTMENTS WINDOW
        deptBtn.addActionListener(e -> openDepartmentsWindow());

        // APPOINTMENTS WINDOW
        appBtn.addActionListener(e -> openAppointmentsWindow());

        frame.setVisible(true);
    }

    // -------------------------
    // DOCTORS GUI
    // -------------------------
    private void openDoctorsWindow() {

        JFrame frame = new JFrame("Doctors");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JButton add = new JButton("Add Doctor");
        JButton show = new JButton("Show Doctors");

        frame.add(add);
        frame.add(show);

        add.addActionListener(e -> {

            try {
                int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                String name = JOptionPane.showInputDialog("Name");
                int age = Integer.parseInt(JOptionPane.showInputDialog("Age"));
                String gender = JOptionPane.showInputDialog("Gender");
                String spec = JOptionPane.showInputDialog("Specialization");
                double salary = Double.parseDouble(JOptionPane.showInputDialog("Salary"));
                String level = JOptionPane.showInputDialog("Job Level");

                Doctor d = new Doctor(id, name, gender, age, spec, salary, level);
                hospital.addDoctor(d);

                JOptionPane.showMessageDialog(null, "Doctor Added!");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Input!");
            }
        });

        show.addActionListener(e -> {

            StringBuilder sb = new StringBuilder();

            for (Doctor d : hospital.getDoctorsList()) {
                sb.append(d.getName())
                  .append(" - ")
                  .append(d.getSpecialization())
                  .append("\n");
            }

            JOptionPane.showMessageDialog(null, sb.toString());
        });

        frame.setVisible(true);
    }

    // -------------------------
    // NURSES GUI (SIMPLE)
    // -------------------------
    private void openNursesWindow() {

        JFrame frame = new JFrame("Nurses");
        frame.setSize(400, 300);

        JButton show = new JButton("Show Nurses");

        frame.add(show);

        show.addActionListener(e -> {

            StringBuilder sb = new StringBuilder();

            for (Nurse n : hospital.getNursesList()) {
                sb.append(n.getName())
                  .append(" - Shift: ")
                  .append(n.getShift())
                  .append("\n");
            }

            JOptionPane.showMessageDialog(null, sb.toString());
        });

        frame.setVisible(true);
    }

    // -------------------------
    // PLACEHOLDERS
    // -------------------------
    private void openDepartmentsWindow() {
        JOptionPane.showMessageDialog(null, "Departments GUI Coming Soon");
    }

    private void openAppointmentsWindow() {
        JOptionPane.showMessageDialog(null, "Appointments GUI Coming Soon");
    }

    // MAIN
    public static void main(String[] args) {
        new HospitalGUI();
    }
}

package service;

import db.DBConnection;
import java.sql.*;
import java.util.Scanner;

public class StudentService {

    Scanner sc = new Scanner(System.in);

    // ADD STUDENT
    public void addStudent() throws Exception {
        Connection con = DBConnection.getConnection();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Level: ");
        String level = sc.next();

        String query = "INSERT INTO students (studentName, level) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        ps.setString(1, name);
        ps.setString(2, level);
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        int studentId = 0;

        if (rs.next()) {
            studentId = rs.getInt(1);
        }

        System.out.print("Enter Skill: ");
        String skill = sc.next();

        PreparedStatement psSkill = con.prepareStatement(
                "INSERT INTO skills (student_id, skill) VALUES (?, ?)"
        );

        psSkill.setInt(1, studentId);
        psSkill.setString(2, skill);
        psSkill.executeUpdate();

        System.out.println("Student Added!");
        con.close();
    }

    // VIEW DSA STUDENTS
    public void getDSAStudents() throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "SELECT s.studentName FROM students s " +
                "JOIN skills sk ON s.id = sk.student_id " +
                "WHERE sk.skill = 'DSA'";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        System.out.println("DSA Students:");
        while (rs.next()) {
            System.out.println(rs.getString("studentName"));
        }

        con.close();
    }

    // ADD SKILL
    public void addSkill() throws Exception {
        Connection con = DBConnection.getConnection();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter New Skill: ");
        String skill = sc.next();

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO skills (student_id, skill) VALUES (?, ?)"
        );

        ps.setInt(1, id);
        ps.setString(2, skill);
        ps.executeUpdate();

        System.out.println("Skill Added!");
        con.close();
    }

    // ADD PRACTICE
    public void addPractice() throws Exception {
        Connection con = DBConnection.getConnection();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = sc.next();

        System.out.print("Enter Hours: ");
        int hours = sc.nextInt();

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO practice_logs (student_id, date, hours) VALUES (?, ?, ?)"
        );

        ps.setInt(1, id);
        ps.setDate(2, Date.valueOf(date));
        ps.setInt(3, hours);

        ps.executeUpdate();

        System.out.println("Practice Added!");
        con.close();
    }

    // SHOW ANALYTICS
    public void showAnalytics() throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "SELECT s.studentName, SUM(p.hours) AS total " +
                "FROM students s JOIN practice_logs p " +
                "ON s.id = p.student_id GROUP BY s.studentName";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        System.out.println("Total Practice Hours:");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " -> " + rs.getInt(2));
        }

        con.close();
    }

    // DELETE INACTIVE
    public void deleteInactive() throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM students WHERE id NOT IN " +
                "(SELECT DISTINCT student_id FROM practice_logs)";

        Statement st = con.createStatement();
        st.executeUpdate(query);

        System.out.println("Inactive Students Deleted!");
        con.close();
    }
}

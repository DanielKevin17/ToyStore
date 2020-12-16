/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toystore;
import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection koneksi;

    public static Connection Koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //nama driver mysql jdbc bisa dicek pada library sql yg baru ditambahkan
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/toystorejava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            return koneksi;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

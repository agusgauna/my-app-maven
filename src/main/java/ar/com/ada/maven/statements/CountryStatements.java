package ar.com.ada.maven.statements;

import ar.com.ada.maven.database.ConnectionDB;

import java.sql.*;
import java.util.Scanner;

public class CountryStatements {
    public static void listarPais() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        String sql = "SELECT * FROM Pais";
        Connection conn = ConnectionDB.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

    while (rs.next()) {
       System.out.println(rs.getInt("id"));
        System.out.println(rs.getString("nombre"));
    }
    conn.close();
    }
    public static void insertarPais() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        // Integer continent_id = 1;
        // String pais = "Chile";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese Pais: ");
        String pais = keyboard.nextLine();
        System.out.println("Ingrese Continent_id: ");
        Integer continent_id = keyboard.nextInt();

        String sql = "INSERT INTO Pais (nombre, Continent_id) VALUES (?, ?)";
        Connection conn = ConnectionDB.getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, pais);
        pst.setInt(2, continent_id);

        int insert = pst.executeUpdate();

        System.out.println(insert);
        conn.close();
    }
}
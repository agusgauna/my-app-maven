package ar.com.ada.maven;

import ar.com.ada.maven.database.ConnectionDB;
import ar.com.ada.maven.statements.CountryStatements;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        CountryStatements.listarPais();
        CountryStatements.insertarPais();
    }
}

package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector extends DatabaseConnector{

    @Override
    public void openConnection() {
        System.out.println("Create postgres connetion");
    }
}

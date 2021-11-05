package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends AbstractReport{

    private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();
    

    public void generate() {
        createDatabaseConnection(connector);
        executePostgresQuery();
        convertToXLS();
    }

    public void executePostgresQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.executeQuery(query);
    }

    public void convertToXLS() {
        System.out.println("Converting To XLS...");
    }

}

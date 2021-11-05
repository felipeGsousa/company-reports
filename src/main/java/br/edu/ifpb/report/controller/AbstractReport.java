package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;

public abstract class AbstractReport { 

    public void createDatabaseConnection(DatabaseConnector connector) {
        System.out.println("Creating Database Connection...");
        connector.openConnection();
    }
}

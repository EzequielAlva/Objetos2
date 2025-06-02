package org.example;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseAccessProxy implements DatabaseAccess {
    private DatabaseRealAccess database;
    private User user;
    private static Logger logger = Logger.getLogger("Practica_17_DB");

    public DatabaseAccessProxy(String email, String password) {
        this.database = new DatabaseRealAccess();
        this.user = new User();
        this.user.login(email, password);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if(user.isAuthenticated())
            return database.insertNewRow(rowData);
        logger.log(Level.SEVERE, " -- Usuario No Autenticado - No puede realizar insersiones -- ");
        return 0;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if(user.isAuthenticated())
            return database.getSearchResults(queryString);
        logger.log(Level.SEVERE, " -- Usuario No Autenticado - No puede realizar busquedas -- ");
        return null;
    }
}

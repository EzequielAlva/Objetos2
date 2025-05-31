package org.example;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess {
    private DatabaseRealAccess database;
    private User user;

    public DatabaseAccessProxy(String email, String password) {
        this.database = new DatabaseRealAccess();
        this.user = new User();
        this.user.login(email, password);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if(user.isAuthenticated())
            return database.insertNewRow(rowData);
        return 0;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if(user.isAuthenticated())
            return database.getSearchResults(queryString);
        return null;
    }
}

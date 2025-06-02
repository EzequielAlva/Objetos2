package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseRealAccess  implements DatabaseAccess {
    private Map<String, List<String>> data;
    private int currentId;
    private static Logger logger = Logger.getLogger("Practica_17_DB");

    public DatabaseRealAccess() {
        super();
        this.data = new HashMap<>();
        this.currentId = 3;
        this.data.put("select * from comics where id=1", Arrays.asList("Spiderman", "Marvel"));
        this.data.put("select * from comics where id=2", Arrays.asList("Batman", "DC comics"));
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        logger.log(Level.INFO, " -- Brindando informacion -- ");
        return this.data.getOrDefault(queryString, Collections.emptyList());
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        logger.log(Level.WARNING, " -- Insertando informacion delicada -- ");
        this.data.put("select * from comics where id=" + this.currentId, rowData);
        this.currentId = this.currentId + 1;

        return this.currentId - 1;
    }
}

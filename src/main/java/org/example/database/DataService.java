package org.example.database;

public class DataService {

    private final DataStorage datastorage = new Database();

    public void saveData(String data) {
        datastorage.save(data);
    }
}

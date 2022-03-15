package com.company;

import java.io.IOException;

public interface ChampionshipManager  {

    void addRace();
     void generateRace() throws IOException;
    void driverTable();
    void addDriver();
    void deleteDriver();
    void playerStatistic();
    void changeTeam();
    void saveData() throws IOException;
    void LoadData() throws IOException;
}

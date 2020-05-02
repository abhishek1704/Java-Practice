package com.abhishekVelankar;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> writeValues();
    void readValues(List<String> savedValues);


}

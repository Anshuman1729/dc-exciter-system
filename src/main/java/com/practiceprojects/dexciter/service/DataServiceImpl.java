package com.practiceprojects.dexciter.service;

import com.practiceprojects.dexciter.entities.publicData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImpl implements dataService {

    List<publicData> list;

    public DataServiceImpl(){
        list =  new ArrayList<>();
        list.add(new publicData(60.0, 0.05, 100));
        list.add(new publicData(50.0,0.1,120));
    }

    @Override
    public List<publicData> getData() {
        return list;
    }
}

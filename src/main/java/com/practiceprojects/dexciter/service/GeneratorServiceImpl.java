package com.practiceprojects.dexciter.service;

import com.practiceprojects.dexciter.entities.Generator;
import org.springframework.stereotype.Service;

@Service
public class GeneratorServiceImpl implements generatorService{

    Generator gen = new Generator();
    @Override
    public Generator getGenerator() {
        gen.getFlux();
        gen.getTurnsPerPhase();

        return gen;
    }
}

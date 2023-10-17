package com.practiceprojects.dexciter.entities;

public class VoltageTransducer {
    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    Generator generator = new Generator();

    public double getGeneratorVoltageOutput(){
        return(generator.alternatorOutputVoltage());
    }

}

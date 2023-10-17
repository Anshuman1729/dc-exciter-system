package com.practiceprojects.dexciter.entities;

public class publicData {

    double age;
    double ESR;
    int weight;

    public publicData() {
        super();
    }

    public publicData(double age, double ESR, int weight) {
        this.age = age;
        this.ESR = ESR;
        this.weight = weight;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getESR() {
        return ESR;
    }

    public void setESR(double ESR) {
        this.ESR = ESR;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "publicData{" +
                "age=" + age +
                ", ESR=" + ESR +
                ", weight=" + weight +
                '}';
    }

}

package com.practiceprojects.dexciter.entities;

public class Generator {

    Exciter exciter = new Exciter();

    double alternatorFieldCurrent = 150;
    double alternatorFieldResistance = exciter.finalPowerGenerated()/alternatorFieldCurrent;
    double alternatorRPM = exciter.rpm;
    double alternatorFrequency = exciter.frequency;
    double flux = exciter.flux;
    int turnsPerPhase = 70;

    public Exciter getExciter() {
        return exciter;
    }

    public void setExciter(Exciter exciter) {
        this.exciter = exciter;
    }

    public double getAlternatorFieldCurrent() {

        return alternatorFieldCurrent;
    }

    public void setAlternatorFieldCurrent(double alternatorFieldCurrent) {
        this.alternatorFieldCurrent = alternatorFieldCurrent;
    }

    public double getAlternatorFieldResistance() {
        return alternatorFieldResistance;
    }

    public void setAlternatorFieldResistance(double alternatorFieldResistance) {
        this.alternatorFieldResistance = alternatorFieldResistance;
    }

    public double getAlternatorRPM() {
        return alternatorRPM;
    }

    public void setAlternatorRPM(double alternatorRPM) {
        this.alternatorRPM = alternatorRPM;
    }

    public double getAlternatorFrequency() {
        return alternatorFrequency;
    }

    public void setAlternatorFrequency(double alternatorFrequency) {
        this.alternatorFrequency = alternatorFrequency;
    }

    public double getFlux() {
        return flux;
    }

    public void setFlux(double flux) {
        this.flux = flux;
    }

    public int getTurnsPerPhase() {
        return turnsPerPhase;
    }

    public void setTurnsPerPhase(int turnsPerPhase) {
        this.turnsPerPhase = turnsPerPhase;
    }

    @Override
    public String toString() {
        return "Generator{" +
                "exciter=" + exciter +
                ", alternatorFieldCurrent=" + alternatorFieldCurrent +
                ", alternatorFieldResistance=" + alternatorFieldResistance +
                ", alternatorRPM=" + alternatorRPM +
                ", alternatorFrequency=" + alternatorFrequency +
                ", flux=" + flux +
                ", turnsPerPhase=" + turnsPerPhase +
                '}';
    }

    public Generator(){
        super();
    }

    public Generator(double alternatorFrequency, double flux, int turnsPerPhase) {
        this.alternatorFrequency = alternatorFrequency;
        this.flux = flux;
        this.turnsPerPhase = turnsPerPhase;
    }



    public double alternatorOutputVoltage(){
        return(4.44*flux*alternatorFrequency*turnsPerPhase);
    }

}

package com.practiceprojects.dexciter.entities;

import java.util.Scanner;

public class Exciter {

    double fieldCurrent  = 0.00;
    double exciterVT = 0.00;
    double rpm = 0.00;
    final int exciterPole = 4;

    double fieldResistance = 500;

    double criticalCurrent;

    public double getFieldResistance() {
        return fieldResistance;
    }

    public void setFieldResistance(double fieldResistance) {
        this.fieldResistance = fieldResistance;
    }

    public double getFieldCurrent() {
        return fieldCurrent;
    }

    public void setFieldCurrent(double fieldCurrent) {
        this.fieldCurrent = fieldCurrent;
    }

    public double getExciterVT() {
        return exciterVT;
    }

    public void setExciterVT(double exciterVT) {
        this.exciterVT = exciterVT;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }

    public int getExciterPole() {
        return exciterPole;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getExciterArmatureCurrent() {
        return exciterArmatureCurrent;
    }

    public void setExciterArmatureCurrent(double exciterArmatureCurrent) {
        this.exciterArmatureCurrent = exciterArmatureCurrent;
    }

    public double getExciterArmatureResistance() {
        return exciterArmatureResistance;
    }

    public void setExciterArmatureResistance(double exciterArmatureResistance) {
        this.exciterArmatureResistance = exciterArmatureResistance;
    }

    public int getExciterZ() {
        return exciterZ;
    }

    public void setExciterZ(int exciterZ) {
        this.exciterZ = exciterZ;
    }

    public double getFlux() {
        return flux;
    }

    public void setFlux(double flux) {
        this.flux = flux;
    }

    double frequency = 50;
    double exciterArmatureCurrent = 90.00;
    double exciterArmatureResistance = 1.00;
    int exciterZ = 4;
    double flux = 0.01;


    public String exciterCheck() {
        String res = "";
        if(fieldCurrent > criticalCurrent && (exciterVT > 210 || exciterVT < 240 )){
            res = "System Stable";
        } else {
            res = "System Critical";
//            System.out.println("Shutting down system!");
            System.exit(2);
        }
        return res;
    }

    public double exciterFreqValue(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the present RPM of the machine: ");
        rpm = in.nextInt();

        double freq = (exciterPole *rpm)/120;

        this.frequency = freq;

        return freq;
    }

    public boolean freqIs50Hz(){
        return (frequency == 50);
    }

    public double criticalityCheck(){
        String res = "";
        return criticalCurrent = (exciterVT/fieldResistance)*(1-(exciterArmatureResistance/fieldResistance));
    }

    public double abnormalFreq(){
        double freq = this.frequency;
        double changeRPM = 1500 - ((freq*120)/ exciterPole);
        System.out.print("Change the rpm by: ");

        return changeRPM;
    }

    public double RPMCorrection(double correctionFactor){
        double newRPM = Math.abs(rpm - correctionFactor);
        rpm = newRPM;
//        terminalVltg = (newRPM*flux*z)/60 + armatureResistance*armatureCurrent;
        exciterArmatureCurrent = (exciterVT - (newRPM*flux* exciterZ)/60)/ exciterArmatureResistance;


        System.out.print("Updated armature current should be: ");

        return exciterArmatureCurrent;
    }

    public double finalPowerGenerated() {
        return (((flux * exciterZ * rpm) / 60) * exciterArmatureCurrent);
    }

//    public static void main(String[] args) {
//
//        com.practiceprojects.dexciter.DcExciter.Exciter test = new com.practiceprojects.dexciter.DcExciter.Exciter();
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter field current value: ");
//        double fieldI = in.nextDouble();
//        test.fieldCurrent = fieldI;
//
//        System.out.print("Enter terminal voltage value: ");
//        double terminalV = in.nextDouble();
//        test.exciterVT = terminalV;
//
//        test.exciterCheck();
//        System.out.println(test.exciterFreqValue() + " Hz");
//
//        if(!test.freqIs50Hz()){
//            double correction = test.abnormalFreq();
//            System.out.println(correction + " Hz");
//            System.out.println(test.RPMCorrection(correction) + " A");
//
//        }
//
//        System.out.println("Power generated = " + test.finalPowerGenerated() + " W");
//    }

}

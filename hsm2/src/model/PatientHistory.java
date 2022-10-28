/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author doshi
 */
public class PatientHistory {
    
    private ArrayList<PatientHistory> patienthistory;
    
    public PatientHistory(){
        this.patienthistory = new ArrayList <PatientHistory>();
    }

    public ArrayList<PatientHistory> getPatienthistory() {
        return patienthistory;
    }

    public void setPatienthistory(ArrayList<PatientHistory> patienthistory) {
        this.patienthistory = patienthistory;
    }
    
    
    
    
}

package org.example.class15;

public class Students {
    private String sName;
    private double gradeMath;
    private double gradeScience;
    private double gradeAccount;

    public Students(String stname, double g1,double g2,double g3){
        sName = stname;
        gradeMath = g1;
        gradeScience = g2;
        gradeAccount = g3;

    }
    public void averageMarks(){
        double avgMarks = (gradeMath+gradeScience+gradeAccount)/3;
        System.out.println(avgMarks);
    }


}

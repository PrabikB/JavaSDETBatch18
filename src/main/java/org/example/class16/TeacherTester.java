package org.example.class16;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.joke();

        MathTeacher mt = new MathTeacher();
        mt.teachMath();

        ChemistryTeacher ct = new ChemistryTeacher();
        ct.teachChemistry();

        PianoTeacher pt = new PianoTeacher();
        pt.teachPiano();
    }
}

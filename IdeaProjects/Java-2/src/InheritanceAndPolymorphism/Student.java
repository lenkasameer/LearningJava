package InheritanceAndPolymorphism;

class UniversityStudent {
    private final String name;
    protected static int year;

    public UniversityStudent(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getDetail(){
        return this.name + "  " + "in year " + this.year;
    }
}

class ResearchStudent extends UniversityStudent{
    private final String researchArea;
    private int annualFees;

    public ResearchStudent(String name, int year, String researchArea, int annualFees){
        super(name, year);
        this.researchArea = researchArea;
        this.annualFees = annualFees;
    }

    public String getDetail(){
        this.annualFees = super.year * 10000;
        return super.getDetail() + " research area is " + this.researchArea + " annual fees is " + this.annualFees;
    }
}

public class Student{
    public static void main(String[] args){
        ResearchStudent s1 = new ResearchStudent("Karthik", 2, "Software Development", 0);
        printStudentDetails(s1);

    }
    public static void printStudentDetails(ResearchStudent s1 ){
        System.out.println(s1.getDetail());

    }
}

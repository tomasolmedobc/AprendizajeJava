public class DataTypes {
    public static void main(String[] args) {
        int n   = 1312312344;
        long nL  = 12381231317L;

        double  nD   = 123.456;
        float   nF   = 123.4577F;

        //
        var salary = 1000;
        //pension 3%
        var pension = salary*0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Tomas Olmedo";
        System.out.println("Employee: " + employeeName + " SALARY: " + totalSalary);
    }
}

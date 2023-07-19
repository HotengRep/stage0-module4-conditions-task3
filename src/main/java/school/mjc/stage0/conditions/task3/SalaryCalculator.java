package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        int taxesIndex = 0;
        if(salary<=10000 && salary >0){
            taxesIndex = 15;
        } else if (salary>10000 && salary<=20000) {
            taxesIndex = 18;
        } else if (salary>20000) {
            taxesIndex = 20;
        }

        if (!(taxesIndex == 0))
        {
            float formulaResult = salary - salary*taxesIndex/100F;
            System.out.println(formulaResult);
        }
        else {
            System.out.println("wrong input!");
        }
    }
}

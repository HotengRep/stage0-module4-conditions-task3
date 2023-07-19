package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        String result = "Not aliquot";

        if(second%first == 0)
        {
            result = "Aliquot";
        }

        System.out.println(result);
    }
}

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/?envType=study-plan&id=programming-skills-i
class Salary {
    public double average(int[] salary) {
        double sum= 0;
        Arrays.sort(salary);
        // System.out.println(salary[0]);
        for(int i=1;i<salary.length-1;i++)
            sum+= salary[i];
        return (sum/(salary.length-2));
        
    }
}

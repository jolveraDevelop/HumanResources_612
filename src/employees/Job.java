package employees;

public class Job {

    private String title;
    private double maxSalary;
    private double minSalary;

    public Job() {
    }

    public Job(String title, double minSalary, double maxSalary) {
        this.title = title;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Max salary:" + maxSalary);
        System.out.println("Min salary: " + minSalary);
    }
}

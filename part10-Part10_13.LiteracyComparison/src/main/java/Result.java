public class Result {
    private String gender;
    private String country;
    private int year;
    private double percent;
 
    public Result(String gender, String country, int year, double percent) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percent = percent;
    }
 
    public double getPercent() {
        return percent;
    }
 
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percent;
    }
}
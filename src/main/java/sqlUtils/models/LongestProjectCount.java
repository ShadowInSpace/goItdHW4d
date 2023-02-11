package sqlUtils.models;

public class LongestProjectCount {
    private String name;
    private int monthCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    public LongestProjectCount(String name, int monthCount) {
        this.name = name;
        this.monthCount = monthCount;
    }

    @Override
    public String toString() {
        return "MaxProjectsClient{" +
                "name='" + name + '\'' +
                ", project_count=" + monthCount +
                '}';
    }
}

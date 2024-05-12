package DSADAYQuestions;

public class user {

    private String name;
    private String job;

    public void newuser(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName(){
        return name;
    }

    public String getJob(){
        return job;
    }
}

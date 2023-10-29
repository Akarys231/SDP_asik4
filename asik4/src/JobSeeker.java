class JobSeeker implements Observer {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    public void update(JobPosting jobPosting, String message) {
        System.out.println(name + " received a notification: " + message);
    }
}

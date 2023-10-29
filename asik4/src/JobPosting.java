import java.util.ArrayList;
import java.util.List;
class JobPosting {
    private String jobTitle;
    private String company;
    private List<JobSeeker> jobSeekers = new ArrayList<>();

    public JobPosting(String jobTitle, String company) {
        this.jobTitle = jobTitle;
        this.company = company;
    }

    public void addJobSeeker(JobSeeker jobSeeker) {
        jobSeekers.add(jobSeeker);
    }

    public void removeJobSeeker(JobSeeker jobSeeker) {
        jobSeekers.remove(jobSeeker);
    }

    public void notifyJobSeekers(String message) {
        for (JobSeeker jobSeeker : jobSeekers) {
            jobSeeker.update(this, message);
        }
    }

    public void postJob(String message) {
        System.out.println("Job posted: " + message);
        notifyJobSeekers(message);
    }
}

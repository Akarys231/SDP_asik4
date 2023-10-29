public class Main {
    public static void main(String[] args) {
        JobPosting jobPost = new JobPosting("Software Engineer", "Tech Company");

        JobSeeker seeker1 = new JobSeeker("Alice");
        JobSeeker seeker2 = new JobSeeker("Bob");
        JobSeeker seeker3 = new JobSeeker("Charlie");

        jobPost.addJobSeeker(seeker1);
        jobPost.addJobSeeker(seeker2);

        jobPost.postJob("We're hiring a Java Developer!");

        jobPost.addJobSeeker(seeker3);

        jobPost.postJob("New job opening for Data Scientist!");

        // Output will show notifications sent to Alice, Bob, and Charlie.
    }
}
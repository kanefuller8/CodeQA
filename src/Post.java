import java.util.ArrayList;

public class Post {
    // Initial
    public int postID;
    public String postTitle;
    public String postBody;
    public String[] postTags;
    public String postTypes;
    public String postEmergency;
    public ArrayList<String> postComments = new ArrayList<>();

    // Constructor for post
    public Post(int postID, String postTitle, String postBody, String[] postTags, String postType, String postEmergency) {
        this.postID = postID;
        this.postTitle = postTitle;
        this.postBody = postBody;
        this.postTags = postTags;
        this.postTypes = postType;
        this.postEmergency = postEmergency;
    }

    // Add Post function
    public boolean addPost() {
        // Cond 1.1: Post title <10 OR >250 return false
        if (postTitle.length() < 10 || postTitle.length() > 250) {
            System.out.println("Validation failed: Post title length must be between 10 and 250 characters.");
            return false;
        }

        // Cond 1.2: First 5 characters should be letters
        for (int i = 0; i < 5; i++) {
            char x = postTitle.charAt(i);
            if (!(Character.isLetter(x) || x == ' ')) {
                System.out.println("Validation failed: The first 5 characters of the post title must be letters.");
                return false;
            }
        }

        // Cond 2: Post body should have a minimum of 250 characters
        if (postBody.length() < 250) {
            System.out.println("Validation failed: Post body must be at least 250 characters long.");
            return false;
        }

        // Cond 3.1: Post should have min 2 tags & max 5 tags
        if (postTags.length < 2 || postTags.length > 5) {
            System.out.println("Validation failed: Post must have between 2 and 5 tags.");
            return false;
        }

        // Cond 3.2: Tags should have min 2 characters & max 10 characters (lowercase)
        for (String tag : postTags) {
            if (tag.length() < 2 || tag.length() > 10 || !tag.equals(tag.toLowerCase())) {
                System.out.println("Validation failed: Each tag must be between 2 and 10 characters and in lowercase.");
                return false;
            }
        }

        // Cond 4.1: "Easy" posts should not have more than 3 tags
        if (postTypes.equals("Easy") && postTags.length > 3) {
            System.out.println("Validation failed: 'Easy' posts cannot have more than 3 tags.");
            return false;
        }

        // Cond 4.2: "Very Difficult" & "Difficult" posts should have min 300 characters in postBody
        if ((postTypes.equals("Very Difficult") || postTypes.equals("Difficult")) && postBody.length() < 300) {
            System.out.println("Validation failed: 'Very Difficult' and 'Difficult' posts must have at least 300 characters in the body.");
            return false;
        }

        // Cond 5.1: "Easy" posts should not have "Immediately Needed" and "Highly Needed" emergency type
        if (postTypes.equals("Easy") && (postEmergency.equals("Immediately Needed") || postEmergency.equals("Highly Needed"))) {
            System.out.println("Validation failed: 'Easy' posts cannot have 'Immediately Needed' or 'Highly Needed' emergency types.");
            return false;
        }

        // Cond 5.2: "Very Difficult" and "Difficult" posts should not have the status of "Ordinary"
        if ((postTypes.equals("Very Difficult") || postTypes.equals("Difficult")) && postEmergency.equals("Ordinary")) {
            System.out.println("Validation failed: 'Very Difficult' and 'Difficult' posts cannot have the status of 'Ordinary'.");
            return false;
        }

        System.out.println("Post validated successfully.");
        return true;
    }

    // Add Comment function
    public boolean addComment(String commentText) {
        // Cond 1.1: Comment text should have min 4 words and max 10 words
        String[] words = commentText.split("\\s+");
        if (words.length < 4 || words.length > 10) {
            System.out.println("Validation failed: Comment must have between 4 and 10 words.");
            return false;
        }

        // Cond 1.2: First character of the first word should be uppercase
        char firstChar = commentText.charAt(0);
        if (!Character.isUpperCase(firstChar)) {
            System.out.println("Validation failed: The first character of the comment must be uppercase.");
            return false;
        }

        // Cond 2.1: Each post can have 0-5 comments
        if (postComments.size() >= 5) {
            System.out.println("Validation failed: Each post can have a maximum of 5 comments.");
            return false;
        }

        // Cond 2.2: "Easy" or "Ordinary" posts should have maximum 3 comments
        if ((postTypes.equals("Easy") || postEmergency.equals("Ordinary")) && postComments.size() >= 3) {
            System.out.println("Validation failed: 'Easy' or 'Ordinary' posts can have a maximum of 3 comments.");
            return false;
        }

        // Add comment to comment array list
        postComments.add(commentText);
        System.out.println("Comment added successfully.");
        return true;
    }
}

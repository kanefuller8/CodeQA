import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner to "scan" and store what user inputs into console
        Scanner scanner = new Scanner(System.in);

        // Asking user if they would like to create a Post or a Comment
        System.out.println("Would you like to create a Post or a Comment?");
        String userSelection = scanner.nextLine();

        // If user types Post, user is prompted with details to fill in for their post
        if (userSelection.equalsIgnoreCase("Post")) {
            // User to input post details (ID, Title, Body, Tags, Post Type, Post Emergency)
            System.out.println("Enter Post ID: ");
            int postID = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Post Title: ");
            String postTitle = scanner.nextLine();

            System.out.println("Enter Post Body: ");
            String postBody = scanner.nextLine();

            System.out.println("Enter Post Tags (comma-separated): ");
            String[] postTags = scanner.nextLine().split(",");

            System.out.println("Enter Post Type (Very Difficult, Difficult, Easy): ");
            String postTypes = scanner.nextLine();

            System.out.println("Enter Post Emergency (Immediately Needed, Highly Needed, Ordinary): ");
            String postEmergency = scanner.nextLine();

            // Create Post object via constructor
            Post post = new Post(postID, postTitle, postBody, postTags, postTypes, postEmergency);
            if (post.addPost()) {
                try {
                    // Finding post.txt
                    FileOutputStream fileStream = new FileOutputStream("post.txt", true);
                    PrintWriter filePrinter = new PrintWriter(fileStream);

                    // Write to the Printer
                    writeToTextFile(filePrinter, postID, postTitle, postBody, postTags, postTypes, postEmergency);

                    // Close the filePrinter
                    filePrinter.close();
                    System.out.println("Your post has been uploaded");
                } catch (Exception e) {
                    // Error handling to ensure console doesn't crash
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Post validation failed.");
            }
            // If user types Comment, user is prompted with details to fill in for their comment
        } else if (userSelection.equalsIgnoreCase("Comment")) {

            System.out.println("Enter Post ID to comment on: ");
            int postID = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Comment: ");
            String postComment = scanner.nextLine();
            scanner.close();

            Post post = retrievePostByID(postID);

            if (post.addComment(postComment)) {
                try {
                    // Finding comment.txt
                    FileOutputStream fileStream = new FileOutputStream("comment.txt", true);
                    PrintWriter filePrinter = new PrintWriter(fileStream);

                    // Write to the Printer
                    writeCommentToTextFile(filePrinter, postID, postComment);

                    // Close the filePrinter
                    filePrinter.close();
                    System.out.println("Your comment has been uploaded");
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Comment validation failed.");
            }
        } else {
            System.out.println("Invalid selection.");
        }

        scanner.close();
    }



    // Write to post.txt 
    public static void writeToTextFile(PrintWriter filePrinter, int ID, String title, String body, String[] tags, String type, String emergency) {
        filePrinter.println("ID: " + ID);
        filePrinter.println("Title: " + title);
        filePrinter.println("Body: " + body);
        filePrinter.print("Tags: ");
        for (int i = 0; i < tags.length; i++) {
            filePrinter.print(tags[i]);
            if (i < tags.length - 1) {
                filePrinter.print(", ");
            }
        }
        filePrinter.println();
        filePrinter.println("Type: " + type);
        filePrinter.println("Emergency: " + emergency);
    }

    // Write to comment.txt    
    public static void writeCommentToTextFile(PrintWriter filePrinter, int postID, String postComment) {
        filePrinter.println("Post ID: " + postID);
        filePrinter.println("Comment: " + postComment);
    }

    public static Post retrievePostByID(int postID) {
        // Sample post details provided below, TO DO: replace with real post details...
        return new Post(postID, "title", "body", new String[]{"tag1", "tag2"}, "Easy", "Ordinary");
    }
}

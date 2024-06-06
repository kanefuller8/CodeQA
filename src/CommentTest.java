import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommentTest {
    // The following methods will conduct unit tests on 2 example comments under their relevant posts.
    @Test
    void testAddCommentConditions_ValidInputs1() {
        // Post 1
        String[] tags = {"java", "mysql"};
        Post post = new Post(1, "Need Help With My Java Project",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras malesuada odio quis libero commodo, nec porta arcu scelerisque. Aliquam erat volutpat. Proin varius lorem lacus, dignissim efficitur purus semper eget. Maecenas ac lorem ac neque lacinia lobortis ornare vitae lorem. Nullam eget turpis pretium nulla suscipit volutpat. Quisque gravida ultricies lobortis. Suspendisse eget mi cursus lectus maximus laoreet eu eu magna. Suspendisse potenti. Suspendisse porttitor, lorem at luctus tempus, nibh felis viverra erat, eget rhoncus neque nulla quis nisl. Praesent rutrum sit amet sem nec tincidunt. Nunc sit amet est sed tellus convallis scelerisque non vehicula ex. Suspendisse et tellus magna. Proin mi velit, facilisis eu odio sed, mattis tincidunt justo. Proin hendrerit sagittis tristique. Praesent sit amet libero sapien. In pulvinar quam et ex mollis vulputate. Sed at sapien porta, mollis nisi in, commodo dui. Fusce interdum risus sed diam facilisis, et molestie ante dapibus. Pellentesque finibus metus justo, ac faucibus nunc rutrum ut. Donec ut convallis mauris, vitae dictum purus. Quisque fermentum consequat neque, ut suscipit augue iaculis ac. Integer nulla velit, interdum quis ligula in, vulputate faucibus ipsum. Etiam interdum mi risus, at finibus ante aliquet eget. Etiam ac ex ac felis pretium viverra et vitae augue. Proin volutpat eget sapien ut facilisis. Duis accumsan turpis id eleifend sodales. Nulla lectus eros, malesuada eget mi quis, tincidunt hendrerit neque. Nunc quis rhoncus augue, et congue arcu. Suspendisse consequat gravida lorem vitae porta. Integer accumsan, dolor vel vestibulum dapibus, est ligula venenatis justo, vitae interdum nisl turpis a.)",
                tags, "Easy", "Ordinary");

        // Test Data 1: Check the add comment function by commenting less than 4 words
        String comment = "Word1, Word2, Word3";
        boolean result = post.addComment(comment);
        assertTrue(result, "Validation failed: Comment must have between 4 and 10 words.");
    }

    @Test
    void testAddCommentConditions_ValidInputs2() {
        // Post 2
        String[] tags = {"java", "apache"};
        Post post = new Post(2, "My second post. Need further help :(",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras malesuada odio quis libero commodo, nec porta arcu scelerisque. Aliquam erat volutpat. Proin varius lorem lacus, dignissim efficitur purus semper eget. Maecenas ac lorem ac neque lacinia lobortis ornare vitae lorem. Nullam eget turpis pretium nulla suscipit volutpat. Quisque gravida ultricies lobortis. Suspendisse eget mi cursus lectus maximus laoreet eu eu magna. Suspendisse potenti. Suspendisse porttitor, lorem at luctus tempus, nibh felis viverra erat, eget rhoncus neque nulla quis nisl. Praesent rutrum sit amet sem nec tincidunt. Nunc sit amet est sed tellus convallis scelerisque non vehicula ex. Suspendisse et tellus magna. Proin mi velit, facilisis eu odio sed, mattis tincidunt justo. Proin hendrerit sagittis tristique. Praesent sit amet libero sapien. In pulvinar quam et ex mollis vulputate. Sed at sapien porta, mollis nisi in, commodo dui. Fusce interdum risus sed diam facilisis, et molestie ante dapibus. Pellentesque finibus metus justo, ac faucibus nunc rutrum ut. Donec ut convallis mauris, vitae dictum purus. Quisque fermentum consequat neque, ut suscipit augue iaculis ac. Integer nulla velit, interdum quis ligula in, vulputate faucibus ipsum. Etiam interdum mi risus, at finibus ante aliquet eget. Etiam ac ex ac felis pretium viverra et vitae augue. Proin volutpat eget sapien ut facilisis. Duis accumsan turpis id eleifend sodales. Nulla lectus eros, malesuada eget mi quis, tincidunt hendrerit neque. Nunc quis rhoncus augue, et congue arcu. Suspendisse consequat gravida lorem vitae porta. Integer accumsan, dolor vel vestibulum dapibus, est ligula venenatis justo, vitae interdum nisl turpis a.)",
                tags, "Difficult", "Highly Needed");

        // Test Data 2: Check the add comment function by commenting less than 4 words
        String comment = "Wow, nice, bro";
        boolean result = post.addComment(comment);
        assertTrue(result, "Validation failed: Comment must have between 4 and 10 words.");
    }

    @Test
    void testAddCommentConditions_ValidInputs3() {
        // Post 1
        String[] tags = {"java", "mysql"};
        Post post = new Post(1, "Need Help With My Java Project",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras malesuada odio quis libero commodo, nec porta arcu scelerisque. Aliquam erat volutpat. Proin varius lorem lacus, dignissim efficitur purus semper eget. Maecenas ac lorem ac neque lacinia lobortis ornare vitae lorem. Nullam eget turpis pretium nulla suscipit volutpat. Quisque gravida ultricies lobortis. Suspendisse eget mi cursus lectus maximus laoreet eu eu magna. Suspendisse potenti. Suspendisse porttitor, lorem at luctus tempus, nibh felis viverra erat, eget rhoncus neque nulla quis nisl. Praesent rutrum sit amet sem nec tincidunt. Nunc sit amet est sed tellus convallis scelerisque non vehicula ex. Suspendisse et tellus magna. Proin mi velit, facilisis eu odio sed, mattis tincidunt justo. Proin hendrerit sagittis tristique. Praesent sit amet libero sapien. In pulvinar quam et ex mollis vulputate. Sed at sapien porta, mollis nisi in, commodo dui. Fusce interdum risus sed diam facilisis, et molestie ante dapibus. Pellentesque finibus metus justo, ac faucibus nunc rutrum ut. Donec ut convallis mauris, vitae dictum purus. Quisque fermentum consequat neque, ut suscipit augue iaculis ac. Integer nulla velit, interdum quis ligula in, vulputate faucibus ipsum. Etiam interdum mi risus, at finibus ante aliquet eget. Etiam ac ex ac felis pretium viverra et vitae augue. Proin volutpat eget sapien ut facilisis. Duis accumsan turpis id eleifend sodales. Nulla lectus eros, malesuada eget mi quis, tincidunt hendrerit neque. Nunc quis rhoncus augue, et congue arcu. Suspendisse consequat gravida lorem vitae porta. Integer accumsan, dolor vel vestibulum dapibus, est ligula venenatis justo, vitae interdum nisl turpis a.)",
                tags, "Easy", "Ordinary");

        // Test Data 3: Check the add comment function with a non-capitalised first character
        String comment = "you , forgot, to, initialise, it";
        boolean result = post.addComment(comment);
        assertTrue(result, "Validation failed: The first character of the comment must be uppercase.");
    }

    @Test
    void testAddCommentConditions_ValidInputs4() {
        // Post 2
        String[] tags = {"java", "apache"};
        Post post = new Post(2, "My second post. Need further help :(",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras malesuada odio quis libero commodo, nec porta arcu scelerisque. Aliquam erat volutpat. Proin varius lorem lacus, dignissim efficitur purus semper eget. Maecenas ac lorem ac neque lacinia lobortis ornare vitae lorem. Nullam eget turpis pretium nulla suscipit volutpat. Quisque gravida ultricies lobortis. Suspendisse eget mi cursus lectus maximus laoreet eu eu magna. Suspendisse potenti. Suspendisse porttitor, lorem at luctus tempus, nibh felis viverra erat, eget rhoncus neque nulla quis nisl. Praesent rutrum sit amet sem nec tincidunt. Nunc sit amet est sed tellus convallis scelerisque non vehicula ex. Suspendisse et tellus magna. Proin mi velit, facilisis eu odio sed, mattis tincidunt justo. Proin hendrerit sagittis tristique. Praesent sit amet libero sapien. In pulvinar quam et ex mollis vulputate. Sed at sapien porta, mollis nisi in, commodo dui. Fusce interdum risus sed diam facilisis, et molestie ante dapibus. Pellentesque finibus metus justo, ac faucibus nunc rutrum ut. Donec ut convallis mauris, vitae dictum purus. Quisque fermentum consequat neque, ut suscipit augue iaculis ac. Integer nulla velit, interdum quis ligula in, vulputate faucibus ipsum. Etiam interdum mi risus, at finibus ante aliquet eget. Etiam ac ex ac felis pretium viverra et vitae augue. Proin volutpat eget sapien ut facilisis. Duis accumsan turpis id eleifend sodales. Nulla lectus eros, malesuada eget mi quis, tincidunt hendrerit neque. Nunc quis rhoncus augue, et congue arcu. Suspendisse consequat gravida lorem vitae porta. Integer accumsan, dolor vel vestibulum dapibus, est ligula venenatis justo, vitae interdum nisl turpis a.)",
                tags, "Difficult", "Highly Needed");

        // Test Data 4: Check the add comment function with a non-capitalised first character
        String comment = "i, am, also, stuck. Goodluck";
        boolean result = post.addComment(comment);
        assertTrue(result, "Validation failed: The first character of the comment must be uppercase.");
    }
}

/**
 * ?? SOCIAL MEDIA PLATFORM CORE
 * 
 * ?? DESCRIPTION:
 * Build the core functionality of a social media platform with users,
 * posts, comments, and interactions. This exercise focuses on social
 * features and user engagement.
 * 
 * ?? LEARNING OBJECTIVES:
 * - Implement social features
 * - Practice user interaction
 * - Work with content management
 * - Learn social algorithms
 * 
 * ?? REQUIREMENTS:
 * 
 * User Class:
 * ? Private fields:
 *    - userId (String): unique identifier
 *    - username (String): display name
 *    - email (String): user email
 *    - friends (ArrayList<User>): user connections
 *    - posts (ArrayList<Post>): user posts
 * 
 * ? Constructor:
 *    - User(userId, username, email)
 *    - Initialize empty friends and posts
 * 
 * ? Public Methods:
 *    - addFriend(user): Add connection
 *    - removeFriend(userId): Remove connection
 *    - createPost(content): Create new post
 *    - getFriendCount(): Return number of friends
 *    - getUserInfo(): Return formatted user info
 * 
 * Post Class:
 * ? Private fields:
 *    - postId (String): unique identifier
 *    - content (String): post content
 *    - author (User): who posted
 *    - timestamp (String): when posted
 *    - likes (ArrayList<User>): who liked
 *    - comments (ArrayList<Comment>): post comments
 * 
 * ? Constructor:
 *    - Post(content, author)
 *    - Set timestamp to current time
 *    - Initialize empty likes and comments
 * 
 * ? Public Methods:
 *    - addLike(user): Add like
 *    - removeLike(userId): Remove like
 *    - addComment(comment): Add comment
 *    - getLikeCount(): Return number of likes
 *    - getPostInfo(): Return formatted post info
 * 
 * Comment Class:
 * ? Private fields:
 *    - commentId (String): unique identifier
 *    - content (String): comment text
 *    - author (User): who commented
 *    - timestamp (String): when commented
 * 
 * SocialMedia Class:
 * ? Private fields:
 *    - users (ArrayList<User>): all users
 *    - posts (ArrayList<Post>): all posts
 * 
 * ? Public Methods:
 *    - registerUser(userData): Create new user
 *    - createPost(userId, content): User creates post
 *    - likePost(userId, postId): User likes post
 *    - commentOnPost(userId, postId, content): User comments
 *    - getNewsFeed(userId): Return recent posts from friends
 *    - getUserTimeline(userId): Return user's posts
 *    - getPopularPosts(): Return most liked posts
 * 
 * ?? EXTRA CHALLENGE:
 * - Add post sharing
 * - Implement direct messaging
 * - Add user profiles with photos
 * - Create content moderation
 * 
 * ?? IMPLEMENTATION TIPS:
 * 1. Start with User class with friend management
 * 2. Create Post with like and comment functionality
 * 3. Build Comment for user interactions
 * 4. Implement SocialMedia to coordinate everything
 * 5. Test social interactions
 */

public class HowToDo {
    // This file contains the exercise description and requirements
    // Use this as a guide to implement your solution
    
    public static void main(String[] args) {
        System.out.println("Implement the exercise requirements here!");
        // Test your implementation in this main method
    }
}

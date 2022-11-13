//Description
//        Imagine you are building a Facebook clone.
//        Write a function called ‘mostVotes’ that —
//        1) takes in an int array called votesPerUser as a parameter,
//        where each element in the array represents the number of votes received
//        by the user, with the userId at that index.
//        2) returns the index of the user with the most votes.
//        3) if there are ties between users with the most votes,
//        returns the index of the first user with the most votes.
//        For example, if the 0th and 7th users in the array both have 20 votes,
//        and both have the most number of votes, they return 0.
//
//        For example, if the array is - 2 4 3 5 6 3
//        Output would be - User with the most votes is User: 4




package PracticeQuestionsOnFunctions;

public class Question2 {
    public static void main (String[] args){
        int[] votes = new int[] {2,4,5,6,7,9,10,15,3,1,15};
        int indexOfUser = mostVotes(votes);
        System.out.println(indexOfUser);
    }
    public static int mostVotes(int[] userVotes){
        int temp = 0;
        int userIndex = 0;
        for (int i = 0; i < userVotes.length; i++){
            if (userVotes[i] > temp){
                temp = userVotes[i];
                userIndex = i;

            }
        }
        return userIndex;

    }

}

package DeleteThis;

public class PERSONAL_TEST {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("C:\\Users\\bryan\\IdeaProjects\\Data Structures Assignment 3\\src\\shuffled dictionary set 2.txt");

//        System.out.println(dictionary);
        String word;
        String result;

        word = "Earl";
        System.out.println("Searching for the word \'" + word + "\'");
        result = dictionary.find(word);
        result = result == "" ? "The word does not exist" : result;
        System.out.println(result);

        dictionary.add(word, "definition TBD");

        word = "Earl";
        System.out.println("Searching for the word \'" + word + "\'");
        result = dictionary.find(word);
        result = result == "" ? "The word does not exist" : result;
        System.out.println(result);
    }
}

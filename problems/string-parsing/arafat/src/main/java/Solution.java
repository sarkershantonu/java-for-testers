import java.util.*;

public class Solution {

    private String givenParagraph;
    private Map<String, Integer> splittedParagraph = new HashMap<String, Integer>();
    private int totalWords = 0;
    private Set<String> verbs = new HashSet<String>();

    public Solution(String givenParagraph){
        this.givenParagraph = givenParagraph.trim();
        splitTheParagraph();
        inintVerbs();
    }

    /**
     * Splitting the paragraph and storing each word in map with frequency
     */
    private void splitTheParagraph(){
        String[] splittedWords = givenParagraph.split("\\s-+\\s|\\s");
        if(givenParagraph.length() == 0)
            totalWords = 0;
        else
            totalWords = splittedWords.length;
        
        for (int index = 0; index < splittedWords.length; index++){
            String tempWord = splittedWords[index].toLowerCase();

            if(this.splittedParagraph.containsKey(tempWord)){
                this.splittedParagraph.put(tempWord, this.splittedParagraph.get(tempWord) + 1);
            }
            else this.splittedParagraph.put(tempWord, 1);
        }

//        for(String key: this.splittedParagraph.keySet())
//            System.out.println(key + " : " + this.splittedParagraph.get(key));
    }

    /**
     * Verb Dictionary
     */
    private void inintVerbs(){
        verbs.add("work");
        verbs.add("will");
        verbs.add("be");
        verbs.add("re-used");
        verbs.add("redone");
        verbs.add("shows");
        verbs.add("come");
        verbs.add("starts");
        verbs.add("can");
        verbs.add("wait");
        verbs.add("bring");
    }

    /**
     * Total Words in given paragraph
     * @return
     */
    public int howManyWords(){
        return totalWords;
    }

    /**
     * Frequency of a specific word
     * @param whichWord
     * @return
     */
    public int howManyWords(String whichWord){
        String tempWord = whichWord.toLowerCase();
        if(splittedParagraph.containsKey(tempWord))
            return splittedParagraph.get(tempWord);
        else return 0;
    }

    /**
     * How many Verbs in given paragraph
     */
    public int howManyVerbs(){
        int totalVerbs = 0;
        Iterator<String> iterator = verbs.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            totalVerbs += howManyWords(word);
        }
        return totalVerbs;
    }

}

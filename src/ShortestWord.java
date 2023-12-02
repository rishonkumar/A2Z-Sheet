public class ShortestWord {
    public String findShortestWord(String[]words)
    {
        String smallVar = words[0]; // Assuming that 1st Index of an array is a smallest length string
        int a = words.length;
        for(int i=0;i<a-1;i++)
        {
            if(smallVar.length()>words[i+1].length())
            {
                smallVar=words[i+1];
            }
        }
        return smallVar;
    }
    public static void main(String[]args)
    {
        String[]words = {"Java12343","Python","C","Programming"};
        ShortestWord shortestWord = new ShortestWord();
        String str = shortestWord.findShortestWord(words);
        System.out.println("The shortest word is "+str);
    }



}

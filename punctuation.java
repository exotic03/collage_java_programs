public class punctuation {
    public static void main(String[] args) {
        String s="The man is rich! , and also a humble person";
        int pCount=0,i;
        for (i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c==','||c=='.'||c==':'||c==';'||c=='!'||c=='?')
            {
                pCount++;
            }
        }
        System.out.println("The total number of punctuation is : "+pCount);
    }
}

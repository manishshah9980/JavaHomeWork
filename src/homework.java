import org.omg.CORBA.WStringSeqHelper;

public class homework {

    public static void main(String[] args) {

        String s = "This is very easy programme";
        String s1 = s.replace("s", " ");// remove char s from string
        int s2 = s.length();
        String spchar = " this $300 is equivalent of £200 but not for @100";
        String v = "The cost of iPhone is £1,250";
        String v1 = v.replaceAll("[0-9]", " ");
        int a = 450;
        double d = a;
        String v3 = "125";
        int result = Integer.parseInt(v3);
        double v4 =123.45;
        String m = Double.toString(v4);
        String k = "560.25";
        double t = Double.parseDouble("560.25");
        float c = 1/3;
        String price = "$250.00";
        String word1 = "there";
        word1 = word1.substring(2, 3);
        String word2 = "England";
        word2 = word2.substring(3, 4);
        String word3 ="orange";
        word3 = word3.substring(1, 2);








        System.out.println(s.replaceAll( "s", " "));
        System.out.println("string lenth:" +s2);
        System.out.println(s = s. replaceAll("\\s",""));
        System.out.println(spchar = spchar.replaceAll("[^a-zA-Z0-9]", " "));
        System.out.println(v1);
        System.out.println(d);
                System.out.println(result);
        System.out.println(m);
        System.out.println(t);
        System.out.println(c);
        System.out.println(price.replaceAll("\\$", "£"));
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);







        }
}
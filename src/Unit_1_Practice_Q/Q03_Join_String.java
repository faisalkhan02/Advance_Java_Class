package Unit_1_Practice_Q;

/*
Use a lambda to join two strings.
 */
interface JoinString{
     String join (String str1,String str2);
}
public class Q03_Join_String {
    public static void main(String[] args) {
        JoinString js = ((str1, str2) -> (str1 + str2));

        String result=js.join("Faisal ","Khan");
        System.out.println(result);
    }
}

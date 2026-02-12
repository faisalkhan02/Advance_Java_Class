package Unit_2_Practice_Q;

/*
Write a lambda expression to find the maximum of two numbers.

 */
interface Maximum{
    int findMax(int x,int y);
}
public class Q02_Maximum {
    public static void main(String[] args) {

//        Maximum m = (x,y) -> (x>y) ? x :y;


//        OR
        Maximum m = Math::max;
        // equivalent to >>> Maximum m = (x,y) -> Math.max(x,y);

        System.out.println(m.findMax(15,16));
    }
}

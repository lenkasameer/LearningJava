package module3.com;

public class Arrays {
    public static void main (String[] args){
        Object[] arr = {1,2,3,4,'1',"abc"};
        for (Object s:arr){
            System.out.println(s.getClass());
        }

    }
}

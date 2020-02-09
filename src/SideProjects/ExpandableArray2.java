package SideProjects;

public class ExpandableArray2 {

    //takes the array and increased the size by one
    public static long count;

    public static String[] expandArray(String[] a) {
        //a = old array
        //b = new array
        String[] b = new String[a.length + 1];

        for(int i = 0; i < a.length; i++) {
            b[i] = a[i]; //most performance heavy process, copying the number
            count++;
        }
        return b;
    }

}

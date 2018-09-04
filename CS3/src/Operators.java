import java.util.Arrays;
/**
 * Contains a traverse, insert, search, sort, delete and merge for static arrays
 * @author warham_905444
 * @version 8/22
 */
public class Operators {
    static int[] arr = {1,3,6,8,4,25,8,9,0,15};;
    public static void main(String[] args) {
        //traverse(arr);
        searchint(arr, 2);
        insert(arr,4,5);
        delete(arr,7);
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
        merge(arr,arr);
    }
    /**
     * Tells you what is in each position in a static array
     * @param a - the array input
     */
    public static void traverse(int[] a) {
        for(int i = 0;i<a.length;i++) {
            System.out.println("traverse, position"+ i+": " + a[i]);
        }
    }
    /**
     * Looks for a certain number in a static array
     * @param a - the array input
     * @param s - what you are searching for
     */
    public static void searchint(int[] a,int s) {
        int p = -1;
        for(int i = 0;i<a.length;i++) {
            if(a[i] ==s) {
                p=i;
                break;
            }
        }
        System.out.println("searching for " + s+": "+ p);
    }
    /**
     * Sorts the static array in increasing order
     * @param a the input array
     * @return Returns the sorted array
     */
    public static int[] sort(int[] a) {
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[index]) 
                    index = j;
      
            int smallerNumber = a[index];  
            a[index] = a[i];
            a[i] = smallerNumber;
            System.out.println(Arrays.toString(a));
        }
        return a;
    }
    /**
     * Inserts a number in a position in a certain position in an array
     * @param a the input array
     * @param p the position you want the number to be inserted at
     * @param n the number you want inserted
     */
    public static void insert(int[] a, int p, int n) {
        int[] arr2 = new int[a.length+1];
        arr2[p]=n;
        boolean passed = false;
        for(int i = 0; i<arr2.length;i++) {
            if(p==i) {
                passed =true;
                continue;
            }
            if(passed)
                arr2[i]=a[i-1];
            else
                arr2[i]=a[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
    /**
     * Deletes the number at the given position
     * @param a the input array
     * @param p position that the item will be deleted at
     */
    public static void delete(int[] a, int p) {
        int[] arr2 = new int[a.length-1];
        boolean passed = false;
        for(int i = 0; i<arr2.length;i++) {
            if(p==i) {
                passed =true;
                continue;
            }
            if(passed)
                arr2[i]=a[i+1];
            else
                arr2[i]=a[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
    /**
     * Combines 2 static int arrays
     * @param a the input array coming first
     * @param b the last input array
     */
    public static void merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int pos =0;
        for(int x = 0; x<a.length; x++){
            c[pos] = a[x];
            pos++;
        }
        for(int y = 0; y<b.length; y++){
            c[pos] = b[y];
            pos++;
        }
        System.out.println(Arrays.toString(c));
    }
    public static int searchString(String[] a,String s) {
        int p = -1;
        for(int i = 0;i<a.length;i++) {
            if(a[i].equals(s)) {
                p=i;
                break;
            }
        }
        return p;
    }
}
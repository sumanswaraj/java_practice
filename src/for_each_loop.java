public class for_each_loop {

    public static void main(String[] args) {
        int [] marks = {75, 55,88,56,90};
        System.out.println("length of array: "+marks.length);

        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("printing element of array in reverse order");
        for(int j = marks.length-1 ;j>0;j--)
        {
            System.out.println(marks[j]);
        }

        // for-each loop
        System.out.println("printing element of array using \"for-each\" loop");
        for (int element:marks)
        {
            System.out.println(element);
        }
    }

}
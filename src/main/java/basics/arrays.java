package basics;

public class arrays {

    public static void main(String[] args) {
        System.out.println("Hello Lab001 program");

        System.out.println("sout for System.out.println");
    int i, j, k;
    String name= "Mudit";
    int namePosition =0;
    String[] names = {"Atul", "Mudit", "Karan", "Lavya", "Mohit"};
        System.out.println(names.length);
        String nameMatch = "Atul";
        for(int s=0; s<names.length; s++){
            System.out.println(names[s]);
            if(names[s].equalsIgnoreCase(nameMatch)){
                namePosition = s+1;
            }

            //find the number of entry for name Match


        }
        System.out.println(name+" is at number: "+namePosition);



    }


}

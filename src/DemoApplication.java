public class DemoApplication {

    public static void main(String[] args){

        Child schoolChild=new SchoolChildBuilder()
                .withName("Olga")
                .studyIn("shcool#3")
                .build();
        System.out.println(schoolChild.toString());
    }
}




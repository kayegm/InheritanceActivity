public class Main extends Teacher {
    protected Main() {
        super("A", "B", "C");
    }

    public static void main(String[] args) {
        Teacher obj = new Teacher("Teacher", "CET", "Programming");
        College codybuilding = new College();

        //accessing the fields of parent class

        System.out.println(obj.collegeName); // Retrieve as non private
        System.out.println(obj.getDesignation()); // Retrieve as private using getter
        System.out.println(obj.getSubjectName());

        obj.setDesignation("Lecturer"); // Change value as private
        System.out.println(obj.getDesignation());
        codybuilding.USLSCET();
        codybuilding.LaSalle();

        System.out.println(obj.getSubjectName()); // from sub class


        obj.does();

    }
}

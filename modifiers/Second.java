package modifiers;

class Second {
    public static void main(String[] args) {
        // create an object of subclass Student.
        Student student = new Student();

        System.out.println("Name: " + student.fname + " " + student.lname);
        System.out.println("Age: " + student.age);
        System.out.println("Graduation Year: " + student.graduationYear);
        student.study();
    }
}

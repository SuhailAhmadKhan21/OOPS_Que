public class q1 {
    int studentId;
    String name;
    String branch;

    q1(int id, String n, String b) {
        studentId = id;
        name = n;
        branch = b;
    }

    void display() {
        System.out.println(studentId + " " + name + " " + branch);
    }

    public static void main(String[] args) {
        q1 s1 = new q1(262, "Suhail", "CS");
        q1 s2 = new q1(276, "Tarang", "CS");
        q1 s3 = new q1(287, "Vaibhav", "CS");

        s1.display();
        s2.display();
        s3.display();
    }
}
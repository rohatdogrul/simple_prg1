public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Rhat Doğrul", 22, "190704003");
        Student student2 = new Student("Barış Yazıcı", 22, "0002");

        System.out.println(student1.getName() + " " + student1.getAge() + " " + student1.getId());
        System.out.println(student2.getName() + " " + student2.getAge() + " " + student2.getId());
    }
}

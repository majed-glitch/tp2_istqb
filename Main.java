public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("TestBot");
        robot.droite();
        robot.avance();
        robot.droite();
        robot.avance();
        robot.avance();

        System.out.println(robot.getPosition());
    }
}

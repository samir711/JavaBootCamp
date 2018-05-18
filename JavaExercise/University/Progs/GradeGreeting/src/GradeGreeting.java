public class GradeGreeting {

    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {

            case 'A':
                System.out.println("Amazing work there. Keep going!");
                break;
            case 'B':
                System.out.println("You can do better");
                break;
            case 'C':
                System.out.println("Little more hard work, buddy");
                break;
            case 'D':
                System.out.println("Ohh boy , get serious");
                break;
            case 'E':
                System.out.println("All got failed, somehow just got it ");
                break;
            case 'F':
                System.out.println("You need to focus on studies. ");
                break;

            default:
                    System.out.println("Grade can only be A to F");
                    break;
        }
    }
}

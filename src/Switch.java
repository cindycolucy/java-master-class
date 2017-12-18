public class Switch {

    public static void main(String[] args) {
//        int value = 2;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3 or a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2 or 3 or 4 or 5");
                break;
        }

        char letter = 'F';

        switch (letter) {
            case 'A':
                System.out.println("Letter was A");
                break;

            case 'B':
                System.out.println("Letter was B");
                break;

            case 'C':
                System.out.println("Letter was C");
                break;

            case 'D':
                System.out.println("Letter was D");
                break;

            case 'E':
                System.out.println("Letter was E");
                break;

            default:
                System.out.println("Letter was not A, B, C, D or E");
                break;

        }


        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
            default:
                System.out.println("Not sure");
                break;
        }

    }
}

package Week6.storm;

public class StormTester {

    public static void main(String[] args) {
        //Test StormWarning Version 1
//        StormWarning hurricane = new StormWarning("hurricane", 300);
//        StormWarning tornado = new StormWarning("tornado", 120);
//        StormWarning thunderstorm = new StormWarning("thunderstorm", 60);
//
//        System.out.println(hurricane + "\n" + tornado + "\n" + thunderstorm);
//
//        //Test StormWarning Version 2
//        StormWarningV2 hurricane2 = new StormWarningV2("hurricane", 300);
//        StormWarningV2 tornado2 = new StormWarningV2("tornado", 120);
//        StormWarningV2 thunderstorm2 = new StormWarningV2("thunderstorm", 60);
//
//        System.out.println(hurricane2 + "\n" + tornado2 + "\n" + thunderstorm2);

        //Test StormWarning Version 3
        StormWarningV3 hurricane3 = new StormWarningV3(new Hurricane(300));
        StormWarningV3 hurricane2 = new StormWarningV3(new Tornado(157));
        StormWarningV3 hurricane1 = new StormWarningV3(new Hurricane(300));
        System.out.println(hurricane1);
        System.out.println(hurricane2);
        System.out.println(hurricane3);
//
//
//        System.out.println(hurricane3 + "\n" );

    }

}
    
package afternoon.nested.local.ex2;

import afternoon.nested.local.Print;

public class AnonymousOuter {
    private String outerInstance = "outerInstance";

    public void outerMethod() {
        String methodString = "methodString";

        Print print = new Print() {
            String localInstance = "localInstance";


            @Override
            public void printLocal() {
                System.out.println(outerInstance);
                System.out.println(methodString);
                System.out.println(localInstance);
//                System.out.println(methodParameter);
            }
        };
        print.printLocal();

    }


    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.outerMethod();
    }
}


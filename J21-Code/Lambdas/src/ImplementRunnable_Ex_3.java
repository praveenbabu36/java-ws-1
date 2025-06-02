public class ImplementRunnable_Ex_3 {

    public static void main(String[] args) {


        /*
            Prior to Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable - Prior to Java 8 style");
            }
        };

        new Thread(runnable).start();


        /*
            Java 8 Lambda

            syntax: () -> {}
         */
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable - Lambda Style");
        };

        new Thread(runnableLambda).start();


        // when there is only one statement to execute we dont need { }
        Runnable runnableLambda2 = () -> System.out.println("Inside Runnable - Lambda Style 2");

        new Thread(runnableLambda2).start();


        // instead of creating the function and passing it to thread
        new Thread( () -> System.out.println("Inside Runnable - Lambda Style 3") ).start();


    }

}

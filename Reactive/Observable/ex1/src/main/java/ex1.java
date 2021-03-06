import utils.AsyncTester;

/**
 * This example shows how to apply RxJava features synchronously to
 * perform basic Observable operations, including just(), map(), and
 * blockingSubscribe().
 */
@SuppressWarnings("StringConcatenationInsideStringBufferAppend")
public class ex1 {
    /**
     * Main entry point into the test program.
     */
    public static void main (String[] argv) throws InterruptedException {
        // Test BigFraction multiplication using a synchronous
        // Observable stream.
        AsyncTester.register(ObservableEx::testFractionMultiplication);

        long testCount = AsyncTester
            // Run all the tests.
            .runTests()

            // Block until all the tests are done to allow future
            // computations to complete running.
            .blockingGet();

        // Print the results.
        System.out.println("Completed " + testCount + " tests");
    }
}

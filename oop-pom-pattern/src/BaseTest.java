public abstract class BaseTest {
    public void setUp() {
        System.out.println("Set up trinh duyet");
        System.out.println("Mo trinh duyet");
        System.out.println("Config trinh duyet");
    }

    public void tearDown() {
        System.out.println("Teardown trinh duyet");
    }

    // define testcase de moi class con se tu define logic rieng
    public abstract void runTest();
}

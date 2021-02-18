package threading;

public class Testing {

    int i = 10;
    void fnTh(String th) {
        Thread t1 = new Thread(
                () ->{
                    for(int it = 0; i< 100; i++) {
                        try {
                            Thread.sleep(1500);
                            System.out.println(th + " - i " + ++i);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        t1.start();
    }
    public static void main(String[] args) {
        Testing tst = new Testing();
        tst.fnTh("TH1");
        tst.fnTh("TH2");
    }
}

public class Client {
    public static void main(String[] args) {
        Image im1 = new Image("a");
        Image im2 = new Image("b");

        InstagramPic inst1 = new InstagramPic( im1,new Blurry());
        InstagramPic inst2 = new InstagramPic( im2,new Green());

        inst1.apply();
        inst2.setStrategy(new Green());
        inst2.apply();

    }
}

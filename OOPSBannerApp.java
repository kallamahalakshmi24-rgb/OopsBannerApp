public class OOPSBannerApp {
    public static void main(String[] args) {

        // Declaration + initialization + population together
        String[] banner = {
                String.join(" ", " *** ", " *** ", "**** ", " ****"),
                String.join(" ", "*   *", "*   *", "*   *", "*    "),
                String.join(" ", "*   *", "*   *", "*   *", "*    "),
                String.join(" ", "*   *", "*   *", "**** ", " *** "),
                String.join(" ", "*   *", "*   *", "*    ", "    *"),
                String.join(" ", "*   *", "*   *", "*    ", "*   *"),
                String.join(" ", " *** ", " *** ", "*    ", " *** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
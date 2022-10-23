public class dz7 {

    public static void main(String[] args) {

        for (int i = 1234; i < 2346; i = i + 1) {
            if (i % 7 == 0) {
                System.out.println(i);
            } else {
                if (i % 13 == 0) {
                    System.out.println(i);
                } else {
                    if (i % 29 == 0) {
                        System.out.println(i);
                    } else {
                        if (i % 43 == 0) {
                            System.out.println(i);

                        }
                    }
                }
            }
        }
    }
}


public class Player {
        int number = 0; // where the guess goes

        public void guess() {
                number = (int) (Math.random() * 10); // (int) casts the double value returned by Math.random() into an int (a primitive data type)
                System.out.println("I'm guessing " + number);
        }
}

class GoodDog {
        // make the instance variable private
        private int size;

        // make the getter method public
        public int getSize() {
                return size;
        }

        // make the setter method public
        public void setSize(int s) {
                size = s;
        }

        /* even though the getter & setter methods don't really add new
         * functionality, the cool thing is that you can change your mind
         * later; you can come back and make a method safer, faster, better
         */

        void bark() {
                if (size > 60) {
                        System.out.println("Wooof! Wooof!");
                } else if (size > 14) {
                        System.out.println("Ruff! Ruff!");
                } else {
                        System.out.println("Yip! Yip!");
                }
        }
}

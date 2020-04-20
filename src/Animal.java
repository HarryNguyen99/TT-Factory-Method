public abstract class Animal {
    public abstract String makeSound();

    public static class Dog extends Animal {
        @Override
        public String makeSound() {
            return "Woof";
        }
    }
}

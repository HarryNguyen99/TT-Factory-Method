public class AnimalFactory {
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Animal.Dog();
        } else {
            return new Cat();
        }
    }
}

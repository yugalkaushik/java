public class AbstractClasses {
    static abstract class Animal {
        private String name;

        Animal(String name){
            this.name = name;
        }
        public void sleep(){
            System.out.println( this.name+ " " + "slept");
        }
        abstract void makeSound();
    }

    static class Dog extends Animal{
        Dog(String name){
            super(name);
        }
        @Override
        void makeSound(){
            System.out.println("bow bow");
        }
    }

    static class Cat extends Animal{
        Cat(String name){
            super(name);
        }
        @Override
        void makeSound(){
            System.out.println("meow meow");
        }
    }
    public static void main(String[] args){
        Dog d = new Dog("luffy");
        Cat c = new Cat("zoro");
        d.makeSound();
        c.makeSound();
        d.sleep();
        c.sleep();
    }
}

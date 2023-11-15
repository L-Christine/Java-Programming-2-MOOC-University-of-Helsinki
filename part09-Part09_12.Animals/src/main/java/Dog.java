
public class Dog extends Animal implements NoiseCapable {
    private String name;
    
    public Dog(String name) {
        super(name);
    }
    
    public Dog() {
        super("Dog");
    }
    
    public void bark() {
        System.out.println(getName() + " barks");
    }
    
    public void makeNoise() {
        bark();
    }
    
}

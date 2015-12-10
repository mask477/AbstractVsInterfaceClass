package interfacevsabstractclass;

public class InterfaceVsAbstractClass {

    public static void main(String[] args) {
        AbstractClass ac = new ExtendingAbstract();
        ac.print();
        ImplementsClass ic = new ImplementsClass();
        ic.print();
    }
    
}

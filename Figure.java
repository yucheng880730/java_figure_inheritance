public class Figure {

    //no parameter constructor
    public Figure(){

        System.out.println("Creating a figure with no parameters.");

    }

    public void erase(){

        System.out.println("Call to Figure's erase method.");

    }

    public void draw(){

        System.out.println("Call to Figure's draw method.");

    }

    public void center(){

        System.out.println("Calling Figure's center method.");
        this.erase();
        this.draw();

    }

}

public class Rectangle extends Figure{

    public Rectangle(){

        super();
        System.out.println("Creating Rectangle Class with no parameters.");

    }

    public void draw(){

        System.out.println("Calling Rectangle's draw method.");

    }

    public void erase(){

        System.out.println("Calling Rectangle's erase method.");

    }

    /*
    public void center(){

        System.out.println("Calling Figure's center method.");
        this.erase();
        this.draw();

    }
    */

}

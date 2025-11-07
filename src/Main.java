//This class declares an object of type box
class BoxDemo{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //assigning values to mybox1's instance variables
        mybox1.width=5;
        mybox1.height=4;
        mybox1.depth=3;

        //assigning different values to mybox2's instance variables
        mybox2.width=10;
        mybox2.height=20;
        mybox2.depth=2;

        //compute volume of mybox1
        vol= mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is " + vol);
        //compute volume of mybox2
        vol= mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);
    }
}
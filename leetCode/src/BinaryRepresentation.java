public class BinaryRepresentation {

    public static void main(String[] args) {

        System.out.println(">>>>>>>> Binary Representation >>>>>>>>>>>> : " + Integer.toString(51, 2));
        System.out.println(">>>>>>>> Binary Representation >>>>>>>>>>>> : " + Integer.toBinaryString(51));

        //reverse from binaary to decimal

        System.out.println(">>>>>>>> Decimal Representation >>>>>>>>>>>> : " + Integer.parseInt("110011", 2));  //51
    }
}

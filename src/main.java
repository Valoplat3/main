public class main {


    public static void main(String[] args)  {
        Property p1 = new Property("an der Hordelwiese 3",10,20.57);
        System.out.println(p1.getAddress() + " - " + p1.getSize() + "m²");

        Property p2 = new Property("pipistraße 1",55,55.55 );
        System.out.println(p2.getAddress() + " - " + p1.getSize() + "m²");

    }
}

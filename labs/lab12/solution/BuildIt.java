package labs.lab12.solution;

public class BuildIt {
    public static void main(String[] args) throws InterruptedException {
        try {
            CustomPart prototype = new CustomPart(1);
            ProductionFacility facility = new ProductionFacility(prototype);
            CustomPart[] parts = facility.massProduce(10);
            for (CustomPart part : parts) {
                System.out.println(part);
            }
        } catch (InterruptedException e) {
            System.out.println("Error on creation of prototype");
            throw e;
        }

    }
}

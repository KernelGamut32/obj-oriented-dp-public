package labs.lab12.solution;

public class ProductionFacility {
    CustomPart prototype;

    public ProductionFacility(CustomPart prototype) {
        this.prototype = prototype;
    }

    public CustomPart[] massProduce(int numCopiesToCreate) {
        CustomPart[] parts = new CustomPart[numCopiesToCreate + 1];
        parts[0] = prototype;
        for (int counter = 1; counter <= numCopiesToCreate; counter++) {
            parts[counter] = prototype.clone(true);
        }
        return parts;
    }
}

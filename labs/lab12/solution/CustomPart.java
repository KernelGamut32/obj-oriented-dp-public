package labs.lab12.solution;

class Instructions {
    private String stepOne;
    private String stepTwo;

    public Instructions() {
        stepOne = "Default step one";
        stepTwo = "Default step two";
    }

    public Instructions(String stepOne, String stepTwo) {
        this.stepOne = stepOne;
        this.stepTwo = stepTwo;
    }

    @Override
    public String toString() {
        return "Step One: " + stepOne + "\nStep Two: " + stepTwo;
    }

    public Instructions clone() {
        return new Instructions(stepOne, stepTwo);
    }
}

class CustomPart {
    int uniqueNumber;
    Instructions instructions;

    public CustomPart(int x) throws InterruptedException {
        uniqueNumber = x;
        instructions = new Instructions("Open package", "Use thing");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
            throw e;
        }
    }

    public CustomPart(int x, Instructions instructions) {
        uniqueNumber = x;
        this.instructions = instructions;
    }

    public int getValue() {
        return uniqueNumber;
    }

    public String getInstructions() {
        return instructions.toString();
    }

    public void setInstructions(Instructions instructions) {
        this.instructions = instructions;
    }

    public CustomPart clone(boolean isDeep) {
        return new CustomPart(uniqueNumber++, isDeep ? instructions.clone() : new Instructions());
    }

    @Override
    public String toString() {
        return "Part #" + uniqueNumber + "\n" + getInstructions();
    }
}
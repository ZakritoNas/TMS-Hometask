public enum Employ {

    DIRECTOR (3),
    WORKER (2);

    private int coefficient;

    Employ (int coefficient){
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }
}


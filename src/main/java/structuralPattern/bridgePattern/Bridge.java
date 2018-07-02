package structuralPattern.bridgePattern;


public abstract class Bridge {
    private Sourceable sourceable;

    public void method(){
        sourceable.method();
    }

    public Sourceable getSource() {
        return sourceable;
    }

    public void setSource(Sourceable source) {
        this.sourceable = source;
    }
}


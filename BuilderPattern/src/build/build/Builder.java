package build.build;

import build.product.Computer;

public abstract class Builder {
    public abstract void buildBoard(String board);
    public abstract void buildDisplay(String display);
    public abstract void buildOs();
    public abstract Computer build();
}

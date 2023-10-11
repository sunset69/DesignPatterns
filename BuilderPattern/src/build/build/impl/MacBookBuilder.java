package build.build.impl;

import build.build.Builder;
import build.product.Computer;
import build.product.impl.MacBook;

public class MacBookBuilder extends Builder {

    private Computer mComputer=new MacBook();


    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOs() {
        mComputer.setOs();
    }

    @Override
    public Computer build() {
        // 可再次校验生和完善成对象
        return mComputer;
    }
}

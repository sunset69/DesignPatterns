package build.product.impl;

import build.product.Computer;

public class MacBook extends Computer {

    public MacBook() {
    }

    @Override
    public void setOs() {
        mOs = "Mac OS X 12";
    }
}

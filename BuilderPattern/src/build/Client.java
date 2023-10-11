package build;

import build.build.Builder;
import build.build.Director;
import build.build.impl.MacBookBuilder;
import build.product.Computer;

public class Client {
    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板", "Retina显示器");

        Computer computer = builder.build();
        System.out.println(computer);
    }
}

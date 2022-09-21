package pl.horus_.builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Block> blocks = new ArrayList<>();
        blocks.add(new Block() {
            @Override
            public String getColor() { return "red"; }

            @Override
            public String getMaterial() { return "mud"; }
        });

        Wall wall = new Wall.WallBuilder(blocks).build();
        System.out.println(wall.count());
    }
}

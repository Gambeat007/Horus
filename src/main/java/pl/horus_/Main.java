package pl.horus_;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // test data
    private final static List<Block> blocks = new ArrayList<>();
    private final static Wall wall = new Wall(blocks);

    public static void main(String[] args) {

        SingleBlock singleBlock1 = new SingleBlock("silver","concrete");
        SingleBlock singleBlock2 = new SingleBlock("silver","clay");
        SingleBlock singleBlock3 = new SingleBlock("orange","concrete");
        blocks.add(singleBlock1);
        blocks.add(singleBlock2);
        blocks.add(singleBlock3);

        System.out.println("Is there any silver brick in this wall?: "+wall.findBlockByColor("silver"));
        System.out.println("Is there any orange brick in this wall?: "+wall.findBlockByColor("orange"));
        System.out.println("Is there any clay brick in this wall?: "+wall.findBlocksByMaterial("clay"));
        System.out.println("Is there any mud brick in this wall?: "+wall.findBlocksByMaterial("mud"));
        System.out.println("How many elements contains this wall?: "+wall.count());
        System.out.println("All wall elements: "+ wall.getBlocks());
    }
}

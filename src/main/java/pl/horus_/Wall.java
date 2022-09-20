package pl.horus_;

import java.util.List;
import java.util.Optional;


public class Wall extends SingleBlock implements Structure, CompositeBlock {
    private final List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }


    @Override
    public Optional findBlockByColor(String color) {
            return blocks.stream()
                    .filter(block -> color.equals(block.getColor()))
                    .findAny();
    }

    @Override
    public List findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> material.equals(block.getMaterial()))
                .toList();
    }

    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public List getBlocks() {
        return blocks;
    }
}

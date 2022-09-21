package pl.horus_.builder;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    private Wall(WallBuilder wallBuilder) {
        this.blocks = wallBuilder.blocks;
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

    public static class WallBuilder {
        private List<Block> blocks;

        public WallBuilder(List<Block> blocks) {
            this.blocks = blocks;
        }

        public Wall build() {
            return new Wall(this);
        }
    }
}

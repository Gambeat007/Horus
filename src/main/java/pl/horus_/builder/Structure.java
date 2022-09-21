package pl.horus_.builder;

import java.util.List;
import java.util.Optional;

public interface Structure extends CompositeBlock {
    Optional findBlockByColor(String color);
    List findBlocksByMaterial(String material);
    int count();
}
package me.kolterdyx.mcbasiclanguage.psi;

import kotlin.Pair;
import me.kolterdyx.mcbasiclanguage.MCBasicLogger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MCBasicNameIndex {
    private static final List<Pair<String, MCBasicNamedElement>> index = new ArrayList<>();

    private MCBasicNameIndex() {
        // Private constructor to prevent instantiation
    }

    public static MCBasicNamedElement registerElement(String name, MCBasicNamedElement element) {
        MCBasicLogger.log("Registering element '" + name + "'");
        index.add(new Pair<>(name, element));
        return element;
    }

    public static List<MCBasicNamedElement> findElements(String name) {
        List<MCBasicNamedElement> elements = new ArrayList<>();
        for (Pair<String, MCBasicNamedElement> pair : index) {
            if (pair.getFirst().equals(name)) {
                elements.add(pair.getSecond());
            }
        }
        return elements;
    }
}

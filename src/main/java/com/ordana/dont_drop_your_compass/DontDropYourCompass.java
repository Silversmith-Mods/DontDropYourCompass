package com.ordana.dont_drop_your_compass;

import net.minecraft.resources.Identifier;

public class DontDropYourCompass {

    public static final String MOD_ID = "dont_drop_your_compass";

    public static Identifier res(String name) {
        //~ if >1.21 'new Identifier'-> 'Identifier.fromNamespaceAndPath'
        return Identifier.fromNamespaceAndPath(MOD_ID, name);
    }

    public static void commonInit() {
    }

}
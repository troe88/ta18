package com.epam.po.elements;

import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;

/**
 * Created by Dmitry_Lebedev1 on 6/8/2018.
 */
public class MyMenu<T extends Enum> extends Menu<T> {
    @SafeVarargs
    public final void selects(T... items) {
        for (T t : items) {
            select(t);
        }
    }
}

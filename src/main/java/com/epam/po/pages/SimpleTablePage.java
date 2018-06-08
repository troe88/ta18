package com.epam.po.pages;

import com.epam.entities.Feature;
import com.epam.jdi.uitests.core.interfaces.complex.tables.interfaces.Row;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.EntityTable;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JTable;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dmitry_Lebedev1 on 6/8/2018.
 */
public class SimpleTablePage extends WebPage {

    @JTable(
            root = @FindBy(css = "#simple-table")
    )
    public EntityTable<Feature, Row> jdiFeaturesTable;

}

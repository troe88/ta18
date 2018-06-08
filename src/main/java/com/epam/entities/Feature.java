package com.epam.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Dmitry_Lebedev1 on 6/8/2018.
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(exclude = {"col2", "col3"})
public class Feature {
    public String col1;
    public String col2;
    public String col3;
}

package com.company.jmixqsproject.screen.catalogdegree;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.CatalogDegree;

@UiController("CatalogDegree.edit")
@UiDescriptor("catalog-degree-edit.xml")
@EditedEntityContainer("catalogDegreeDc")
public class CatalogDegreeEdit extends StandardEditor<CatalogDegree> {
}
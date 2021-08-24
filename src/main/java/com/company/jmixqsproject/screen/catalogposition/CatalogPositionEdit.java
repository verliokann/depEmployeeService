package com.company.jmixqsproject.screen.catalogposition;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.CatalogPosition;

@UiController("Position_.edit")
@UiDescriptor("catalog-position-edit.xml")
@EditedEntityContainer("catalogPositionDc")
public class CatalogPositionEdit extends StandardEditor<CatalogPosition> {
}
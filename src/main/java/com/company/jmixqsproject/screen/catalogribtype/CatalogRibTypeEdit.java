package com.company.jmixqsproject.screen.catalogribtype;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.CatalogRibType;

@UiController("CatalogRibType.edit")
@UiDescriptor("catalog-rib-type-edit.xml")
@EditedEntityContainer("catalogRibTypeDc")
public class CatalogRibTypeEdit extends StandardEditor<CatalogRibType> {
}
package com.company.jmixqsproject.screen.catalogribtype;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.CatalogRibType;

@UiController("CatalogRibType.browse")
@UiDescriptor("catalog-rib-type-browse.xml")
@LookupComponent("catalogRibTypesTable")
public class CatalogRibTypeBrowse extends StandardLookup<CatalogRibType> {
}
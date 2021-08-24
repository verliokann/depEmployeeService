package com.company.jmixqsproject.screen.catalogposition;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.CatalogPosition;

@UiController("Position_.browse")
@UiDescriptor("catalog-position-browse.xml")
@LookupComponent("catalogPositionsTable")
public class CatalogPositionBrowse extends StandardLookup<CatalogPosition> {
}
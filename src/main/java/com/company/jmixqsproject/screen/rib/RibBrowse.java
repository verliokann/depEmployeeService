package com.company.jmixqsproject.screen.rib;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.Rib;

@UiController("Rib.browse")
@UiDescriptor("rib-browse.xml")
@LookupComponent("ribsTable")
public class RibBrowse extends StandardLookup<Rib> {
}
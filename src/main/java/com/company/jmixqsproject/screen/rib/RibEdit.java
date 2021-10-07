package com.company.jmixqsproject.screen.rib;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.Rib;

@UiController("Rib.edit")
@UiDescriptor("rib-edit.xml")
@EditedEntityContainer("ribDc")
public class RibEdit extends StandardEditor<Rib> {
}
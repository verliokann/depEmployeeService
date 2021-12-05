package com.company.jmixqsproject.screen.degreestat;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.DegreeStat;

@UiController("DegreeStat.browse")
@UiDescriptor("degree-stat-browse.xml")
@LookupComponent("degreeStatsTable")
public class DegreeStatBrowse extends StandardLookup<DegreeStat> {
}
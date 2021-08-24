package com.company.jmixqsproject.screen.contract;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.Contract;

@UiController("Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
public class ContractBrowse extends StandardLookup<Contract> {
}
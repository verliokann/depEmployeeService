package com.company.jmixqsproject.screen.contract;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.Contract;

@UiController("Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
public class ContractEdit extends StandardEditor<Contract> {
}
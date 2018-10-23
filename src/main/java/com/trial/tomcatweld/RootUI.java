package com.trial.tomcatweld;

import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

@CDIUI("")
public class RootUI extends UI {
    @Inject
    BeanManager bm;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Label label = new Label("BeanManager: " + bm);
        setContent(label);
    }
}

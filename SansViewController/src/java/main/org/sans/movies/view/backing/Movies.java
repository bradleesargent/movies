package org.sans.movies.view.backing;

import javax.faces.component.html.HtmlOutputText;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.output.RichImage;

public class Movies {
    private RichForm f1;
    private RichDocument d1;
    private HtmlOutputText ot1;
    private RichPanelStretchLayout psl1;
    private RichImage i1;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }


    public void setOt1(HtmlOutputText ot1) {
        this.ot1 = ot1;
    }

    public HtmlOutputText getOt1() {
        return ot1;
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }
}

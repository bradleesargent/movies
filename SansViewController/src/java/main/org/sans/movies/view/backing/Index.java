package org.sans.movies.view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

public class Index {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelStretchLayout psl1;
    private RichOutputText pt_ot1;

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

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public void setPt_ot1(RichOutputText pt_ot1) {
        this.pt_ot1 = pt_ot1;
    }

    public RichOutputText getPt_ot1() {
        return pt_ot1;
    }
}

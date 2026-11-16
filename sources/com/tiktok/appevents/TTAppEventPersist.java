package com.tiktok.appevents;

import defpackage.pv1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class TTAppEventPersist implements Serializable {
    public static final long serialVersionUID = 1;
    private List<TTAppEvent> appEvents = new ArrayList();

    public void addEvents(List<TTAppEvent> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.appEvents.addAll(list);
    }

    public List<TTAppEvent> getAppEvents() {
        return this.appEvents;
    }

    public boolean isEmpty() {
        return this.appEvents.isEmpty();
    }

    public void setAppEvents(List<TTAppEvent> list) {
        this.appEvents = list;
    }

    public String toString() {
        return pv1.q(new StringBuilder("TTAppEventPersist{appEvents="), this.appEvents, '}');
    }
}

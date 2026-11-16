package com.adsurge.adn.p020f0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class e {
    public List a = new ArrayList();
    public Object b;

    public void a() {
        this.b = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a();
        }
    }
}

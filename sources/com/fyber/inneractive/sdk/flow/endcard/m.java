package com.fyber.inneractive.sdk.flow.endcard;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c = -1;
    public final g d = new g();

    public final void a(b bVar) {
        if (((bVar instanceof o) || (bVar instanceof d)) && this.a.contains(bVar)) {
            return;
        }
        this.a.add(bVar);
        this.a.sort(this.d);
    }

    public final b a(com.fyber.inneractive.sdk.model.vast.i iVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b bVar = (b) obj;
            if (bVar.i() == iVar) {
                return bVar;
            }
        }
        return null;
    }

    public final b a() {
        int i = this.c;
        if (i >= 0) {
            return (b) this.a.get(i);
        }
        return null;
    }
}

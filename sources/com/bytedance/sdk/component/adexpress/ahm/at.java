package com.bytedance.sdk.component.adexpress.ahm;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class at implements ra.kgy {

    @NonNull
    private List<ra> ahm;
    vs kgy;
    private gf rz;
    private AtomicBoolean uq = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra.kgy
    public boolean ahm(ra raVar) {
        int iIndexOf = this.ahm.indexOf(raVar);
        return iIndexOf < this.ahm.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra.kgy
    public void kgy(ra raVar) {
        int iIndexOf = this.ahm.indexOf(raVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.ahm.size()) {
                return;
            }
        } while (!this.ahm.get(iIndexOf).kgy(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra.kgy
    public boolean rz() {
        return this.uq.get();
    }

    public at(List<ra> list, gf gfVar) {
        this.ahm = list;
        this.rz = gfVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra.kgy
    public vs ahm() {
        return this.kgy;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra.kgy
    public void kgy() {
        this.rz.uq();
        Iterator<ra> it = this.ahm.iterator();
        while (it.hasNext() && !it.next().kgy(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra.kgy
    public void kgy(vs vsVar) {
        this.kgy = vsVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra.kgy
    public void kgy(boolean z) {
        this.uq.getAndSet(z);
    }
}

package com.bytedance.adsdk.ugeno.ct.kgy;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm implements rz {
    private List<uq> kgy = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.ct.kgy.rz
    public void kgy(String str) {
        if (this.kgy.isEmpty()) {
            return;
        }
        Iterator<uq> it = this.kgy.iterator();
        while (it.hasNext()) {
            it.next().kgy(str);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ct.kgy.rz
    public void kgy(uq uqVar) {
        this.kgy.add(uqVar);
    }
}

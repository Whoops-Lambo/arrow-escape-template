package com.vungle.ads.internal.task;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i implements com.vungle.ads.internal.executor.h {
    public abstract int a();

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        obj.getClass();
        if (obj instanceof i) {
            return s71.h(((i) obj).a(), a());
        }
        return -1;
    }
}

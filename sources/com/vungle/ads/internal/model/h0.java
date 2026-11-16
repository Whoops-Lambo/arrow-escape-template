package com.vungle.ads.internal.model;

import defpackage.uu;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uu.k(Boolean.valueOf(((b) obj2).j()), Boolean.valueOf(((b) obj).j()));
    }
}

package com.inmobi.media;

import defpackage.uu;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C4041g7 c4041g7 = (C4041g7) obj2;
        C4041g7 c4041g8 = (C4041g7) obj;
        return uu.k(Integer.valueOf(c4041g7.c * c4041g7.d), Integer.valueOf(c4041g8.c * c4041g8.d));
    }
}

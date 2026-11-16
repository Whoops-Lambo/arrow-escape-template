package com.inmobi.media;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.inmobi.media.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum EnumC4259o2 {
    d("UNKNOWN"),
    e("PLAYING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25("PAUSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("COMPLETED");

    public static final C4231n2 b = new C4231n2();
    public static final SparseArray c = new SparseArray();
    public final int a;

    static {
        for (EnumC4259o2 enumC4259o2 : values()) {
            c.put(enumC4259o2.a, enumC4259o2);
        }
    }

    EnumC4259o2(String str) {
        this.a = i;
    }
}

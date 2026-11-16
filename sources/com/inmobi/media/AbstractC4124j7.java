package com.inmobi.media;

import java.util.BitSet;

/* JADX INFO: renamed from: com.inmobi.media.j7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4124j7 {
    public final C3870a3 a;

    public final boolean a(boolean z) {
        BitSet bitSet = this.a.a;
        return bitSet != null ? bitSet.get(0) : z;
    }

    public AbstractC4124j7(String str) {
        str.getClass();
        C3870a3 c3870a3 = new C3870a3();
        this.a = c3870a3;
        c3870a3.a(str);
    }
}

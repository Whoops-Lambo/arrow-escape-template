package io.p071bidmachine.media3.extractor.metadata.dvbsi;

import defpackage.nj;
import io.p071bidmachine.media3.common.c0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements c0 {
    public final int a;
    public final String b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return nj.q(sb, this.b, ")");
    }

    public a(int i, String str) {
        this.a = i;
        this.b = str;
    }
}

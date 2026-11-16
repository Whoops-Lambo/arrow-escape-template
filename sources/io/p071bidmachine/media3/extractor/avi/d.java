package io.p071bidmachine.media3.extractor.avi;

import io.p071bidmachine.media3.common.util.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public d(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final int a() {
        int i = this.a;
        if (i != 1935960438) {
            if (i != 1935963489) {
                if (i != 1937012852) {
                    a.A("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }

    @Override // io.p071bidmachine.media3.extractor.avi.a
    public final int getType() {
        return 1752331379;
    }
}

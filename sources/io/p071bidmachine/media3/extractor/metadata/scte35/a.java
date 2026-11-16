package io.p071bidmachine.media3.extractor.metadata.scte35;

import defpackage.jc1;
import io.p071bidmachine.media3.common.util.q;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public a(long j, long j2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.metadata.scte35.b
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return jc1.m(this.c, " }", sb);
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return jc1.m(this.c, " }", sb2);
        }
    }

    public static long b(long j, q qVar) {
        long jT = qVar.t();
        if ((128 & jT) != 0) {
            return 8589934591L & ((((jT & 1) << 32) | qVar.v()) + j);
        }
        return -9223372036854775807L;
    }
}

package io.p071bidmachine.media3.exoplayer;

import defpackage.h50;
import defpackage.jc1;
import io.p071bidmachine.media3.common.util.x;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        int i12 = x.a;
        Locale locale = Locale.US;
        StringBuilder sbT = jc1.t("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
        h50.s(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbT);
        h50.s(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbT);
        h50.s(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbT);
        h50.s(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbT);
        sbT.append(j);
        sbT.append("\n videoFrameProcessingOffsetCount=");
        sbT.append(i11);
        sbT.append("\n}");
        return sbT.toString();
    }
}

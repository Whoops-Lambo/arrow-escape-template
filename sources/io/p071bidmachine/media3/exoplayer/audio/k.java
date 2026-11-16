package io.p071bidmachine.media3.exoplayer.audio;

import androidx.annotation.Nullable;
import defpackage.h50;
import defpackage.jc1;
import io.p071bidmachine.media3.common.n;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class k extends Exception {
    public final int a;
    public final boolean b;
    public final n c;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(int i, int i2, int i3, int i4, n nVar, boolean z, @Nullable Exception exc) {
        StringBuilder sbT = jc1.t("AudioTrack init failed ", i, " Config(", i2, ", ");
        h50.s(i3, i4, ", ", ") ", sbT);
        sbT.append(nVar);
        sbT.append(z ? " (recoverable)" : "");
        this(sbT.toString(), i, nVar, z, exc);
    }

    public k(String str, int i, n nVar, boolean z, @Nullable Throwable th) {
        super(str, th);
        this.a = i;
        this.b = z;
        this.c = nVar;
    }
}

package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzwb extends Exception {

    @Nullable
    public final String a;
    public final boolean b;

    @Nullable
    public final zzvy c;

    @Nullable
    public final String d;

    public final /* synthetic */ zzwb a(zzwb zzwbVar) {
        return new zzwb(getMessage(), getCause(), this.a, false, this.c, this.d, zzwbVar);
    }

    public zzwb(zzv zzvVar, @Nullable Throwable th, boolean z, int i) {
        String string = zzvVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = zzvVar.o;
        int iAbs = Math.abs(i);
        this(string2, th, str, false, null, pv1.l(iAbs, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(iAbs).length() + 60)), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzwb(zzv zzvVar, @Nullable Throwable th, boolean z, zzvy zzvyVar) {
        String str = zzvyVar.a;
        int length = str.length();
        String string = zzvVar.toString();
        this(pv1.p(new StringBuilder(length + 23 + string.length()), "Decoder init failed: ", str, ", ", string), th, zzvVar.o, false, zzvyVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzwb(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z, @Nullable zzvy zzvyVar, @Nullable String str3, @Nullable zzwb zzwbVar) {
        super(str, th);
        this.a = str2;
        this.b = false;
        this.c = zzvyVar;
        this.d = str3;
    }
}

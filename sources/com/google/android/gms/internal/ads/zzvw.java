package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class zzvw extends zzja {
    public final int a;

    public zzvw(Throwable th, @Nullable zzvy zzvyVar) {
        super("Decoder failed: ".concat(String.valueOf(zzvyVar == null ? null : zzvyVar.a)), th);
        boolean z = th instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.a = z ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}

package io.p071bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class n extends Exception {

    @Nullable
    public final String a;
    public final boolean b;

    @Nullable
    public final m c;

    @Nullable
    public final String d;

    @Nullable
    public final n e;

    public n(io.p071bidmachine.media3.common.n nVar, @Nullable Throwable th, boolean z, m mVar) {
        this("Decoder init failed: " + mVar.a + ", " + nVar, th, nVar.n, z, mVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private static String b(int i) {
        return "io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckResult
    public n c(n nVar) {
        return new n(getMessage(), getCause(), this.a, this.b, this.c, this.d, nVar);
    }

    public n(io.p071bidmachine.media3.common.n nVar, @Nullable Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + nVar, th, nVar.n, z, null, b(i), null);
    }

    private n(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z, @Nullable m mVar, @Nullable String str3, @Nullable n nVar) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = mVar;
        this.d = str3;
        this.e = nVar;
    }
}

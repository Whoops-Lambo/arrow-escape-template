package io.p071bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.decoder.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class l extends c {

    @Nullable
    public final m a;

    @Nullable
    public final String b;
    public final int c;

    public l(Throwable th, @Nullable m mVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(mVar == null ? null : mVar.a);
        super(sb.toString(), th);
        this.a = mVar;
        String diagnosticInfo = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.b = diagnosticInfo;
        this.c = x.a >= 23 ? a(th) : x.v(diagnosticInfo);
    }

    @RequiresApi
    private static int a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}

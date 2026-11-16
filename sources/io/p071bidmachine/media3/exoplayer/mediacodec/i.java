package io.p071bidmachine.media3.exoplayer.mediacodec;

import io.p071bidmachine.media3.common.util.x;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements v {
    public static final i a = new i();
    public static final i b = new i();

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.v
    public int getScore(Object obj) {
        String str = ((m) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (x.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public List a(String str, boolean z, boolean z2) {
        return w.e(str, z, z2);
    }
}

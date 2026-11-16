package com.fyber.inneractive.sdk.mraid;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class i extends e {
    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        int iA = a("w");
        int iA2 = a(CmcdData.STREAMING_FORMAT_HLS);
        this.c.a((String) this.b.get("url"), iA <= 0 ? -1 : iA, iA2 <= 0 ? -1 : iA2, "true".equals(this.b.get("shouldUseCustomClose")), "true".equals(this.b.get("lockOrientation")));
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return (String) this.b.get("url");
    }

    public i(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }
}

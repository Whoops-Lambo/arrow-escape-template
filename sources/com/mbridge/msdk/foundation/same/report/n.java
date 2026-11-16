package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;
import com.mbridge.msdk.tracker.w;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class n extends w {
    @Override // com.mbridge.msdk.tracker.w
    public v<String> a(q qVar) {
        String str;
        try {
            str = new String(qVar.b, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar.c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(qVar.b);
        }
        return v.a(str, com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
    }
}

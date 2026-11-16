package com.ironsource.adqualitysdk.sdk.i;

import android.view.Choreographer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﾄ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ChoreographerFrameCallbackC1340 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1337 f4007;

    public ChoreographerFrameCallbackC1340(C1337 c1337) {
        this.f4007 = c1337;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        try {
            AbstractC4631n.m405(this.f4007);
        } catch (Throwable th) {
            String strDecrypt = StringFog.decrypt("ZPBRFUcBGcRcx0Qr\n", "JZQAYCZtcLA=\n");
            AbstractC0509.m497(strDecrypt, strDecrypt, StringFog.decrypt("bM77oBFWqFNl6eCtGlc=\n", "Cq+SzHQyiDc=\n"), th, null, false);
        }
    }
}

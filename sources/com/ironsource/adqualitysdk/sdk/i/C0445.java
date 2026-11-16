package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ɽ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0445 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0368 f901;

    public C0445(C0368 c0368) {
        this.f901 = c0368;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C0969 c0969 = this.f901.f708.f700.f3953;
        String strDecrypt = StringFog.decrypt("P71Mk+Z7KSUqpX6RrXM=\n", "WdEt9MgdQFc=\n");
        C0448 c0448 = new C0448(this);
        c0969.getClass();
        C0969.m739().post(new C1026(c0969, strDecrypt, c0448));
    }
}

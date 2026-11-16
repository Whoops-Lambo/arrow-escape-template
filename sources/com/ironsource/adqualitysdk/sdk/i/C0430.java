package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ɛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0430 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0411 f884;

    public C0430(C0411 c0411) {
        this.f884 = c0411;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C0396 c0396 = this.f884.f844;
        if (c0396.f829) {
            C0604 c0604 = c0396.f828;
            String strDecrypt = StringFog.decrypt("8Hzk0qGnA97zN+PXpbIE8uhq9NStgQ/H\n", "nRmAu8DTarE=\n");
            c0604.getClass();
            c0604.m550(strDecrypt, new ArrayList());
            this.f884.f844.f829 = false;
        }
    }
}

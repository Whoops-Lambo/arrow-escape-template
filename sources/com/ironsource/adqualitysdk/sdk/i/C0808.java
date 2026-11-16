package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.q63;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᒃ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0808 implements InterfaceC0675 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1199 f2119;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2120;

    public C0808(C1199 c1199, ArrayList arrayList) {
        this.f2119 = c1199;
        this.f2120 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0675
    /* JADX INFO: renamed from: ﾇ */
    public final void mo566(Activity activity) {
        String strDecrypt = StringFog.decrypt("P54zxXViD5c1gwHFZHIY\n", "UPB1qhYXfMU=\n");
        if (C1199.m875(this.f2119, activity, this.f2120)) {
            String strI = q63.i("jXnq7YklToiAYOnfgyheieI=\n", "zAmaq+ZGO/s=\n", strDecrypt);
            C1199.m874(this.f2119, strI, true, false, Collections.singletonList(activity));
            AbstractC4631n.m402(new C0849(this, strI, activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0675
    /* JADX INFO: renamed from: ﾒ */
    public final void mo567(Activity activity) {
        String strDecrypt = StringFog.decrypt("hPawAIkW8+mE64I=\n", "65j2b+pjgKU=\n");
        if (C1199.m875(this.f2119, activity, this.f2120)) {
            String strI = q63.i("jXnq7YklToiAYOnfgyheieI=\n", "zAmaq+ZGO/s=\n", strDecrypt);
            C1199.m874(this.f2119, strI, true, false, Collections.singletonList(activity));
            AbstractC4631n.m402(new C0849(this, strI, activity));
        }
    }
}

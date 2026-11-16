package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBFetchManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﬥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1176 extends HashMap implements InterfaceC0672 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1168 f3473;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0752 f3474;

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0672
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo359() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176(C1168 c1168, HashMap map, C0752 c0752) {
        super(map);
        this.f3473 = c1168;
        this.f3474 = c0752;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        DTBFetchManager dTBFetchManager = (DTBFetchManager) obj2;
        this.f3473.m519(this, this.f3474, StringFog.decrypt("QtwLyZUgRhFL6SfulzFXEk7pOue9NVVXdv09\n", "BohJj/BUJXk=\n"), str, dTBFetchManager);
        return (DTBFetchManager) super.put(str, dTBFetchManager);
    }
}

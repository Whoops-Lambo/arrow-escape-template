package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class CS extends AbstractC2637c3 {
    public final /* synthetic */ InterfaceC3321nG A00;
    public final /* synthetic */ C3514qT A01;
    public final /* synthetic */ C3411ol A02;
    public final /* synthetic */ CQ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public CS(CQ cq, String str, C3411ol c3411ol, InterfaceC3321nG interfaceC3321nG, Map map, C3514qT c3514qT) {
        this.A03 = cq;
        this.A04 = str;
        this.A02 = c3411ol;
        this.A00 = interfaceC3321nG;
        this.A05 = map;
        this.A01 = c3514qT;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2637c3
    public final void A03() {
        if (!this.A03.A0A.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A07.get(this.A02.A02())) {
            this.A00.AC7(this.A04, new C3715ti(this.A05).A05(this.A03.A02).A04(this.A01).A07());
            C2847fT.A07(this.A03.A00, this.A03.A08);
            this.A03.A07.put(this.A02.A02(), true);
        }
    }
}

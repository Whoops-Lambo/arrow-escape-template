package com.facebook.ads.redexgen.X;

import java.util.Collection;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class MJ implements InterfaceC2801ei {
    public final /* synthetic */ C2055Hi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public MJ(JSONObject jSONObject, C2055Hi c2055Hi, String str) {
        this.A02 = jSONObject;
        this.A00 = c2055Hi;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2801ei
    public final String A7z() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2801ei
    public final Collection<String> A8Q() {
        return AbstractC2802ej.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2801ei
    public final EnumC2800eh A8w() {
        return AbstractC2802ej.A00(this.A02);
    }
}

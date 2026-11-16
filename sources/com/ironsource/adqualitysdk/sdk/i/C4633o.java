package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C4633o implements InterfaceC1265 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4635p f421;

    public C4633o(C4635p c4635p) {
        this.f421 = c4635p;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1265
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void mo418() {
        JSONObject jSONObject;
        C0928 c0928 = ((C1082) AbstractC1081.m765()).f3129;
        synchronized (c0928) {
            jSONObject = c0928.f2544;
        }
        long jOptLong = jSONObject.optLong(C0928.f2504, 0L);
        C4635p c4635p = this.f421;
        if (jOptLong == 0) {
            c4635p.f430 = Boolean.FALSE;
            jOptLong = c0928.m696();
            AbstractC1290.m905(StringFog.decrypt("eTCZmj2CefZdCo2RLZ5q9EMwjpo8\n", "LVn0/072GJs=\n"), StringFog.decrypt("iB6rZQf0KD7tC7x+Ab0vN+0fvHgDsTNwuQW0bwagID29\n", "zWzZCnXUQVA=\n"), (Throwable) null, false);
        } else {
            c4635p.f430 = Boolean.TRUE;
        }
        this.f421.f429 = c0928.m695();
        this.f421.f428 = c0928.m696();
        C4635p c4635p2 = this.f421;
        c4635p2.f427 = jOptLong - c4635p2.f429;
        c4635p2.f426 = jOptLong - c4635p2.f428;
    }
}

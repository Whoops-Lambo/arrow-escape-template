package com.ironsource;

import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C4984t2 extends com.ironsource.mediationsdk.e.a {
    @Override // com.ironsource.mediationsdk.e.a
    public void a(boolean z, InterfaceC4680c2 interfaceC4680c2, long j) {
        try {
            if (z) {
                ((InterfaceC4859m2) interfaceC4680c2).a(this.b, this.f + 1, j, this.j, this.i);
            } else {
                interfaceC4680c2.a(this.c, this.d, this.f + 1, this.g, j);
            }
        } catch (Exception e) {
            C4950r4.d().a(e);
            interfaceC4680c2.a(1009, e.getMessage(), this.f + 1, this.g, j);
        }
    }

    public C4984t2(InterfaceC4680c2 interfaceC4680c2, URL url, JSONObject jSONObject, boolean z, A2 a2) {
        super(interfaceC4680c2, url, jSONObject, z, a2);
    }
}

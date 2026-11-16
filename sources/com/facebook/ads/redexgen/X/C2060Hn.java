package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2060Hn extends AbstractRunnableC3416oq {
    public final /* synthetic */ InterfaceC3175kr A00;
    public final /* synthetic */ C3176ks A01;
    public final /* synthetic */ C3183kz A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C2060Hn(C3183kz c3183kz, ArrayList arrayList, C3176ks c3176ks, InterfaceC3175kr interfaceC3175kr, ArrayList arrayList2) {
        this.A02 = c3183kz;
        this.A03 = arrayList;
        this.A01 = c3176ks;
        this.A00 = interfaceC3175kr;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        AtomicBoolean atomicBooleanA0D = C3183kz.A0D(this.A03);
        if (this.A02.A04 instanceof C2055Hi) {
            C2055Hi c2055Hi = (C2055Hi) this.A02.A04;
            if (this.A01.A00 == -1) {
                if (atomicBooleanA0D.get()) {
                    c2055Hi.A0F().A5L(C3513qS.A01(this.A02.A00));
                } else {
                    c2055Hi.A0F().A5J(C3513qS.A01(this.A02.A00));
                }
            } else if (atomicBooleanA0D.get()) {
                c2055Hi.A0F().A5M(C3513qS.A01(this.A02.A00), this.A01.A00);
            } else {
                c2055Hi.A0F().A5K(C3513qS.A01(this.A02.A00), this.A01.A00);
            }
        }
        this.A02.A02.post(new C2061Ho(this, atomicBooleanA0D));
        C3183kz.A0D(this.A04);
    }
}

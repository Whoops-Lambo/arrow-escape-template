package com.facebook.ads.redexgen.X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AE implements Yk {
    public final EnumC2487Zc A00;
    public final AbstractC17464t A01;

    public AE(AbstractC17464t abstractC17464t, EnumC2487Zc enumC2487Zc) {
        this.A01 = abstractC17464t;
        this.A00 = enumC2487Zc;
    }

    @Override // com.facebook.ads.redexgen.X.Yk
    public void A4e(Map<InterfaceC2518a7, YU> map, Map<SyncModifiableBundle, EnumC2487Zc> map2) {
        map2.put(null, this.A00);
    }
}

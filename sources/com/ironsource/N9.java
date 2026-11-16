package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class N9 extends AbstractC4949r3 {
    private static N9 R;
    private String P;
    private final Q8 Q = Pb.k0().s();

    @Override // com.ironsource.AbstractC4949r3
    public boolean j(C5 c5) {
        return false;
    }

    public static synchronized N9 i() {
        try {
            if (R == null) {
                N9 n9 = new N9();
                R = n9;
                n9.e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return R;
    }

    @Override // com.ironsource.AbstractC4949r3
    public void d() {
        jc1.v(D5.IS_LOAD_CALLED, this.J);
        jc1.v(D5.IS_INSTANCE_LOAD, this.J);
        jc1.v(D5.IS_INSTANCE_LOAD_SUCCESS, this.J);
        jc1.v(D5.IS_CALLBACK_LOAD_SUCCESS, this.J);
        jc1.v(D5.IS_INSTANCE_LOAD_FAILED, this.J);
        jc1.v(D5.IS_INSTANCE_LOAD_NO_FILL, this.J);
        jc1.v(D5.IS_INSTANCE_READY_TRUE, this.J);
        jc1.v(D5.IS_INSTANCE_READY_FALSE, this.J);
        jc1.v(D5.BN_LOAD, this.J);
        jc1.v(D5.BN_CALLBACK_LOAD_ERROR, this.J);
        jc1.v(D5.BN_RELOAD, this.J);
        jc1.v(D5.BN_CALLBACK_RELOAD_ERROR, this.J);
        jc1.v(D5.BN_CALLBACK_RELOAD_SUCCESS, this.J);
        jc1.v(D5.BN_INSTANCE_LOAD, this.J);
        jc1.v(D5.BN_INSTANCE_RELOAD, this.J);
        jc1.v(D5.BN_INSTANCE_LOAD_SUCCESS, this.J);
        jc1.v(D5.BN_INSTANCE_LOAD_ERROR, this.J);
        jc1.v(D5.BN_INSTANCE_RELOAD_SUCCESS, this.J);
        jc1.v(D5.BN_INSTANCE_RELOAD_ERROR, this.J);
        jc1.v(D5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, this.J);
        jc1.v(D5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, this.J);
        jc1.v(D5.BN_INSTANCE_SHOW, this.J);
        jc1.v(D5.NT_LOAD, this.J);
        jc1.v(D5.NT_CALLBACK_LOAD_ERROR, this.J);
        jc1.v(D5.NT_INSTANCE_LOAD, this.J);
        jc1.v(D5.NT_INSTANCE_LOAD_SUCCESS, this.J);
        jc1.v(D5.NT_INSTANCE_LOAD_ERROR, this.J);
        jc1.v(D5.NT_INSTANCE_SHOW, this.J);
    }

    @Override // com.ironsource.AbstractC4949r3
    public String e(int i) {
        return this.P;
    }

    private N9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    @Override // com.ironsource.AbstractC4949r3
    public int c(C5 c5) {
        int iF = f(c5.c());
        if (iF == AbstractC4949r3.e.BANNER.b()) {
            return this.Q.a(IronSource.a.BANNER);
        }
        int iB = AbstractC4949r3.e.NATIVE_AD.b();
        Q8 q8 = this.Q;
        if (iF == iB) {
            return q8.a(IronSource.a.NATIVE_AD);
        }
        return q8.a(IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC4949r3
    public void f(C5 c5) {
        this.P = c5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC4949r3
    public boolean d(C5 c5) {
        int iC = c5.c();
        return iC == D5.IS_CALLBACK_LOAD_SUCCESS.c() || iC == D5.IS_INSTANCE_OPENED.c() || iC == D5.IS_INSTANCE_CLOSED.c() || iC == D5.IS_AUCTION_SUCCESS.c() || iC == D5.IS_AUCTION_FAILED.c() || iC == D5.BN_INSTANCE_SHOW.c() || iC == D5.BN_AUCTION_SUCCESS.c() || iC == D5.BN_AUCTION_FAILED.c() || iC == D5.NT_INSTANCE_LOAD_SUCCESS.c() || iC == D5.NT_INSTANCE_SHOW.c() || iC == D5.NT_AUCTION_SUCCESS.c() || iC == D5.NT_AUCTION_FAILED.c();
    }
}

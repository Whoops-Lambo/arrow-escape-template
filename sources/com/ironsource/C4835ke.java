package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.jc1;

/* JADX INFO: renamed from: com.ironsource.ke, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4835ke extends AbstractC4949r3 {
    private static C4835ke R;
    private String P;
    private final Q8 Q = Pb.k0().s();

    @Override // com.ironsource.AbstractC4949r3
    public boolean j(C5 c5) {
        return false;
    }

    public static synchronized C4835ke i() {
        try {
            if (R == null) {
                C4835ke c4835ke = new C4835ke();
                R = c4835ke;
                c4835ke.e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return R;
    }

    @Override // com.ironsource.AbstractC4949r3
    public int c(C5 c5) {
        return this.Q.a(IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC4949r3
    public String e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    private C4835ke() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    @Override // com.ironsource.AbstractC4949r3
    public boolean d(C5 c5) {
        int iC = c5.c();
        if (iC != D5.FIRST_INSTANCE.c() && iC != D5.INIT_COMPLETE.c() && iC != D5.SDK_INIT_FAILED.c() && iC != D5.SDK_INIT_SUCCESS.c() && iC != D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.c() && iC != D5.RV_BUSINESS_INSTANCE_OPENED.c() && iC != D5.RV_INSTANCE_CLOSED.c() && iC != D5.RV_BUSINESS_INSTANCE_REWARDED.c() && iC != D5.RV_AUCTION_FAILED.c() && iC != D5.RV_AUCTION_SUCCESS.c()) {
            return false;
        }
        return true;
    }

    @Override // com.ironsource.AbstractC4949r3
    public void f(C5 c5) {
        if (c5.c() != 15 && (c5.c() < 300 || c5.c() >= 400)) {
            return;
        }
        this.P = c5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC4949r3
    public void d() {
        jc1.v(D5.RV_BUSINESS_MEDIATION_LOAD, this.J);
        jc1.v(D5.RV_BUSINESS_INSTANCE_LOAD, this.J);
        jc1.v(D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, this.J);
        jc1.v(D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, this.J);
        jc1.v(D5.RV_INSTANCE_LOAD_FAILED, this.J);
        jc1.v(D5.RV_INSTANCE_SHOW_CHANCE, this.J);
        jc1.v(D5.RV_INSTANCE_READY_TRUE, this.J);
        jc1.v(D5.RV_INSTANCE_READY_FALSE, this.J);
        jc1.v(D5.RV_INSTANCE_LOAD_FAILED_REASON, this.J);
        jc1.v(D5.RV_INSTANCE_LOAD_NO_FILL, this.J);
        jc1.v(D5.RV_MEDIATION_LOAD_ERROR, this.J);
    }
}

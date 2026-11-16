package com.bytedance.sdk.openadsdk.core.ra;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.gf.ra;
import com.bytedance.sdk.openadsdk.core.settings.nu;
import com.bytedance.sdk.openadsdk.lqi.ct;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm {
    public static final Long kgy = 0L;
    private AtomicBoolean ahm;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        static final ahm kgy = new ahm();
    }

    public boolean at() {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "user_compliance_status", -1) == 3;
    }

    public int fi() {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "user_compliance_status", -1);
    }

    public boolean gf() {
        int iKgy = com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "user_compliance_status", -1);
        return iKgy == 1 || iKgy == 2;
    }

    public void kgy(final uq uqVar, final boolean z) {
        rz rzVar = new rz();
        rzVar.kgy(new uq() { // from class: com.bytedance.sdk.openadsdk.core.ra.ahm.1
            @Override // com.bytedance.sdk.openadsdk.core.ra.uq
            public void kgy(boolean z2) {
                if (!z2) {
                    uqVar.kgy(false);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.ra.kgy kgyVar = new com.bytedance.sdk.openadsdk.core.ra.kgy(z);
                kgyVar.kgy(new uq() { // from class: com.bytedance.sdk.openadsdk.core.ra.ahm.1.1
                    @Override // com.bytedance.sdk.openadsdk.core.ra.uq
                    public void kgy(boolean z3) {
                        uqVar.kgy(z3);
                    }
                });
                kgyVar.kgy();
            }
        });
        rzVar.kgy();
    }

    public boolean noq() {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "app_reg", -1) == 1;
    }

    public boolean nu() {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "user_compliance_status", -1) == 1;
    }

    public boolean ra() {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "user_compliance_status", -1) == -1;
    }

    public int rz() {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "app_reg", -1);
    }

    public long twf() {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "allow_req_time", kgy.longValue());
    }

    public boolean yo() {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "app_reg", -1) == -1;
    }

    private ahm() {
        this.ahm = new AtomicBoolean(false);
    }

    private void dg() {
        if (kgy().ct() || this.ahm.getAndSet(true)) {
            return;
        }
        ApmHelper.initAPM();
        ct.ahm();
        ra.ahm();
        com.bytedance.sdk.openadsdk.core.kus.rz.kgy.kgy().ahm();
    }

    public void ahm() {
        String strXrn = nu.ahm().xrn();
        if (!TextUtils.isEmpty(strXrn)) {
            if (TextUtils.equals("true", strXrn)) {
                kgy(1);
            } else if (TextUtils.equals("false", strXrn)) {
                kgy(0);
            }
        }
    }

    public boolean ct() {
        if (!uq() && noq() && gf()) {
            return false;
        }
        return true;
    }

    public void kus() {
        kgy().ahm();
    }

    public boolean uq() {
        long jTwf = twf();
        if (at() && jTwf != 0 && System.currentTimeMillis() < jTwf) {
            return true;
        }
        return false;
    }

    public void vs() {
        dg();
    }

    public void kgy(int i) {
        com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "app_reg", Integer.valueOf(i));
    }

    public void kgy(long j) {
        com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "allow_req_time", Long.valueOf(j));
    }

    public void kgy(String str) {
        com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "user_compliance_status_reason", str);
    }

    public static ahm kgy() {
        return kgy.kgy;
    }

    public void ahm(int i) {
        com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("sp_compliance_file", "user_compliance_status", Integer.valueOf(i));
    }
}

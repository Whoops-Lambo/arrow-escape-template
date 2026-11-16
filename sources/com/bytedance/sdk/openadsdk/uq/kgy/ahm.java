package com.bytedance.sdk.openadsdk.uq.kgy;

import android.content.Context;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.uq.kgy.kgy.twf;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm {
    public static final AtomicBoolean kgy = new AtomicBoolean(false);
    public static final AtomicBoolean ahm = new AtomicBoolean(false);
    public static AtomicInteger rz = new AtomicInteger(0);

    public static void kgy(Context context) {
        try {
            if (kgy.compareAndSet(false, true)) {
                com.bytedance.sdk.component.yo.kgy.ahm.kgy(new com.bytedance.sdk.component.yo.kgy.kgy.C0221kgy().kgy(new yo()).ahm(com.bytedance.sdk.openadsdk.uq.kgy.kgy.fi.ahm()).rz(com.bytedance.sdk.openadsdk.uq.kgy.kgy.fi.rz()).kgy(com.bytedance.sdk.openadsdk.uq.kgy.kgy.fi.kgy()).kgy(new fi()).kgy(ct.kgy).ahm(xh.uq().twf()).kgy(xh.uq().kus()).kgy(xh.uq().idg()).kgy(), context);
                ahm();
            }
        } catch (Throwable unused) {
            kgy.set(false);
        }
        if (!ahm.compareAndSet(false, true) || com.bytedance.sdk.openadsdk.uq.kgy.kgy.noq.kgy() == 1) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.uq.kgy.kgy.yo.kgy(context);
        } catch (Throwable unused2) {
            ahm.set(false);
        }
    }

    public static void ahm() {
        com.bytedance.sdk.component.yo.kgy.ahm.rz();
        com.bytedance.kgy.rz.kgy(true);
    }

    public static void rz() {
        try {
            com.bytedance.sdk.component.yo.kgy.ahm.uq();
            com.bytedance.sdk.component.yo.kgy.ahm.ct();
        } catch (Throwable th) {
            sx.rz("AdLogSwitchUtils", th.getMessage());
        }
        com.bytedance.kgy.rz.kgy(false);
    }

    public static void kgy(com.bytedance.sdk.openadsdk.uq.kgy kgyVar) {
        com.bytedance.sdk.component.yo.kgy.uq.kgy.kgy kgyVar2 = new com.bytedance.sdk.component.yo.kgy.uq.kgy.kgy(kgyVar.yo(), kgyVar);
        kgyVar2.rz(kgyVar.fi() ? (byte) 1 : (byte) 2);
        kgyVar2.ahm((byte) 0);
        if (com.bytedance.sdk.component.yo.kgy.ahm.ahm()) {
            kgy(xh.kgy());
        }
        int iKgy = com.bytedance.sdk.openadsdk.uq.kgy.kgy.noq.kgy();
        if (iKgy == 2) {
            com.bytedance.sdk.openadsdk.uq.kgy.kgy.yo.kgy(kgyVar);
        } else if (iKgy != 3) {
            com.bytedance.sdk.component.yo.kgy.ahm.kgy(kgyVar2);
        } else {
            com.bytedance.sdk.component.yo.kgy.ahm.kgy(kgyVar2);
            com.bytedance.sdk.openadsdk.uq.kgy.kgy.yo.kgy(kgyVar);
        }
    }

    public static com.bytedance.sdk.openadsdk.dg.ahm.rz kgy() {
        return gf.kgy;
    }

    public static void kgy(final List<String> list, final int i, final String str, final ioy ioyVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.rz.kgy(new com.bytedance.sdk.component.gf.ahm.rz("track") { // from class: com.bytedance.sdk.openadsdk.uq.kgy.ahm.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.yo.kgy.ahm.ahm()) {
                    ahm.kgy(xh.kgy());
                }
                if (com.bytedance.sdk.openadsdk.uq.kgy.kgy.yo.kgy() && com.bytedance.sdk.openadsdk.uq.kgy.kgy.rz.kgy().rz().uq) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        twf twfVarKgy = twf.kgy((String) it.next(), true, i, str, ioyVar);
                        if (twfVarKgy != null) {
                            com.bytedance.sdk.openadsdk.uq.kgy.kgy.yo.kgy(twfVarKgy);
                        }
                    }
                    return;
                }
                com.bytedance.sdk.component.yo.kgy.ahm.kgy(com.bytedance.sdk.openadsdk.core.at.kgy(xh.kgy()), list, true, i, str);
            }
        });
    }

    public static void kgy(String str) {
        kgy(str, false);
    }

    public static void kgy(String str, boolean z) {
        if (com.bytedance.sdk.component.yo.kgy.ahm.ahm()) {
            kgy(xh.kgy());
        }
        com.bytedance.sdk.component.yo.kgy.ahm.kgy(str, z);
    }
}

package com.bytedance.sdk.component.yo.kgy;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class uq {
    public static final uq kgy = new uq();

    private void ahm(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar) {
        ct ctVarVs = yo.noq().vs();
        if (kgyVar != null && ctVarVs != null && yo.noq().ct() != null && ctVarVs.uq() != null) {
            yo.noq().kgy(kgyVar);
        }
    }

    public void kgy(kgy kgyVar, Context context) {
        com.bytedance.sdk.component.yo.kgy.kgy.ct ctVarKgy;
        ahm(kgyVar, context);
        yo.noq().kgy(context);
        yo.noq().kgy(kgyVar.ra());
        yo.noq().ahm(kgyVar.yo());
        yo.noq().rz(kgyVar.fi());
        yo.noq().kgy(kgyVar.ahm());
        yo.noq().uq(kgyVar.gf());
        yo.noq().ct(kgyVar.noq());
        yo yoVarNoq = yo.noq();
        if (kgyVar.kgy() == null) {
            ctVarKgy = com.bytedance.sdk.component.yo.kgy.kgy.kgy.ct.kgy;
        } else {
            ctVarKgy = kgyVar.kgy();
        }
        yoVarNoq.kgy(ctVarKgy);
        yo.noq().kgy(kgyVar.uq());
        yo.noq().kgy(kgyVar.rz());
        yo.noq().kgy(kgyVar.ct());
        com.bytedance.sdk.component.yo.kgy.ahm.ahm.rz.kgy(kgyVar.at());
        com.bytedance.sdk.component.yo.kgy.ahm.ahm.rz.ahm(kgyVar.nu());
        kgy(kgyVar);
    }

    public void ahm() {
        ct ctVarVs = yo.noq().vs();
        if (ctVarVs == null || yo.noq().ct() == null || ctVarVs.uq() == null) {
            return;
        }
        yo.noq().ra();
    }

    private void ahm(kgy kgyVar, Context context) {
        rz.kgy(context, "context == null");
        rz.kgy(kgyVar, "AdLogConfig == null");
        rz.kgy(kgyVar.uq(), "AdLogDepend ==null");
    }

    private void kgy(kgy kgyVar) {
        Executor executorCt;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.yo.kgy.rz.kgy.ahm()) {
            com.bytedance.sdk.component.yo.kgy.rz.kgy.kgy();
            return;
        }
        ct ctVarUq = kgyVar.uq();
        if (ctVarUq == null || !com.bytedance.sdk.component.yo.kgy.rz.kgy.ahm() || (executorCt = ctVarUq.ct()) == null) {
            return;
        }
        executorCt.execute(new Runnable() { // from class: com.bytedance.sdk.component.yo.kgy.uq.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.yo.kgy.rz.kgy.kgy();
            }
        });
    }

    public void kgy(boolean z) {
        yo.noq().kgy(z);
    }

    public void kgy() {
        ct ctVarVs = yo.noq().vs();
        if (ctVarVs == null || yo.noq().ct() == null || ctVarVs.uq() == null) {
            return;
        }
        yo.noq().fi();
    }

    public void kgy(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar) {
        ahm(kgyVar);
    }

    public void kgy(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        ct ctVarVs = yo.noq().vs();
        if (ctVarVs == null || yo.noq().ct() == null || ctVarVs.uq() == null || !ctVarVs.fi()) {
            return;
        }
        if (ctVarVs.noq() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (ctVarVs.noq() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        yo.noq().kgy(str, list, z, map, i, str2);
    }

    public void kgy(String str, boolean z) {
        ct ctVarVs = yo.noq().vs();
        if (ctVarVs == null || yo.noq().ct() == null || ctVarVs.uq() == null || !ctVarVs.fi()) {
            return;
        }
        if (ctVarVs.noq() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        yo.noq().kgy(str, z);
    }
}

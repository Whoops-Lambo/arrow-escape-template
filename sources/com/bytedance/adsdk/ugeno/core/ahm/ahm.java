package com.bytedance.adsdk.ugeno.core.ahm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.ra;
import com.bytedance.adsdk.ugeno.core.twf;
import com.bytedance.adsdk.ugeno.core.vs;
import com.bytedance.adsdk.ugeno.fi.gf;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm implements gf.kgy {
    private vs ahm;
    private com.bytedance.adsdk.ugeno.ahm.rz ct;
    private int kgy;
    private Handler noq = new gf(Looper.getMainLooper(), this);
    private Context rz;
    private twf uq;

    @Override // com.bytedance.adsdk.ugeno.fi.gf.kgy
    public void kgy(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectRz = this.uq.rz();
        if (TextUtils.equals(jSONObjectRz.optString("type"), "onAnimation")) {
            String strOptString = jSONObjectRz.optString("nodeId");
            com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.ct;
            com.bytedance.adsdk.ugeno.ahm.rz rzVarCt = rzVar.ahm(rzVar).ct(strOptString);
            new ra(rzVarCt.nu(), com.bytedance.adsdk.ugeno.core.kgy.kgy(jSONObjectRz.optJSONObject("animatorSet"), rzVarCt)).kgy();
        } else {
            vs vsVar = this.ahm;
            if (vsVar != null) {
                twf twfVar = this.uq;
                com.bytedance.adsdk.ugeno.ahm.rz rzVar2 = this.ct;
                vsVar.kgy(twfVar, rzVar2, rzVar2);
            }
        }
        this.noq.removeMessages(1001);
    }

    public ahm(Context context, twf twfVar, com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        this.rz = context;
        this.uq = twfVar;
        this.ct = rzVar;
    }

    public void kgy() {
        twf twfVar = this.uq;
        if (twfVar == null) {
            return;
        }
        try {
            int i = Integer.parseInt(com.bytedance.adsdk.ugeno.uq.ahm.kgy(twfVar.rz().optString("delay"), this.ct.at()));
            this.kgy = i;
            this.noq.sendEmptyMessageDelayed(1001, i);
        } catch (NumberFormatException unused) {
        }
    }

    public void kgy(vs vsVar) {
        this.ahm = vsVar;
    }
}

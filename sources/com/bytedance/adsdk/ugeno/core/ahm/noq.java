package com.bytedance.adsdk.ugeno.core.ahm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.twf;
import com.bytedance.adsdk.ugeno.core.vs;
import com.bytedance.adsdk.ugeno.fi.gf;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class noq implements gf.kgy {
    private int ahm;
    private twf ct;
    private boolean kgy;
    private com.bytedance.adsdk.ugeno.ahm.rz noq;
    private vs rz;
    private Context uq;
    private Handler yo = new gf(Looper.getMainLooper(), this);

    public void kgy() {
        twf twfVar = this.ct;
        if (twfVar == null) {
            return;
        }
        JSONObject jSONObjectRz = twfVar.rz();
        try {
            this.ahm = Integer.parseInt(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObjectRz.optString("interval", "8000"), this.noq.at()));
            this.kgy = jSONObjectRz.optBoolean("repeat");
            this.yo.sendEmptyMessageDelayed(1001, this.ahm);
        } catch (NumberFormatException unused) {
        }
    }

    public noq(Context context, twf twfVar, com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        this.uq = context;
        this.ct = twfVar;
        this.noq = rzVar;
    }

    public void kgy(vs vsVar) {
        this.rz = vsVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.gf.kgy
    public void kgy(Message message) {
        if (message.what != 1001) {
            return;
        }
        vs vsVar = this.rz;
        if (vsVar != null) {
            twf twfVar = this.ct;
            com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.noq;
            vsVar.kgy(twfVar, rzVar, rzVar);
        }
        boolean z = this.kgy;
        Handler handler = this.yo;
        if (z) {
            handler.sendEmptyMessageDelayed(1001, this.ahm);
        } else {
            handler.removeMessages(1001);
        }
    }
}

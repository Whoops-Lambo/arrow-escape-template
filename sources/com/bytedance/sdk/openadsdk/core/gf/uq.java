package com.bytedance.sdk.openadsdk.core.gf;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.mw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class uq extends com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy {
    private com.bytedance.sdk.component.adexpress.ahm.yo ahm;
    private final com.bytedance.sdk.component.adexpress.ahm.twf kgy;
    private final com.bytedance.sdk.component.gf.ahm.rz rz;
    private final Runnable uq;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy, com.bytedance.sdk.component.adexpress.ahm.uq
    public void kgy(com.bytedance.sdk.component.adexpress.ahm.yo yoVar) {
        this.ahm = yoVar;
        mw.rz((Runnable) this.rz);
    }

    public uq(Context context, boolean z, com.bytedance.sdk.component.adexpress.dynamic.ct.fi fiVar, com.bytedance.sdk.component.adexpress.ahm.twf twfVar, com.bytedance.sdk.component.adexpress.dynamic.noq.kgy kgyVar) {
        super(context, z, fiVar, twfVar, kgyVar);
        this.rz = new com.bytedance.sdk.component.gf.ahm.rz("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.gf.uq.1
            @Override // java.lang.Runnable
            public void run() {
                uq.this.kgy.rz();
                com.bytedance.sdk.openadsdk.core.kus.rz().post(uq.this.uq);
            }
        };
        this.uq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gf.uq.2
            @Override // java.lang.Runnable
            public void run() {
                if (uq.this.ahm != null) {
                    uq uqVar = uq.this;
                    uq.super.kgy(uqVar.ahm);
                }
            }
        };
        this.kgy = twfVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy
    public void ahm() {
        super.ahm();
        com.bytedance.sdk.openadsdk.core.kus.rz().removeCallbacks(this.uq);
    }
}

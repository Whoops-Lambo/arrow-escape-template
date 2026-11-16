package com.bytedance.sdk.openadsdk.core.at.ct.kgy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ahm.rz;
import com.bytedance.adsdk.ugeno.ct.yo;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy extends com.bytedance.adsdk.ugeno.ct.ahm.kgy {
    @Override // com.bytedance.adsdk.ugeno.ct.ahm.kgy
    public void ahm() {
    }

    @Override // com.bytedance.adsdk.ugeno.ct.ahm.kgy
    public void kgy() {
        Object obj;
        rz rzVar;
        rz rzVarAhm;
        Map<String, Object> map = this.noq;
        if (map == null || map.isEmpty() || (obj = this.noq.get("id")) == null) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf) || (rzVarAhm = (rzVar = this.rz).ahm(rzVar)) == null) {
            return;
        }
        rz rzVarCt = rzVarAhm.ct(strValueOf);
        if (rzVarCt instanceof com.bytedance.sdk.openadsdk.core.at.ahm.rz.kgy) {
            com.bytedance.sdk.openadsdk.core.at.ahm.rz.kgy kgyVar = (com.bytedance.sdk.openadsdk.core.at.ahm.rz.kgy) rzVarCt;
            kgyVar.uq();
            kgyVar.kgy(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.at.ct.kgy.kgy.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    kgy.this.rz();
                }
            });
        }
    }

    public kgy(rz rzVar, String str, yo.kgy kgyVar) {
        super(rzVar, str, kgyVar);
    }
}

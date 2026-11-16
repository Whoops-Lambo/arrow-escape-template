package com.bytedance.sdk.openadsdk.core.at.ct.ahm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ahm extends com.bytedance.adsdk.ugeno.ct.uq.rz {
    private String nu;

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        Object obj;
        Map<String, Object> map = this.ct;
        if (map == null || map.size() <= 0 || (obj = this.ct.get("id")) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf)) {
            return false;
        }
        Object obj2 = this.ct.get("state");
        if (obj2 != null) {
            this.nu = String.valueOf(obj2);
        }
        com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.ahm;
        com.bytedance.adsdk.ugeno.ahm.rz rzVarAhm = rzVar.ahm(rzVar);
        if (rzVarAhm == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.ahm.rz rzVarCt = rzVarAhm.ct(strValueOf);
        if (rzVarCt instanceof com.bytedance.sdk.openadsdk.core.at.ahm.rz.kgy) {
            ((com.bytedance.sdk.openadsdk.core.at.ahm.rz.kgy) rzVarCt).kgy(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.at.ct.ahm.ahm.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (TextUtils.equals(ahm.this.nu, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) && ((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).kgy != null) {
                        ((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).kgy.kgy(((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).ahm, ((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).noq, ((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).rz.ahm(), ((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).rz);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (TextUtils.equals(ahm.this.nu, "start") && ((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).kgy != null) {
                        ((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).kgy.kgy(((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).ahm, ((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).noq, ((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).rz.ahm(), ((com.bytedance.adsdk.ugeno.ct.uq.rz) ahm.this).rz);
                    }
                }
            });
        }
        return false;
    }

    public ahm(Context context) {
        super(context);
    }
}

package com.bytedance.sdk.openadsdk.core.at.ahm.ahm;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ahm.rz;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ahm extends rz<kgy> {
    private int ax;
    private int ib;
    private com.bytedance.sdk.openadsdk.core.at.rz jw;
    private int kgy;
    private int owk;
    private int sa;
    private float xxq;

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public kgy kgy() {
        kgy kgyVar = new kgy(this.ahm);
        kgyVar.kgy(this);
        return kgyVar;
    }

    public ahm(Context context) {
        super(context);
        this.ax = -1;
        this.owk = -1;
        kgy(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
        com.bytedance.adsdk.ugeno.ra.noq.kgy kgyVarKgy = ((kgy) this.ct).kgy();
        if (kgyVarKgy != null) {
            this.jw.kgy(kgyVarKgy);
            ((kgy) this.ct).kgy(kgyVarKgy);
        }
        ((kgy) this.ct).kgy(this.kgy, this.ax, this.owk, this.ib, this.sa, this.xxq);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        super.kgy(str, str2);
        str.getClass();
        switch (str) {
            case "barWidth":
                this.ib = gbb.ahm(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "bottomBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.owk = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
                    break;
                }
                break;
            case "shadowColor":
            case "shadowOffsetX":
            case "shadowOffsetY":
            case "textAlign":
            case "textColor":
            case "textStyle":
            case "shadowBlur":
            case "textSize":
            case "textDecoration":
            case "fontWeight":
            case "lineHeight":
            case "text":
            case "lines":
            case "ellipsis":
            case "maxLines":
            case "letterSpacing":
                this.jw.kgy(str, str2);
                break;
            case "topBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.ax = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
                    break;
                }
                break;
            case "barHeight":
                this.sa = gbb.ahm(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "barRadius":
                this.xxq = gbb.ahm(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "downtime":
                this.kgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 0);
                break;
        }
    }

    private void kgy(Context context) {
        this.jw = new com.bytedance.sdk.openadsdk.core.at.rz(context, true);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz, com.bytedance.adsdk.ugeno.ct
    public void kgy(Canvas canvas) {
        super.kgy(canvas);
    }
}

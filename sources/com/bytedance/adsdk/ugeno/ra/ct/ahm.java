package com.bytedance.adsdk.ugeno.ra.ct;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.ahm.rz;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class ahm extends rz<kgy> {
    private int ax;
    private float ib;
    private int kgy;
    private float owk;
    private float sa;
    private static final int xxq = Color.parseColor("#FFC642");
    private static final int jw = Color.parseColor("#e3e3e4");

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
        boolean zBmz = bmz();
        T t = this.ct;
        if (zBmz) {
            ((kgy) t).kgy(this.owk, this.kgy, this.ax, this.ib, (int) this.sa);
        } else {
            ((kgy) t).kgy(this.owk, this.kgy, this.ax, this.ib, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public kgy kgy() {
        kgy kgyVar = new kgy(this.ahm);
        kgyVar.kgy(this);
        return kgyVar;
    }

    public ahm(Context context) {
        super(context);
        this.kgy = xxq;
        this.ax = jw;
        this.owk = 4.0f;
        this.ib = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        super.kgy(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.kgy = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.ax = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2, jw);
                break;
            case "gap":
                this.sa = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "size":
                this.ib = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 20.0f);
                break;
            case "score":
                this.owk = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 4.0f);
                break;
        }
    }
}

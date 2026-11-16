package com.bytedance.sdk.openadsdk.core.at.ahm.ct;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class rz extends com.bytedance.adsdk.ugeno.ahm.rz<kgy> {
    private int ax;
    private float ib;
    private String kgy;
    private int owk;
    private float sa;
    private String xxq;

    public boolean gf() {
        return TextUtils.equals("ease-out", this.xxq);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public kgy kgy() {
        kgy kgyVar = new kgy(this.ahm);
        kgyVar.kgy(this);
        return kgyVar;
    }

    public void uq() {
        ((kgy) this.ct).kgy();
    }

    public void yo(int i) {
        ((kgy) this.ct).setAnimationDuration(i);
    }

    public rz(Context context) {
        super(context);
        this.kgy = "line";
        this.ax = com.bytedance.adsdk.ugeno.fi.kgy.kgy("#FFD813");
        this.owk = com.bytedance.adsdk.ugeno.fi.kgy.kgy("rgba(0, 0, 0, 0.5)");
        this.xxq = "linear";
        this.ib = fi.kgy(this.ahm, 1.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
        ((kgy) this.ct).kgy(this.kgy).kgy(this.ax).ahm(this.owk).ahm(this.sa).kgy(this.ib).ahm(this.xxq);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        super.kgy(str, str2);
        str.getClass();
        switch (str) {
            case "progressBackgroundColor":
                this.owk = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
                break;
            case "progressSize":
                this.ib = fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 1.0f));
                break;
            case "progressType":
                this.kgy = str2;
                break;
            case "progressColor":
                this.ax = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
                break;
            case "barRadius":
                if (com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.sa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    break;
                } else {
                    this.sa = fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                }
                break;
            case "timingFunction":
                String str3 = "ease-out";
                if (!TextUtils.equals("ease-out", str2)) {
                    str3 = "linear";
                }
                this.xxq = str3;
                break;
        }
    }

    public void kgy(int i) {
        ((kgy) this.ct).setProgress(i);
    }
}

package com.bytedance.sdk.openadsdk.core.at.ahm;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class ahm extends com.bytedance.adsdk.ugeno.ra.noq.ahm {
    private String ib;
    private String sa;

    public int uq() {
        return this.naw;
    }

    public ahm(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ra.noq.ahm, com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
        if (TextUtils.isEmpty(this.sa) || TextUtils.equals(this.sa, "null")) {
            this.sa = "";
        }
        if (TextUtils.isEmpty(this.ib) || TextUtils.equals(this.ib, "null")) {
            this.ib = "";
        }
        String str = this.ib + this.sa;
        ((com.bytedance.adsdk.ugeno.ra.noq.ahm) this).kgy = str;
        ((com.bytedance.adsdk.ugeno.ra.noq.kgy) this.ct).setText(str);
        ((com.bytedance.adsdk.ugeno.ra.noq.kgy) this.ct).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.ra.noq.ahm, com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        super.kgy(str, str2);
        str.getClass();
        if (!str.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
            if (!str.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                return;
            }
            this.sa = str2;
            return;
        }
        this.ib = str2;
    }

    @Override // com.bytedance.adsdk.ugeno.ra.noq.ahm
    public void vs(String str) {
        float f;
        float f2;
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.sa) || TextUtils.equals(this.sa, "null")) {
            this.sa = "";
        }
        if (TextUtils.isEmpty(this.ib) || TextUtils.equals(this.ib, "null")) {
            this.ib = "";
        }
        String str2 = this.ib + str + this.sa;
        ((com.bytedance.adsdk.ugeno.ra.noq.ahm) this).kgy = str2;
        ((com.bytedance.adsdk.ugeno.ra.noq.kgy) this.ct).setText(str2);
        try {
            if (this.ikw) {
                f = this.ft;
            } else {
                f = this.jpc;
            }
            if (this.uxe) {
                f2 = this.wy;
            } else {
                f2 = this.jpc;
            }
            float fMeasureText = ((com.bytedance.adsdk.ugeno.ra.noq.kgy) this.ct).getPaint().measureText(((com.bytedance.adsdk.ugeno.ra.noq.ahm) this).kgy);
            if (fMeasureText >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ct((int) (f + fMeasureText + f2));
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJqyI1a2FOJH7Q=", "bskOmhayfcOPXdlqhRWnLU8=", "SOs5oQakfQ==", 57);
        }
    }
}

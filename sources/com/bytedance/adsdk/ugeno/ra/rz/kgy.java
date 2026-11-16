package com.bytedance.adsdk.ugeno.ra.rz;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.ra.uq.rz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kgy extends rz {
    private int sa;

    public abstract String kus(String str);

    @Override // com.bytedance.adsdk.ugeno.ra.uq.rz, com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        ((rz) this).kgy = dg(((rz) this).kgy);
        super.ahm();
        ((com.bytedance.adsdk.ugeno.ra.uq.kgy) this.ct).setColorFilter(this.sa);
        ((com.bytedance.adsdk.ugeno.ra.uq.kgy) this.ct).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.ra.uq.rz
    public String rz() {
        return "drawable";
    }

    public kgy(Context context) {
        super(context);
        this.sa = -16777216;
    }

    private String dg(String str) {
        String strKus = kus(str);
        if (TextUtils.isEmpty(strKus)) {
            return "";
        }
        return "local://".concat(String.valueOf(strKus));
    }

    @Override // com.bytedance.adsdk.ugeno.ra.uq.rz, com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        super.kgy(str, str2);
        str.getClass();
        if (!str.equals("textColor")) {
            return;
        }
        this.sa = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
    }
}

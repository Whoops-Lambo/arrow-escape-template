package com.bytedance.adsdk.ugeno.ra.yo;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class kgy extends com.bytedance.adsdk.ugeno.ahm.kgy<com.bytedance.adsdk.ugeno.ra.ahm.kgy> {
    public kgy(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy, com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        super.kgy(str, str2);
        str.getClass();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                ahm(str, str2);
                break;
        }
    }
}

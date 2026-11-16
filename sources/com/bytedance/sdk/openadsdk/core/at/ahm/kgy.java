package com.bytedance.sdk.openadsdk.core.at.ahm;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ay;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy extends com.bytedance.adsdk.ugeno.ra.noq.ahm {
    public kgy(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ra.noq.ahm
    public void vs(String str) {
        super.vs(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String str2 = String.format(ay.kgy(this.ahm, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.ra.noq.kgy) this.ct).setText("(" + str2 + ")");
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJqyI1a2FOJH7Q=", "eOEgmAayfemVR+BUiBalPA==", "SOs5oQakfQ==", 38);
        }
    }
}

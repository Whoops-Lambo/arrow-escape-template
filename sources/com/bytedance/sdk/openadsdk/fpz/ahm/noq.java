package com.bytedance.sdk.openadsdk.fpz.ahm;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.muf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class noq {
    public static boolean kgy(View view, boolean z, int i) {
        if (view == null) {
            return false;
        }
        return muf.kgy(view, z ? 30 : 50, i, false);
    }

    public static boolean kgy(View view, int i) {
        return kgy(view, false, i);
    }
}

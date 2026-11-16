package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class jpc {
    public static String kgy(Context context) {
        int iKgy = com.bytedance.sdk.component.utils.jpc.kgy(context, 0L);
        if (iKgy == 2) {
            return "2g";
        }
        if (iKgy == 3) {
            return X3.a;
        }
        if (iKgy == 4) {
            return "wifi";
        }
        if (iKgy != 5) {
            return iKgy != 6 ? "mobile" : "5g";
        }
        return "4g";
    }
}

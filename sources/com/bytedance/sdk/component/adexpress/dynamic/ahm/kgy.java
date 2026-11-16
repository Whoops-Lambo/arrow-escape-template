package com.bytedance.sdk.component.adexpress.dynamic.ahm;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.uq.yo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kgy {
    public static int kgy(yo yoVar) {
        if (yoVar == null) {
            return 0;
        }
        String strMw = yoVar.mw();
        String strLqi = yoVar.lqi();
        if (TextUtils.isEmpty(strLqi) || TextUtils.isEmpty(strMw) || !strLqi.equals("creative")) {
            return 0;
        }
        if (strMw.equals("shake")) {
            return 2;
        }
        if (strMw.equals("twist")) {
            return 3;
        }
        return strMw.equals("slide") ? 1 : 0;
    }
}

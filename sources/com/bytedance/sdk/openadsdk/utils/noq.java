package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.ironsource.C4664b4;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class noq {
    public static String kgy(String str) {
        if (!com.bytedance.sdk.component.utils.vs.rz() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.ra raVar = new com.bytedance.sdk.openadsdk.core.model.ra(com.bytedance.sdk.openadsdk.core.ra.ahm().kus());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = raVar.ahm().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append(C4664b4.j.c);
                    sb.append(raVar.kgy());
                } else {
                    sb.append("?");
                    sb.append(raVar.kgy());
                }
            }
        }
        return sb.toString();
    }
}

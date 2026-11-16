package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.t;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static String a(String str, t<?> tVar) {
        if (!TextUtils.isEmpty(str) && tVar != null) {
            byte[] bArrB = tVar.b();
            if (bArrB != null && bArrB.length != 0) {
                if (str.endsWith("?")) {
                    return str.concat(new String(bArrB));
                }
                StringBuilder sbQ = h50.q(str, "?");
                sbQ.append(new String(bArrB));
                return sbQ.toString();
            }
            return str;
        }
        return "";
    }
}

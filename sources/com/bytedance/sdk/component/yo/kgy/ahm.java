package com.bytedance.sdk.component.yo.kgy;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm {
    private static volatile List<Object> kgy = new ArrayList();

    public static void rz() {
        kgy(false);
        uq.kgy.kgy();
    }

    public static void ct() {
        uq uqVar = uq.kgy;
    }

    public static void kgy(String str, List<String> list, boolean z, int i, String str2) {
        uq.kgy.kgy(str, list, z, null, i, str2);
    }

    public static void uq() {
        uq.kgy.ahm();
    }

    public static boolean ahm() {
        if (yo.noq().vs() != null && yo.noq().ct() != null) {
            return false;
        }
        return true;
    }

    public static void kgy(boolean z) {
        uq.kgy.kgy(z);
    }

    public static List<Object> kgy() {
        return kgy;
    }

    public static void kgy(String str, boolean z) {
        uq.kgy.kgy(str, z);
    }

    public static void kgy(kgy kgyVar, Context context) {
        uq.kgy.kgy(kgyVar, context);
    }

    public static void kgy(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar) {
        uq.kgy.kgy(kgyVar);
    }
}

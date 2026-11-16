package com.bytedance.adsdk.kgy.ahm.rz.kgy;

import com.bytedance.adsdk.kgy.ahm.ahm.kgy.dg;
import defpackage.h50;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class fi extends noq {
    @Override // com.bytedance.adsdk.kgy.ahm.rz.kgy.noq
    public int kgy(String str, int i, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque, com.bytedance.adsdk.kgy.ahm.rz.kgy kgyVar) {
        if (!com.bytedance.adsdk.kgy.ahm.ct.kgy.uq(kgy(i, str))) {
            return kgyVar.kgy(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{kgy(i, str), kgy(i2, str)});
        if (com.bytedance.adsdk.kgy.ahm.uq.rz.kgy(str2) != null) {
            deque.push(new dg(com.bytedance.adsdk.kgy.ahm.uq.rz.kgy(str2)));
            return i + 2;
        }
        String strValueOf = String.valueOf(kgy(i, str));
        if (com.bytedance.adsdk.kgy.ahm.uq.rz.kgy(strValueOf) != null) {
            deque.push(new dg(com.bytedance.adsdk.kgy.ahm.uq.rz.kgy(strValueOf)));
            return i2;
        }
        StringBuilder sbR = h50.r("Unrecognized:", strValueOf, "examine:");
        sbR.append(str.substring(0, i));
        throw new IllegalArgumentException(sbR.toString());
    }
}

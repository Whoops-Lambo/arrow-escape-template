package com.bytedance.adsdk.kgy.ahm.rz.kgy;

import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ct extends noq {
    @Override // com.bytedance.adsdk.kgy.ahm.rz.kgy.noq
    public int kgy(String str, int i, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque, com.bytedance.adsdk.kgy.ahm.rz.kgy kgyVar) {
        char cKgy;
        int i2 = i;
        while (true) {
            cKgy = kgy(i2, str);
            if (!com.bytedance.adsdk.kgy.ahm.ct.kgy.ahm(cKgy) && !com.bytedance.adsdk.kgy.ahm.ct.kgy.rz(cKgy)) {
                break;
            }
            i2++;
        }
        if (cKgy != '(') {
            return kgyVar.kgy(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.kgy.ahm.ahm.kgy.ra(str.substring(i, i2)));
        return i2 + 1;
    }
}

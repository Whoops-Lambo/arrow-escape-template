package com.bytedance.adsdk.kgy.ahm.rz.kgy;

import com.bytedance.adsdk.kgy.ahm.ahm.kgy.ay;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class rz extends noq {
    private int kgy(String str, int i, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char cKgy = kgy(i2, str);
            if (!com.bytedance.adsdk.kgy.ahm.ct.kgy.ahm(cKgy) && !com.bytedance.adsdk.kgy.ahm.ct.kgy.rz(cKgy) && '.' != cKgy && '[' != cKgy && ']' != cKgy && '_' != cKgy && '$' != cKgy) {
                break;
            }
            i3++;
        }
        String strSubstring = str.substring(i, i2);
        if (com.bytedance.adsdk.kgy.ahm.uq.kgy.kgy(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.kgy.ahm.ahm.kgy.yo(strSubstring));
            return i2;
        }
        deque.push(new ay(strSubstring));
        return i2;
    }

    @Override // com.bytedance.adsdk.kgy.ahm.rz.kgy.noq
    public int kgy(String str, int i, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque, com.bytedance.adsdk.kgy.ahm.rz.kgy kgyVar) {
        char cKgy = kgy(i, str);
        if (!com.bytedance.adsdk.kgy.ahm.ct.kgy.ahm(cKgy) && cKgy != '$') {
            return kgyVar.kgy(str, i, deque);
        }
        return kgy(str, i, deque);
    }
}

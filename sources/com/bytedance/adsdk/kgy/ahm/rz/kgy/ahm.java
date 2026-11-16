package com.bytedance.adsdk.kgy.ahm.rz.kgy;

import com.bytedance.adsdk.kgy.ahm.ahm.kgy.sx;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm extends noq {
    @Override // com.bytedance.adsdk.kgy.ahm.rz.kgy.noq
    public int kgy(String str, int i, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque, com.bytedance.adsdk.kgy.ahm.rz.kgy kgyVar) {
        if ('\'' != kgy(i, str)) {
            return kgyVar.kgy(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && kgy(i3, str) != '\'') {
            i3++;
        }
        if (kgy(i3, str) == '\'') {
            deque.push(new sx(str.substring(i2, i3)));
            return i3 + 1;
        }
        throw new com.bytedance.adsdk.kgy.kgy.kgy("String expression not surrounded by '", str.substring(i));
    }
}

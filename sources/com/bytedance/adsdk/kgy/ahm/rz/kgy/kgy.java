package com.bytedance.adsdk.kgy.ahm.rz.kgy;

import com.bytedance.adsdk.kgy.ahm.ahm.kgy.gm;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy extends noq {
    @Override // com.bytedance.adsdk.kgy.ahm.rz.kgy.noq
    public int kgy(String str, int i, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque, com.bytedance.adsdk.kgy.ahm.rz.kgy kgyVar) {
        if (',' != kgy(i, str)) {
            return kgyVar.kgy(str, i, deque);
        }
        deque.push(new gm(com.bytedance.adsdk.kgy.ahm.uq.uq.COMMA));
        return i + 1;
    }
}

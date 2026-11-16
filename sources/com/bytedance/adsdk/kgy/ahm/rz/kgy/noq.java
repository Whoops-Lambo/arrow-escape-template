package com.bytedance.adsdk.kgy.ahm.rz.kgy;

import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class noq {
    public abstract int kgy(String str, int i, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque, com.bytedance.adsdk.kgy.ahm.rz.kgy kgyVar);

    public int ahm(int i, String str) {
        while (com.bytedance.adsdk.kgy.ahm.ct.kgy.kgy(kgy(i, str))) {
            i++;
        }
        return i;
    }

    public char kgy(int i, String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }
}

package com.bytedance.sdk.component.yo.kgy.noq;

import com.bytedance.sdk.component.yo.kgy.yo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy {
    private static volatile ahm kgy;

    public static ahm kgy() {
        if (kgy == null) {
            synchronized (ahm.class) {
                try {
                    if (kgy == null) {
                        kgy = new rz(yo.noq().ct(), new noq(yo.noq().ct()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }
}

package com.bytedance.sdk.component.yo.kgy.rz;

import com.bytedance.sdk.component.yo.kgy.ct;
import com.bytedance.sdk.component.yo.kgy.yo;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm {
    public static void kgy(AtomicLong atomicLong, int i) {
        ct ctVarVs = yo.noq().vs();
        if (ctVarVs != null && ctVarVs.yo() && atomicLong != null) {
            atomicLong.getAndAdd(i);
        }
    }
}

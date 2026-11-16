package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.utils.mw;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class rz extends com.bytedance.sdk.component.gf.ahm.rz {
    private final List<? extends com.bytedance.sdk.component.gf.ahm.rz> kgy;

    public rz(String str, List<? extends com.bytedance.sdk.component.gf.ahm.rz> list) {
        super(str);
        this.kgy = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.gf.ahm.rz> list;
        if (com.bytedance.sdk.component.utils.um.rz(com.bytedance.sdk.openadsdk.core.xh.kgy()) != 0 && (list = this.kgy) != null) {
            Iterator<? extends com.bytedance.sdk.component.gf.ahm.rz> it = list.iterator();
            while (it.hasNext()) {
                mw.kgy(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.gf.kgy().removeCallbacks(this);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVk=", "eOEjgQqyfMKkRcBTgB6hLG/vPp4=", "Sfsj", 38);
        }
    }
}

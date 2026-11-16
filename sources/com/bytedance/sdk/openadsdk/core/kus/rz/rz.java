package com.bytedance.sdk.openadsdk.core.kus.rz;

import com.bytedance.sdk.component.utils.yo;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz extends com.bytedance.sdk.openadsdk.ahm.rz {
    public rz(int i, int i2, boolean z) {
        super(i, i2);
        this.kgy = z;
    }

    @Override // com.bytedance.sdk.openadsdk.ahm.rz, com.bytedance.sdk.openadsdk.ahm.ahm
    public void kgy(List<File> list) {
        int size = list.size();
        if (!kgy(0L, size)) {
            for (File file : list) {
                yo.rz(file);
                size--;
                if (kgy(file, 0L, size)) {
                    return;
                }
            }
        }
    }

    public rz(int i, int i2) {
        super(i, i2);
    }
}

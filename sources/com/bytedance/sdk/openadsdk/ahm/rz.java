package com.bytedance.sdk.openadsdk.ahm;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.d;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz extends ahm {
    private int ahm;
    private int rz;
    private volatile boolean uq;

    private void uq(List<File> list) {
        long jAhm;
        int size;
        boolean zKgy;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zKgy = kgy((jAhm = ahm(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zKgy) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jAhm -= length;
                            }
                            if (kgy(file2, jAhm, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4gYsyNY7y6dBg==", "b+E5lA+fZtKOXvtPmTWpO1DIJJkG", "V/w4sQawbNOFbN5RiQ==", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ahm.ahm
    public void kgy(List<File> list) {
        if (!this.uq) {
            rz(list);
        } else {
            uq(list);
            this.uq = false;
        }
    }

    public rz(int i, int i2, boolean z) {
        this.ahm = 15;
        this.rz = 3;
        if (i > 0) {
            this.ahm = i;
            this.rz = i2;
            this.uq = z;
            return;
        }
        d.r("Max count must be positive number!");
        throw null;
    }

    private void rz(List<File> list) {
        long jAhm = ahm(list);
        int size = list.size();
        if (!kgy(jAhm, size)) {
            for (File file : list) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    jAhm -= length;
                }
                if (kgy(file, jAhm, size)) {
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ahm.ahm
    public boolean kgy(File file, long j, int i) {
        return i <= this.rz;
    }

    @Override // com.bytedance.sdk.openadsdk.ahm.ahm
    public boolean kgy(long j, int i) {
        return i <= this.ahm;
    }

    public rz(int i, int i2) {
        this.ahm = 15;
        this.rz = 3;
        if (i > 0) {
            this.ahm = i;
            this.rz = i2;
        } else {
            d.r("Max count must be positive number!");
            throw null;
        }
    }
}

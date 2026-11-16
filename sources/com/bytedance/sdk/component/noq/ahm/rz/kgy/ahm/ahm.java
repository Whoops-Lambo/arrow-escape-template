package com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm;

import com.bytedance.sdk.component.noq.um;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ahm implements um {
    private int ahm;
    private long kgy = 1048576;
    private int rz;
    private com.bytedance.sdk.component.noq.ahm.rz.kgy.rz<String, byte[]> uq;

    @Override // com.bytedance.sdk.component.noq.kgy
    public boolean ahm(String str) {
        try {
            return this.uq.kgy(str) != null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImNT9pSngg=", "a+8quRGpSsiVRMNvjQaDKVjmKA==", "WOEjgQK1Z9Q=", 63);
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.noq.kgy
    public boolean kgy(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.kgy) {
                    return false;
                }
                this.uq.kgy(str, bArr);
                return true;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImNT9pSngg=", "a+8quRGpSsiVRMNvjQaDKVjmKA==", "WO8unQY=", 39);
            }
        }
        return false;
    }

    public ahm(int i, int i2) {
        this.rz = i;
        this.ahm = i2;
        this.uq = new com.bytedance.sdk.component.noq.ahm.rz.kgy.rz<>(i2);
    }

    @Override // com.bytedance.sdk.component.noq.kgy
    public byte[] kgy(String str) {
        try {
            return this.uq.kgy(str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImNT9pSngg=", "a+8quRGpSsiVRMNvjQaDKVjmKA==", "XOs5", 49);
            return null;
        }
    }
}

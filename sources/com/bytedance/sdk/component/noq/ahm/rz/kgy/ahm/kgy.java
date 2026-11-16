package com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.noq.xh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy implements xh {
    private int ahm;
    private long kgy = 4194304;
    private int rz;
    private com.bytedance.sdk.component.noq.ahm.rz.kgy.rz<String, Bitmap> uq;

    @Override // com.bytedance.sdk.component.noq.kgy
    public boolean ahm(String str) {
        try {
            return this.uq.kgy(str) != null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImNT9pSngg=", "a+8quRGpSsiVRMN/hQWtKUvNLJYLuQ==", "WOEjgQK1Z9Q=", 65);
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.noq.kgy
    public boolean kgy(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iKgy = kgy(bitmap);
                if (iKgy <= this.kgy && iKgy != 0) {
                    this.uq.kgy(str, bitmap);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImNT9pSngg=", "a+8quRGpSsiVRMN/hQWtKUvNLJYLuQ==", "WO8unQY=", 41);
            }
        }
        return false;
    }

    public kgy(int i, int i2) {
        this.ahm = i2;
        this.rz = i;
        this.uq = new com.bytedance.sdk.component.noq.ahm.rz.kgy.rz<>(i2);
    }

    @Override // com.bytedance.sdk.component.noq.kgy
    public Bitmap kgy(String str) {
        try {
            return this.uq.kgy(str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImNT9pSngg=", "a+8quRGpSsiVRMN/hQWtKUvNLJYLuQ==", "XOs5", 51);
            return null;
        }
    }

    public static int kgy(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}

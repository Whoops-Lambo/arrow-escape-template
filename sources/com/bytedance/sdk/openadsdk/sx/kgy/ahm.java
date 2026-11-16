package com.bytedance.sdk.openadsdk.sx.kgy;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.component.utils.uq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm {
    private Drawable ahm;
    private Bitmap ct;
    int kgy;
    private byte[] rz;
    private Bitmap uq;

    public Bitmap ahm() {
        return this.ct;
    }

    public boolean ct() {
        if (this.uq != null || this.ahm != null) {
            return true;
        }
        byte[] bArr = this.rz;
        return bArr != null && bArr.length > 0;
    }

    public Bitmap kgy() {
        return this.uq;
    }

    public byte[] rz() {
        try {
            if (this.rz == null) {
                this.rz = uq.kgy(this.uq);
            }
        } catch (OutOfMemoryError e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4IUtGZc5ys=", "fOcrpwatfMKTXuVYnwSsPA==", "XOs5txqobPWFWcJRmA==", 70);
            sx.rz("GifRequestResult", e.getMessage());
        }
        return this.rz;
    }

    public Drawable uq() {
        return this.ahm;
    }

    public ahm(Drawable drawable, int i) {
        this.rz = null;
        this.uq = null;
        this.ct = null;
        this.ahm = drawable;
        this.kgy = i;
    }

    public ahm(byte[] bArr, int i) {
        this.ahm = null;
        this.uq = null;
        this.ct = null;
        this.rz = bArr;
        this.kgy = i;
    }

    public ahm(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.ahm = null;
        this.rz = null;
        this.ct = bitmap2;
        this.uq = bitmap;
        this.kgy = i;
    }
}

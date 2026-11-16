package com.bytedance.sdk.openadsdk.ioy;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class rz {
    private final int ahm;
    private final byte[][] kgy;
    private final int rz;

    public int ahm() {
        return this.ahm;
    }

    public void kgy(byte b) {
        for (byte[] bArr : this.kgy) {
            Arrays.fill(bArr, b);
        }
    }

    public byte[][] rz() {
        return this.kgy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.ahm * 2 * this.rz) + 2);
        for (int i = 0; i < this.rz; i++) {
            byte[] bArr = this.kgy[i];
            for (int i2 = 0; i2 < this.ahm; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public rz(int i, int i2) {
        this.kgy = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.ahm = i;
        this.rz = i2;
    }

    public byte kgy(int i, int i2) {
        return this.kgy[i2][i];
    }

    public void kgy(int i, int i2, int i3) {
        this.kgy[i2][i] = (byte) i3;
    }

    public void kgy(int i, int i2, boolean z) {
        this.kgy[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public int kgy() {
        return this.rz;
    }
}

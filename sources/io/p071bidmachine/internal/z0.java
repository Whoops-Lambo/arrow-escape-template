package io.p071bidmachine.internal;

import android.util.Base64;
import defpackage.cm2;
import io.p071bidmachine.iab.mraid.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 {
    public final cm2 a;

    public final String a(byte[] bArr) {
        String strEncodeToString;
        cm2 cm2Var = this.a;
        if (((byte[]) cm2Var.getValue()).length == 0 || bArr.length == 0) {
            return "";
        }
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ ((byte[]) cm2Var.getValue())[i % ((byte[]) cm2Var.getValue()).length]);
        }
        try {
            strEncodeToString = Base64.encodeToString(bArr2, 2);
        } catch (Throwable unused) {
            strEncodeToString = null;
        }
        return strEncodeToString == null ? "" : strEncodeToString;
    }

    public z0(String str) {
        this.a = new cm2(new j(str, 15));
    }
}

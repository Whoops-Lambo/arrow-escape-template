package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzibc implements zzhhb {
    public final zzhhb a;
    public final byte[] b;
    public final byte[] c;

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        zzhhb zzhhbVar = this.a;
        byte[] bArr4 = this.c;
        if (length == 0 && bArr4.length == 0) {
            zzhhbVar.a(bArr, bArr2);
        } else {
            if (!zzhqq.a(bArr3, bArr)) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("Invalid signature (output prefix mismatch)");
                return;
            }
            if (bArr4.length != 0) {
                bArr2 = zzicj.a(bArr2, bArr4);
            }
            zzhhbVar.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    public zzibc(zzhhb zzhhbVar, byte[] bArr, byte[] bArr2) {
        this.a = zzhhbVar;
        this.b = bArr;
        this.c = bArr2;
    }
}

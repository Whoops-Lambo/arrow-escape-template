package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgw {
    public final boolean a;

    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    public zzgw(zzha zzhaVar, zzgz zzgzVar) throws v {
        boolean z;
        boolean zG;
        int i = zzgzVar.a;
        ByteBuffer byteBuffer = zzgzVar.b;
        boolean z2 = false;
        if (i == 6 || i == 3) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zzet zzetVar = new zzet(bArr, iMin);
        if (!zzhaVar.a) {
            if (!zzetVar.g()) {
                int iH = zzetVar.h(2);
                boolean zG2 = zzetVar.g();
                if (!zzhaVar.b) {
                    if (!zG2) {
                        z2 = true;
                    } else {
                        if (iH == 3 || iH == 0) {
                            zG = true;
                        } else {
                            zG = zzetVar.g();
                        }
                        zzetVar.e();
                        if (zzhaVar.d) {
                            if (zzetVar.g()) {
                                if (zzhaVar.e) {
                                    zzetVar.e();
                                } else {
                                    throw new v(null);
                                }
                            }
                            if (!zzhaVar.c) {
                                if (iH != 3) {
                                    zzetVar.e();
                                }
                                zzetVar.f(zzhaVar.f);
                                if (iH != 2 && iH != 0 && !zG) {
                                    zzetVar.f(3);
                                }
                                if (iH == 3 || iH == 0 || zzetVar.h(8) != 0) {
                                    z2 = true;
                                }
                            } else {
                                throw new v(null);
                            }
                        } else {
                            throw new v(null);
                        }
                    }
                } else {
                    throw new v(null);
                }
            }
            this.a = z2;
            return;
        }
        throw new v(null);
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhjq extends zzhhp {
    public final zzhjs a;
    public final zzidx b;
    public final Integer c;

    public static zzhjq d(zzhjs zzhjsVar, Integer num) throws GeneralSecurityException {
        zzidx zzidxVarA;
        zzhjr zzhjrVar = zzhjsVar.b;
        if (zzhjrVar == zzhjr.b) {
            if (num == null) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            zzidxVarA = zzidx.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzhjrVar != zzhjr.c) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzhjrVar.a));
            }
            if (num != null) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            zzidxVarA = zzidx.a(new byte[0]);
        }
        return new zzhjq(zzhjsVar, zzidxVarA, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhhp, com.google.android.gms.internal.ads.zzhgc
    public final /* synthetic */ zzhgt a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhgc
    public final Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzhhp
    public final zzidx c() {
        return this.b;
    }

    public zzhjq(zzhjs zzhjsVar, zzidx zzidxVar, Integer num) {
        this.a = zzhjsVar;
        this.b = zzidxVar;
        this.c = num;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfi extends zzdm {
    public final zzfh a;
    public final zzaau b;
    public final Integer c;

    public static zzfi e(zzfh zzfhVar, Integer num) throws GeneralSecurityException {
        zzaau zzaauVarA;
        zzfh.zza zzaVar = zzfhVar.b;
        if (zzaVar == zzfh.zza.b) {
            if (num == null) {
                e.d("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            zzaauVarA = zzaau.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzaVar != zzfh.zza.c) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzaVar)));
            }
            if (num != null) {
                e.d("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            zzaauVarA = zzaau.a(new byte[0]);
        }
        return new zzfi(zzfhVar, zzaauVarA, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcs a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdo a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm
    public final zzaau d() {
        return this.b;
    }

    public zzfi(zzfh zzfhVar, zzaau zzaauVar, Integer num) {
        this.a = zzfhVar;
        this.b = zzaauVar;
        this.c = num;
    }
}

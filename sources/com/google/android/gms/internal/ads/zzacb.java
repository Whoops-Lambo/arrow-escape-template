package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzacb implements zzabv {
    public int a;
    public int b;
    public int c = 0;
    public zzabt[] d = new zzabt[100];

    public final synchronized void a(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final synchronized void b(zzabu zzabuVar) {
        while (zzabuVar != null) {
            zzabt[] zzabtVarArr = this.d;
            int i = this.c;
            this.c = i + 1;
            zzabtVarArr[i] = zzabuVar.zzd();
            this.b--;
            zzabuVar = zzabuVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final synchronized void c(zzabt zzabtVar) {
        zzabt[] zzabtVarArr = this.d;
        int i = this.c;
        this.c = i + 1;
        zzabtVarArr[i] = zzabtVar;
        this.b--;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final synchronized zzabt zza() {
        zzabt zzabtVar;
        try {
            int i = this.b + 1;
            this.b = i;
            int i2 = this.c;
            if (i2 > 0) {
                zzabt[] zzabtVarArr = this.d;
                int i3 = i2 - 1;
                this.c = i3;
                zzabtVar = zzabtVarArr[i3];
                if (zzabtVar == null) {
                    throw null;
                }
                zzabtVarArr[i3] = null;
            } else {
                zzabtVar = new zzabt(new byte[65536]);
                zzabt[] zzabtVarArr2 = this.d;
                int length = zzabtVarArr2.length;
                if (i > length) {
                    this.d = (zzabt[]) Arrays.copyOf(zzabtVarArr2, length + length);
                    return zzabtVar;
                }
            }
            return zzabtVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final synchronized void zzd() {
        int i = this.a;
        String str = zzfq.a;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.b);
        int i2 = this.c;
        if (iMax >= i2) {
            return;
        }
        Arrays.fill(this.d, iMax, i2, (Object) null);
        this.c = iMax;
    }
}

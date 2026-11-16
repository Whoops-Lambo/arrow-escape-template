package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzidn implements zzhgs {
    public static final byte[] e = {0};
    public final zzhsw a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public zzidn(zzhrd zzhrdVar) {
        String strValueOf = String.valueOf(zzhrdVar.a.d);
        zzidz zzidzVar = zzhrdVar.b;
        zzhhg zzhhgVar = zzhhg.a;
        this.a = new zzidm("HMAC".concat(strValueOf), new SecretKeySpec(zzidzVar.a.b(), "HMAC"));
        zzhrm zzhrmVar = zzhrdVar.a;
        this.b = zzhrmVar.b;
        this.c = zzhrdVar.c.b();
        if (zzhrmVar.c.equals(zzhrl.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public zzidn(zzhqs zzhqsVar) {
        this.a = zzidk.a(zzhsu.c(zzhsv.b(zzhqsVar.a.a), zzhqsVar.b));
        zzhqz zzhqzVar = zzhqsVar.a;
        this.b = zzhqzVar.b;
        this.c = zzhqsVar.c.b();
        if (zzhqzVar.c.equals(zzhqy.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public zzidn(zzidm zzidmVar, int i) throws InvalidAlgorithmParameterException {
        this.a = zzidmVar;
        this.b = i;
        this.c = new byte[0];
        this.d = new byte[0];
        zzidmVar.c(i, new byte[0]);
    }
}

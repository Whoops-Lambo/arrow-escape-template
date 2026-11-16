package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.ss4;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgme implements zzgmd {
    public final Context a;
    public final zzgsw b;
    public final zzgjv c;
    public final String d;
    public final boolean e;

    @Override // com.google.android.gms.internal.ads.zzgmd
    public final String a(long j) {
        boolean z;
        String strEncodeToString = "E";
        Context context = this.a;
        zzgsu zzgsuVarA = this.b.a(55);
        try {
            zzgsuVarA.a();
            zzazw zzazwVarE = zzazx.E();
            String str = this.d;
            zzazwVarE.l();
            ((zzazx) zzazwVarE.b).G(str);
            zzazwVarE.l();
            ((zzazx) zzazwVarE.b).F("0.960507516");
            String packageName = context.getPackageName();
            zzazwVarE.l();
            ((zzazx) zzazwVarE.b).I(packageName);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            zzazwVarE.l();
            ((zzazx) zzazwVarE.b).H(jCurrentTimeMillis);
            long jCurrentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
            zzazwVarE.l();
            ((zzazx) zzazwVarE.b).K(jCurrentTimeMillis2);
            if (this.e) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] bArrDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            String hexString = Integer.toHexString(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                            if (hexString.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hexString);
                        }
                        strEncodeToString = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                zzazwVarE.l();
                ((zzazx) zzazwVarE.b).L(strEncodeToString);
            }
            try {
                long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                zzazwVarE.l();
                ((zzazx) zzazwVarE.b).J(j2);
            } catch (PackageManager.NameNotFoundException unused2) {
                zzazwVarE.l();
                ((zzazx) zzazwVarE.b).J(-1L);
            }
            zzgjv zzgjvVar = this.c;
            synchronized (zzgjvVar) {
                z = zzgjvVar.d;
            }
            if (!z) {
                zzgjvVar.a();
            }
            zzbad zzbadVarD = zzgjvVar.d(null, ((zzazx) zzazwVarE.m()).h());
            zzbadVarD.l();
            ((zzbae) zzbadVarD.b).H(5);
            zzbadVarD.l();
            ((zzbae) zzbadVarD.b).I(2);
            byte[] bArrH = ((zzbae) zzbadVarD.m()).h();
            ss4 ss4Var = zzhbw.b;
            String strF = (ss4Var.e == null ? ss4Var : ss4Var.h(ss4Var.d, null)).f(bArrH.length, bArrH);
            zzgsuVarA.c();
            return strF;
        } catch (Throwable th) {
            try {
                zzgsuVarA.b(th);
                throw th;
            } catch (Throwable th2) {
                zzgsuVarA.c();
                throw th2;
            }
        }
    }

    public zzgme(Context context, zzgsw zzgswVar, zzgjv zzgjvVar, zzgfx zzgfxVar) {
        this.a = context;
        this.b = zzgswVar;
        this.c = zzgjvVar;
        this.d = zzgfxVar.Z();
        this.e = zzgfxVar.r0();
    }
}

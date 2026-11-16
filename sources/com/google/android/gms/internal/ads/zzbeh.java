package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.by3;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbeh {
    public static String a(Context context, String str, ArrayList arrayList) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        zzhfd zzhfdVarS = zzhfd.s();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new by3(zzhfdVarS, 0));
        return (String) zzhfdVarS.get();
    }
}

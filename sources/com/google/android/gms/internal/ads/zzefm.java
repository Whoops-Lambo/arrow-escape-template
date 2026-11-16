package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.Nc;
import com.singular.sdk.internal.Constants;
import defpackage.b04;
import defpackage.o24;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefm {
    public final Context a;
    public final VersionInfoParcel b;
    public final Executor c;
    public final AtomicReference d = new AtomicReference("");

    public static final String c(String str) {
        String str2 = new String(Base64.decode((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.sg), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        zzgdf zzgdfVar = com.google.android.gms.ads.internal.util.zzs.zza;
        char[] charArray = str3.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public final String a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.og)).booleanValue()) {
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.qg)).isEmpty()) {
                if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.rg)).isEmpty()) {
                    if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.sg)).isEmpty()) {
                        String str = (String) this.d.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.c.execute(new b04(this, 28));
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final String b() {
        String name;
        VersionInfoParcel versionInfoParcel = this.b;
        String strC = null;
        if (versionInfoParcel.isClientJar) {
            name = zzcmj.class.getName();
        } else {
            try {
                name = (String) new JSONObject(c((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.qg))).get(Integer.toString(versionInfoParcel.clientJarVersion));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.pg)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().d("SdkIE", e);
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strC = c((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.rg));
        } catch (IllegalArgumentException e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.pg)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().d("SdkIE", e2);
            }
        }
        if (TextUtils.isEmpty(strC)) {
            return Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET;
        }
        try {
            for (Method method : this.a.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strC)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return Nc.e;
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }

    public zzefm(Context context, VersionInfoParcel versionInfoParcel, o24 o24Var) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = o24Var;
    }
}

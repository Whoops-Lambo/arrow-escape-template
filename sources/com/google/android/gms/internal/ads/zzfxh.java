package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfxh implements zzfxa {
    public final Context a;
    public final zzfxi b;

    public final void a(zzfwz zzfwzVar) {
        boolean zHasSystemFeature;
        boolean zBooleanValue;
        Map map;
        zzfxi zzfxiVar = this.b;
        boolean z = false;
        if (zzfxiVar.b != null) {
            zBooleanValue = zzfxiVar.b.booleanValue();
        } else {
            synchronized (zzfxiVar) {
                try {
                    if (zzfxiVar.b != null) {
                        zHasSystemFeature = zzfxiVar.b.booleanValue();
                    } else {
                        if (zzfxiVar.b()) {
                            try {
                                PackageManager packageManager = zzfxiVar.c.getPackageManager();
                                if (packageManager == null) {
                                    zzfxiVar.b = Boolean.FALSE;
                                } else {
                                    zHasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                    zzfxiVar.b = Boolean.valueOf(zHasSystemFeature);
                                }
                            } catch (SecurityException e) {
                                zzfyu.a("Security exception when checking attestation capability", e);
                                zzfxiVar.b = Boolean.FALSE;
                            } catch (Exception e2) {
                                zzfyu.a("Unexpected error when checking attestation capability", e2);
                                zzfxiVar.b = Boolean.FALSE;
                            }
                        } else {
                            zzfxiVar.b = Boolean.FALSE;
                        }
                        zBooleanValue = false;
                    }
                    zBooleanValue = zHasSystemFeature;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zBooleanValue && (map = zzfwzVar.a) != null) {
            String str = (String) map.get("verifierurl");
            String str2 = (String) zzfwzVar.a.get("version");
            if (str2 == null || str2.trim().isEmpty()) {
                str2 = "1.0";
            }
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            try {
                new URL(str);
                if (str.startsWith("https://") || str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v)) {
                    z = true;
                }
            } catch (MalformedURLException unused) {
            }
            if (z) {
                try {
                    PrivacyPass.getInstance(this.a).attest(new VerificationContext(Collections.singletonList(str)), (AttestAPICallback) null, str2);
                } catch (IllegalArgumentException e3) {
                    zzfyu.a("Attestation failed: Invalid input parameters", e3);
                } catch (Exception e4) {
                    zzfyu.a("Attestation failed: unexpected error", e4);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    public final List zzd() {
        return Collections.singletonList("1.0");
    }

    public zzfxh(Context context) {
        this.a = context;
        this.b = zzfxi.a(context);
    }
}

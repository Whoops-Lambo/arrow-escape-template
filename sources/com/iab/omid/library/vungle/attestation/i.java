package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class i implements b {
    private final Context a;
    private final j b;

    private boolean b(String str) {
        try {
            new URL(str);
            return str.startsWith("https://") || str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v);
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public void a(a aVar) {
        String strConcat;
        String str;
        if (!this.b.b()) {
            strConcat = "Attestation failed: Full attestation capability not available";
        } else if (aVar == null) {
            strConcat = "Attestation failed: AttestationArgs is null";
        } else if (aVar.a() == null) {
            strConcat = "Attestation failed: attestationData is null";
        } else {
            String str2 = aVar.a().get("verifierurl");
            String strA = a(aVar.a().get("version"));
            if (str2 == null || str2.trim().isEmpty()) {
                strConcat = "Attestation failed: verifier URL is null or empty";
            } else {
                if (b(str2)) {
                    com.iab.omid.library.vungle.utils.d.a("Starting FireTV's FOS device attestation with verifier URL: ".concat(str2));
                    try {
                        if (this.a == null) {
                            com.iab.omid.library.vungle.utils.d.b("Attestation failed: application context is null");
                            return;
                        } else {
                            PrivacyPass.getInstance(this.a).attest(new VerificationContext(Collections.singletonList(str2)), (AttestAPICallback) null, strA);
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str = "Attestation failed: Invalid input parameters";
                        com.iab.omid.library.vungle.utils.d.a(str, e);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        str = "Attestation failed: unexpected error";
                        com.iab.omid.library.vungle.utils.d.a(str, e);
                        return;
                    }
                }
                strConcat = "Attestation failed: invalid verifier URL format: ".concat(str2);
            }
        }
        com.iab.omid.library.vungle.utils.d.b(strConcat);
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public List<String> c() {
        return Collections.singletonList("1.0");
    }

    public i(Context context) {
        if (context != null) {
            this.a = context;
            this.b = j.a(context);
        } else {
            defpackage.d.r("Application context cannot be null");
            throw null;
        }
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public String b() {
        return "FireTVFOSDAT";
    }

    private String a(String str) {
        return (str == null || str.trim().isEmpty()) ? "1.0" : str;
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public h a() {
        return h.NATIVE;
    }
}

package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3359nt {
    public final AdErrorType A00;
    public final String A01;

    public C3359nt(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C3359nt(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C3359nt A00(AdErrorType adErrorType) {
        return new C3359nt(adErrorType, (String) null);
    }

    public static C3359nt A01(AdErrorType adErrorType, String str) {
        return new C3359nt(adErrorType, str);
    }

    public static C3359nt A02(C3360nu c3360nu) {
        return new C3359nt(c3360nu.A00(), c3360nu.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}

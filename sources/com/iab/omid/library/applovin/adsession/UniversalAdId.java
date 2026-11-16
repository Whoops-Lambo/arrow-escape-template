package com.iab.omid.library.applovin.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.utils.g;
import defpackage.h50;

/* JADX INFO: loaded from: classes7.dex */
public final class UniversalAdId {
    private final String idRegistry;
    private final String universalAdIdValue;

    public static UniversalAdId createUniversalAdId(String str, String str2) {
        g.a(str, "UniversalADID is null or empty");
        g.a(str2, "UniversalADID registry is null or empty");
        return new UniversalAdId(str, str2);
    }

    @NonNull
    public String toString() {
        return h50.i(this.universalAdIdValue, "; ", this.idRegistry);
    }

    private UniversalAdId(String str, String str2) {
        this.universalAdIdValue = str;
        this.idRegistry = str2;
    }
}

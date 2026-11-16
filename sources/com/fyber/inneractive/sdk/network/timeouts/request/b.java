package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.k;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends a {
    public b(k kVar, String str) {
        super(str, kVar, null);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar, String str) {
        int i;
        kVar.getClass();
        String str2 = str + "_global_timeout";
        if (k.d(str)) {
            i = 30000;
        } else {
            i = 10000;
        }
        Integer numA = kVar.a(str2);
        if (numA != null) {
            return numA.intValue();
        }
        return i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(k kVar, String str) {
        kVar.getClass();
        String strA = k.a(str, "min", "rat");
        "read".equalsIgnoreCase(str);
        Integer numA = kVar.a(strA);
        if (numA != null) {
            return numA.intValue();
        }
        return 5000;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(k kVar, String str) {
        int i;
        kVar.getClass();
        String strA = k.a(str, "rat_perc");
        if ("read".equalsIgnoreCase(str)) {
            i = 15;
        } else {
            i = 10;
        }
        Integer numA = kVar.a(strA);
        if (numA != null) {
            return numA.intValue();
        }
        return i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar) {
        kVar.getClass();
        Integer numA = kVar.a(k.a("timeout", "threshold"));
        if (numA != null) {
            return numA.intValue();
        }
        return 300;
    }
}

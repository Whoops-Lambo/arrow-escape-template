package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.security.Security;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zznt {
    public static final String[] a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider a() {
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(a[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}

package com.google.android.gms.auth.api;

import com.google.android.gms.common.api.Api;
import defpackage.mj3;
import defpackage.uj3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Auth {
    public static final Api a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        mj3 mj3Var = new mj3();
        uj3 uj3Var = new uj3();
        Api api = AuthProxy.a;
        new Api("Auth.CREDENTIALS_API", mj3Var, clientKey);
        a = new Api("Auth.GOOGLE_SIGN_IN_API", uj3Var, clientKey2);
        Api api2 = AuthProxy.a;
        new com.google.android.gms.internal.p000authapi.zbd();
        new com.google.android.gms.auth.api.signin.internal.zbd();
    }

    private Auth() {
    }
}

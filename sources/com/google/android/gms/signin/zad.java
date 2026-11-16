package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import defpackage.ej3;
import defpackage.fj3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zad {
    public static final ej3 a;
    public static final Api b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        ej3 ej3Var = new ej3();
        a = ej3Var;
        fj3 fj3Var = new fj3();
        new Scope(Scopes.PROFILE);
        new Scope("email");
        b = new Api("SignIn.API", ej3Var, clientKey);
        new Api("SignIn.INTERNAL_API", fj3Var, clientKey2);
    }
}

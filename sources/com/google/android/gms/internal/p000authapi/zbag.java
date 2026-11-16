package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.zbi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import defpackage.nj3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zbag extends GoogleApi implements CredentialSavingClient {
    public static final Api b = new Api("Auth.Api.Identity.CredentialSaving.API", new nj3(), new Api.ClientKey());
    public final String a;

    public zbag(Context context, zbi zbiVar) {
        super(context, (Api<zbi>) b, zbiVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.a = zbat.a();
    }
}

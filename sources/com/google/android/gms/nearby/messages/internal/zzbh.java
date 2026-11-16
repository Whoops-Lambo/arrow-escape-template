package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.nearby.messages.MessagesClient;
import com.google.android.gms.nearby.messages.MessagesOptions;
import defpackage.kw3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbh extends GoogleApi implements MessagesClient {
    static {
        new Api("Nearby.MESSAGES_API", new kw3(), new Api.ClientKey());
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final ClientSettings.Builder createClientSettingsBuilder() {
        ClientSettings.Builder builderCreateClientSettingsBuilder = super.createClientSettingsBuilder();
        if (getApiOptions() != null) {
            ((MessagesOptions) getApiOptions()).getClass();
        }
        return builderCreateClientSettingsBuilder;
    }
}

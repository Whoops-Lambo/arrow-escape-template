package com.google.android.gms.common.api.internal;

import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public final class ApiKey<O extends Api.ApiOptions> {
    private final int zaa;
    private final Api zab;

    @Nullable
    private final Api.ApiOptions zac;

    @Nullable
    private final String zad;

    @Nullable
    private final UserHandle zae;

    @NonNull
    @KeepForSdk
    public static <O extends Api.ApiOptions> ApiKey<O> getSharedApiKey(@NonNull Api<O> api, @Nullable O o, @Nullable String str) {
        return getSharedApiKey(api, o, str, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.equal(this.zab, apiKey.zab) && Objects.equal(this.zac, apiKey.zac) && Objects.equal(this.zad, apiKey.zad) && Objects.equal(this.zae, apiKey.zae);
    }

    public final int hashCode() {
        return this.zaa;
    }

    @NonNull
    public final String zaa() {
        return this.zab.zad();
    }

    private ApiKey(Api api, @Nullable Api.ApiOptions apiOptions, @Nullable String str, @Nullable UserHandle userHandle) {
        this.zab = api;
        this.zac = apiOptions;
        this.zad = str;
        this.zae = userHandle;
        this.zaa = Objects.hashCode(api, apiOptions, str, userHandle);
    }

    @NonNull
    @KeepForSdk
    public static <O extends Api.ApiOptions> ApiKey<O> getSharedApiKey(@NonNull Api<O> api, @Nullable O o, @Nullable String str, @Nullable UserHandle userHandle) {
        return new ApiKey<>(api, o, str, userHandle);
    }
}

package com.google.android.gms.games;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class FriendsResolutionRequiredException extends ResolvableApiException {
    @NonNull
    public static FriendsResolutionRequiredException zza(@NonNull Status status) {
        return new FriendsResolutionRequiredException(status);
    }

    private FriendsResolutionRequiredException(Status status) {
        super(status);
    }
}

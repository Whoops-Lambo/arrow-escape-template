package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AuthCredential extends AbstractSafeParcelable {
    @NonNull
    public abstract String getProvider();

    @NonNull
    public abstract String getSignInMethod();

    @NonNull
    public abstract AuthCredential zza();
}

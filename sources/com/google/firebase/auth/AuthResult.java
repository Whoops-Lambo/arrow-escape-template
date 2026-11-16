package com.google.firebase.auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface AuthResult extends SafeParcelable {
    @Nullable
    AdditionalUserInfo getAdditionalUserInfo();

    @Nullable
    AuthCredential getCredential();

    @Nullable
    FirebaseUser getUser();
}

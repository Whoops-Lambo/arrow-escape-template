package com.google.firebase.auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface AdditionalUserInfo extends SafeParcelable {
    @Nullable
    Map<String, Object> getProfile();

    @Nullable
    String getProviderId();

    @Nullable
    String getUsername();

    boolean isNewUser();
}

package com.google.android.gms.appset;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.appset.zzr;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class AppSet {
    @NonNull
    public static AppSetIdClient getClient(@NonNull Context context) {
        return new zzr(context);
    }

    private AppSet() {
    }
}

package io.p071bidmachine;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface ContextProvider {
    @Nullable
    Activity getActivity();

    @NonNull
    Context getApplicationContext();

    @NonNull
    Context getContext();
}

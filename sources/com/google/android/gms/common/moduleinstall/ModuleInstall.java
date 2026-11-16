package com.google.android.gms.common.moduleinstall;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.moduleinstall.internal.zay;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ModuleInstall {
    @NonNull
    public static ModuleInstallClient getClient(@NonNull Activity activity) {
        return new zay(activity);
    }

    private ModuleInstall() {
    }

    @NonNull
    public static ModuleInstallClient getClient(@NonNull Context context) {
        return new zay(context);
    }
}

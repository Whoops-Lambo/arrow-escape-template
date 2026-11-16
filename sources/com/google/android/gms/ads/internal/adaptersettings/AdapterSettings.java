package com.google.android.gms.ads.internal.adaptersettings;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbja;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class AdapterSettings {

    @Nullable
    private static volatile AdapterSettings instance;
    private final zzbja adapterSettingsInternal = zzba.zzd();

    @KeepForSdk
    private boolean getBoolean(String str, boolean z) {
        zzbja zzbjaVar = this.adapterSettingsInternal;
        zzbjaVar.getClass();
        return !str.startsWith("adapter:") ? z : zzbjaVar.c.optBoolean(str, z);
    }

    @KeepForSdk
    private float getFloat(String str, float f) {
        zzbja zzbjaVar = this.adapterSettingsInternal;
        zzbjaVar.getClass();
        return !str.startsWith("adapter:") ? f : (float) zzbjaVar.c.optDouble(str, f);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    @KeepForSdk
    private int getInt(String str, int i) {
        zzbja zzbjaVar = this.adapterSettingsInternal;
        zzbjaVar.getClass();
        return !str.startsWith("adapter:") ? i : zzbjaVar.c.optInt(str, i);
    }

    @KeepForSdk
    private long getLong(String str, long j) {
        zzbja zzbjaVar = this.adapterSettingsInternal;
        zzbjaVar.getClass();
        return !str.startsWith("adapter:") ? j : zzbjaVar.c.optLong(str, j);
    }

    @KeepForSdk
    private String getString(String str, String str2) {
        zzbja zzbjaVar = this.adapterSettingsInternal;
        zzbjaVar.getClass();
        return !str.startsWith("adapter:") ? str2 : zzbjaVar.c.optString(str, str2);
    }
}

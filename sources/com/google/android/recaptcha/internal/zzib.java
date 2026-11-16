package com.google.android.recaptcha.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import io.p071bidmachine.media3.extractor.ts.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzib implements zzih {

    @NotNull
    private final Context zza;

    @Override // com.google.android.recaptcha.internal.zzih
    @SuppressLint({"UnprotectedReceiver"})
    @Nullable
    public final Object zza(@NotNull Object... objArr) throws zzce {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        int i = Build.VERSION.SDK_INT;
        Context context = this.zza;
        Intent intentRegisterReceiver = i >= 33 ? context.registerReceiver(null, intentFilter, 4) : context.registerReceiver(null, intentFilter);
        if (intentRegisterReceiver == null) {
            y.e(7, 19, null);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("health", -1);
        int intExtra2 = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        int intExtra3 = intentRegisterReceiver.getIntExtra("plugged", -1);
        boolean booleanExtra = intentRegisterReceiver.getBooleanExtra("present", false);
        int intExtra4 = intentRegisterReceiver.getIntExtra("scale", -1);
        int intExtra5 = intentRegisterReceiver.getIntExtra("status", -1);
        String stringExtra = intentRegisterReceiver.getStringExtra("technology");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Integer.valueOf(intExtra3), Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra4), Integer.valueOf(intExtra5), stringExtra, Integer.valueOf(intentRegisterReceiver.getIntExtra("temperature", -1)), Integer.valueOf(intentRegisterReceiver.getIntExtra("voltage", -1))};
    }

    public zzib(@NotNull Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }
}

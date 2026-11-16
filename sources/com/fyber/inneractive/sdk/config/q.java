package com.fyber.inneractive.sdk.config;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.singular.sdk.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class q {
    public static void a(Context context, z zVar) {
        String string = null;
        boolean z = false;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            z = Settings.Secure.getInt(contentResolver, Constants.AMAZON_LIMIT_AD_TRACKING) != 0;
            if (!z) {
                string = Settings.Secure.getString(contentResolver, Constants.AMAZON_ADVERTISING_ID);
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        if (string != null) {
            synchronized (zVar) {
                y yVar = zVar.b;
                yVar.a = string;
                yVar.b = z;
                yVar.c = true;
            }
        }
    }
}

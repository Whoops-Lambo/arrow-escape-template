package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.SystemClock;
import defpackage.e32;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzry {
    public static File a(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            File filesDir2 = context.getFilesDir();
            if (filesDir2 != null) {
                return filesDir2;
            }
            e32.i("getFilesDir returned null twice.");
            return null;
        }
        return filesDir;
    }
}

package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class xh {
    public static long kgy() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "dusgmhGlWs6aTw==", "XOs5tBW9YMuBSNtYpR+0LUngLJkuuWTIklPkVJYU", 43);
            return 0L;
        }
    }
}

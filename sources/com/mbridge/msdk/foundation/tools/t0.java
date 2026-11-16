package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class t0 {
    static String a = "";
    private static volatile boolean b = false;
    private static int c = -1;
    private static int d = -1;
    private static long e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            t0.b();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (b) {
                return;
            }
            b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                a = externalFilesDir.getAbsolutePath();
            }
            try {
                b(context);
            } catch (Exception unused) {
                b(context);
            }
        } catch (Exception e2) {
            q0.b("SameSDCardTool", e2.getMessage());
        }
    }

    public static int c() {
        return d;
    }

    public static void b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            d = Long.valueOf(((((long) statFs.getBlockCount()) * blockSize) / 1000) / 1000).intValue();
            c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            e = System.currentTimeMillis();
        } catch (Exception e2) {
            q0.b("SameSDCardTool", e2.getMessage());
        }
    }

    public static int a() {
        if (System.currentTimeMillis() - e > 1800000) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        }
        return c;
    }

    private static void b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(a)) {
            com.mbridge.msdk.foundation.same.directory.e.a(new com.mbridge.msdk.foundation.same.directory.d(a));
            com.mbridge.msdk.foundation.same.directory.e.b().a();
        }
        b();
    }
}

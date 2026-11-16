package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.yo;
import com.bytedance.sdk.openadsdk.core.xh;
import defpackage.nj;
import defpackage.oe3;
import defpackage.za3;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class CacheDirFactory {
    public static volatile za3 MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String kgy;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getRootDir());
        return nj.q(sb, File.separator, str);
    }

    public static String getImageCacheDir(String str) {
        if (kgy == null) {
            kgy = getDiskCacheDirPath(str);
        }
        return kgy;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileKgy = yo.kgy(xh.kgy(), "tt_ad");
        if (fileKgy.isFile()) {
            fileKgy.delete();
        }
        if (!fileKgy.exists()) {
            fileKgy.mkdirs();
        }
        String absolutePath = fileKgy.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static za3 kgy() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        oe3 oe3Var = new oe3();
                        oe3Var.a = null;
                        oe3Var.b = null;
                        oe3Var.c = null;
                        oe3Var.d = null;
                        oe3Var.e = null;
                        MEDIA_CACHE_DIR = oe3Var;
                        oe3Var.a = getRootDir();
                        ((oe3) MEDIA_CACHE_DIR).f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static za3 getICacheDir() {
        return kgy();
    }
}

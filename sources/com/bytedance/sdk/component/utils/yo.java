package com.bytedance.sdk.component.utils;

import android.content.Context;
import com.safedk.android.internal.partials.PangleFilesBridge;
import defpackage.dr0;
import defpackage.h50;
import defpackage.n30;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class yo {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.yo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy implements Comparator<File> {
        private kgy() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return kgy(file.lastModified(), file2.lastModified());
        }

        public /* synthetic */ kgy(AnonymousClass1 anonymousClass1) {
            this();
        }

        private int kgy(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006a A[Catch: all -> 0x0066, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {all -> 0x0066, blocks: (B:37:0x0062, B:41:0x006a), top: B:60:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x007d A[Catch: all -> 0x0079, FINALLY_INSNS, TRY_LEAVE, TryCatch #3 {all -> 0x0079, blocks: (B:47:0x0075, B:51:0x007d), top: B:62:0x0075 }] */
    public static boolean kgy(File file, File file2) {
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        if (file == null || !file.exists() || !file.isFile() || !file.canRead() || file2 == null) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(file2);
            try {
                byte[] bArr = new byte[1024];
                FileInputStream fileInputStream2 = new FileInputStream(file);
                while (true) {
                    try {
                        int i = fileInputStream2.read(bArr);
                        if (i == -1) {
                            try {
                                fileInputStream2.close();
                                fileOutputStreamFileOutputStreamCtor.close();
                                return true;
                            } catch (Throwable th) {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "WOE9jCW1ZcI=", 288);
                                return true;
                            }
                        }
                        fileOutputStreamFileOutputStreamCtor.write(bArr, 0, i);
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        try {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "WOE9jCW1ZcI=", 278);
                            if (fileInputStream != null) {
                                try {
                                } catch (Throwable th3) {
                                    return false;
                                }
                            }
                            return false;
                        } finally {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                    if (fileOutputStreamFileOutputStreamCtor != null) {
                                        fileOutputStreamFileOutputStreamCtor.close();
                                    }
                                } catch (Throwable th4) {
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th4, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "WOE9jCW1ZcI=", 288);
                                }
                            } else if (fileOutputStreamFileOutputStreamCtor != null) {
                                fileOutputStreamFileOutputStreamCtor.close();
                            }
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            fileOutputStreamFileOutputStreamCtor = null;
        }
    }

    public static void rz(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            try {
                file.delete();
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "X+shkBe5Tc6S", 169);
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    rz(file2);
                } else {
                    try {
                        file2.delete();
                    } catch (Throwable th2) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "X+shkBe5Tc6S", 180);
                    }
                }
            }
        }
        try {
            file.delete();
        } catch (Throwable th3) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th3, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "X+shkBe5Tc6S", 188);
        }
    }

    public static byte[] uq(File file) {
        FileInputStream fileInputStream;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    if (fileInputStream.read(bArr) == length) {
                        try {
                            fileInputStream.close();
                            return bArr;
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "SesskSW1ZcI=", 250);
                            return bArr;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "SesskSW1ZcI=", 245);
                    if (fileInputStream != null) {
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th4, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "SesskSW1ZcI=", 250);
            }
        }
        return null;
    }

    public static void ahm(File file) throws IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!file.setLastModified(jCurrentTimeMillis)) {
                ct(file);
                if (file.lastModified() < jCurrentTimeMillis) {
                    new Date(file.lastModified()).toString();
                    file.getAbsolutePath();
                }
            }
        }
    }

    private static void ct(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            noq(file);
            return;
        }
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
            long j = length - 1;
            try {
                randomAccessFile2.seek(j);
                byte b = randomAccessFile2.readByte();
                randomAccessFile2.seek(j);
                randomAccessFile2.write(b);
                randomAccessFile2.close();
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                try {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "VuEpnAWl", 206);
                } finally {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void noq(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
            return;
        }
        dr0.h("Error recreate zero-size file ".concat(String.valueOf(file)));
    }

    public static File ahm(Context context, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = n30.m(absolutePath, str2);
            }
        }
        File file = new File(n30.m(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File kgy(Context context, String str, String str2) {
        String strKgy = kgy(context);
        if (!gm.kgy(context)) {
            StringBuilder sbQ = h50.q(str, "_");
            sbQ.append(gm.rz(context));
            str = sbQ.toString();
        }
        if (strKgy != null) {
            String str3 = File.separator;
            if (!strKgy.endsWith(str3)) {
                strKgy = n30.m(strKgy, str3);
            }
        }
        String strM = n30.m(strKgy, str);
        File file = new File(strM);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(strM, str2);
    }

    public static File kgy(Context context, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (!gm.kgy(context)) {
            StringBuilder sbQ = h50.q(str, "_");
            sbQ.append(gm.rz(context));
            str = sbQ.toString();
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = n30.m(absolutePath, str2);
            }
        }
        File file = new File(n30.m(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String kgy(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static List<File> kgy(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new kgy(null));
        return listAsList;
    }

    public static File kgy(Context context, File file, String str) {
        if (file != null) {
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "fechkDaoYMuT", "XOs5uAK1Z+iSecJfvAOvK179PrMKsGw=", 45);
                return new File(file, str);
            }
        }
        if (gm.kgy(context)) {
            return new File(file, str);
        }
        return new File(file, str + "_" + gm.rz(context));
    }
}

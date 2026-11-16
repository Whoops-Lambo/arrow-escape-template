package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import android.util.Log;
import defpackage.pe;
import defpackage.uu;
import defpackage.xb2;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class FileStore {
    public final String a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;
    public final File g;

    public static synchronized void d(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List f(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public final void a(String str) {
        File file = new File(this.b, str);
        if (file.exists() && e(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public final File b(String str) {
        File file = new File(this.d, str);
        file.mkdirs();
        File file2 = new File(file, "native");
        file2.mkdirs();
        return file2;
    }

    public final File c(String str, String str2) {
        File file = new File(this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public FileStore(Context context) {
        String string;
        String strReplaceAll;
        String str = ((pe) xb2.e.b(context)).a;
        this.a = str;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (!str.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str.length() > 40) {
                strReplaceAll = uu.M(str);
            } else {
                strReplaceAll = str.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(strReplaceAll);
            string = sb.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        d(file);
        this.c = file;
        File file2 = new File(file, "open-sessions");
        d(file2);
        this.d = file2;
        File file3 = new File(file, "reports");
        d(file3);
        this.e = file3;
        File file4 = new File(file, "priority-reports");
        d(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        d(file5);
        this.g = file5;
    }

    public static boolean e(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                e(file2);
            }
        }
        return file.delete();
    }
}

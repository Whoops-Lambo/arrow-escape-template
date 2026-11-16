package com.mbridge.msdk.config.component.load.downloader.utils;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.utils.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C1407a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.exists();
        }
    }

    public static boolean b(File file) {
        if (file == null) {
            return false;
        }
        boolean zExists = file.exists();
        return !zExists ? a(file) : zExists;
    }

    private static boolean a(File file) {
        File[] fileArrListFiles;
        try {
            fileArrListFiles = file.getParentFile().listFiles(new C1407a());
        } catch (Exception e) {
            q0.a("doubleCheckExists", e.getLocalizedMessage());
            fileArrListFiles = null;
        }
        if (fileArrListFiles != null && file.length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    public static void a(com.mbridge.msdk.config.component.load.downloader.resource.stream.a aVar) {
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } catch (Exception e) {
            q0.a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void a(a0 a0Var) {
        if (a0Var == null) {
            return;
        }
        try {
            if (a0Var.d() != null) {
                a0Var.d().close();
            }
            a0Var.close();
        } catch (Exception e) {
            q0.a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void a(b0 b0Var) {
        if (b0Var == null) {
            return;
        }
        try {
            b0Var.close();
        } catch (Exception e) {
            q0.a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (Exception e) {
            q0.a("closeStream", e.getLocalizedMessage());
        }
    }

    public static boolean a(Object obj) {
        return !b(obj);
    }
}

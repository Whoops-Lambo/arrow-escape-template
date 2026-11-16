package com.fyber.inneractive.sdk.player.cache;

import defpackage.dr0;
import defpackage.n30;
import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    dr0.h(n30.j(file2, "failed to delete file: "));
                    return;
                }
            }
            return;
        }
        dr0.h(n30.j(file, "not a readable directory: "));
    }
}

package com.bykv.vk.openvk.preload.geckox.utils;

import defpackage.ak1;
import defpackage.jc1;
import defpackage.vq2;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class BsPatch {
    private static native int patch(String str, String str2, String str3) throws Exception;

    static {
        System.loadLibrary("geckox_bspatch");
    }

    public static void a(File file, File file2, File file3, String str) throws Exception {
        if (file.exists()) {
            if (file2.exists()) {
                file3.mkdirs();
                File file4 = new File(file3, str);
                file4.delete();
                int iPatch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
                if (iPatch == 0) {
                    return;
                }
                StringBuilder sbS = jc1.s(iPatch, "patch merged failed, code：", " full:");
                sbS.append(file.getAbsolutePath());
                sbS.append(" patch:");
                sbS.append(file2.getAbsolutePath());
                sbS.append(" dest:");
                ak1.m(sbS, file4.getAbsolutePath());
                return;
            }
            vq2.t(file2.getAbsolutePath(), "patch package not exist：");
            return;
        }
        vq2.t(file.getAbsolutePath(), "full package not exist：");
    }
}

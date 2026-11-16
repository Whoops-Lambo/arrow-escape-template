package com.unity3d.ads.core.extensions;

import defpackage.k1;
import java.io.File;
import java.util.LinkedList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getDirectorySize", "", "Ljava/io/File;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FileExtensionsKt {
    public static final long getDirectorySize(@NotNull File file) {
        File[] fileArrListFiles;
        file.getClass();
        long length = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length != 0) {
                k1 k1Var = new k1(fileArrListFiles);
                while (k1Var.hasNext()) {
                    File file3 = (File) k1Var.next();
                    if (file3.isDirectory()) {
                        linkedList.add(file3);
                    } else {
                        length += file3.length();
                    }
                }
            }
        }
        return length;
    }
}

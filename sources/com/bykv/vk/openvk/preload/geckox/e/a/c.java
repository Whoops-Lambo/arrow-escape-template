package com.bykv.vk.openvk.preload.geckox.e.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import defpackage.dr0;
import defpackage.nj;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends a {
    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    public final InputStream a(File file, String str) throws IOException {
        File file2 = new File(file, nj.q(new StringBuilder("res"), File.separator, str));
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            GeckoLogger.d("gecko-debug-tag", "NormalFileLoader, file:", file2.getAbsolutePath());
            return new FileInputStream(file2.getCanonicalFile());
        }
        dr0.h("file not found");
        return null;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    public final boolean b(File file, String str) throws IOException {
        return new File(file, nj.q(new StringBuilder("res"), File.separator, str)).exists();
    }

    public c(File file) {
        super(file);
    }
}

package com.bykv.vk.openvk.preload.geckox.e.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    private File a;

    public abstract InputStream a(File file, String str) throws IOException;

    public abstract boolean b(File file, String str) throws IOException;

    public final InputStream a(String str) throws IOException {
        return a(this.a, str);
    }

    public final boolean b(String str) throws IOException {
        return b(this.a, str);
    }

    public a(File file) {
        this.a = file;
    }
}

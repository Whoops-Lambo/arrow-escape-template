package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import defpackage.vq2;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file, long j) throws IOException {
        if (j <= 0) {
            try {
                return new b(file);
            } catch (Exception e) {
                vq2.m("create FileBuffer failed! file:", file.getAbsolutePath(), " caused by:", e.getMessage(), e);
                return null;
            }
        }
        try {
            return new c(j, file);
        } catch (Exception e2) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e2.getMessage(), e2);
        }
    }

    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file, long j) throws IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarB = b(file, j);
        GeckoLogger.d("gecko-debug-tag", "buffer type:" + aVarB.getClass());
        return aVarB;
    }
}

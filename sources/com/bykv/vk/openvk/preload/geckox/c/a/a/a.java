package com.bykv.vk.openvk.preload.geckox.c.a.a;

import android.util.Pair;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import defpackage.vq2;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a extends d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<File, UpdatePackage>> {
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static Object a2(com.bykv.vk.openvk.preload.a.b<Pair<File, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start check full single file channel:", ((UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        aVar.b(0L);
        try {
            com.bykv.vk.openvk.preload.geckox.utils.d.a(new com.bykv.vk.openvk.preload.geckox.buffer.stream.a(aVar), updatePackage.getFullPackage().getMd5());
            aVar.a();
            return bVar.a(new Pair<>(aVar.f(), updatePackage));
        } catch (Throwable th) {
            vq2.k("check full single file failed, channel:", updatePackage.getChannel(), updatePackage.getFullPackage().getId(), th.getMessage(), th);
            return null;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* bridge */ /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.b<Pair<File, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        return a2(bVar, pair);
    }
}

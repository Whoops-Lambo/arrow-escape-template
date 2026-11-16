package com.bykv.vk.openvk.preload.geckox.c.b.a;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import defpackage.h50;
import defpackage.nj;
import defpackage.vq2;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class d extends com.bykv.vk.openvk.preload.a.d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<File, UpdatePackage>> {
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static Object a2(com.bykv.vk.openvk.preload.a.b<Pair<File, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String channel = updatePackage.getChannel();
        GeckoLogger.d("gecko-debug-tag", "start unzip full zip file, channel:", channel);
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        aVar.b(0L);
        File parentFile = aVar.f().getParentFile();
        try {
            h.a(new com.bykv.vk.openvk.preload.geckox.buffer.stream.a(aVar), parentFile.getAbsolutePath(), channel);
            aVar.a();
            File file = new File(parentFile, "res");
            com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
            if (new File(parentFile, channel).renameTo(file)) {
                return bVar.a(new Pair<>(aVar.f(), updatePackage));
            }
            throw new RuntimeException("rename unziped full zip file failed:" + parentFile.getAbsolutePath() + ", dest:" + file.getAbsolutePath() + ", exist?" + file.exists());
        } catch (Exception e) {
            StringBuilder sbR = h50.r("unzip full zip file failed, channel:", channel, ", pkg id:");
            sbR.append(updatePackage.getFullPackage().getId());
            sbR.append(", dir:");
            sbR.append(parentFile.getAbsolutePath());
            sbR.append(", caused by:");
            vq2.n(nj.o(e, sbR), e);
            return null;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* bridge */ /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.b<Pair<File, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws Throwable {
        return a2(bVar, pair);
    }
}

package com.bykv.vk.openvk.preload.geckox.c;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class i extends com.bykv.vk.openvk.preload.a.d<Pair<String, Long>, Pair<String, Long>> {
    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.b<Pair<String, Long>> bVar, Pair<String, Long> pair) throws Throwable {
        Pair<String, Long> pair2 = pair;
        GeckoLogger.d("gecko-debug-tag", "update success:", pair2);
        return bVar.a(pair2);
    }
}

package com.adsurge.adn.managers.localt;

import com.adsurge.adn.M.b;
import com.adsurge.adn.M.c;
import com.adsurge.adn.X.q;
import defpackage.r70;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MMPIdFetcher {
    public static final MMPProvider[] a = {new com.adsurge.adn.M.a(), new b()};

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface AllDoneCallback {
        void onAllDone(List<c> list);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Callback {
        void onProviderResult(MMPProvider mMPProvider, c cVar);
    }

    public static void a(AllDoneCallback allDoneCallback) {
        MMPProvider[] mMPProviderArr = a;
        int length = mMPProviderArr.length;
        ArrayList arrayList = new ArrayList(length);
        AtomicInteger atomicInteger = new AtomicInteger(length);
        for (MMPProvider mMPProvider : mMPProviderArr) {
            q.b.execute(new r70(mMPProvider, arrayList, atomicInteger, allDoneCallback, 11));
        }
    }

    public static /* synthetic */ void a(List list, AtomicInteger atomicInteger, AllDoneCallback allDoneCallback, c cVar) {
        boolean z;
        synchronized (list) {
            list.add(cVar);
            z = atomicInteger.decrementAndGet() == 0;
        }
        if (z) {
            allDoneCallback.onAllDone(list);
        }
    }
}

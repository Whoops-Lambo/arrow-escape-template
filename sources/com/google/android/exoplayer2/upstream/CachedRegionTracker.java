package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import com.google.android.exoplayer2.util.Log;
import defpackage.wn;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class CachedRegionTracker implements Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final String TAG = "CachedRegionTracker";
    private final Cache cache;
    private final String cacheKey;
    private final ChunkIndex chunkIndex;
    private final TreeSet<wn> regions = new TreeSet<>();
    private final wn lookupRegion = new wn(0, 0);

    public synchronized int getRegionEndTimeMs(long j) {
        int i;
        wn wnVar = this.lookupRegion;
        wnVar.a = j;
        wn wnVarFloor = this.regions.floor(wnVar);
        if (wnVarFloor != null) {
            long j2 = wnVarFloor.b;
            if (j <= j2 && (i = wnVarFloor.c) != -1) {
                ChunkIndex chunkIndex = this.chunkIndex;
                if (i == chunkIndex.length - 1) {
                    if (j2 == chunkIndex.offsets[i] + ((long) chunkIndex.sizes[i])) {
                        return -2;
                    }
                }
                return (int) ((chunkIndex.timesUs[i] + (((j2 - chunkIndex.offsets[i]) * chunkIndex.durationsUs[i]) / ((long) chunkIndex.sizes[i]))) / 1000);
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        mergeSpan(cacheSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        long j = cacheSpan.position;
        wn wnVar = new wn(j, cacheSpan.length + j);
        wn wnVarFloor = this.regions.floor(wnVar);
        if (wnVarFloor == null) {
            Log.e(TAG, "Removed a span we were not aware of");
            return;
        }
        this.regions.remove(wnVarFloor);
        long j2 = wnVarFloor.a;
        long j3 = wnVar.a;
        if (j2 < j3) {
            wn wnVar2 = new wn(j2, j3);
            int iBinarySearch = Arrays.binarySearch(this.chunkIndex.offsets, j3);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            wnVar2.c = iBinarySearch;
            this.regions.add(wnVar2);
        }
        long j4 = wnVarFloor.b;
        long j5 = wnVar.b;
        if (j4 > j5) {
            wn wnVar3 = new wn(j5 + 1, j4);
            wnVar3.c = wnVarFloor.c;
            this.regions.add(wnVar3);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }

    private void mergeSpan(CacheSpan cacheSpan) {
        long j = cacheSpan.position;
        wn wnVar = new wn(j, cacheSpan.length + j);
        wn wnVarFloor = this.regions.floor(wnVar);
        wn wnVarCeiling = this.regions.ceiling(wnVar);
        boolean zRegionsConnect = regionsConnect(wnVarFloor, wnVar);
        if (regionsConnect(wnVar, wnVarCeiling)) {
            if (zRegionsConnect) {
                wnVarFloor.b = wnVarCeiling.b;
                wnVarFloor.c = wnVarCeiling.c;
            } else {
                wnVar.b = wnVarCeiling.b;
                wnVar.c = wnVarCeiling.c;
                this.regions.add(wnVar);
            }
            this.regions.remove(wnVarCeiling);
            return;
        }
        if (!zRegionsConnect) {
            int iBinarySearch = Arrays.binarySearch(this.chunkIndex.offsets, wnVar.b);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            wnVar.c = iBinarySearch;
            this.regions.add(wnVar);
            return;
        }
        wnVarFloor.b = wnVar.b;
        int i = wnVarFloor.c;
        while (true) {
            ChunkIndex chunkIndex = this.chunkIndex;
            if (i >= chunkIndex.length - 1) {
                break;
            }
            int i2 = i + 1;
            if (chunkIndex.offsets[i2] > wnVarFloor.b) {
                break;
            } else {
                i = i2;
            }
        }
        wnVarFloor.c = i;
    }

    private boolean regionsConnect(@Nullable wn wnVar, @Nullable wn wnVar2) {
        return (wnVar == null || wnVar2 == null || wnVar.b != wnVar2.a) ? false : true;
    }

    public void release() {
        this.cache.removeListener(this.cacheKey, this);
    }

    public CachedRegionTracker(Cache cache, String str, ChunkIndex chunkIndex) {
        this.cache = cache;
        this.cacheKey = str;
        this.chunkIndex = chunkIndex;
        synchronized (this) {
            try {
                Iterator<CacheSpan> itDescendingIterator = cache.addListener(str, this).descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    mergeSpan(itDescendingIterator.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

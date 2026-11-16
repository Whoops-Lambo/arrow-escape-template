package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class CacheSpan implements Comparable<CacheSpan> {

    @Nullable
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastAccessTimestamp;
    public final long length;
    public final long position;

    @Override // java.lang.Comparable
    public int compareTo(@NonNull CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j = this.position - cacheSpan.position;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public CacheSpan(String str, long j, long j2, long j3, @Nullable File file) {
        boolean z;
        this.key = str;
        this.position = j;
        this.length = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.isCached = z;
        this.file = file;
        this.lastAccessTimestamp = j3;
    }

    public CacheSpan(String str, long j, long j2) {
        this(str, j, j2, -9223372036854775807L, null);
    }
}

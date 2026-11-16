package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.ironsource.C4664b4;
import defpackage.jc1;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public class CacheSpan implements Comparable<CacheSpan> {

    @Nullable
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
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

    public String toString() {
        StringBuilder sb = new StringBuilder(C4664b4.j.d);
        sb.append(this.position);
        sb.append(", ");
        return jc1.m(this.length, C4664b4.j.e, sb);
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
        this.lastTouchTimestamp = j3;
    }

    public CacheSpan(String str, long j, long j2) {
        this(str, j, j2, -9223372036854775807L, null);
    }
}

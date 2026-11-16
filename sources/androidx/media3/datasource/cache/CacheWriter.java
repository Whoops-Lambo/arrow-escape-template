package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final Cache cache;
    private final String cacheKey;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;

    @Nullable
    private final ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ProgressListener {
        void onProgress(long j, long j2, long j3);
    }

    public void cancel() {
        this.isCanceled = true;
    }

    private long getLength() {
        long j = this.endPosition;
        if (j == -1) {
            return -1L;
        }
        return j - this.dataSpec.position;
    }

    private void onNewBytesCached(long j) {
        this.bytesCached += j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, j);
        }
    }

    private void onRequestEndPosition(long j) {
        if (this.endPosition == j) {
            return;
        }
        this.endPosition = j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
    }

    private long readBlockToCache(long j, long j2) throws Exception {
        long jOpen;
        boolean z = true;
        boolean z2 = j + j2 == this.endPosition || j2 == -1;
        if (j2 != -1) {
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(j2).build());
            } catch (Exception unused) {
                DataSourceUtil.closeQuietly(this.dataSource);
                z = false;
                jOpen = -1;
            }
        } else {
            z = false;
            jOpen = -1;
        }
        if (!z) {
            throwIfCanceled();
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(-1L).build());
            } catch (Exception e) {
                DataSourceUtil.closeQuietly(this.dataSource);
                throw e;
            }
        }
        if (z2 && jOpen != -1) {
            try {
                onRequestEndPosition(jOpen + j);
            } catch (Exception e2) {
                DataSourceUtil.closeQuietly(this.dataSource);
                throw e2;
            }
        }
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            throwIfCanceled();
            CacheDataSource cacheDataSource = this.dataSource;
            byte[] bArr = this.temporaryBuffer;
            i = cacheDataSource.read(bArr, 0, bArr.length);
            if (i != -1) {
                onNewBytesCached(i);
                i2 += i;
            }
        }
        if (z2) {
            onRequestEndPosition(j + ((long) i2));
        }
        this.dataSource.close();
        return i2;
    }

    private void throwIfCanceled() throws InterruptedIOException {
        if (this.isCanceled) {
            throw new InterruptedIOException();
        }
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, @Nullable byte[] bArr, @Nullable ProgressListener progressListener) {
        this.dataSource = cacheDataSource;
        this.cache = cacheDataSource.getCache();
        this.dataSpec = dataSpec;
        this.temporaryBuffer = bArr == null ? new byte[131072] : bArr;
        this.progressListener = progressListener;
        this.cacheKey = cacheDataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.nextPosition = dataSpec.position;
    }

    @WorkerThread
    public void cache() throws IOException {
        long j;
        throwIfCanceled();
        Cache cache = this.cache;
        String str = this.cacheKey;
        DataSpec dataSpec = this.dataSpec;
        this.bytesCached = cache.getCachedBytes(str, dataSpec.position, dataSpec.length);
        DataSpec dataSpec2 = this.dataSpec;
        long j2 = dataSpec2.length;
        if (j2 != -1) {
            this.endPosition = dataSpec2.position + j2;
        } else {
            long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(this.cacheKey));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.endPosition = contentLength;
        }
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
        while (true) {
            long j3 = this.endPosition;
            if (j3 != -1 && this.nextPosition >= j3) {
                return;
            }
            throwIfCanceled();
            long j4 = this.endPosition;
            if (j4 == -1) {
                j = Long.MAX_VALUE;
            } else {
                j = j4 - this.nextPosition;
            }
            long cachedLength = this.cache.getCachedLength(this.cacheKey, this.nextPosition, j);
            if (cachedLength > 0) {
                this.nextPosition += cachedLength;
            } else {
                long j5 = -cachedLength;
                if (j5 == Long.MAX_VALUE) {
                    j5 = -1;
                }
                long j6 = this.nextPosition;
                this.nextPosition = j6 + readBlockToCache(j6, j5);
            }
        }
    }
}

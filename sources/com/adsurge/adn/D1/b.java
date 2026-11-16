package com.adsurge.adn.D1;

import android.os.SystemClock;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.datasource.cache.ContentMetadata;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import com.adsurge.adn.managers.AdSurgeAdSdk;
import defpackage.ya;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static volatile Cache b;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final Object c = new Object();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements CacheWriter.ProgressListener {
        public long a = 0;
        public final /* synthetic */ InterfaceC0070b b;
        public final /* synthetic */ String c;

        public a(InterfaceC0070b interfaceC0070b, String str) {
            this.b = interfaceC0070b;
            this.c = str;
        }

        @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
        public void onProgress(long j, long j2, long j3) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - this.a >= 500) {
                this.a = jElapsedRealtime;
                InterfaceC0070b interfaceC0070b = this.b;
                if (interfaceC0070b != null) {
                    interfaceC0070b.a(this.c, j2, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.D1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0070b {
        void a(String str);

        void a(String str, long j);

        void a(String str, long j, long j2);

        void a(String str, long j, long j2, long j3);

        void a(String str, Exception exc);

        void b(String str, long j, long j2, long j3);
    }

    public static CacheWriter a(String str, long j, long j2, InterfaceC0070b interfaceC0070b, Cache cache) {
        CacheDataSource.Factory upstreamDataSourceFactory = new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(new DefaultHttpDataSource.Factory().setUserAgent("AdSurge-Preload").setConnectTimeoutMs(10000).setReadTimeoutMs(10000));
        DataSpec.Builder key = new DataSpec.Builder().setUri(str).setPosition(0L).setLength(j).setKey(str);
        if (c.d()) {
            upstreamDataSourceFactory.setCacheWriteDataSinkFactory(new CacheDataSink.Factory().setCache(cache).setFragmentSize(a(j2)));
            key.setFlags(4);
        }
        return new CacheWriter(upstreamDataSourceFactory.createDataSource(), key.build(), null, new a(interfaceC0070b, str));
    }

    public static Cache b() {
        if (b == null) {
            synchronized (c) {
                if (b == null) {
                    try {
                        File fileA = a();
                        b = new SimpleCache(fileA, new LeastRecentlyUsedCacheEvictor(104857600L), new StandaloneDatabaseProvider(AdSurgeAdSdk.getInstance().getContext()));
                        fileA.getAbsolutePath();
                    } catch (Exception e) {
                        e.getMessage();
                        b = null;
                    }
                }
            }
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.adsurge.adn.D1.b$b] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.adsurge.adn.D1.b$b] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.media3.datasource.cache.CacheWriter] */
    public static void c(String str, long j, long j2, InterfaceC0070b interfaceC0070b) throws Throwable {
        Exception exc;
        ?? r1;
        Throwable th;
        ?? r2 = interfaceC0070b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Cache cacheB = b();
            if (cacheB == null) {
                if (r2 != 0) {
                    r2.a(str, new IllegalStateException("Failed to initialize cache"));
                    return;
                }
                return;
            }
            long cachedBytes = cacheB.getCachedBytes(str, 0L, j);
            if (cachedBytes >= j) {
                if (r2 != 0) {
                    r2.a(str, cachedBytes);
                    return;
                }
                return;
            }
            if (r2 != 0) {
                r2.a(str);
            }
            try {
                CacheWriter cacheWriterA = a(str, j, j2, r2, cacheB);
                try {
                    ConcurrentHashMap concurrentHashMap = a;
                    r2 = (CacheWriter) concurrentHashMap.put(str, cacheWriterA);
                    if (r2 != 0) {
                        try {
                            r2.cancel();
                        } catch (Exception e) {
                            exc = e;
                            r1 = interfaceC0070b;
                        }
                    }
                    try {
                        try {
                            cacheWriterA.cache();
                            concurrentHashMap.remove(str, cacheWriterA);
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (interfaceC0070b != null) {
                                interfaceC0070b.b(str, j, j - cachedBytes, jElapsedRealtime2);
                                return;
                            }
                            return;
                        } catch (InterruptedIOException unused) {
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            long jB = b(str);
                            if (interfaceC0070b != null) {
                                try {
                                    interfaceC0070b.a(str, j, jB, jElapsedRealtime3);
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    a.remove(str, cacheWriterA);
                                    throw th;
                                }
                            }
                            a.remove(str, cacheWriterA);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            a.remove(str, cacheWriterA);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        a.remove(str, cacheWriterA);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    r2 = interfaceC0070b;
                    exc = e;
                    r1 = r2;
                }
            } catch (Exception e3) {
                e = e3;
                r2 = r2;
            }
        } catch (Exception e4) {
            e = e4;
        }
        exc = e;
        r1 = r2;
        if (r1 != 0) {
            r1.a(str, exc);
        }
    }

    public static long b(String str) {
        Cache cacheB = b();
        if (cacheB == null) {
            return -1L;
        }
        return cacheB.getCachedBytes(str, 0L, -1L);
    }

    public static void b(String str, long j, long j2, InterfaceC0070b interfaceC0070b) {
        com.adsurge.adn.x1.g.b.execute(new ya(str, j, j2, interfaceC0070b));
    }

    public static /* synthetic */ void a(String str, long j, long j2, InterfaceC0070b interfaceC0070b) throws Throwable {
        try {
            c(str, j, j2, interfaceC0070b);
        } catch (Exception e) {
            if (interfaceC0070b != null) {
                interfaceC0070b.a(str, e);
            }
        }
    }

    public static File a() {
        return AdSurgeAdSdk.getInstance().getContext().getDir("odc_vid_cac", 0);
    }

    public static void a(String str) {
        CacheWriter cacheWriter;
        if (!c.e() || str == null || (cacheWriter = (CacheWriter) a.remove(str)) == null) {
            return;
        }
        cacheWriter.cancel();
    }

    public static long a(long j) {
        if (j <= 0) {
            return 65536L;
        }
        long j2 = (j * 1000) / 8;
        if (j2 < 16384) {
            return 16384L;
        }
        return Math.min(j2, 1048576L);
    }

    public static boolean c(String str) {
        Cache cacheB = b();
        if (cacheB == null || cacheB.getCachedSpans(str).isEmpty()) {
            return false;
        }
        long contentLength = ContentMetadata.getContentLength(cacheB.getContentMetadata(str));
        if (contentLength != -1) {
            return cacheB.isCached(str, 0L, contentLength);
        }
        return false;
    }
}

package defpackage;

import android.os.Bundle;
import androidx.arch.core.util.Function;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.PreloadManagerListener;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.facebook.internal.x;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.video.ColorInfo;
import java.io.EOFException;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements x, Bundleable.Creator, Function, ListenerSet.IterationFinishedEvent, ChunkExtractor.Factory, CacheKeyFactory, androidx.media3.datasource.cache.CacheKeyFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    public static /* synthetic */ void c() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalArgumentException(str + ((char) i));
    }

    public static /* synthetic */ void f(long j, Object obj) throws EOFException {
        throw new EOFException("\\n not found: limit=" + j + ((Object) " content=") + obj + (char) 8230);
    }

    public static /* synthetic */ void g(long j, String str) {
        throw new IllegalStateException((str + j).toString());
    }

    public static /* synthetic */ void h(Object obj) {
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new NumberFormatException(str + obj);
    }

    public static /* synthetic */ void k(Object obj, String str, int i, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2 + ')').toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new ArrayIndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) throws IOException {
        throw new IOException(str + obj, th);
    }

    public static /* synthetic */ void n(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public static /* synthetic */ void o() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void p(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void r(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void s() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void u(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void v() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void w(String str) {
        throw new NullPointerException(str);
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        return AppLovinNativeAdImpl.lambda$getCustomTabsSettings$1((m5) obj);
    }

    @Override // com.facebook.internal.x
    public void d(boolean z) {
        if (z) {
            st stVar = st.a;
            if (lz.a.contains(st.class)) {
                return;
            }
            try {
                st.f.set(true);
                return;
            } catch (Throwable th) {
                lz.a(st.class, th);
                return;
            }
        }
        st stVar2 = st.a;
        if (lz.a.contains(st.class)) {
            return;
        }
        try {
            st.f.set(false);
        } catch (Throwable th2) {
            lz.a(st.class, th2);
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.a) {
            case 3:
                return AdPlaybackState.fromBundle(bundle);
            case 4:
                return AdPlaybackState.AdGroup.fromBundle(bundle);
            case 10:
                return AudioAttributes.lambda$static$0(bundle);
            default:
                return ColorInfo.lambda$static$0(bundle);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        BasePreloadManager.lambda$new$0((PreloadManagerListener) obj, flagSet);
    }

    @Override // androidx.media3.datasource.cache.CacheKeyFactory
    public String buildCacheKey(DataSpec dataSpec) {
        return androidx.media3.datasource.cache.CacheKeyFactory.lambda$static$0(dataSpec);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory
    public ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput, PlayerId playerId) {
        return BundledChunkExtractor.lambda$static$0(i, format, z, list, trackOutput, playerId);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
    public String buildCacheKey(com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
        return CacheKeyFactory.lambda$static$0(dataSpec);
    }
}

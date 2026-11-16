package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Trace;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import defpackage.jc1;
import defpackage.qw;
import defpackage.vq2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.MappedByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    public static final FontProviderHelper d = new FontProviderHelper();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class FontProviderHelper {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {
        public final Context a;
        public final FontRequest b;
        public final FontProviderHelper c;
        public final Object d = new Object();
        public Handler e;
        public ThreadPoolExecutor f;
        public ThreadPoolExecutor g;
        public EmojiCompat.MetadataRepoLoaderCallback h;
        public ContentObserver i;

        /* JADX INFO: renamed from: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass1 extends ContentObserver {
            @Override // android.database.ContentObserver
            public final void onChange(boolean z, Uri uri) {
                throw null;
            }
        }

        public final FontsContractCompat.FontInfo c() {
            try {
                FontProviderHelper fontProviderHelper = this.c;
                Context context = this.a;
                FontRequest fontRequest = this.b;
                fontProviderHelper.getClass();
                FontsContractCompat.FontFamilyResult fontFamilyResultA = FontsContractCompat.a(context, fontRequest);
                int i = fontFamilyResultA.a;
                if (i != 0) {
                    y.j(jc1.k(i, "fetchFonts failed (", ")"));
                    return null;
                }
                FontsContractCompat.FontInfo[] fontInfoArr = (FontsContractCompat.FontInfo[]) fontFamilyResultA.b.get(0);
                if (fontInfoArr != null && fontInfoArr.length != 0) {
                    return fontInfoArr[0];
                }
                y.j("fetchFonts failed (empty result)");
                return null;
            } catch (PackageManager.NameNotFoundException e) {
                vq2.n("provider not found", e);
                return null;
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public final void a(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            synchronized (this.d) {
                this.h = metadataRepoLoaderCallback;
            }
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new qw(0, "emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.g = threadPoolExecutor;
                        this.f = threadPoolExecutor;
                    }
                    this.f.execute(new Runnable() { // from class: androidx.emoji2.text.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = this.a;
                            synchronized (fontRequestMetadataLoader.d) {
                                try {
                                    if (fontRequestMetadataLoader.h == null) {
                                        return;
                                    }
                                    try {
                                        FontsContractCompat.FontInfo fontInfoC = fontRequestMetadataLoader.c();
                                        int i = fontInfoC.e;
                                        if (i == 2) {
                                            synchronized (fontRequestMetadataLoader.d) {
                                            }
                                        }
                                        if (i != 0) {
                                            throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                                        }
                                        try {
                                            int i2 = TraceCompat.a;
                                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                            FontRequestEmojiCompatConfig.FontProviderHelper fontProviderHelper = fontRequestMetadataLoader.c;
                                            Context context = fontRequestMetadataLoader.a;
                                            fontProviderHelper.getClass();
                                            Typeface typefaceA = TypefaceCompat.a(context, new FontsContractCompat.FontInfo[]{fontInfoC}, 0);
                                            MappedByteBuffer mappedByteBufferE = TypefaceCompatUtil.e(fontRequestMetadataLoader.a, fontInfoC.a);
                                            if (mappedByteBufferE == null || typefaceA == null) {
                                                throw new RuntimeException("Unable to open file.");
                                            }
                                            try {
                                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                MetadataRepo metadataRepo = new MetadataRepo(typefaceA, MetadataListReader.a(mappedByteBufferE));
                                                Trace.endSection();
                                                Trace.endSection();
                                                synchronized (fontRequestMetadataLoader.d) {
                                                    try {
                                                        EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = fontRequestMetadataLoader.h;
                                                        if (metadataRepoLoaderCallback2 != null) {
                                                            metadataRepoLoaderCallback2.b(metadataRepo);
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                fontRequestMetadataLoader.b();
                                            } catch (Throwable th2) {
                                                int i3 = TraceCompat.a;
                                                Trace.endSection();
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            int i4 = TraceCompat.a;
                                            Trace.endSection();
                                            throw th3;
                                        }
                                    } catch (Throwable th4) {
                                        synchronized (fontRequestMetadataLoader.d) {
                                            try {
                                                EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback3 = fontRequestMetadataLoader.h;
                                                if (metadataRepoLoaderCallback3 != null) {
                                                    metadataRepoLoaderCallback3.a(th4);
                                                }
                                                fontRequestMetadataLoader.b();
                                            } catch (Throwable th5) {
                                                throw th5;
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        FontProviderHelper fontProviderHelper = this.c;
                        Context context = this.a;
                        fontProviderHelper.getClass();
                        context.getContentResolver().unregisterContentObserver(contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public FontRequestMetadataLoader(Context context, FontRequest fontRequest) {
            Preconditions.c(context, "Context cannot be null");
            this.a = context.getApplicationContext();
            this.b = fontRequest;
            this.c = FontRequestEmojiCompatConfig.d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class RetryPolicy {
    }
}

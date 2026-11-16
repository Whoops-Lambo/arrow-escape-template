package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.annotation.RequiresApi;
import androidx.core.os.TraceCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import defpackage.qw;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class BackgroundDefaultConfig extends EmojiCompat.Config {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class BackgroundDefaultLoader implements EmojiCompat.MetadataRepoLoader {
        public final Context a;

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public final void a(final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            qw qwVar = new qw(0, "EmojiCompatInitializer");
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), qwVar);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.a
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.BackgroundDefaultLoader backgroundDefaultLoader = this.a;
                    final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = metadataRepoLoaderCallback;
                    final ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    try {
                        FontRequestEmojiCompatConfig fontRequestEmojiCompatConfigA = DefaultEmojiCompatConfig.a(backgroundDefaultLoader.a);
                        if (fontRequestEmojiCompatConfigA == null) {
                            throw new RuntimeException("EmojiCompat font provider not available on this device.");
                        }
                        FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = (FontRequestEmojiCompatConfig.FontRequestMetadataLoader) fontRequestEmojiCompatConfigA.a;
                        synchronized (fontRequestMetadataLoader.d) {
                            fontRequestMetadataLoader.f = threadPoolExecutor2;
                        }
                        fontRequestEmojiCompatConfigA.a.a(new EmojiCompat.MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.1
                            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                            public final void a(Throwable th) {
                                ThreadPoolExecutor threadPoolExecutor3 = threadPoolExecutor2;
                                try {
                                    metadataRepoLoaderCallback2.a(th);
                                } finally {
                                    threadPoolExecutor3.shutdown();
                                }
                            }

                            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                            public final void b(MetadataRepo metadataRepo) {
                                ThreadPoolExecutor threadPoolExecutor3 = threadPoolExecutor2;
                                try {
                                    metadataRepoLoaderCallback2.b(metadataRepo);
                                } finally {
                                    threadPoolExecutor3.shutdown();
                                }
                            }
                        });
                    } catch (Throwable th) {
                        metadataRepoLoaderCallback2.a(th);
                        threadPoolExecutor2.shutdown();
                    }
                }
            });
        }

        public BackgroundDefaultLoader(Context context) {
            this.a = context.getApplicationContext();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LoadEmojiCompatRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = TraceCompat.a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.k != null) {
                    EmojiCompat.a().e();
                }
            } finally {
                int i2 = TraceCompat.a;
                Trace.endSection();
            }
        }
    }

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Object objB;
        BackgroundDefaultConfig backgroundDefaultConfig = new BackgroundDefaultConfig(new BackgroundDefaultLoader(context));
        backgroundDefaultConfig.b = 1;
        if (EmojiCompat.k == null) {
            synchronized (EmojiCompat.j) {
                try {
                    if (EmojiCompat.k == null) {
                        EmojiCompat.k = new EmojiCompat(backgroundDefaultConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        AppInitializer appInitializerC = AppInitializer.c(context);
        appInitializerC.getClass();
        synchronized (AppInitializer.e) {
            try {
                objB = appInitializerC.a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = appInitializerC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final Lifecycle lifecycle = ((LifecycleOwner) objB).getLifecycle();
        lifecycle.a(new DefaultLifecycleObserver(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(LifecycleOwner lifecycleOwner) {
                (Build.VERSION.SDK_INT >= 28 ? ConcurrencyHelpers.Handler28Impl.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new LoadEmojiCompatRunnable(), 500L);
                lifecycle.c(this);
            }
        });
        return Boolean.TRUE;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}

package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
class CallbackWrapper {
    public final TypefaceCompat.ResourcesCallbackAdapter a;
    public final Executor b;

    public final void a(FontRequestWorker.TypefaceResult typefaceResult) {
        final int i = typefaceResult.b;
        Executor executor = this.b;
        final TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter = this.a;
        if (i != 0) {
            ((RequestExecutor.HandlerExecutor) executor).execute(new Runnable() { // from class: androidx.core.provider.CallbackWrapper.2
                @Override // java.lang.Runnable
                public final void run() {
                    ResourcesCompat.FontCallback fontCallback = resourcesCallbackAdapter.a;
                    if (fontCallback != null) {
                        fontCallback.b(i);
                    }
                }
            });
        } else {
            final Typeface typeface = typefaceResult.a;
            ((RequestExecutor.HandlerExecutor) executor).execute(new Runnable() { // from class: androidx.core.provider.CallbackWrapper.1
                @Override // java.lang.Runnable
                public final void run() {
                    ResourcesCompat.FontCallback fontCallback = resourcesCallbackAdapter.a;
                    if (fontCallback != null) {
                        fontCallback.c(typeface);
                    }
                }
            });
        }
    }

    public CallbackWrapper(TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter, Executor executor) {
        this.a = resourcesCallbackAdapter;
        this.b = executor;
    }
}

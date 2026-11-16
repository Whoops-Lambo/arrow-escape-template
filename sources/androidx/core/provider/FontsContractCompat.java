package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.BaseColumns;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Consumer;
import defpackage.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class FontsContractCompat {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Columns implements BaseColumns {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FontRequestCallback {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface FontRequestFailReason {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FontFamilyResult {
        public final int a;
        public final List b;

        public FontFamilyResult() {
            this.a = 1;
            this.b = Collections.singletonList(null);
        }

        public FontFamilyResult(ArrayList arrayList) {
            this.a = 0;
            this.b = arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FontInfo {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;

        public FontInfo(Uri uri, int i, int i2, boolean z, int i3) {
            uri.getClass();
            this.a = uri;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }
    }

    public static Typeface b(final Context context, List list, final int i, boolean z, int i2, Handler handler, TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter) {
        final CallbackWrapper callbackWrapper = new CallbackWrapper(resourcesCallbackAdapter, new RequestExecutor.HandlerExecutor(handler));
        if (!z) {
            final String strA = FontRequestWorker.a(i, list);
            Typeface typeface = (Typeface) FontRequestWorker.a.c(strA);
            if (typeface != null) {
                callbackWrapper.a(new FontRequestWorker.TypefaceResult(typeface));
                return typeface;
            }
            Consumer<FontRequestWorker.TypefaceResult> consumer = new Consumer<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.2
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    TypefaceResult typefaceResult = (TypefaceResult) obj;
                    if (typefaceResult == null) {
                        typefaceResult = new TypefaceResult(-3);
                    }
                    callbackWrapper.a(typefaceResult);
                }

                public AnonymousClass2() {
                }
            };
            synchronized (FontRequestWorker.c) {
                try {
                    SimpleArrayMap simpleArrayMap = FontRequestWorker.d;
                    ArrayList arrayList = (ArrayList) simpleArrayMap.get(strA);
                    if (arrayList != null) {
                        arrayList.add(consumer);
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(consumer);
                    simpleArrayMap.put(strA, arrayList2);
                    FontRequestWorker.AnonymousClass3 anonymousClass3 = new FontRequestWorker.AnonymousClass3(context, list, strA, i);
                    ThreadPoolExecutor threadPoolExecutor = FontRequestWorker.b;
                    Consumer<FontRequestWorker.TypefaceResult> consumer2 = new Consumer<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.4
                        public final /* synthetic */ String a;

                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj) {
                            TypefaceResult typefaceResult = (TypefaceResult) obj;
                            synchronized (FontRequestWorker.c) {
                                try {
                                    SimpleArrayMap simpleArrayMap2 = FontRequestWorker.d;
                                    ArrayList arrayList3 = (ArrayList) simpleArrayMap2.get(str);
                                    if (arrayList3 == null) {
                                        return;
                                    }
                                    simpleArrayMap2.remove(str);
                                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                        ((Consumer) arrayList3.get(i3)).accept(typefaceResult);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }

                        public AnonymousClass4() {
                            str = strA;
                        }
                    };
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    RequestExecutor.ReplyRunnable replyRunnable = new RequestExecutor.ReplyRunnable();
                    replyRunnable.a = anonymousClass3;
                    replyRunnable.b = consumer2;
                    replyRunnable.c = handler2;
                    threadPoolExecutor.execute(replyRunnable);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (list.size() > 1) {
            d.r("Fallbacks with blocking fetches are not supported for performance reasons");
            return null;
        }
        final FontRequest fontRequest = (FontRequest) list.get(0);
        LruCache lruCache = FontRequestWorker.a;
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = new Object[]{fontRequest}[0];
        Objects.requireNonNull(obj);
        arrayList3.add(obj);
        final String strA2 = FontRequestWorker.a(i, Collections.unmodifiableList(arrayList3));
        Typeface typeface2 = (Typeface) FontRequestWorker.a.c(strA2);
        if (typeface2 != null) {
            callbackWrapper.a(new FontRequestWorker.TypefaceResult(typeface2));
            return typeface2;
        }
        if (i2 == -1) {
            ArrayList arrayList4 = new ArrayList(1);
            Object obj2 = new Object[]{fontRequest}[0];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
            FontRequestWorker.TypefaceResult typefaceResultB = FontRequestWorker.b(context, Collections.unmodifiableList(arrayList4), strA2, i);
            callbackWrapper.a(typefaceResultB);
            return typefaceResultB.a;
        }
        try {
            try {
                FontRequestWorker.TypefaceResult typefaceResult = (FontRequestWorker.TypefaceResult) FontRequestWorker.b.submit(new Callable<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.1
                    public final /* synthetic */ String a;
                    public final /* synthetic */ Context b;
                    public final /* synthetic */ FontRequest c;
                    public final /* synthetic */ int d;

                    @Override // java.util.concurrent.Callable
                    public final TypefaceResult call() {
                        Object[] objArr = {fontRequest};
                        ArrayList arrayList5 = new ArrayList(1);
                        Object obj3 = objArr[0];
                        Objects.requireNonNull(obj3);
                        arrayList5.add(obj3);
                        return FontRequestWorker.b(context, Collections.unmodifiableList(arrayList5), str, i);
                    }

                    public AnonymousClass1() {
                        str = strA2;
                        context = context;
                        fontRequest = fontRequest;
                        i = i;
                    }
                }).get(i2, TimeUnit.MILLISECONDS);
                callbackWrapper.a(typefaceResult);
                return typefaceResult.a;
            } catch (InterruptedException e) {
                throw e;
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            } catch (TimeoutException unused) {
                throw new InterruptedException("timeout");
            }
        } catch (InterruptedException unused2) {
            callbackWrapper.a(new FontRequestWorker.TypefaceResult(-3));
            return null;
        }
    }

    public static FontFamilyResult a(Context context, FontRequest fontRequest) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{fontRequest}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return FontProvider.a(context, Collections.unmodifiableList(arrayList));
    }
}

package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.tracing.Trace;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class FontRequestWorker {
    public static final LruCache a = new LruCache(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final SimpleArrayMap d;

    /* JADX INFO: renamed from: androidx.core.provider.FontRequestWorker$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass3 implements Callable<TypefaceResult> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ List c;
        public final /* synthetic */ int d;

        @Override // java.util.concurrent.Callable
        public final TypefaceResult call() {
            try {
                return FontRequestWorker.b(this.b, this.c, this.a, this.d);
            } catch (Throwable unused) {
                return new TypefaceResult(-3);
            }
        }

        public AnonymousClass3(Context context, List list, String str, int i) {
            this.a = str;
            this.b = context;
            this.c = list;
            this.d = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class TypefaceResult {
        public final Typeface a;
        public final int b;

        public TypefaceResult(int i) {
            this.a = null;
            this.b = i;
        }

        public TypefaceResult(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }

    static {
        RequestExecutor.DefaultThreadFactory defaultThreadFactory = new RequestExecutor.DefaultThreadFactory();
        defaultThreadFactory.a = "fonts-androidx";
        defaultThreadFactory.b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), defaultThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new SimpleArrayMap(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((FontRequest) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static TypefaceResult b(Context context, List list, String str, int i) {
        int i2;
        LruCache lruCache = a;
        Trace.a("getFontSync");
        try {
            Typeface typeface = (Typeface) lruCache.c(str);
            if (typeface != null) {
                TypefaceResult typefaceResult = new TypefaceResult(typeface);
                android.os.Trace.endSection();
                return typefaceResult;
            }
            try {
                FontsContractCompat.FontFamilyResult fontFamilyResultA = FontProvider.a(context, list);
                List list2 = fontFamilyResultA.b;
                int i3 = fontFamilyResultA.a;
                if (i3 == 0) {
                    FontsContractCompat.FontInfo[] fontInfoArr = (FontsContractCompat.FontInfo[]) list2.get(0);
                    if (fontInfoArr == null || fontInfoArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = fontInfoArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = fontInfoArr[i4].e;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    TypefaceResult typefaceResult2 = new TypefaceResult(i2);
                    android.os.Trace.endSection();
                    return typefaceResult2;
                }
                Typeface typefaceA = (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) ? TypefaceCompat.a(context, (FontsContractCompat.FontInfo[]) list2.get(0), i) : TypefaceCompat.b(context, list2, i);
                if (typefaceA == null) {
                    TypefaceResult typefaceResult3 = new TypefaceResult(-3);
                    android.os.Trace.endSection();
                    return typefaceResult3;
                }
                lruCache.d(str, typefaceA);
                TypefaceResult typefaceResult4 = new TypefaceResult(typefaceA);
                android.os.Trace.endSection();
                return typefaceResult4;
            } catch (PackageManager.NameNotFoundException unused) {
                TypefaceResult typefaceResult5 = new TypefaceResult(-1);
                android.os.Trace.endSection();
                return typefaceResult5;
            }
        } catch (Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }
}

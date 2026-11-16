package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.tracing.Trace;
import defpackage.ek1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class TypefaceCompat {
    public static final TypefaceCompatBaseImpl a;
    public static final LruCache b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {
        public ResourcesCompat.FontCallback a;
    }

    static {
        Trace.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new TypefaceCompatApi29Impl();
        } else if (i >= 28) {
            a = new TypefaceCompatApi28Impl();
        } else if (i >= 26) {
            a = new TypefaceCompatApi26Impl();
        } else {
            Method method = TypefaceCompatApi24Impl.d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new TypefaceCompatApi24Impl();
            } else {
                a = new TypefaceCompatApi21Impl();
            }
        }
        b = new LruCache(16);
        android.os.Trace.endSection();
    }

    public static Typeface a(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        Trace.a("TypefaceCompat.createFromFontInfo");
        try {
            return a.b(context, fontInfoArr, i);
        } finally {
            android.os.Trace.endSection();
        }
    }

    public static Typeface b(Context context, List list, int i) {
        Trace.a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return a.c(context, list, i);
        } finally {
            android.os.Trace.endSection();
        }
    }

    public static Typeface c(Context context, FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, Resources resources, int i, String str, int i2, int i3, ResourcesCompat.FontCallback fontCallback, boolean z) {
        Typeface typefaceA;
        List listUnmodifiableList;
        int i4 = 21;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            String str2 = providerResourceEntry.e;
            Typeface typeface = null;
            if (str2 != null && !str2.isEmpty()) {
                Typeface typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                    typeface = typefaceCreate;
                }
            }
            if (typeface != null) {
                if (fontCallback != null) {
                    new Handler(Looper.getMainLooper()).post(new ek1(i4, fontCallback, typeface));
                }
                return typeface;
            }
            boolean z2 = !z ? fontCallback != null : providerResourceEntry.d != 0;
            int i5 = z ? providerResourceEntry.c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            ResourcesCallbackAdapter resourcesCallbackAdapter = new ResourcesCallbackAdapter();
            resourcesCallbackAdapter.a = fontCallback;
            FontRequest fontRequest = providerResourceEntry.b;
            FontRequest fontRequest2 = providerResourceEntry.a;
            if (fontRequest != null) {
                Object[] objArr = {fontRequest2, fontRequest};
                ArrayList arrayList = new ArrayList(2);
                for (int i6 = 0; i6 < 2; i6++) {
                    Object obj = objArr[i6];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = new Object[]{fontRequest2}[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            typefaceA = FontsContractCompat.b(context, listUnmodifiableList, i3, z2, i5, handler, resourcesCallbackAdapter);
        } else {
            typefaceA = a.a(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i3);
            if (fontCallback != null) {
                if (typefaceA != null) {
                    new Handler(Looper.getMainLooper()).post(new ek1(i4, fontCallback, typefaceA));
                } else {
                    fontCallback.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            b.d(e(resources, i, str, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceE = a.e(context, resources, i, str, i3);
        if (typefaceE != null) {
            b.d(e(resources, i, str, i2, i3), typefaceE);
        }
        return typefaceE;
    }

    public static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}

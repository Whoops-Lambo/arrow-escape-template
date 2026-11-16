package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.TypefaceCompat;
import defpackage.ek1;
import defpackage.s;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ResourcesCompat {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api29Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ColorStateListCacheKey {
        public final Resources a;
        public final Resources.Theme b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ColorStateListCacheKey.class == obj.getClass()) {
                ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
                if (this.a.equals(colorStateListCacheKey.a) && Objects.equals(this.b, colorStateListCacheKey.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        public ColorStateListCacheKey(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class FontCallback {
        public abstract void b(int i);

        public abstract void c(Typeface typeface);

        public final void a(int i) {
            new Handler(Looper.getMainLooper()).post(new s(i, 4, this));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ThemeCompat {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @RequiresApi
        public static class Api23Impl {
            public static final Object a = new Object();
            public static Method b;
            public static boolean c;
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @RequiresApi
        public static class Api29Impl {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public static void a(Resources.Theme theme) {
            Method method;
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.a(theme);
                return;
            }
            synchronized (Api23Impl.a) {
                if (Api23Impl.c) {
                    method = Api23Impl.b;
                    if (method != null) {
                        method.invoke(theme, null);
                    }
                } else {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                        Api23Impl.b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                    }
                    Api23Impl.c = true;
                    method = Api23Impl.b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            Api23Impl.b = null;
                        }
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ColorStateListCacheEntry {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int iHashCode;
            this.a = colorStateList;
            this.b = configuration;
            if (theme == null) {
                iHashCode = 0;
            } else {
                iHashCode = theme.hashCode();
            }
            this.c = iHashCode;
        }
    }

    public static ColorStateList a(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        ColorStateListCacheEntry colorStateListCacheEntry;
        ColorStateListCacheKey colorStateListCacheKey = new ColorStateListCacheKey(resources, theme);
        synchronized (c) {
            try {
                SparseArray sparseArray = (SparseArray) b.get(colorStateListCacheKey);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (colorStateListCacheEntry = (ColorStateListCacheEntry) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (colorStateListCacheEntry.b.equals(resources.getConfiguration())) {
                        if (theme != null || colorStateListCacheEntry.c != 0) {
                            if (theme == null || colorStateListCacheEntry.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = colorStateListCacheEntry.a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListA = ColorStateListInflaterCompat.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (c) {
            try {
                WeakHashMap weakHashMap = b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(colorStateListCacheKey);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(colorStateListCacheKey, sparseArray2);
                }
                sparseArray2.append(i, new ColorStateListCacheEntry(colorStateListA, colorStateListCacheKey.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceC = null;
        if (string.startsWith("res/")) {
            Typeface typeface = (Typeface) TypefaceCompat.b.c(TypefaceCompat.e(resources, i, string, typedValue.assetCookie, i2));
            int i3 = 21;
            if (typeface != null) {
                if (fontCallback != null) {
                    new Handler(Looper.getMainLooper()).post(new ek1(i3, fontCallback, typeface));
                }
                typefaceC = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        FontResourcesParserCompat.FamilyResourceEntry familyResourceEntryA = FontResourcesParserCompat.a(resources.getXml(i), resources);
                        if (familyResourceEntryA == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (fontCallback != null) {
                                fontCallback.a(-3);
                            }
                        } else {
                            try {
                                typefaceC = TypefaceCompat.c(context, familyResourceEntryA, resources, i, string, typedValue.assetCookie, i2, fontCallback, z);
                            } catch (IOException e) {
                                e = e;
                                string = string;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                                if (fontCallback != null) {
                                    fontCallback.a(-3);
                                }
                            } catch (XmlPullParserException e2) {
                                e = e2;
                                string = string;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e);
                                if (fontCallback != null) {
                                    fontCallback.a(-3);
                                }
                            }
                        }
                    } else {
                        Typeface typefaceD = TypefaceCompat.d(context, resources, i, string, typedValue.assetCookie, i2);
                        if (fontCallback != null) {
                            if (typefaceD != null) {
                                new Handler(Looper.getMainLooper()).post(new ek1(i3, fontCallback, typefaceD));
                            } else {
                                fontCallback.a(-3);
                            }
                        }
                        typefaceC = typefaceD;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (XmlPullParserException e4) {
                    e = e4;
                }
            }
        } else if (fontCallback != null) {
            fontCallback.a(-3);
        }
        if (typefaceC != null || fontCallback != null || z2) {
            return typefaceC;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }
}

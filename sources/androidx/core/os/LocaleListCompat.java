package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class LocaleListCompat {
    public static final LocaleListCompat b = f(new LocaleList(new Locale[0]));
    public final LocaleListPlatformWrapper a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
        public static final /* synthetic */ int a = 0;

        static {
            new Locale("en", "XA");
            new Locale("ar", "XB");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
    }

    public static LocaleListCompat a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = Api21Impl.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return f(new LocaleList(localeArr));
    }

    public static LocaleListCompat f(LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final boolean c() {
        return this.a.a.isEmpty();
    }

    public final int d() {
        return this.a.a.size();
    }

    public final String e() {
        return this.a.a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocaleListCompat) {
            return this.a.equals(((LocaleListCompat) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }

    public LocaleListCompat(LocaleListPlatformWrapper localeListPlatformWrapper) {
        this.a = localeListPlatformWrapper;
    }
}

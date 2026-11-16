package androidx.core.os;

import androidx.annotation.RequiresApi;
import defpackage.d;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class LocaleListCompatWrapper implements LocaleListInterface {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Object getLocaleList() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        LocaleListCompat localeListCompat = LocaleListCompat.b;
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            return;
        }
        if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else if (strArrSplit.length == 1) {
            new Locale(strArrSplit[0]);
        } else {
            d.r("Can not parse language tag: [en-Latn]");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocaleListCompatWrapper) {
            throw null;
        }
        return false;
    }
}

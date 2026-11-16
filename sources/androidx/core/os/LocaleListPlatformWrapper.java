package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi
final class LocaleListPlatformWrapper implements LocaleListInterface {
    public final LocaleList a;

    public final boolean equals(Object obj) {
        return this.a.equals(((LocaleListInterface) obj).getLocaleList());
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Object getLocaleList() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public LocaleListPlatformWrapper(LocaleList localeList) {
        this.a = localeList;
    }
}

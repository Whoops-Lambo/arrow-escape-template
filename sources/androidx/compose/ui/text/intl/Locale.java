package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Locale {
    public final PlatformLocale a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.a.a().equals(((Locale) obj).a.a());
    }

    public final int hashCode() {
        return this.a.a().hashCode();
    }

    public final String toString() {
        return this.a.a();
    }

    public Locale(String str) {
        str.getClass();
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
        localeForLanguageTag.getClass();
        this.a = new AndroidLocale(localeForLanguageTag);
    }

    public Locale(PlatformLocale platformLocale) {
        platformLocale.getClass();
        this.a = platformLocale;
    }
}

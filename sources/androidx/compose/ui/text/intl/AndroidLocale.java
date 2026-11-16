package androidx.compose.ui.text.intl;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidLocale implements PlatformLocale {
    public final java.util.Locale a;

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    public final String a() {
        String languageTag = this.a.toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    public AndroidLocale(java.util.Locale locale) {
        this.a = locale;
    }
}

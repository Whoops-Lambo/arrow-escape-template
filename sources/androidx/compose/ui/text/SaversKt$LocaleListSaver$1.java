package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import defpackage.rc1;
import defpackage.zr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/intl/LocaleList;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class SaversKt$LocaleListSaver$1 extends rc1 implements zr0 {
    public static final SaversKt$LocaleListSaver$1 i = new SaversKt$LocaleListSaver$1(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        LocaleList localeList = (LocaleList) obj2;
        saverScope.getClass();
        localeList.getClass();
        ArrayList arrayList = localeList.a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(SaversKt.a((Locale) arrayList.get(i2), SaversKt.r, saverScope));
        }
        return arrayList2;
    }
}

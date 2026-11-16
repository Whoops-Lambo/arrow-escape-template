package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ax {
    public static final Set a = n8.q0(new String[]{"AR", "BG", "BS", "CA", "CS", "CY", "DA", "DE", "EL", "EN", "ES", "ET", "EU", "FI", "FR", "GL", "HE", "HI", "HR", "HU", "ID", "IT", "JA", "KA", "KO", "LT", "LV", "MK", "MS", "MT", "NL", "NO", "PL", "PT", "PT_BR", "RO", "RU", "SK", "SL", "SQ", "SR", "SR_LATN", "SV", "TH", "TL", "TR", "UK", "VI", "ZH", "ZH-HANT"});

    public static String a(String str) {
        Object next;
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        List listN0 = dk2.n0(upperCase, new String[]{"_"}, 0, 6);
        Iterator it = a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!dk2.O((String) next, (CharSequence) listN0.get(0), false));
        String str2 = (String) next;
        if (str2 == null) {
            return null;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}

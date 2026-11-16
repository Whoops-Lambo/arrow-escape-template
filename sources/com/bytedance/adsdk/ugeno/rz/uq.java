package com.bytedance.adsdk.ugeno.rz;

import android.icu.number.FormattedNumber;
import android.icu.number.LocalizedNumberFormatter;
import android.icu.number.Notation;
import android.icu.number.NumberFormatter;
import android.icu.number.Precision;
import android.icu.text.NumberFormat;
import android.icu.util.Currency;
import android.os.Build;
import defpackage.uh3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class uq {
    private static List<rz> kgy(List<rz> list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        rz rzVar = list.get(0);
        rz rzVar2 = new rz(rzVar.kgy(), rzVar.ahm(), rzVar.rz(), rzVar.uq());
        for (int i2 = 1; i2 < list.size(); i2++) {
            rz rzVar3 = list.get(i2);
            boolean z = rzVar2.uq() == rzVar3.rz();
            boolean zEquals = rzVar2.kgy().equals(rzVar3.kgy());
            boolean z2 = (rzVar2.kgy().equals("currency") && rzVar3.kgy().equals("literal")) || (rzVar2.kgy().equals("literal") && rzVar3.kgy().equals("currency"));
            boolean z3 = (rzVar2.kgy().equals("compact") && rzVar3.kgy().equals("literal")) || (rzVar2.kgy().equals("literal") && rzVar3.kgy().equals("compact"));
            if (z && (zEquals || z2 || z3)) {
                rzVar2.kgy(z2 ? "currency" : z3 ? "compact" : rzVar2.kgy());
                rzVar2.ahm(rzVar2.ahm() + rzVar3.ahm());
                rzVar2.kgy(rzVar3.uq());
            } else {
                arrayList.add(rzVar2);
                rzVar2 = new rz(rzVar3.kgy(), rzVar3.ahm(), rzVar3.rz(), rzVar3.uq());
            }
        }
        arrayList.add(rzVar2);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rz rzVar4 = (rz) obj;
            if (!"literal".equals(rzVar4.kgy())) {
                arrayList2.add(rzVar4);
            }
        }
        return arrayList2;
    }

    private static FormattedNumber rz(BigDecimal bigDecimal, String str, Locale locale, int i, int i2, int i3) {
        LocalizedNumberFormatter localizedNumberFormatterD;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            return null;
        }
        Currency currency = Currency.getInstance(str);
        Notation notationSimple = Notation.simple();
        if (i2 == 1) {
            notationSimple = Notation.simple();
        } else if (i2 == 2) {
            notationSimple = i4 == 30 ? Notation.simple() : Notation.compactShort();
        }
        LocalizedNumberFormatter localizedNumberFormatterD2 = uh3.d(uh3.d(uh3.d(NumberFormatter.withLocale(locale).unit(currency)).notation(notationSimple)).precision(Precision.maxFraction(i3)));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        LocalizedNumberFormatter localizedNumberFormatterD3 = uh3.d(localizedNumberFormatterD2.roundingMode(RoundingMode.HALF_UP));
        if (i == 1) {
            NumberFormatter.UnitWidth unused = NumberFormatter.UnitWidth.ISO_CODE;
            localizedNumberFormatterD = uh3.d(localizedNumberFormatterD3.unitWidth(NumberFormatter.UnitWidth.ISO_CODE));
        } else if (i == 3) {
            NumberFormatter.UnitWidth unused2 = NumberFormatter.UnitWidth.NARROW;
            localizedNumberFormatterD = uh3.d(localizedNumberFormatterD3.unitWidth(NumberFormatter.UnitWidth.NARROW));
        } else if (i != 4) {
            NumberFormatter.UnitWidth unused3 = NumberFormatter.UnitWidth.SHORT;
            localizedNumberFormatterD = uh3.d(localizedNumberFormatterD3.unitWidth(NumberFormatter.UnitWidth.SHORT));
        } else {
            NumberFormatter.UnitWidth unused4 = NumberFormatter.UnitWidth.FULL_NAME;
            localizedNumberFormatterD = uh3.d(localizedNumberFormatterD3.unitWidth(NumberFormatter.UnitWidth.FULL_NAME));
        }
        return localizedNumberFormatterD.format(bigDecimal);
    }

    public static List<rz> ahm(BigDecimal bigDecimal, String str, Locale locale, int i, int i2, int i3) {
        try {
            FormattedNumber formattedNumberRz = rz(bigDecimal, str, locale, i, i2, i3);
            if (formattedNumberRz != null) {
                return kgy(formattedNumberRz);
            }
        } catch (Throwable unused) {
        }
        return Collections.EMPTY_LIST;
    }

    private static List<rz> kgy(FormattedNumber formattedNumber) {
        NumberFormat.Field field;
        if (Build.VERSION.SDK_INT < 30) {
            return Collections.EMPTY_LIST;
        }
        if (formattedNumber != null) {
            String string = formattedNumber.toString();
            if (!string.isEmpty()) {
                AttributedCharacterIterator characterIterator = formattedNumber.toCharacterIterator();
                ArrayList arrayList = new ArrayList();
                int beginIndex = characterIterator.getBeginIndex();
                while (beginIndex < characterIterator.getEndIndex()) {
                    characterIterator.setIndex(beginIndex);
                    int runStart = characterIterator.getRunStart();
                    int runLimit = characterIterator.getRunLimit();
                    Iterator<AttributedCharacterIterator.Attribute> it = characterIterator.getAttributes().keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            field = null;
                            break;
                        }
                        AttributedCharacterIterator.Attribute next = it.next();
                        if (next instanceof NumberFormat.Field) {
                            field = (NumberFormat.Field) next;
                            break;
                        }
                    }
                    arrayList.add(new rz(kgy(field), string.substring(runStart, runLimit), runStart, runLimit));
                    beginIndex = runLimit;
                }
                return kgy(arrayList);
            }
            return Collections.EMPTY_LIST;
        }
        return Collections.EMPTY_LIST;
    }

    private static String kgy(NumberFormat.Field field) {
        if (field == null) {
            return "literal";
        }
        if (field.toString().toLowerCase().contains("compact")) {
            return "compact";
        }
        if (field.equals(NumberFormat.Field.CURRENCY)) {
            return "currency";
        }
        if (!field.equals(NumberFormat.Field.INTEGER) && !field.equals(NumberFormat.Field.GROUPING_SEPARATOR) && !field.equals(NumberFormat.Field.SIGN)) {
            if (!field.equals(NumberFormat.Field.FRACTION) && !field.equals(NumberFormat.Field.DECIMAL_SEPARATOR)) {
                return "literal";
            }
            return "fraction";
        }
        return "integer";
    }

    public static String kgy(BigDecimal bigDecimal, String str, Locale locale, int i, int i2, int i3) {
        try {
            FormattedNumber formattedNumberRz = rz(bigDecimal, str, locale, i, i2, i3);
            if (formattedNumberRz != null) {
                return formattedNumberRz.toString();
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }
}

package com.bytedance.adsdk.ugeno.rz;

import defpackage.nj;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class kgy {
    private static List<rz> kgy(List<rz> list) {
        rz rzVar;
        rz next;
        ArrayList arrayList = new ArrayList();
        Iterator<rz> it = list.iterator();
        loop0: while (true) {
            rzVar = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                next = it.next();
                if ("literal".equals(next.kgy())) {
                    rzVar = next;
                } else {
                    if (rzVar != null) {
                        break;
                    }
                    arrayList.add(next);
                }
            }
            if ("currency".equals(next.kgy())) {
                arrayList.add(new rz("currency", rzVar.ahm() + next.ahm(), rzVar.rz(), next.uq()));
            } else {
                if (arrayList.isEmpty() || !"currency".equals(((rz) nj.h(1, arrayList)).kgy())) {
                    arrayList.add(new rz("integer", rzVar.ahm(), rzVar.rz(), rzVar.uq()));
                } else {
                    rz rzVar2 = (rz) arrayList.remove(arrayList.size() - 1);
                    arrayList.add(new rz("currency", rzVar2.ahm() + rzVar.ahm(), rzVar2.rz(), rzVar.uq()));
                }
                arrayList.add(next);
            }
        }
        if (rzVar != null && !arrayList.isEmpty()) {
            rz rzVar3 = (rz) arrayList.remove(arrayList.size() - 1);
            if ("currency".equals(rzVar3.kgy())) {
                arrayList.add(new rz("currency", rzVar3.ahm() + rzVar.ahm(), rzVar3.rz(), rzVar.uq()));
                return arrayList;
            }
            arrayList.add(rzVar3);
            arrayList.add(new rz("integer", rzVar.ahm(), rzVar.rz(), rzVar.uq()));
        }
        return arrayList;
    }

    public static List<rz> ahm(BigDecimal bigDecimal, String str, Locale locale, int i, int i2, int i3) {
        try {
            DecimalFormat decimalFormatKgy = kgy(Currency.getInstance(str), locale, i, i2, i3);
            return kgy(decimalFormatKgy.format(bigDecimal), decimalFormatKgy.formatToCharacterIterator(bigDecimal));
        } catch (Throwable unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private static DecimalFormat kgy(Currency currency, Locale locale, int i, int i2, int i3) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(locale);
        decimalFormat.setCurrency(currency);
        if (i == 1) {
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(currency.getCurrencyCode());
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            String pattern = decimalFormat.toPattern();
            if (pattern.contains("¤#") || pattern.contains("¤0")) {
                pattern = pattern.replace("¤#", "¤ #").replace("¤0", "¤ 0");
            }
            if (pattern.contains("#¤") || pattern.contains("0¤")) {
                pattern = pattern.replace("#¤", "# ¤").replace("0¤", "0 ¤");
            }
            if (pattern.contains("¤-#") || pattern.contains("¤-0")) {
                pattern = pattern.replace("¤-#", "¤ -#").replace("¤-0", "¤ -0");
            }
            if (pattern.contains("-¤#") || pattern.contains("-¤0")) {
                pattern = pattern.replace("-¤#", "- ¤#").replace("-¤0", "- ¤0");
            }
            decimalFormat.applyPattern(pattern);
        } else if (i == 4) {
            String displayName = currency.getDisplayName(locale);
            try {
                decimalFormat.applyPattern(((android.icu.text.DecimalFormat) android.icu.text.NumberFormat.getInstance(locale, 6)).toPattern().replace("¤¤¤", "¤").replace("¤¤", "¤"));
            } catch (Throwable unused) {
            }
            DecimalFormatSymbols decimalFormatSymbols2 = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols2.setCurrencySymbol(displayName);
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols2);
        }
        decimalFormat.setMaximumFractionDigits(i3);
        decimalFormat.setMinimumFractionDigits(0);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    private static List<rz> kgy(String str, AttributedCharacterIterator attributedCharacterIterator) {
        String strKgy;
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        int i = -1;
        for (int beginIndex = attributedCharacterIterator.getBeginIndex(); beginIndex < attributedCharacterIterator.getEndIndex(); beginIndex++) {
            attributedCharacterIterator.setIndex(beginIndex);
            Set<AttributedCharacterIterator.Attribute> setKeySet = attributedCharacterIterator.getAttributes().keySet();
            if (!setKeySet.isEmpty()) {
                strKgy = kgy((NumberFormat.Field) setKeySet.iterator().next());
            } else {
                strKgy = "literal";
            }
            if (!strKgy.equals(str2)) {
                if (str2 != null) {
                    arrayList.add(new rz(str2, str.substring(i, beginIndex), i, beginIndex));
                }
                i = beginIndex;
                str2 = strKgy;
            }
        }
        if (str2 != null) {
            arrayList.add(new rz(str2, str.substring(i, attributedCharacterIterator.getEndIndex()), i, attributedCharacterIterator.getEndIndex()));
        }
        return kgy(arrayList);
    }

    private static String kgy(NumberFormat.Field field) {
        if (field.equals(NumberFormat.Field.CURRENCY)) {
            return "currency";
        }
        if (field.equals(NumberFormat.Field.INTEGER) || field.equals(NumberFormat.Field.GROUPING_SEPARATOR) || field.equals(NumberFormat.Field.SIGN)) {
            return "integer";
        }
        return (field.equals(NumberFormat.Field.FRACTION) || field.equals(NumberFormat.Field.DECIMAL_SEPARATOR)) ? "fraction" : "integer";
    }

    public static String kgy(BigDecimal bigDecimal, String str, Locale locale, int i, int i2, int i3) {
        try {
            return kgy(Currency.getInstance(str), locale, i, i2, i3).format(bigDecimal);
        } catch (Throwable unused) {
            return "";
        }
    }
}

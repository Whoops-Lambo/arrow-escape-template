package androidx.compose.ui.text;

import defpackage.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AnnotatedStringKt {
    public static final AnnotatedString a = new AnnotatedString(6, "", null);

    public static final ArrayList a(int i, int i2, List list) {
        if (i > i2) {
            d.k(") should be less than or equal to end (", "start (", i, i2);
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            AnnotatedString.Range range = (AnnotatedString.Range) obj;
            if (b(i, i2, range.b, range.c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range2 = (AnnotatedString.Range) arrayList.get(i4);
            arrayList2.add(new AnnotatedString.Range(range2.a, range2.d, Math.max(i, range2.b) - i, Math.min(i2, range2.c) - i));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0027  */
    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:23:0x002c  */
    /* JADX WARN: Code duplicated, block: B:24:0x002e  */
    public static final boolean b(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (Math.max(i, i3) >= Math.min(i2, i4)) {
            if (i <= i3 && i4 <= i2) {
                if (i2 == i4) {
                    if (i3 == i4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i == i2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3 != z4) {
                        if (i3 <= i) {
                            if (i4 == i2) {
                                if (i == i2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (i3 == i4) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z == z2) {
                                }
                            }
                        }
                        return false;
                    }
                }
            } else {
                if (i3 <= i && i2 <= i4) {
                    if (i4 == i2) {
                        if (i == i2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i3 == i4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z == z2) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}

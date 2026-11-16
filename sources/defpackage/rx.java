package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class rx {
    public static final rx e = new rx("*", "*", gg0.a);
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof rx)) {
            return false;
        }
        rx rxVar = (rx) obj;
        return kk2.E(this.c, rxVar.c, true) && kk2.E(this.d, rxVar.d, true) && s71.b(this.b, rxVar.b);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.c.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.d.toLowerCase(locale);
        lowerCase2.getClass();
        int iHashCode2 = lowerCase2.hashCode();
        return (this.b.hashCode() * 31) + iHashCode2 + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x012d A[LOOP:4: B:44:0x00ca->B:65:0x012d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb;
        int length;
        int i;
        char cCharAt;
        int length2;
        int i2;
        List<qw0> list = this.b;
        boolean zIsEmpty = list.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        int length3 = str.length();
        int length4 = 0;
        for (qw0 qw0Var : list) {
            length4 += qw0Var.b.length() + qw0Var.a.length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length3 + length4);
        sb2.append(str);
        int size = list.size() - 1;
        if (size >= 0) {
            int i3 = 0;
            while (true) {
                qw0 qw0Var2 = (qw0) list.get(i3);
                sb2.append("; ");
                sb2.append(qw0Var2.a);
                sb2.append("=");
                String str2 = qw0Var2.b;
                Set set = rw0.a;
                if (str2.length() != 0) {
                    if (str2.length() < 2) {
                        length2 = str2.length();
                        i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                if (rw0.a.contains(Character.valueOf(str2.charAt(i2)))) {
                                    sb = new StringBuilder("\"");
                                    length = str2.length();
                                    for (i = 0; i < length; i++) {
                                        cCharAt = str2.charAt(i);
                                        if (cCharAt == '\t') {
                                            sb.append("\\t");
                                        } else if (cCharAt == '\n') {
                                            sb.append("\\n");
                                        } else if (cCharAt == '\r') {
                                            sb.append("\\r");
                                        } else if (cCharAt == '\"') {
                                            sb.append("\\\"");
                                        } else if (cCharAt != '\\') {
                                            sb.append(cCharAt);
                                        } else {
                                            sb.append("\\\\");
                                        }
                                    }
                                    sb.append("\"");
                                    sb2.append(sb.toString());
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        if (str2.length() == 0) {
                            vq2.s("Char sequence is empty.");
                            return null;
                        }
                        if (str2.charAt(0) != '\"') {
                            length2 = str2.length();
                            i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    if (rw0.a.contains(Character.valueOf(str2.charAt(i2)))) {
                                        sb = new StringBuilder("\"");
                                        length = str2.length();
                                        while (i < length) {
                                            cCharAt = str2.charAt(i);
                                            if (cCharAt == '\t') {
                                                sb.append("\\t");
                                            } else if (cCharAt == '\n') {
                                                sb.append("\\n");
                                            } else if (cCharAt == '\r') {
                                                sb.append("\\r");
                                            } else if (cCharAt == '\"') {
                                                sb.append("\\\"");
                                            } else if (cCharAt != '\\') {
                                                sb.append(cCharAt);
                                            } else {
                                                sb.append("\\\\");
                                            }
                                        }
                                        sb.append("\"");
                                        sb2.append(sb.toString());
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        } else {
                            if (str2.length() == 0) {
                                vq2.s("Char sequence is empty.");
                                return null;
                            }
                            if (str2.charAt(str2.length() - 1) != '\"') {
                                length2 = str2.length();
                                i2 = 0;
                                while (true) {
                                    if (i2 < length2) {
                                        if (rw0.a.contains(Character.valueOf(str2.charAt(i2)))) {
                                            sb = new StringBuilder("\"");
                                            length = str2.length();
                                            while (i < length) {
                                                cCharAt = str2.charAt(i);
                                                if (cCharAt == '\t') {
                                                    sb.append("\\t");
                                                } else if (cCharAt == '\n') {
                                                    sb.append("\\n");
                                                } else if (cCharAt == '\r') {
                                                    sb.append("\\r");
                                                } else if (cCharAt == '\"') {
                                                    sb.append("\\\"");
                                                } else if (cCharAt != '\\') {
                                                    sb.append(cCharAt);
                                                } else {
                                                    sb.append("\\\\");
                                                }
                                            }
                                            sb.append("\"");
                                            sb2.append(sb.toString());
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            } else {
                                int i4 = 1;
                                while (true) {
                                    int iW = dk2.W(str2, '\"', i4, 4);
                                    if (iW != str2.length() - 1) {
                                        int i5 = 0;
                                        for (int i6 = iW - 1; str2.charAt(i6) == '\\'; i6--) {
                                            i5++;
                                        }
                                        if (i5 % 2 == 0) {
                                            length2 = str2.length();
                                            i2 = 0;
                                            while (true) {
                                                if (i2 < length2) {
                                                    if (rw0.a.contains(Character.valueOf(str2.charAt(i2)))) {
                                                        sb = new StringBuilder("\"");
                                                        length = str2.length();
                                                        while (i < length) {
                                                            cCharAt = str2.charAt(i);
                                                            if (cCharAt == '\t') {
                                                                sb.append("\\t");
                                                            } else if (cCharAt == '\n') {
                                                                sb.append("\\n");
                                                            } else if (cCharAt == '\r') {
                                                                sb.append("\\r");
                                                            } else if (cCharAt == '\"') {
                                                                sb.append("\\\"");
                                                            } else if (cCharAt != '\\') {
                                                                sb.append(cCharAt);
                                                            } else {
                                                                sb.append("\\\\");
                                                            }
                                                        }
                                                        sb.append("\"");
                                                        sb2.append(sb.toString());
                                                    } else {
                                                        i2++;
                                                    }
                                                }
                                            }
                                        } else {
                                            i4 = iW + 1;
                                            if (i4 >= str2.length()) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    sb2.append(str2);
                } else {
                    sb = new StringBuilder("\"");
                    length = str2.length();
                    while (i < length) {
                        cCharAt = str2.charAt(i);
                        if (cCharAt == '\t') {
                            sb.append("\\t");
                        } else if (cCharAt == '\n') {
                            sb.append("\\n");
                        } else if (cCharAt == '\r') {
                            sb.append("\\r");
                        } else if (cCharAt == '\"') {
                            sb.append("\\\"");
                        } else if (cCharAt != '\\') {
                            sb.append(cCharAt);
                        } else {
                            sb.append("\\\\");
                        }
                    }
                    sb.append("\"");
                    sb2.append(sb.toString());
                }
                if (i3 != size) {
                    i3++;
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rx(String str, String str2, List list) {
        this(str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
        this.c = str;
        this.d = str2;
    }

    public final String a(String str) {
        str.getClass();
        List list = this.b;
        int iO = eu.o(list);
        if (iO >= 0) {
            int i = 0;
            while (true) {
                qw0 qw0Var = (qw0) list.get(i);
                if (kk2.E(qw0Var.a, str, true)) {
                    return qw0Var.b;
                }
                if (i != iO) {
                    i++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public rx(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public rx(String str, String str2, String str3, ArrayList arrayList) {
        this(str3, arrayList);
        this.c = str;
        this.d = str2;
    }
}

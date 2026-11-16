package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@z92(with = c13.class)
public final class a13 implements Serializable {

    @NotNull
    public static final z03 Companion = new z03();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final ny2 g;
    public final ny2 h;
    public final cm2 i;
    public final cm2 j;
    public final cm2 k;
    public final cm2 l;
    public final cm2 m;

    private final Object writeReplace() {
        z80 z80Var = new z80();
        z80Var.a = b13.a;
        z80Var.b = this;
        return z80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a13.class != obj.getClass()) {
            return false;
        }
        return this.f.equals(((a13) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return this.f;
    }

    public a13(ny2 ny2Var, String str, int i, ArrayList arrayList, yt1 yt1Var, String str2, String str3, String str4, boolean z, String str5) {
        str.getClass();
        yt1Var.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        if (i >= 0 && i < 65536) {
            final int i2 = 1;
            new cm2(new ia2(i2, arrayList));
            this.g = ny2Var;
            this.h = ny2Var == null ? ny2.c : ny2Var;
            this.i = new cm2(new v5(28, arrayList, this));
            final int i3 = 0;
            this.j = new cm2(new sr0(this) { // from class: y03
                public final /* synthetic */ a13 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sr0
                public final Object invoke() {
                    int i4 = i3;
                    a13 a13Var = this.b;
                    switch (i4) {
                        case 0:
                            String str6 = a13Var.f;
                            int iW = dk2.W(str6, '?', 0, 6) + 1;
                            if (iW == 0) {
                                return "";
                            }
                            int iW2 = dk2.W(str6, '#', iW, 4);
                            return iW2 == -1 ? str6.substring(iW) : str6.substring(iW, iW2);
                        case 1:
                            String str7 = a13Var.f;
                            int iW3 = dk2.W(str7, '/', a13Var.h.a.length() + 3, 4);
                            if (iW3 == -1) {
                                return "";
                            }
                            int iW4 = dk2.W(str7, '#', iW3, 4);
                            return iW4 == -1 ? str7.substring(iW3) : str7.substring(iW3, iW4);
                        case 2:
                            String str8 = a13Var.f;
                            String str9 = a13Var.c;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = a13Var.h.a.length() + 3;
                            return str8.substring(length, dk2.Y(str8, new char[]{':', '@'}, length, false));
                        case 3:
                            String str10 = a13Var.f;
                            String str11 = a13Var.d;
                            if (str11 == null) {
                                return null;
                            }
                            return str11.length() == 0 ? "" : str10.substring(dk2.W(str10, ':', a13Var.h.a.length() + 3, 4) + 1, dk2.W(str10, '@', 0, 6));
                        default:
                            String str12 = a13Var.f;
                            int iW5 = dk2.W(str12, '#', 0, 6) + 1;
                            return iW5 == 0 ? "" : str12.substring(iW5);
                    }
                }
            });
            new cm2(new sr0(this) { // from class: y03
                public final /* synthetic */ a13 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sr0
                public final Object invoke() {
                    int i4 = i2;
                    a13 a13Var = this.b;
                    switch (i4) {
                        case 0:
                            String str6 = a13Var.f;
                            int iW = dk2.W(str6, '?', 0, 6) + 1;
                            if (iW == 0) {
                                return "";
                            }
                            int iW2 = dk2.W(str6, '#', iW, 4);
                            return iW2 == -1 ? str6.substring(iW) : str6.substring(iW, iW2);
                        case 1:
                            String str7 = a13Var.f;
                            int iW3 = dk2.W(str7, '/', a13Var.h.a.length() + 3, 4);
                            if (iW3 == -1) {
                                return "";
                            }
                            int iW4 = dk2.W(str7, '#', iW3, 4);
                            return iW4 == -1 ? str7.substring(iW3) : str7.substring(iW3, iW4);
                        case 2:
                            String str8 = a13Var.f;
                            String str9 = a13Var.c;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = a13Var.h.a.length() + 3;
                            return str8.substring(length, dk2.Y(str8, new char[]{':', '@'}, length, false));
                        case 3:
                            String str10 = a13Var.f;
                            String str11 = a13Var.d;
                            if (str11 == null) {
                                return null;
                            }
                            return str11.length() == 0 ? "" : str10.substring(dk2.W(str10, ':', a13Var.h.a.length() + 3, 4) + 1, dk2.W(str10, '@', 0, 6));
                        default:
                            String str12 = a13Var.f;
                            int iW5 = dk2.W(str12, '#', 0, 6) + 1;
                            return iW5 == 0 ? "" : str12.substring(iW5);
                    }
                }
            });
            final int i4 = 2;
            this.k = new cm2(new sr0(this) { // from class: y03
                public final /* synthetic */ a13 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sr0
                public final Object invoke() {
                    int i5 = i4;
                    a13 a13Var = this.b;
                    switch (i5) {
                        case 0:
                            String str6 = a13Var.f;
                            int iW = dk2.W(str6, '?', 0, 6) + 1;
                            if (iW == 0) {
                                return "";
                            }
                            int iW2 = dk2.W(str6, '#', iW, 4);
                            return iW2 == -1 ? str6.substring(iW) : str6.substring(iW, iW2);
                        case 1:
                            String str7 = a13Var.f;
                            int iW3 = dk2.W(str7, '/', a13Var.h.a.length() + 3, 4);
                            if (iW3 == -1) {
                                return "";
                            }
                            int iW4 = dk2.W(str7, '#', iW3, 4);
                            return iW4 == -1 ? str7.substring(iW3) : str7.substring(iW3, iW4);
                        case 2:
                            String str8 = a13Var.f;
                            String str9 = a13Var.c;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = a13Var.h.a.length() + 3;
                            return str8.substring(length, dk2.Y(str8, new char[]{':', '@'}, length, false));
                        case 3:
                            String str10 = a13Var.f;
                            String str11 = a13Var.d;
                            if (str11 == null) {
                                return null;
                            }
                            return str11.length() == 0 ? "" : str10.substring(dk2.W(str10, ':', a13Var.h.a.length() + 3, 4) + 1, dk2.W(str10, '@', 0, 6));
                        default:
                            String str12 = a13Var.f;
                            int iW5 = dk2.W(str12, '#', 0, 6) + 1;
                            return iW5 == 0 ? "" : str12.substring(iW5);
                    }
                }
            });
            final int i5 = 3;
            this.l = new cm2(new sr0(this) { // from class: y03
                public final /* synthetic */ a13 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sr0
                public final Object invoke() {
                    int i6 = i5;
                    a13 a13Var = this.b;
                    switch (i6) {
                        case 0:
                            String str6 = a13Var.f;
                            int iW = dk2.W(str6, '?', 0, 6) + 1;
                            if (iW == 0) {
                                return "";
                            }
                            int iW2 = dk2.W(str6, '#', iW, 4);
                            return iW2 == -1 ? str6.substring(iW) : str6.substring(iW, iW2);
                        case 1:
                            String str7 = a13Var.f;
                            int iW3 = dk2.W(str7, '/', a13Var.h.a.length() + 3, 4);
                            if (iW3 == -1) {
                                return "";
                            }
                            int iW4 = dk2.W(str7, '#', iW3, 4);
                            return iW4 == -1 ? str7.substring(iW3) : str7.substring(iW3, iW4);
                        case 2:
                            String str8 = a13Var.f;
                            String str9 = a13Var.c;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = a13Var.h.a.length() + 3;
                            return str8.substring(length, dk2.Y(str8, new char[]{':', '@'}, length, false));
                        case 3:
                            String str10 = a13Var.f;
                            String str11 = a13Var.d;
                            if (str11 == null) {
                                return null;
                            }
                            return str11.length() == 0 ? "" : str10.substring(dk2.W(str10, ':', a13Var.h.a.length() + 3, 4) + 1, dk2.W(str10, '@', 0, 6));
                        default:
                            String str12 = a13Var.f;
                            int iW5 = dk2.W(str12, '#', 0, 6) + 1;
                            return iW5 == 0 ? "" : str12.substring(iW5);
                    }
                }
            });
            final int i6 = 4;
            this.m = new cm2(new sr0(this) { // from class: y03
                public final /* synthetic */ a13 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sr0
                public final Object invoke() {
                    int i7 = i6;
                    a13 a13Var = this.b;
                    switch (i7) {
                        case 0:
                            String str6 = a13Var.f;
                            int iW = dk2.W(str6, '?', 0, 6) + 1;
                            if (iW == 0) {
                                return "";
                            }
                            int iW2 = dk2.W(str6, '#', iW, 4);
                            return iW2 == -1 ? str6.substring(iW) : str6.substring(iW, iW2);
                        case 1:
                            String str7 = a13Var.f;
                            int iW3 = dk2.W(str7, '/', a13Var.h.a.length() + 3, 4);
                            if (iW3 == -1) {
                                return "";
                            }
                            int iW4 = dk2.W(str7, '#', iW3, 4);
                            return iW4 == -1 ? str7.substring(iW3) : str7.substring(iW3, iW4);
                        case 2:
                            String str8 = a13Var.f;
                            String str9 = a13Var.c;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = a13Var.h.a.length() + 3;
                            return str8.substring(length, dk2.Y(str8, new char[]{':', '@'}, length, false));
                        case 3:
                            String str10 = a13Var.f;
                            String str11 = a13Var.d;
                            if (str11 == null) {
                                return null;
                            }
                            return str11.length() == 0 ? "" : str10.substring(dk2.W(str10, ':', a13Var.h.a.length() + 3, 4) + 1, dk2.W(str10, '@', 0, 6));
                        default:
                            String str12 = a13Var.f;
                            int iW5 = dk2.W(str12, '#', 0, 6) + 1;
                            return iW5 == 0 ? "" : str12.substring(iW5);
                    }
                }
            });
            return;
        }
        ak1.n(pv1.k(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        throw null;
    }
}

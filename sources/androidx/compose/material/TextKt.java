package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextKt {
    public static final DynamicProvidableCompositionLocal a = new DynamicProvidableCompositionLocal(SnapshotStateKt.k(), TextKt$LocalTextStyle$1.i);

    /* JADX WARN: Code duplicated, block: B:100:0x0135  */
    /* JADX WARN: Code duplicated, block: B:102:0x013f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:106:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x017e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0188  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01de  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:152:0x0203  */
    /* JADX WARN: Code duplicated, block: B:153:0x0208  */
    /* JADX WARN: Code duplicated, block: B:155:0x0210  */
    /* JADX WARN: Code duplicated, block: B:156:0x0213  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:161:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129  */
    public static final void b(String str, Modifier modifier, long j, long j2, FontWeight fontWeight, FontFamily fontFamily, long j3, TextAlign textAlign, long j4, int i, boolean z, int i2, wr0 wr0Var, TextStyle textStyle, Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        long j5;
        int i8;
        int i9;
        long j6;
        int i10;
        int i11;
        int i12;
        int i13;
        FontWeight fontWeight2;
        int i14;
        int i15;
        FontFamily fontFamily2;
        int i16;
        int i17;
        int i18;
        TextAlign textAlign2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Modifier modifier2;
        long j7;
        long j8;
        TextAlign textAlign3;
        boolean z2;
        int i31;
        int i32;
        int i33;
        wr0 wr0Var2;
        TextStyle textStyle2;
        int i34;
        long j9;
        long j10;
        long jB;
        Modifier modifier3;
        ComposerImpl composerImpl;
        TextStyle textStyle3;
        int i35;
        int i36;
        boolean z3;
        long j11;
        FontWeight fontWeight3;
        TextAlign textAlign4;
        long j12;
        long j13;
        FontFamily fontFamily3;
        long j14;
        RecomposeScopeImpl recomposeScopeImplT;
        str.getClass();
        ComposerImpl composerImplT = composer.t(-366126944);
        if ((i3 & 14) == 0) {
            i6 = (composerImplT.l(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i37 = i5 & 2;
        if (i37 == 0) {
            if ((i3 & 112) == 0) {
                i6 |= composerImplT.l(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 != 0) {
                if ((i3 & 896) == 0) {
                    j5 = j;
                    if (composerImplT.q(j5)) {
                        i8 = 256;
                    } else {
                        i8 = 128;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    i6 |= 3072;
                    j6 = j2;
                } else {
                    j6 = j2;
                    if ((i3 & 7168) == 0) {
                        if (composerImplT.q(j6)) {
                            i10 = 2048;
                        } else {
                            i10 = 1024;
                        }
                        i6 |= i10;
                    }
                }
                i11 = i6 | 24576;
                i12 = i5 & 32;
                i13 = 65536;
                if (i12 != 0) {
                    if ((458752 & i3) == 0) {
                        fontWeight2 = fontWeight;
                        if (composerImplT.l(fontWeight2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i11 |= i14;
                    }
                    i15 = i5 & 64;
                    if (i15 != 0) {
                        i11 |= 1572864;
                        fontFamily2 = fontFamily;
                    } else {
                        fontFamily2 = fontFamily;
                        if ((i3 & 3670016) == 0) {
                            if (composerImplT.l(fontFamily2)) {
                                i16 = 1048576;
                            } else {
                                i16 = 524288;
                            }
                            i11 |= i16;
                        }
                    }
                    i17 = i11 | 113246208;
                    i18 = i5 & 512;
                    if (i18 != 0) {
                        if ((1879048192 & i3) == 0) {
                            textAlign2 = textAlign;
                            if (composerImplT.l(textAlign2)) {
                                i19 = 536870912;
                            } else {
                                i19 = 268435456;
                            }
                            i17 |= i19;
                        }
                        i20 = i4 | 6;
                        i21 = i5 & 2048;
                        if (i21 != 0) {
                            i20 = i4 | 54;
                        } else if ((i4 & 112) != 0) {
                            if (composerImplT.p(i)) {
                                i22 = 32;
                            } else {
                                i22 = 16;
                            }
                            i20 |= i22;
                        }
                        i23 = i20;
                        i24 = i23 | 384;
                        i25 = i5 & 8192;
                        if (i25 != 0) {
                            i26 = i23 | 3456;
                        } else {
                            if ((i4 & 7168) != 0) {
                                if (composerImplT.p(i2)) {
                                    i27 = 2048;
                                } else {
                                    i27 = 1024;
                                }
                                i24 |= i27;
                            }
                            i26 = i24;
                        }
                        i28 = i26 | 24576;
                        if ((i5 & 32768) == 0) {
                            i29 = i28;
                            if (composerImplT.l(textStyle)) {
                                i13 = 131072;
                            }
                        } else {
                            i29 = i28;
                        }
                        i30 = i29 | i13;
                        if ((i17 & 1533916891) != 306783378 && (i30 & 374491) == 74898 && composerImplT.b()) {
                            composerImplT.h();
                            modifier3 = modifier;
                            z3 = z;
                            i36 = i2;
                            wr0Var2 = wr0Var;
                            textStyle3 = textStyle;
                            composerImpl = composerImplT;
                            j11 = j5;
                            j14 = j4;
                            textAlign4 = textAlign2;
                            fontWeight3 = fontWeight2;
                            j12 = j6;
                            fontFamily3 = fontFamily2;
                            j13 = j3;
                            i35 = i;
                        } else {
                            composerImplT.r0();
                            if ((i3 & 1) != 0 || composerImplT.X()) {
                                if (i37 != 0) {
                                    modifier2 = Modifier.Companion.a;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    j7 = Color.i;
                                } else {
                                    j7 = j5;
                                }
                                if (i9 != 0) {
                                    j6 = TextUnit.c;
                                }
                                if (i12 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                }
                                j8 = TextUnit.c;
                                textAlign3 = i18 == 0 ? textAlign2 : null;
                                z2 = true;
                                if (i21 != 0) {
                                    i31 = 1;
                                } else {
                                    i31 = i;
                                }
                                if (i25 != 0) {
                                    i32 = Integer.MAX_VALUE;
                                } else {
                                    i32 = i2;
                                }
                                i33 = i5 & 32768;
                                wr0Var2 = TextKt$Text$1.i;
                                if (i33 != 0) {
                                    i30 &= -458753;
                                    textStyle2 = (TextStyle) composerImplT.v(a);
                                } else {
                                    textStyle2 = textStyle;
                                }
                                i34 = i31;
                                j9 = j8;
                            } else {
                                composerImplT.h();
                                if ((i5 & 32768) != 0) {
                                    i30 &= -458753;
                                }
                                modifier2 = modifier;
                                j9 = j4;
                                i34 = i;
                                i32 = i2;
                                wr0Var2 = wr0Var;
                                textStyle2 = textStyle;
                                textAlign3 = textAlign2;
                                j7 = j5;
                                j8 = j3;
                                z2 = z;
                            }
                            composerImplT.S();
                            Modifier modifier4 = modifier2;
                            composerImplT.B(1557613088);
                            j10 = Color.i;
                            if (j7 != j10) {
                                jB = j7;
                            } else {
                                jB = textStyle2.b();
                                if (jB == j10) {
                                    jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                                }
                            }
                            composerImplT.R(false);
                            TextStyle textStyle4 = textStyle2;
                            int i38 = i30 << 9;
                            int i39 = i34;
                            int i40 = i32;
                            boolean z4 = z2;
                            wr0 wr0Var3 = wr0Var2;
                            BasicTextKt.a(str, modifier4, textStyle4.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var3, i39, z4, i40, composerImplT, (i17 & 126) | 3072 | (i38 & 57344) | 196608 | (i38 & 3670016));
                            modifier3 = modifier4;
                            composerImpl = composerImplT;
                            textStyle3 = textStyle4;
                            FontFamily fontFamily4 = fontFamily2;
                            i35 = i39;
                            long j15 = j9;
                            i36 = i32;
                            z3 = z2;
                            j11 = j7;
                            fontWeight3 = fontWeight2;
                            textAlign4 = textAlign3;
                            j12 = j6;
                            j13 = j8;
                            fontFamily3 = fontFamily4;
                            j14 = j15;
                        }
                        recomposeScopeImplT = composerImpl.T();
                        if (recomposeScopeImplT == null) {
                            return;
                        }
                        recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
                    }
                    i17 = i11 | 918552576;
                    textAlign2 = textAlign;
                    i20 = i4 | 6;
                    i21 = i5 & 2048;
                    if (i21 != 0) {
                        i20 = i4 | 54;
                    } else if ((i4 & 112) != 0) {
                        if (composerImplT.p(i)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i20 |= i22;
                    }
                    i23 = i20;
                    i24 = i23 | 384;
                    i25 = i5 & 8192;
                    if (i25 != 0) {
                        i26 = i23 | 3456;
                    } else {
                        if ((i4 & 7168) != 0) {
                            if (composerImplT.p(i2)) {
                                i27 = 2048;
                            } else {
                                i27 = 1024;
                            }
                            i24 |= i27;
                        }
                        i26 = i24;
                    }
                    i28 = i26 | 24576;
                    if ((i5 & 32768) == 0) {
                        i29 = i28;
                        if (composerImplT.l(textStyle)) {
                            i13 = 131072;
                        }
                    } else {
                        i29 = i28;
                    }
                    i30 = i29 | i13;
                    if ((i17 & 1533916891) != 306783378) {
                        composerImplT.r0();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        } else {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        }
                        composerImplT.S();
                        Modifier modifier5 = modifier2;
                        composerImplT.B(1557613088);
                        j10 = Color.i;
                        if (j7 != j10) {
                            jB = j7;
                        } else {
                            jB = textStyle2.b();
                            if (jB == j10) {
                                jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                            }
                        }
                        composerImplT.R(false);
                        TextStyle textStyle5 = textStyle2;
                        int i310 = i30 << 9;
                        int i311 = i34;
                        int i41 = i32;
                        boolean z5 = z2;
                        wr0 wr0Var4 = wr0Var2;
                        BasicTextKt.a(str, modifier5, textStyle5.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var4, i311, z5, i41, composerImplT, (i17 & 126) | 3072 | (i310 & 57344) | 196608 | (i310 & 3670016));
                        modifier3 = modifier5;
                        composerImpl = composerImplT;
                        textStyle3 = textStyle5;
                        FontFamily fontFamily5 = fontFamily2;
                        i35 = i311;
                        long j16 = j9;
                        i36 = i32;
                        z3 = z2;
                        j11 = j7;
                        fontWeight3 = fontWeight2;
                        textAlign4 = textAlign3;
                        j12 = j6;
                        j13 = j8;
                        fontFamily3 = fontFamily5;
                        j14 = j16;
                    } else {
                        composerImplT.r0();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        } else {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        }
                        composerImplT.S();
                        Modifier modifier6 = modifier2;
                        composerImplT.B(1557613088);
                        j10 = Color.i;
                        if (j7 != j10) {
                            jB = j7;
                        } else {
                            jB = textStyle2.b();
                            if (jB == j10) {
                                jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                            }
                        }
                        composerImplT.R(false);
                        TextStyle textStyle6 = textStyle2;
                        int i312 = i30 << 9;
                        int i313 = i34;
                        int i42 = i32;
                        boolean z6 = z2;
                        wr0 wr0Var5 = wr0Var2;
                        BasicTextKt.a(str, modifier6, textStyle6.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var5, i313, z6, i42, composerImplT, (i17 & 126) | 3072 | (i312 & 57344) | 196608 | (i312 & 3670016));
                        modifier3 = modifier6;
                        composerImpl = composerImplT;
                        textStyle3 = textStyle6;
                        FontFamily fontFamily6 = fontFamily2;
                        i35 = i313;
                        long j17 = j9;
                        i36 = i32;
                        z3 = z2;
                        j11 = j7;
                        fontWeight3 = fontWeight2;
                        textAlign4 = textAlign3;
                        j12 = j6;
                        j13 = j8;
                        fontFamily3 = fontFamily6;
                        j14 = j17;
                    }
                    recomposeScopeImplT = composerImpl.T();
                    if (recomposeScopeImplT == null) {
                        return;
                    }
                    recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
                }
                i11 = 221184 | i6;
                fontWeight2 = fontWeight;
                i15 = i5 & 64;
                if (i15 != 0) {
                    i11 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 3670016) == 0) {
                        if (composerImplT.l(fontFamily2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i11 |= i16;
                    }
                }
                i17 = i11 | 113246208;
                i18 = i5 & 512;
                if (i18 != 0) {
                    if ((1879048192 & i3) == 0) {
                        textAlign2 = textAlign;
                        if (composerImplT.l(textAlign2)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i17 |= i19;
                    }
                    i20 = i4 | 6;
                    i21 = i5 & 2048;
                    if (i21 != 0) {
                        i20 = i4 | 54;
                    } else if ((i4 & 112) != 0) {
                        if (composerImplT.p(i)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i20 |= i22;
                    }
                    i23 = i20;
                    i24 = i23 | 384;
                    i25 = i5 & 8192;
                    if (i25 != 0) {
                        i26 = i23 | 3456;
                    } else {
                        if ((i4 & 7168) != 0) {
                            if (composerImplT.p(i2)) {
                                i27 = 2048;
                            } else {
                                i27 = 1024;
                            }
                            i24 |= i27;
                        }
                        i26 = i24;
                    }
                    i28 = i26 | 24576;
                    if ((i5 & 32768) == 0) {
                        i29 = i28;
                        if (composerImplT.l(textStyle)) {
                            i13 = 131072;
                        }
                    } else {
                        i29 = i28;
                    }
                    i30 = i29 | i13;
                    if ((i17 & 1533916891) != 306783378) {
                        composerImplT.r0();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        } else {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        }
                        composerImplT.S();
                        Modifier modifier7 = modifier2;
                        composerImplT.B(1557613088);
                        j10 = Color.i;
                        if (j7 != j10) {
                            jB = j7;
                        } else {
                            jB = textStyle2.b();
                            if (jB == j10) {
                                jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                            }
                        }
                        composerImplT.R(false);
                        TextStyle textStyle7 = textStyle2;
                        int i314 = i30 << 9;
                        int i315 = i34;
                        int i43 = i32;
                        boolean z7 = z2;
                        wr0 wr0Var6 = wr0Var2;
                        BasicTextKt.a(str, modifier7, textStyle7.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var6, i315, z7, i43, composerImplT, (i17 & 126) | 3072 | (i314 & 57344) | 196608 | (i314 & 3670016));
                        modifier3 = modifier7;
                        composerImpl = composerImplT;
                        textStyle3 = textStyle7;
                        FontFamily fontFamily7 = fontFamily2;
                        i35 = i315;
                        long j18 = j9;
                        i36 = i32;
                        z3 = z2;
                        j11 = j7;
                        fontWeight3 = fontWeight2;
                        textAlign4 = textAlign3;
                        j12 = j6;
                        j13 = j8;
                        fontFamily3 = fontFamily7;
                        j14 = j18;
                    } else {
                        composerImplT.r0();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        } else {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        }
                        composerImplT.S();
                        Modifier modifier8 = modifier2;
                        composerImplT.B(1557613088);
                        j10 = Color.i;
                        if (j7 != j10) {
                            jB = j7;
                        } else {
                            jB = textStyle2.b();
                            if (jB == j10) {
                                jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                            }
                        }
                        composerImplT.R(false);
                        TextStyle textStyle8 = textStyle2;
                        int i316 = i30 << 9;
                        int i317 = i34;
                        int i44 = i32;
                        boolean z8 = z2;
                        wr0 wr0Var7 = wr0Var2;
                        BasicTextKt.a(str, modifier8, textStyle8.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var7, i317, z8, i44, composerImplT, (i17 & 126) | 3072 | (i316 & 57344) | 196608 | (i316 & 3670016));
                        modifier3 = modifier8;
                        composerImpl = composerImplT;
                        textStyle3 = textStyle8;
                        FontFamily fontFamily8 = fontFamily2;
                        i35 = i317;
                        long j19 = j9;
                        i36 = i32;
                        z3 = z2;
                        j11 = j7;
                        fontWeight3 = fontWeight2;
                        textAlign4 = textAlign3;
                        j12 = j6;
                        j13 = j8;
                        fontFamily3 = fontFamily8;
                        j14 = j19;
                    }
                    recomposeScopeImplT = composerImpl.T();
                    if (recomposeScopeImplT == null) {
                        return;
                    }
                    recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
                }
                i17 = i11 | 918552576;
                textAlign2 = textAlign;
                i20 = i4 | 6;
                i21 = i5 & 2048;
                if (i21 != 0) {
                    i20 = i4 | 54;
                } else if ((i4 & 112) != 0) {
                    if (composerImplT.p(i)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                i24 = i23 | 384;
                i25 = i5 & 8192;
                if (i25 != 0) {
                    i26 = i23 | 3456;
                } else {
                    if ((i4 & 7168) != 0) {
                        if (composerImplT.p(i2)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i24 |= i27;
                    }
                    i26 = i24;
                }
                i28 = i26 | 24576;
                if ((i5 & 32768) == 0) {
                    i29 = i28;
                    if (composerImplT.l(textStyle)) {
                        i13 = 131072;
                    }
                } else {
                    i29 = i28;
                }
                i30 = i29 | i13;
                if ((i17 & 1533916891) != 306783378) {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier9 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle9 = textStyle2;
                    int i318 = i30 << 9;
                    int i319 = i34;
                    int i45 = i32;
                    boolean z9 = z2;
                    wr0 wr0Var8 = wr0Var2;
                    BasicTextKt.a(str, modifier9, textStyle9.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var8, i319, z9, i45, composerImplT, (i17 & 126) | 3072 | (i318 & 57344) | 196608 | (i318 & 3670016));
                    modifier3 = modifier9;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle9;
                    FontFamily fontFamily9 = fontFamily2;
                    i35 = i319;
                    long j110 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily9;
                    j14 = j110;
                } else {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier10 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle10 = textStyle2;
                    int i3110 = i30 << 9;
                    int i3111 = i34;
                    int i46 = i32;
                    boolean z10 = z2;
                    wr0 wr0Var9 = wr0Var2;
                    BasicTextKt.a(str, modifier10, textStyle10.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var9, i3111, z10, i46, composerImplT, (i17 & 126) | 3072 | (i3110 & 57344) | 196608 | (i3110 & 3670016));
                    modifier3 = modifier10;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle10;
                    FontFamily fontFamily10 = fontFamily2;
                    i35 = i3111;
                    long j111 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily10;
                    j14 = j111;
                }
                recomposeScopeImplT = composerImpl.T();
                if (recomposeScopeImplT == null) {
                    return;
                }
                recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
            }
            i6 |= 384;
            j5 = j;
            i9 = i5 & 8;
            if (i9 != 0) {
                i6 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i3 & 7168) == 0) {
                    if (composerImplT.q(j6)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i6 |= i10;
                }
            }
            i11 = i6 | 24576;
            i12 = i5 & 32;
            i13 = 65536;
            if (i12 != 0) {
                if ((458752 & i3) == 0) {
                    fontWeight2 = fontWeight;
                    if (composerImplT.l(fontWeight2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i11 |= i14;
                }
                i15 = i5 & 64;
                if (i15 != 0) {
                    i11 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 3670016) == 0) {
                        if (composerImplT.l(fontFamily2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i11 |= i16;
                    }
                }
                i17 = i11 | 113246208;
                i18 = i5 & 512;
                if (i18 != 0) {
                    if ((1879048192 & i3) == 0) {
                        textAlign2 = textAlign;
                        if (composerImplT.l(textAlign2)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i17 |= i19;
                    }
                    i20 = i4 | 6;
                    i21 = i5 & 2048;
                    if (i21 != 0) {
                        i20 = i4 | 54;
                    } else if ((i4 & 112) != 0) {
                        if (composerImplT.p(i)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i20 |= i22;
                    }
                    i23 = i20;
                    i24 = i23 | 384;
                    i25 = i5 & 8192;
                    if (i25 != 0) {
                        i26 = i23 | 3456;
                    } else {
                        if ((i4 & 7168) != 0) {
                            if (composerImplT.p(i2)) {
                                i27 = 2048;
                            } else {
                                i27 = 1024;
                            }
                            i24 |= i27;
                        }
                        i26 = i24;
                    }
                    i28 = i26 | 24576;
                    if ((i5 & 32768) == 0) {
                        i29 = i28;
                        if (composerImplT.l(textStyle)) {
                            i13 = 131072;
                        }
                    } else {
                        i29 = i28;
                    }
                    i30 = i29 | i13;
                    if ((i17 & 1533916891) != 306783378) {
                        composerImplT.r0();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        } else {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        }
                        composerImplT.S();
                        Modifier modifier11 = modifier2;
                        composerImplT.B(1557613088);
                        j10 = Color.i;
                        if (j7 != j10) {
                            jB = j7;
                        } else {
                            jB = textStyle2.b();
                            if (jB == j10) {
                                jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                            }
                        }
                        composerImplT.R(false);
                        TextStyle textStyle11 = textStyle2;
                        int i3112 = i30 << 9;
                        int i3113 = i34;
                        int i47 = i32;
                        boolean z11 = z2;
                        wr0 wr0Var10 = wr0Var2;
                        BasicTextKt.a(str, modifier11, textStyle11.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var10, i3113, z11, i47, composerImplT, (i17 & 126) | 3072 | (i3112 & 57344) | 196608 | (i3112 & 3670016));
                        modifier3 = modifier11;
                        composerImpl = composerImplT;
                        textStyle3 = textStyle11;
                        FontFamily fontFamily11 = fontFamily2;
                        i35 = i3113;
                        long j112 = j9;
                        i36 = i32;
                        z3 = z2;
                        j11 = j7;
                        fontWeight3 = fontWeight2;
                        textAlign4 = textAlign3;
                        j12 = j6;
                        j13 = j8;
                        fontFamily3 = fontFamily11;
                        j14 = j112;
                    } else {
                        composerImplT.r0();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        } else {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        }
                        composerImplT.S();
                        Modifier modifier12 = modifier2;
                        composerImplT.B(1557613088);
                        j10 = Color.i;
                        if (j7 != j10) {
                            jB = j7;
                        } else {
                            jB = textStyle2.b();
                            if (jB == j10) {
                                jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                            }
                        }
                        composerImplT.R(false);
                        TextStyle textStyle12 = textStyle2;
                        int i3114 = i30 << 9;
                        int i3115 = i34;
                        int i48 = i32;
                        boolean z12 = z2;
                        wr0 wr0Var11 = wr0Var2;
                        BasicTextKt.a(str, modifier12, textStyle12.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var11, i3115, z12, i48, composerImplT, (i17 & 126) | 3072 | (i3114 & 57344) | 196608 | (i3114 & 3670016));
                        modifier3 = modifier12;
                        composerImpl = composerImplT;
                        textStyle3 = textStyle12;
                        FontFamily fontFamily12 = fontFamily2;
                        i35 = i3115;
                        long j113 = j9;
                        i36 = i32;
                        z3 = z2;
                        j11 = j7;
                        fontWeight3 = fontWeight2;
                        textAlign4 = textAlign3;
                        j12 = j6;
                        j13 = j8;
                        fontFamily3 = fontFamily12;
                        j14 = j113;
                    }
                    recomposeScopeImplT = composerImpl.T();
                    if (recomposeScopeImplT == null) {
                        return;
                    }
                    recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
                }
                i17 = i11 | 918552576;
                textAlign2 = textAlign;
                i20 = i4 | 6;
                i21 = i5 & 2048;
                if (i21 != 0) {
                    i20 = i4 | 54;
                } else if ((i4 & 112) != 0) {
                    if (composerImplT.p(i)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                i24 = i23 | 384;
                i25 = i5 & 8192;
                if (i25 != 0) {
                    i26 = i23 | 3456;
                } else {
                    if ((i4 & 7168) != 0) {
                        if (composerImplT.p(i2)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i24 |= i27;
                    }
                    i26 = i24;
                }
                i28 = i26 | 24576;
                if ((i5 & 32768) == 0) {
                    i29 = i28;
                    if (composerImplT.l(textStyle)) {
                        i13 = 131072;
                    }
                } else {
                    i29 = i28;
                }
                i30 = i29 | i13;
                if ((i17 & 1533916891) != 306783378) {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier13 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle13 = textStyle2;
                    int i3116 = i30 << 9;
                    int i3117 = i34;
                    int i49 = i32;
                    boolean z13 = z2;
                    wr0 wr0Var12 = wr0Var2;
                    BasicTextKt.a(str, modifier13, textStyle13.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var12, i3117, z13, i49, composerImplT, (i17 & 126) | 3072 | (i3116 & 57344) | 196608 | (i3116 & 3670016));
                    modifier3 = modifier13;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle13;
                    FontFamily fontFamily13 = fontFamily2;
                    i35 = i3117;
                    long j114 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily13;
                    j14 = j114;
                } else {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier14 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle14 = textStyle2;
                    int i3118 = i30 << 9;
                    int i3119 = i34;
                    int i410 = i32;
                    boolean z14 = z2;
                    wr0 wr0Var13 = wr0Var2;
                    BasicTextKt.a(str, modifier14, textStyle14.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var13, i3119, z14, i410, composerImplT, (i17 & 126) | 3072 | (i3118 & 57344) | 196608 | (i3118 & 3670016));
                    modifier3 = modifier14;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle14;
                    FontFamily fontFamily14 = fontFamily2;
                    i35 = i3119;
                    long j115 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily14;
                    j14 = j115;
                }
                recomposeScopeImplT = composerImpl.T();
                if (recomposeScopeImplT == null) {
                    return;
                }
                recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
            }
            i11 = 221184 | i6;
            fontWeight2 = fontWeight;
            i15 = i5 & 64;
            if (i15 != 0) {
                i11 |= 1572864;
                fontFamily2 = fontFamily;
            } else {
                fontFamily2 = fontFamily;
                if ((i3 & 3670016) == 0) {
                    if (composerImplT.l(fontFamily2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i11 |= i16;
                }
            }
            i17 = i11 | 113246208;
            i18 = i5 & 512;
            if (i18 != 0) {
                if ((1879048192 & i3) == 0) {
                    textAlign2 = textAlign;
                    if (composerImplT.l(textAlign2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i17 |= i19;
                }
                i20 = i4 | 6;
                i21 = i5 & 2048;
                if (i21 != 0) {
                    i20 = i4 | 54;
                } else if ((i4 & 112) != 0) {
                    if (composerImplT.p(i)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                i24 = i23 | 384;
                i25 = i5 & 8192;
                if (i25 != 0) {
                    i26 = i23 | 3456;
                } else {
                    if ((i4 & 7168) != 0) {
                        if (composerImplT.p(i2)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i24 |= i27;
                    }
                    i26 = i24;
                }
                i28 = i26 | 24576;
                if ((i5 & 32768) == 0) {
                    i29 = i28;
                    if (composerImplT.l(textStyle)) {
                        i13 = 131072;
                    }
                } else {
                    i29 = i28;
                }
                i30 = i29 | i13;
                if ((i17 & 1533916891) != 306783378) {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier15 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle15 = textStyle2;
                    int i31110 = i30 << 9;
                    int i31111 = i34;
                    int i411 = i32;
                    boolean z15 = z2;
                    wr0 wr0Var14 = wr0Var2;
                    BasicTextKt.a(str, modifier15, textStyle15.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var14, i31111, z15, i411, composerImplT, (i17 & 126) | 3072 | (i31110 & 57344) | 196608 | (i31110 & 3670016));
                    modifier3 = modifier15;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle15;
                    FontFamily fontFamily15 = fontFamily2;
                    i35 = i31111;
                    long j116 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily15;
                    j14 = j116;
                } else {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier16 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle16 = textStyle2;
                    int i31112 = i30 << 9;
                    int i31113 = i34;
                    int i412 = i32;
                    boolean z16 = z2;
                    wr0 wr0Var15 = wr0Var2;
                    BasicTextKt.a(str, modifier16, textStyle16.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var15, i31113, z16, i412, composerImplT, (i17 & 126) | 3072 | (i31112 & 57344) | 196608 | (i31112 & 3670016));
                    modifier3 = modifier16;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle16;
                    FontFamily fontFamily16 = fontFamily2;
                    i35 = i31113;
                    long j117 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily16;
                    j14 = j117;
                }
                recomposeScopeImplT = composerImpl.T();
                if (recomposeScopeImplT == null) {
                    return;
                }
                recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
            }
            i17 = i11 | 918552576;
            textAlign2 = textAlign;
            i20 = i4 | 6;
            i21 = i5 & 2048;
            if (i21 != 0) {
                i20 = i4 | 54;
            } else if ((i4 & 112) != 0) {
                if (composerImplT.p(i)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            i23 = i20;
            i24 = i23 | 384;
            i25 = i5 & 8192;
            if (i25 != 0) {
                i26 = i23 | 3456;
            } else {
                if ((i4 & 7168) != 0) {
                    if (composerImplT.p(i2)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i24 |= i27;
                }
                i26 = i24;
            }
            i28 = i26 | 24576;
            if ((i5 & 32768) == 0) {
                i29 = i28;
                if (composerImplT.l(textStyle)) {
                    i13 = 131072;
                }
            } else {
                i29 = i28;
            }
            i30 = i29 | i13;
            if ((i17 & 1533916891) != 306783378) {
                composerImplT.r0();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                } else {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                }
                composerImplT.S();
                Modifier modifier17 = modifier2;
                composerImplT.B(1557613088);
                j10 = Color.i;
                if (j7 != j10) {
                    jB = j7;
                } else {
                    jB = textStyle2.b();
                    if (jB == j10) {
                        jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                    }
                }
                composerImplT.R(false);
                TextStyle textStyle17 = textStyle2;
                int i31114 = i30 << 9;
                int i31115 = i34;
                int i413 = i32;
                boolean z17 = z2;
                wr0 wr0Var16 = wr0Var2;
                BasicTextKt.a(str, modifier17, textStyle17.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var16, i31115, z17, i413, composerImplT, (i17 & 126) | 3072 | (i31114 & 57344) | 196608 | (i31114 & 3670016));
                modifier3 = modifier17;
                composerImpl = composerImplT;
                textStyle3 = textStyle17;
                FontFamily fontFamily17 = fontFamily2;
                i35 = i31115;
                long j118 = j9;
                i36 = i32;
                z3 = z2;
                j11 = j7;
                fontWeight3 = fontWeight2;
                textAlign4 = textAlign3;
                j12 = j6;
                j13 = j8;
                fontFamily3 = fontFamily17;
                j14 = j118;
            } else {
                composerImplT.r0();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                } else {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                }
                composerImplT.S();
                Modifier modifier18 = modifier2;
                composerImplT.B(1557613088);
                j10 = Color.i;
                if (j7 != j10) {
                    jB = j7;
                } else {
                    jB = textStyle2.b();
                    if (jB == j10) {
                        jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                    }
                }
                composerImplT.R(false);
                TextStyle textStyle18 = textStyle2;
                int i31116 = i30 << 9;
                int i31117 = i34;
                int i414 = i32;
                boolean z18 = z2;
                wr0 wr0Var17 = wr0Var2;
                BasicTextKt.a(str, modifier18, textStyle18.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var17, i31117, z18, i414, composerImplT, (i17 & 126) | 3072 | (i31116 & 57344) | 196608 | (i31116 & 3670016));
                modifier3 = modifier18;
                composerImpl = composerImplT;
                textStyle3 = textStyle18;
                FontFamily fontFamily18 = fontFamily2;
                i35 = i31117;
                long j119 = j9;
                i36 = i32;
                z3 = z2;
                j11 = j7;
                fontWeight3 = fontWeight2;
                textAlign4 = textAlign3;
                j12 = j6;
                j13 = j8;
                fontFamily3 = fontFamily18;
                j14 = j119;
            }
            recomposeScopeImplT = composerImpl.T();
            if (recomposeScopeImplT == null) {
                return;
            }
            recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
        }
        i6 |= 48;
        i7 = i5 & 4;
        if (i7 != 0) {
            if ((i3 & 896) == 0) {
                j5 = j;
                if (composerImplT.q(j5)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i6 |= i8;
            }
            i9 = i5 & 8;
            if (i9 != 0) {
                i6 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i3 & 7168) == 0) {
                    if (composerImplT.q(j6)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i6 |= i10;
                }
            }
            i11 = i6 | 24576;
            i12 = i5 & 32;
            i13 = 65536;
            if (i12 != 0) {
                if ((458752 & i3) == 0) {
                    fontWeight2 = fontWeight;
                    if (composerImplT.l(fontWeight2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i11 |= i14;
                }
                i15 = i5 & 64;
                if (i15 != 0) {
                    i11 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 3670016) == 0) {
                        if (composerImplT.l(fontFamily2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i11 |= i16;
                    }
                }
                i17 = i11 | 113246208;
                i18 = i5 & 512;
                if (i18 != 0) {
                    if ((1879048192 & i3) == 0) {
                        textAlign2 = textAlign;
                        if (composerImplT.l(textAlign2)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i17 |= i19;
                    }
                    i20 = i4 | 6;
                    i21 = i5 & 2048;
                    if (i21 != 0) {
                        i20 = i4 | 54;
                    } else if ((i4 & 112) != 0) {
                        if (composerImplT.p(i)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i20 |= i22;
                    }
                    i23 = i20;
                    i24 = i23 | 384;
                    i25 = i5 & 8192;
                    if (i25 != 0) {
                        i26 = i23 | 3456;
                    } else {
                        if ((i4 & 7168) != 0) {
                            if (composerImplT.p(i2)) {
                                i27 = 2048;
                            } else {
                                i27 = 1024;
                            }
                            i24 |= i27;
                        }
                        i26 = i24;
                    }
                    i28 = i26 | 24576;
                    if ((i5 & 32768) == 0) {
                        i29 = i28;
                        if (composerImplT.l(textStyle)) {
                            i13 = 131072;
                        }
                    } else {
                        i29 = i28;
                    }
                    i30 = i29 | i13;
                    if ((i17 & 1533916891) != 306783378) {
                        composerImplT.r0();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        } else {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        }
                        composerImplT.S();
                        Modifier modifier19 = modifier2;
                        composerImplT.B(1557613088);
                        j10 = Color.i;
                        if (j7 != j10) {
                            jB = j7;
                        } else {
                            jB = textStyle2.b();
                            if (jB == j10) {
                                jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                            }
                        }
                        composerImplT.R(false);
                        TextStyle textStyle19 = textStyle2;
                        int i31118 = i30 << 9;
                        int i31119 = i34;
                        int i415 = i32;
                        boolean z19 = z2;
                        wr0 wr0Var18 = wr0Var2;
                        BasicTextKt.a(str, modifier19, textStyle19.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var18, i31119, z19, i415, composerImplT, (i17 & 126) | 3072 | (i31118 & 57344) | 196608 | (i31118 & 3670016));
                        modifier3 = modifier19;
                        composerImpl = composerImplT;
                        textStyle3 = textStyle19;
                        FontFamily fontFamily19 = fontFamily2;
                        i35 = i31119;
                        long j1110 = j9;
                        i36 = i32;
                        z3 = z2;
                        j11 = j7;
                        fontWeight3 = fontWeight2;
                        textAlign4 = textAlign3;
                        j12 = j6;
                        j13 = j8;
                        fontFamily3 = fontFamily19;
                        j14 = j1110;
                    } else {
                        composerImplT.r0();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        } else {
                            if (i37 != 0) {
                                modifier2 = Modifier.Companion.a;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                j7 = Color.i;
                            } else {
                                j7 = j5;
                            }
                            if (i9 != 0) {
                                j6 = TextUnit.c;
                            }
                            if (i12 != 0) {
                                fontWeight2 = null;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            }
                            j8 = TextUnit.c;
                            if (i18 == 0) {
                            }
                            z2 = true;
                            if (i21 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            if (i25 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            i33 = i5 & 32768;
                            wr0Var2 = TextKt$Text$1.i;
                            if (i33 != 0) {
                                i30 &= -458753;
                                textStyle2 = (TextStyle) composerImplT.v(a);
                            } else {
                                textStyle2 = textStyle;
                            }
                            i34 = i31;
                            j9 = j8;
                        }
                        composerImplT.S();
                        Modifier modifier110 = modifier2;
                        composerImplT.B(1557613088);
                        j10 = Color.i;
                        if (j7 != j10) {
                            jB = j7;
                        } else {
                            jB = textStyle2.b();
                            if (jB == j10) {
                                jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                            }
                        }
                        composerImplT.R(false);
                        TextStyle textStyle110 = textStyle2;
                        int i311110 = i30 << 9;
                        int i311111 = i34;
                        int i416 = i32;
                        boolean z110 = z2;
                        wr0 wr0Var19 = wr0Var2;
                        BasicTextKt.a(str, modifier110, textStyle110.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var19, i311111, z110, i416, composerImplT, (i17 & 126) | 3072 | (i311110 & 57344) | 196608 | (i311110 & 3670016));
                        modifier3 = modifier110;
                        composerImpl = composerImplT;
                        textStyle3 = textStyle110;
                        FontFamily fontFamily110 = fontFamily2;
                        i35 = i311111;
                        long j1111 = j9;
                        i36 = i32;
                        z3 = z2;
                        j11 = j7;
                        fontWeight3 = fontWeight2;
                        textAlign4 = textAlign3;
                        j12 = j6;
                        j13 = j8;
                        fontFamily3 = fontFamily110;
                        j14 = j1111;
                    }
                    recomposeScopeImplT = composerImpl.T();
                    if (recomposeScopeImplT == null) {
                        return;
                    }
                    recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
                }
                i17 = i11 | 918552576;
                textAlign2 = textAlign;
                i20 = i4 | 6;
                i21 = i5 & 2048;
                if (i21 != 0) {
                    i20 = i4 | 54;
                } else if ((i4 & 112) != 0) {
                    if (composerImplT.p(i)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                i24 = i23 | 384;
                i25 = i5 & 8192;
                if (i25 != 0) {
                    i26 = i23 | 3456;
                } else {
                    if ((i4 & 7168) != 0) {
                        if (composerImplT.p(i2)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i24 |= i27;
                    }
                    i26 = i24;
                }
                i28 = i26 | 24576;
                if ((i5 & 32768) == 0) {
                    i29 = i28;
                    if (composerImplT.l(textStyle)) {
                        i13 = 131072;
                    }
                } else {
                    i29 = i28;
                }
                i30 = i29 | i13;
                if ((i17 & 1533916891) != 306783378) {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier111 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle111 = textStyle2;
                    int i311112 = i30 << 9;
                    int i311113 = i34;
                    int i417 = i32;
                    boolean z111 = z2;
                    wr0 wr0Var110 = wr0Var2;
                    BasicTextKt.a(str, modifier111, textStyle111.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var110, i311113, z111, i417, composerImplT, (i17 & 126) | 3072 | (i311112 & 57344) | 196608 | (i311112 & 3670016));
                    modifier3 = modifier111;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle111;
                    FontFamily fontFamily111 = fontFamily2;
                    i35 = i311113;
                    long j1112 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily111;
                    j14 = j1112;
                } else {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier112 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle112 = textStyle2;
                    int i311114 = i30 << 9;
                    int i311115 = i34;
                    int i418 = i32;
                    boolean z112 = z2;
                    wr0 wr0Var111 = wr0Var2;
                    BasicTextKt.a(str, modifier112, textStyle112.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var111, i311115, z112, i418, composerImplT, (i17 & 126) | 3072 | (i311114 & 57344) | 196608 | (i311114 & 3670016));
                    modifier3 = modifier112;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle112;
                    FontFamily fontFamily112 = fontFamily2;
                    i35 = i311115;
                    long j1113 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily112;
                    j14 = j1113;
                }
                recomposeScopeImplT = composerImpl.T();
                if (recomposeScopeImplT == null) {
                    return;
                }
                recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
            }
            i11 = 221184 | i6;
            fontWeight2 = fontWeight;
            i15 = i5 & 64;
            if (i15 != 0) {
                i11 |= 1572864;
                fontFamily2 = fontFamily;
            } else {
                fontFamily2 = fontFamily;
                if ((i3 & 3670016) == 0) {
                    if (composerImplT.l(fontFamily2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i11 |= i16;
                }
            }
            i17 = i11 | 113246208;
            i18 = i5 & 512;
            if (i18 != 0) {
                if ((1879048192 & i3) == 0) {
                    textAlign2 = textAlign;
                    if (composerImplT.l(textAlign2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i17 |= i19;
                }
                i20 = i4 | 6;
                i21 = i5 & 2048;
                if (i21 != 0) {
                    i20 = i4 | 54;
                } else if ((i4 & 112) != 0) {
                    if (composerImplT.p(i)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                i24 = i23 | 384;
                i25 = i5 & 8192;
                if (i25 != 0) {
                    i26 = i23 | 3456;
                } else {
                    if ((i4 & 7168) != 0) {
                        if (composerImplT.p(i2)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i24 |= i27;
                    }
                    i26 = i24;
                }
                i28 = i26 | 24576;
                if ((i5 & 32768) == 0) {
                    i29 = i28;
                    if (composerImplT.l(textStyle)) {
                        i13 = 131072;
                    }
                } else {
                    i29 = i28;
                }
                i30 = i29 | i13;
                if ((i17 & 1533916891) != 306783378) {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier113 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle113 = textStyle2;
                    int i311116 = i30 << 9;
                    int i311117 = i34;
                    int i419 = i32;
                    boolean z113 = z2;
                    wr0 wr0Var112 = wr0Var2;
                    BasicTextKt.a(str, modifier113, textStyle113.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var112, i311117, z113, i419, composerImplT, (i17 & 126) | 3072 | (i311116 & 57344) | 196608 | (i311116 & 3670016));
                    modifier3 = modifier113;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle113;
                    FontFamily fontFamily113 = fontFamily2;
                    i35 = i311117;
                    long j1114 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily113;
                    j14 = j1114;
                } else {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier114 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle114 = textStyle2;
                    int i311118 = i30 << 9;
                    int i311119 = i34;
                    int i4110 = i32;
                    boolean z114 = z2;
                    wr0 wr0Var113 = wr0Var2;
                    BasicTextKt.a(str, modifier114, textStyle114.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var113, i311119, z114, i4110, composerImplT, (i17 & 126) | 3072 | (i311118 & 57344) | 196608 | (i311118 & 3670016));
                    modifier3 = modifier114;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle114;
                    FontFamily fontFamily114 = fontFamily2;
                    i35 = i311119;
                    long j1115 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily114;
                    j14 = j1115;
                }
                recomposeScopeImplT = composerImpl.T();
                if (recomposeScopeImplT == null) {
                    return;
                }
                recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
            }
            i17 = i11 | 918552576;
            textAlign2 = textAlign;
            i20 = i4 | 6;
            i21 = i5 & 2048;
            if (i21 != 0) {
                i20 = i4 | 54;
            } else if ((i4 & 112) != 0) {
                if (composerImplT.p(i)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            i23 = i20;
            i24 = i23 | 384;
            i25 = i5 & 8192;
            if (i25 != 0) {
                i26 = i23 | 3456;
            } else {
                if ((i4 & 7168) != 0) {
                    if (composerImplT.p(i2)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i24 |= i27;
                }
                i26 = i24;
            }
            i28 = i26 | 24576;
            if ((i5 & 32768) == 0) {
                i29 = i28;
                if (composerImplT.l(textStyle)) {
                    i13 = 131072;
                }
            } else {
                i29 = i28;
            }
            i30 = i29 | i13;
            if ((i17 & 1533916891) != 306783378) {
                composerImplT.r0();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                } else {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                }
                composerImplT.S();
                Modifier modifier115 = modifier2;
                composerImplT.B(1557613088);
                j10 = Color.i;
                if (j7 != j10) {
                    jB = j7;
                } else {
                    jB = textStyle2.b();
                    if (jB == j10) {
                        jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                    }
                }
                composerImplT.R(false);
                TextStyle textStyle115 = textStyle2;
                int i3111110 = i30 << 9;
                int i3111111 = i34;
                int i4111 = i32;
                boolean z115 = z2;
                wr0 wr0Var114 = wr0Var2;
                BasicTextKt.a(str, modifier115, textStyle115.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var114, i3111111, z115, i4111, composerImplT, (i17 & 126) | 3072 | (i3111110 & 57344) | 196608 | (i3111110 & 3670016));
                modifier3 = modifier115;
                composerImpl = composerImplT;
                textStyle3 = textStyle115;
                FontFamily fontFamily115 = fontFamily2;
                i35 = i3111111;
                long j1116 = j9;
                i36 = i32;
                z3 = z2;
                j11 = j7;
                fontWeight3 = fontWeight2;
                textAlign4 = textAlign3;
                j12 = j6;
                j13 = j8;
                fontFamily3 = fontFamily115;
                j14 = j1116;
            } else {
                composerImplT.r0();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                } else {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                }
                composerImplT.S();
                Modifier modifier116 = modifier2;
                composerImplT.B(1557613088);
                j10 = Color.i;
                if (j7 != j10) {
                    jB = j7;
                } else {
                    jB = textStyle2.b();
                    if (jB == j10) {
                        jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                    }
                }
                composerImplT.R(false);
                TextStyle textStyle116 = textStyle2;
                int i3111112 = i30 << 9;
                int i3111113 = i34;
                int i4112 = i32;
                boolean z116 = z2;
                wr0 wr0Var115 = wr0Var2;
                BasicTextKt.a(str, modifier116, textStyle116.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var115, i3111113, z116, i4112, composerImplT, (i17 & 126) | 3072 | (i3111112 & 57344) | 196608 | (i3111112 & 3670016));
                modifier3 = modifier116;
                composerImpl = composerImplT;
                textStyle3 = textStyle116;
                FontFamily fontFamily116 = fontFamily2;
                i35 = i3111113;
                long j1117 = j9;
                i36 = i32;
                z3 = z2;
                j11 = j7;
                fontWeight3 = fontWeight2;
                textAlign4 = textAlign3;
                j12 = j6;
                j13 = j8;
                fontFamily3 = fontFamily116;
                j14 = j1117;
            }
            recomposeScopeImplT = composerImpl.T();
            if (recomposeScopeImplT == null) {
                return;
            }
            recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
        }
        i6 |= 384;
        j5 = j;
        i9 = i5 & 8;
        if (i9 != 0) {
            i6 |= 3072;
            j6 = j2;
        } else {
            j6 = j2;
            if ((i3 & 7168) == 0) {
                if (composerImplT.q(j6)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i6 |= i10;
            }
        }
        i11 = i6 | 24576;
        i12 = i5 & 32;
        i13 = 65536;
        if (i12 != 0) {
            if ((458752 & i3) == 0) {
                fontWeight2 = fontWeight;
                if (composerImplT.l(fontWeight2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i11 |= i14;
            }
            i15 = i5 & 64;
            if (i15 != 0) {
                i11 |= 1572864;
                fontFamily2 = fontFamily;
            } else {
                fontFamily2 = fontFamily;
                if ((i3 & 3670016) == 0) {
                    if (composerImplT.l(fontFamily2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i11 |= i16;
                }
            }
            i17 = i11 | 113246208;
            i18 = i5 & 512;
            if (i18 != 0) {
                if ((1879048192 & i3) == 0) {
                    textAlign2 = textAlign;
                    if (composerImplT.l(textAlign2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i17 |= i19;
                }
                i20 = i4 | 6;
                i21 = i5 & 2048;
                if (i21 != 0) {
                    i20 = i4 | 54;
                } else if ((i4 & 112) != 0) {
                    if (composerImplT.p(i)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                i24 = i23 | 384;
                i25 = i5 & 8192;
                if (i25 != 0) {
                    i26 = i23 | 3456;
                } else {
                    if ((i4 & 7168) != 0) {
                        if (composerImplT.p(i2)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i24 |= i27;
                    }
                    i26 = i24;
                }
                i28 = i26 | 24576;
                if ((i5 & 32768) == 0) {
                    i29 = i28;
                    if (composerImplT.l(textStyle)) {
                        i13 = 131072;
                    }
                } else {
                    i29 = i28;
                }
                i30 = i29 | i13;
                if ((i17 & 1533916891) != 306783378) {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier117 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle117 = textStyle2;
                    int i3111114 = i30 << 9;
                    int i3111115 = i34;
                    int i4113 = i32;
                    boolean z117 = z2;
                    wr0 wr0Var116 = wr0Var2;
                    BasicTextKt.a(str, modifier117, textStyle117.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var116, i3111115, z117, i4113, composerImplT, (i17 & 126) | 3072 | (i3111114 & 57344) | 196608 | (i3111114 & 3670016));
                    modifier3 = modifier117;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle117;
                    FontFamily fontFamily117 = fontFamily2;
                    i35 = i3111115;
                    long j1118 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily117;
                    j14 = j1118;
                } else {
                    composerImplT.r0();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    } else {
                        if (i37 != 0) {
                            modifier2 = Modifier.Companion.a;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            j7 = Color.i;
                        } else {
                            j7 = j5;
                        }
                        if (i9 != 0) {
                            j6 = TextUnit.c;
                        }
                        if (i12 != 0) {
                            fontWeight2 = null;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        }
                        j8 = TextUnit.c;
                        if (i18 == 0) {
                        }
                        z2 = true;
                        if (i21 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i25 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        i33 = i5 & 32768;
                        wr0Var2 = TextKt$Text$1.i;
                        if (i33 != 0) {
                            i30 &= -458753;
                            textStyle2 = (TextStyle) composerImplT.v(a);
                        } else {
                            textStyle2 = textStyle;
                        }
                        i34 = i31;
                        j9 = j8;
                    }
                    composerImplT.S();
                    Modifier modifier118 = modifier2;
                    composerImplT.B(1557613088);
                    j10 = Color.i;
                    if (j7 != j10) {
                        jB = j7;
                    } else {
                        jB = textStyle2.b();
                        if (jB == j10) {
                            jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                        }
                    }
                    composerImplT.R(false);
                    TextStyle textStyle118 = textStyle2;
                    int i3111116 = i30 << 9;
                    int i3111117 = i34;
                    int i4114 = i32;
                    boolean z118 = z2;
                    wr0 wr0Var117 = wr0Var2;
                    BasicTextKt.a(str, modifier118, textStyle118.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var117, i3111117, z118, i4114, composerImplT, (i17 & 126) | 3072 | (i3111116 & 57344) | 196608 | (i3111116 & 3670016));
                    modifier3 = modifier118;
                    composerImpl = composerImplT;
                    textStyle3 = textStyle118;
                    FontFamily fontFamily118 = fontFamily2;
                    i35 = i3111117;
                    long j1119 = j9;
                    i36 = i32;
                    z3 = z2;
                    j11 = j7;
                    fontWeight3 = fontWeight2;
                    textAlign4 = textAlign3;
                    j12 = j6;
                    j13 = j8;
                    fontFamily3 = fontFamily118;
                    j14 = j1119;
                }
                recomposeScopeImplT = composerImpl.T();
                if (recomposeScopeImplT == null) {
                    return;
                }
                recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
            }
            i17 = i11 | 918552576;
            textAlign2 = textAlign;
            i20 = i4 | 6;
            i21 = i5 & 2048;
            if (i21 != 0) {
                i20 = i4 | 54;
            } else if ((i4 & 112) != 0) {
                if (composerImplT.p(i)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            i23 = i20;
            i24 = i23 | 384;
            i25 = i5 & 8192;
            if (i25 != 0) {
                i26 = i23 | 3456;
            } else {
                if ((i4 & 7168) != 0) {
                    if (composerImplT.p(i2)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i24 |= i27;
                }
                i26 = i24;
            }
            i28 = i26 | 24576;
            if ((i5 & 32768) == 0) {
                i29 = i28;
                if (composerImplT.l(textStyle)) {
                    i13 = 131072;
                }
            } else {
                i29 = i28;
            }
            i30 = i29 | i13;
            if ((i17 & 1533916891) != 306783378) {
                composerImplT.r0();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                } else {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                }
                composerImplT.S();
                Modifier modifier119 = modifier2;
                composerImplT.B(1557613088);
                j10 = Color.i;
                if (j7 != j10) {
                    jB = j7;
                } else {
                    jB = textStyle2.b();
                    if (jB == j10) {
                        jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                    }
                }
                composerImplT.R(false);
                TextStyle textStyle119 = textStyle2;
                int i3111118 = i30 << 9;
                int i3111119 = i34;
                int i4115 = i32;
                boolean z119 = z2;
                wr0 wr0Var118 = wr0Var2;
                BasicTextKt.a(str, modifier119, textStyle119.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var118, i3111119, z119, i4115, composerImplT, (i17 & 126) | 3072 | (i3111118 & 57344) | 196608 | (i3111118 & 3670016));
                modifier3 = modifier119;
                composerImpl = composerImplT;
                textStyle3 = textStyle119;
                FontFamily fontFamily119 = fontFamily2;
                i35 = i3111119;
                long j11110 = j9;
                i36 = i32;
                z3 = z2;
                j11 = j7;
                fontWeight3 = fontWeight2;
                textAlign4 = textAlign3;
                j12 = j6;
                j13 = j8;
                fontFamily3 = fontFamily119;
                j14 = j11110;
            } else {
                composerImplT.r0();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                } else {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                }
                composerImplT.S();
                Modifier modifier1110 = modifier2;
                composerImplT.B(1557613088);
                j10 = Color.i;
                if (j7 != j10) {
                    jB = j7;
                } else {
                    jB = textStyle2.b();
                    if (jB == j10) {
                        jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                    }
                }
                composerImplT.R(false);
                TextStyle textStyle1110 = textStyle2;
                int i31111110 = i30 << 9;
                int i31111111 = i34;
                int i4116 = i32;
                boolean z1110 = z2;
                wr0 wr0Var119 = wr0Var2;
                BasicTextKt.a(str, modifier1110, textStyle1110.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var119, i31111111, z1110, i4116, composerImplT, (i17 & 126) | 3072 | (i31111110 & 57344) | 196608 | (i31111110 & 3670016));
                modifier3 = modifier1110;
                composerImpl = composerImplT;
                textStyle3 = textStyle1110;
                FontFamily fontFamily1110 = fontFamily2;
                i35 = i31111111;
                long j11111 = j9;
                i36 = i32;
                z3 = z2;
                j11 = j7;
                fontWeight3 = fontWeight2;
                textAlign4 = textAlign3;
                j12 = j6;
                j13 = j8;
                fontFamily3 = fontFamily1110;
                j14 = j11111;
            }
            recomposeScopeImplT = composerImpl.T();
            if (recomposeScopeImplT == null) {
                return;
            }
            recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
        }
        i11 = 221184 | i6;
        fontWeight2 = fontWeight;
        i15 = i5 & 64;
        if (i15 != 0) {
            i11 |= 1572864;
            fontFamily2 = fontFamily;
        } else {
            fontFamily2 = fontFamily;
            if ((i3 & 3670016) == 0) {
                if (composerImplT.l(fontFamily2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i11 |= i16;
            }
        }
        i17 = i11 | 113246208;
        i18 = i5 & 512;
        if (i18 != 0) {
            if ((1879048192 & i3) == 0) {
                textAlign2 = textAlign;
                if (composerImplT.l(textAlign2)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i17 |= i19;
            }
            i20 = i4 | 6;
            i21 = i5 & 2048;
            if (i21 != 0) {
                i20 = i4 | 54;
            } else if ((i4 & 112) != 0) {
                if (composerImplT.p(i)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            i23 = i20;
            i24 = i23 | 384;
            i25 = i5 & 8192;
            if (i25 != 0) {
                i26 = i23 | 3456;
            } else {
                if ((i4 & 7168) != 0) {
                    if (composerImplT.p(i2)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i24 |= i27;
                }
                i26 = i24;
            }
            i28 = i26 | 24576;
            if ((i5 & 32768) == 0) {
                i29 = i28;
                if (composerImplT.l(textStyle)) {
                    i13 = 131072;
                }
            } else {
                i29 = i28;
            }
            i30 = i29 | i13;
            if ((i17 & 1533916891) != 306783378) {
                composerImplT.r0();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                } else {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                }
                composerImplT.S();
                Modifier modifier1111 = modifier2;
                composerImplT.B(1557613088);
                j10 = Color.i;
                if (j7 != j10) {
                    jB = j7;
                } else {
                    jB = textStyle2.b();
                    if (jB == j10) {
                        jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                    }
                }
                composerImplT.R(false);
                TextStyle textStyle1111 = textStyle2;
                int i31111112 = i30 << 9;
                int i31111113 = i34;
                int i4117 = i32;
                boolean z1111 = z2;
                wr0 wr0Var1110 = wr0Var2;
                BasicTextKt.a(str, modifier1111, textStyle1111.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var1110, i31111113, z1111, i4117, composerImplT, (i17 & 126) | 3072 | (i31111112 & 57344) | 196608 | (i31111112 & 3670016));
                modifier3 = modifier1111;
                composerImpl = composerImplT;
                textStyle3 = textStyle1111;
                FontFamily fontFamily1111 = fontFamily2;
                i35 = i31111113;
                long j11112 = j9;
                i36 = i32;
                z3 = z2;
                j11 = j7;
                fontWeight3 = fontWeight2;
                textAlign4 = textAlign3;
                j12 = j6;
                j13 = j8;
                fontFamily3 = fontFamily1111;
                j14 = j11112;
            } else {
                composerImplT.r0();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                } else {
                    if (i37 != 0) {
                        modifier2 = Modifier.Companion.a;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        j7 = Color.i;
                    } else {
                        j7 = j5;
                    }
                    if (i9 != 0) {
                        j6 = TextUnit.c;
                    }
                    if (i12 != 0) {
                        fontWeight2 = null;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    }
                    j8 = TextUnit.c;
                    if (i18 == 0) {
                    }
                    z2 = true;
                    if (i21 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i25 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    i33 = i5 & 32768;
                    wr0Var2 = TextKt$Text$1.i;
                    if (i33 != 0) {
                        i30 &= -458753;
                        textStyle2 = (TextStyle) composerImplT.v(a);
                    } else {
                        textStyle2 = textStyle;
                    }
                    i34 = i31;
                    j9 = j8;
                }
                composerImplT.S();
                Modifier modifier1112 = modifier2;
                composerImplT.B(1557613088);
                j10 = Color.i;
                if (j7 != j10) {
                    jB = j7;
                } else {
                    jB = textStyle2.b();
                    if (jB == j10) {
                        jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                    }
                }
                composerImplT.R(false);
                TextStyle textStyle1112 = textStyle2;
                int i31111114 = i30 << 9;
                int i31111115 = i34;
                int i4118 = i32;
                boolean z1112 = z2;
                wr0 wr0Var1111 = wr0Var2;
                BasicTextKt.a(str, modifier1112, textStyle1112.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var1111, i31111115, z1112, i4118, composerImplT, (i17 & 126) | 3072 | (i31111114 & 57344) | 196608 | (i31111114 & 3670016));
                modifier3 = modifier1112;
                composerImpl = composerImplT;
                textStyle3 = textStyle1112;
                FontFamily fontFamily1112 = fontFamily2;
                i35 = i31111115;
                long j11113 = j9;
                i36 = i32;
                z3 = z2;
                j11 = j7;
                fontWeight3 = fontWeight2;
                textAlign4 = textAlign3;
                j12 = j6;
                j13 = j8;
                fontFamily3 = fontFamily1112;
                j14 = j11113;
            }
            recomposeScopeImplT = composerImpl.T();
            if (recomposeScopeImplT == null) {
                return;
            }
            recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
        }
        i17 = i11 | 918552576;
        textAlign2 = textAlign;
        i20 = i4 | 6;
        i21 = i5 & 2048;
        if (i21 != 0) {
            i20 = i4 | 54;
        } else if ((i4 & 112) != 0) {
            if (composerImplT.p(i)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i20 |= i22;
        }
        i23 = i20;
        i24 = i23 | 384;
        i25 = i5 & 8192;
        if (i25 != 0) {
            i26 = i23 | 3456;
        } else {
            if ((i4 & 7168) != 0) {
                if (composerImplT.p(i2)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i24 |= i27;
            }
            i26 = i24;
        }
        i28 = i26 | 24576;
        if ((i5 & 32768) == 0) {
            i29 = i28;
            if (composerImplT.l(textStyle)) {
                i13 = 131072;
            }
        } else {
            i29 = i28;
        }
        i30 = i29 | i13;
        if ((i17 & 1533916891) != 306783378) {
            composerImplT.r0();
            if ((i3 & 1) != 0) {
                if (i37 != 0) {
                    modifier2 = Modifier.Companion.a;
                } else {
                    modifier2 = modifier;
                }
                if (i7 != 0) {
                    j7 = Color.i;
                } else {
                    j7 = j5;
                }
                if (i9 != 0) {
                    j6 = TextUnit.c;
                }
                if (i12 != 0) {
                    fontWeight2 = null;
                }
                if (i15 != 0) {
                    fontFamily2 = null;
                }
                j8 = TextUnit.c;
                if (i18 == 0) {
                }
                z2 = true;
                if (i21 != 0) {
                    i31 = 1;
                } else {
                    i31 = i;
                }
                if (i25 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i2;
                }
                i33 = i5 & 32768;
                wr0Var2 = TextKt$Text$1.i;
                if (i33 != 0) {
                    i30 &= -458753;
                    textStyle2 = (TextStyle) composerImplT.v(a);
                } else {
                    textStyle2 = textStyle;
                }
                i34 = i31;
                j9 = j8;
            } else {
                if (i37 != 0) {
                    modifier2 = Modifier.Companion.a;
                } else {
                    modifier2 = modifier;
                }
                if (i7 != 0) {
                    j7 = Color.i;
                } else {
                    j7 = j5;
                }
                if (i9 != 0) {
                    j6 = TextUnit.c;
                }
                if (i12 != 0) {
                    fontWeight2 = null;
                }
                if (i15 != 0) {
                    fontFamily2 = null;
                }
                j8 = TextUnit.c;
                if (i18 == 0) {
                }
                z2 = true;
                if (i21 != 0) {
                    i31 = 1;
                } else {
                    i31 = i;
                }
                if (i25 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i2;
                }
                i33 = i5 & 32768;
                wr0Var2 = TextKt$Text$1.i;
                if (i33 != 0) {
                    i30 &= -458753;
                    textStyle2 = (TextStyle) composerImplT.v(a);
                } else {
                    textStyle2 = textStyle;
                }
                i34 = i31;
                j9 = j8;
            }
            composerImplT.S();
            Modifier modifier1113 = modifier2;
            composerImplT.B(1557613088);
            j10 = Color.i;
            if (j7 != j10) {
                jB = j7;
            } else {
                jB = textStyle2.b();
                if (jB == j10) {
                    jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                }
            }
            composerImplT.R(false);
            TextStyle textStyle1113 = textStyle2;
            int i31111116 = i30 << 9;
            int i31111117 = i34;
            int i4119 = i32;
            boolean z1113 = z2;
            wr0 wr0Var1112 = wr0Var2;
            BasicTextKt.a(str, modifier1113, textStyle1113.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var1112, i31111117, z1113, i4119, composerImplT, (i17 & 126) | 3072 | (i31111116 & 57344) | 196608 | (i31111116 & 3670016));
            modifier3 = modifier1113;
            composerImpl = composerImplT;
            textStyle3 = textStyle1113;
            FontFamily fontFamily1113 = fontFamily2;
            i35 = i31111117;
            long j11114 = j9;
            i36 = i32;
            z3 = z2;
            j11 = j7;
            fontWeight3 = fontWeight2;
            textAlign4 = textAlign3;
            j12 = j6;
            j13 = j8;
            fontFamily3 = fontFamily1113;
            j14 = j11114;
        } else {
            composerImplT.r0();
            if ((i3 & 1) != 0) {
                if (i37 != 0) {
                    modifier2 = Modifier.Companion.a;
                } else {
                    modifier2 = modifier;
                }
                if (i7 != 0) {
                    j7 = Color.i;
                } else {
                    j7 = j5;
                }
                if (i9 != 0) {
                    j6 = TextUnit.c;
                }
                if (i12 != 0) {
                    fontWeight2 = null;
                }
                if (i15 != 0) {
                    fontFamily2 = null;
                }
                j8 = TextUnit.c;
                if (i18 == 0) {
                }
                z2 = true;
                if (i21 != 0) {
                    i31 = 1;
                } else {
                    i31 = i;
                }
                if (i25 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i2;
                }
                i33 = i5 & 32768;
                wr0Var2 = TextKt$Text$1.i;
                if (i33 != 0) {
                    i30 &= -458753;
                    textStyle2 = (TextStyle) composerImplT.v(a);
                } else {
                    textStyle2 = textStyle;
                }
                i34 = i31;
                j9 = j8;
            } else {
                if (i37 != 0) {
                    modifier2 = Modifier.Companion.a;
                } else {
                    modifier2 = modifier;
                }
                if (i7 != 0) {
                    j7 = Color.i;
                } else {
                    j7 = j5;
                }
                if (i9 != 0) {
                    j6 = TextUnit.c;
                }
                if (i12 != 0) {
                    fontWeight2 = null;
                }
                if (i15 != 0) {
                    fontFamily2 = null;
                }
                j8 = TextUnit.c;
                if (i18 == 0) {
                }
                z2 = true;
                if (i21 != 0) {
                    i31 = 1;
                } else {
                    i31 = i;
                }
                if (i25 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i2;
                }
                i33 = i5 & 32768;
                wr0Var2 = TextKt$Text$1.i;
                if (i33 != 0) {
                    i30 &= -458753;
                    textStyle2 = (TextStyle) composerImplT.v(a);
                } else {
                    textStyle2 = textStyle;
                }
                i34 = i31;
                j9 = j8;
            }
            composerImplT.S();
            Modifier modifier1114 = modifier2;
            composerImplT.B(1557613088);
            j10 = Color.i;
            if (j7 != j10) {
                jB = j7;
            } else {
                jB = textStyle2.b();
                if (jB == j10) {
                    jB = Color.b(((Color) composerImplT.v(ContentColorKt.a)).a, ((Number) composerImplT.v(ContentAlphaKt.a)).floatValue());
                }
            }
            composerImplT.R(false);
            TextStyle textStyle1114 = textStyle2;
            int i31111118 = i30 << 9;
            int i31111119 = i34;
            int i41110 = i32;
            boolean z1114 = z2;
            wr0 wr0Var1113 = wr0Var2;
            BasicTextKt.a(str, modifier1114, textStyle1114.c(new TextStyle(jB, j6, fontWeight2, null, fontFamily2, j8, null, textAlign3, j9, 175952)), wr0Var1113, i31111119, z1114, i41110, composerImplT, (i17 & 126) | 3072 | (i31111118 & 57344) | 196608 | (i31111118 & 3670016));
            modifier3 = modifier1114;
            composerImpl = composerImplT;
            textStyle3 = textStyle1114;
            FontFamily fontFamily1114 = fontFamily2;
            i35 = i31111119;
            long j11115 = j9;
            i36 = i32;
            z3 = z2;
            j11 = j7;
            fontWeight3 = fontWeight2;
            textAlign4 = textAlign3;
            j12 = j6;
            j13 = j8;
            fontFamily3 = fontFamily1114;
            j14 = j11115;
        }
        recomposeScopeImplT = composerImpl.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new TextKt$Text$2(str, modifier3, j11, j12, fontWeight3, fontFamily3, j13, textAlign4, j14, i35, z3, i36, wr0Var2, textStyle3, i3, i4, i5);
    }

    public static final void a(TextStyle textStyle, zr0 zr0Var, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        textStyle.getClass();
        zr0Var.getClass();
        ComposerImpl composerImplT = composer.t(1772272796);
        if ((i & 14) == 0) {
            if (composerImplT.l(textStyle)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (composerImplT.l(zr0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && composerImplT.b()) {
            composerImplT.h();
        } else {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = a;
            CompositionLocalKt.a(new ProvidedValue[]{dynamicProvidableCompositionLocal.b(((TextStyle) composerImplT.v(dynamicProvidableCompositionLocal)).c(textStyle))}, zr0Var, composerImplT, (i2 & 112) | 8);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new TextKt$ProvideTextStyle$1(textStyle, zr0Var, i);
    }
}

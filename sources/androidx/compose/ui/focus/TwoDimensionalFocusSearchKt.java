package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import defpackage.wr0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TwoDimensionalFocusSearchKt {
    public static final boolean b(int i, Rect rect, Rect rect2) {
        if (i == 3 || i == 4) {
            if (rect.d > rect2.b && rect.b < rect2.d) {
                return true;
            }
        } else {
            if (i != 5 && i != 6) {
                e32.i("This function should only be used for 2-D focus search");
                return false;
            }
            if (rect.c > rect2.a && rect.a < rect2.c) {
                return true;
            }
        }
        return false;
    }

    public static final FocusModifier c(MutableVector mutableVector, Rect rect, int i) {
        Rect rectF;
        FocusModifier focusModifier = null;
        if (i == 3) {
            rectF = rect.f(rect.d() + 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i == 4) {
            rectF = rect.f(-(rect.d() + 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i == 5) {
            rectF = rect.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.c() + 1.0f);
        } else {
            if (i != 6) {
                e32.i("This function should only be used for 2-D focus search");
                return null;
            }
            rectF = rect.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -(rect.c() + 1.0f));
        }
        int i2 = mutableVector.c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.a;
            int i3 = 0;
            do {
                FocusModifier focusModifier2 = (FocusModifier) objArr[i3];
                if (FocusTraversalKt.e(focusModifier2)) {
                    Rect rectD = FocusTraversalKt.d(focusModifier2);
                    if (e(i, rectD, rect) && (!e(i, rectF, rect) || a(rect, rectD, rectF, i) || (!a(rect, rectF, rectD, i) && f(i, rect, rectD) < f(i, rect, rectF)))) {
                        focusModifier = focusModifier2;
                        rectF = rectD;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return focusModifier;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[1] = 1;
            iArr[4] = 2;
            iArr[0] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[5] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(Rect rect, Rect rect2, Rect rect3, int i) {
        float f;
        float f2;
        boolean zB = b(i, rect3, rect);
        float f3 = rect3.b;
        float f4 = rect3.d;
        float f5 = rect3.a;
        float f6 = rect3.c;
        float f7 = rect.d;
        float f8 = rect.b;
        float f9 = rect.c;
        float f10 = rect.a;
        if (zB || !b(i, rect2, rect)) {
            return false;
        }
        if (i == 3) {
            if (f10 < f6) {
                return true;
            }
        } else if (i == 4) {
            if (f9 > f5) {
                return true;
            }
        } else if (i == 5) {
            if (f8 < f4) {
                return true;
            }
        } else {
            if (i != 6) {
                e32.i("This function should only be used for 2-D focus search");
                return false;
            }
            if (f7 > f3) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f = f10 - rect2.c;
        } else if (i == 4) {
            f = rect2.a - f9;
        } else if (i == 5) {
            f = f8 - rect2.d;
        } else {
            if (i != 6) {
                e32.i("This function should only be used for 2-D focus search");
                return false;
            }
            f = rect2.b - f7;
        }
        float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        if (i == 3) {
            f2 = f10 - f5;
        } else if (i == 4) {
            f2 = f6 - f9;
        } else if (i == 5) {
            f2 = f8 - f3;
        } else {
            if (i != 6) {
                e32.i("This function should only be used for 2-D focus search");
                return false;
            }
            f2 = f4 - f7;
        }
        return fMax < Math.max(1.0f, f2);
    }

    public static final boolean e(int i, Rect rect, Rect rect2) {
        float f = rect.b;
        float f2 = rect.d;
        float f3 = rect.a;
        float f4 = rect.c;
        float f5 = rect2.b;
        float f6 = rect2.d;
        float f7 = rect2.a;
        float f8 = rect2.c;
        if (i == 3) {
            if ((f8 > f4 || f7 >= f4) && f7 > f3) {
                return true;
            }
        } else if (i == 4) {
            if ((f7 < f3 || f8 <= f3) && f8 < f4) {
                return true;
            }
        } else if (i == 5) {
            if ((f6 > f2 || f5 >= f2) && f5 > f) {
                return true;
            }
        } else {
            if (i != 6) {
                e32.i("This function should only be used for 2-D focus search");
                return false;
            }
            if ((f5 < f || f6 <= f) && f6 < f2) {
                return true;
            }
        }
        return false;
    }

    public static final long f(int i, Rect rect, Rect rect2) {
        float f;
        float fC;
        float fC2;
        float f2 = rect.b;
        float f3 = rect.a;
        float f4 = rect2.b;
        float f5 = rect2.a;
        if (i == 3) {
            f = f3 - rect2.c;
        } else if (i == 4) {
            f = f5 - rect.c;
        } else if (i == 5) {
            f = f2 - rect2.d;
        } else {
            if (i != 6) {
                e32.i("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = f4 - rect.d;
        }
        long jAbs = (long) Math.abs(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f));
        if (i == 3 || i == 4) {
            fC = (rect.c() / 2.0f) + f2;
            fC2 = (rect2.c() / 2.0f) + f4;
        } else {
            if (i != 5 && i != 6) {
                e32.i("This function should only be used for 2-D focus search");
                return 0L;
            }
            fC = (rect.d() / 2.0f) + f3;
            fC2 = (rect2.d() / 2.0f) + f5;
        }
        long jAbs2 = (long) Math.abs(fC - fC2);
        return (jAbs2 * jAbs2) + (13 * jAbs * jAbs);
    }

    public static final boolean g(FocusModifier focusModifier, FocusModifier focusModifier2, int i, wr0 wr0Var) {
        FocusModifier focusModifierC;
        MutableVector mutableVector = focusModifier.c;
        FocusModifier[] focusModifierArr = new FocusModifier[mutableVector.c];
        MutableVector mutableVector2 = new MutableVector();
        mutableVector2.a = focusModifierArr;
        mutableVector2.c = 0;
        mutableVector2.c(0, mutableVector);
        while (mutableVector2.n() && (focusModifierC = c(mutableVector2, FocusTraversalKt.d(focusModifier2), i)) != null) {
            if (!focusModifierC.d.f()) {
                return ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifierC)).booleanValue();
            }
            if (d(focusModifierC, focusModifier2, i, wr0Var)) {
                return true;
            }
            mutableVector2.o(focusModifierC);
        }
        return false;
    }

    public static final boolean d(FocusModifier focusModifier, FocusModifier focusModifier2, int i, wr0 wr0Var) {
        if (g(focusModifier, focusModifier2, i, wr0Var)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.a(focusModifier, i, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusModifier, focusModifier2, i, wr0Var));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    public static final boolean h(FocusModifier focusModifier, int i, wr0 wr0Var) {
        MutableVector mutableVectorA;
        Rect rect;
        FocusModifier focusModifierC;
        Object obj;
        FocusModifier focusModifier2;
        FocusModifier focusModifier3;
        int iOrdinal;
        FocusStateImpl focusStateImpl;
        FocusModifier focusModifierB;
        focusModifier.getClass();
        int iOrdinal2 = focusModifier.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            if (iOrdinal2 == 5) {
                                return ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifier)).booleanValue();
                            }
                            e.b();
                            return false;
                        }
                        focusModifier3 = focusModifier.e;
                        if (focusModifier3 != null) {
                            iOrdinal = focusModifier3.d.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            if (iOrdinal != 4) {
                                                if (iOrdinal != 5) {
                                                    e.b();
                                                    return false;
                                                }
                                            }
                                        }
                                        e32.i("ActiveParent must have a focusedChild");
                                        return false;
                                    }
                                }
                                if (!h(focusModifier3, i, wr0Var)) {
                                    focusStateImpl = focusModifier3.d;
                                    if (focusStateImpl == FocusStateImpl.b) {
                                    }
                                    focusModifierB = FocusTraversalKt.b(focusModifier3);
                                    if (focusModifierB != null) {
                                        if (d(focusModifier, focusModifierB, i, wr0Var)) {
                                        }
                                    } else {
                                        e32.i("ActiveParent must have a focusedChild");
                                        return false;
                                    }
                                }
                                return true;
                            }
                            return d(focusModifier, focusModifier3, i, wr0Var);
                        }
                        e32.i("ActiveParent must have a focusedChild");
                        return false;
                    }
                } else {
                    mutableVectorA = FocusTraversalKt.a(focusModifier);
                    if (mutableVectorA.c <= 1) {
                        if (mutableVectorA.m()) {
                            obj = null;
                        } else {
                            obj = mutableVectorA.a[0];
                        }
                        focusModifier2 = (FocusModifier) obj;
                        if (focusModifier2 != null) {
                            return ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifier2)).booleanValue();
                        }
                    } else {
                        if (i != 4) {
                            Rect rectD = FocusTraversalKt.d(focusModifier);
                            float f = rectD.a;
                            float f2 = rectD.b;
                            rect = new Rect(f, f2, f, f2);
                        } else {
                            if (i == 3) {
                                e32.i("This function should only be used for 2-D focus search");
                                return false;
                            }
                            Rect rectD2 = FocusTraversalKt.d(focusModifier);
                            float f3 = rectD2.c;
                            float f4 = rectD2.d;
                            rect = new Rect(f3, f4, f3, f4);
                        }
                        focusModifierC = c(mutableVectorA, rect, i);
                        if (focusModifierC != null) {
                            return ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifierC)).booleanValue();
                        }
                    }
                }
            } else {
                focusModifier3 = focusModifier.e;
                if (focusModifier3 != null) {
                    iOrdinal = focusModifier3.d.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    if (iOrdinal != 4) {
                                        if (iOrdinal != 5) {
                                            e.b();
                                            return false;
                                        }
                                    }
                                }
                                e32.i("ActiveParent must have a focusedChild");
                                return false;
                            }
                        }
                        if (!h(focusModifier3, i, wr0Var)) {
                            focusStateImpl = focusModifier3.d;
                            if (focusStateImpl == FocusStateImpl.b && focusStateImpl != FocusStateImpl.e) {
                                e32.i("Check failed.");
                                return false;
                            }
                            focusModifierB = FocusTraversalKt.b(focusModifier3);
                            if (focusModifierB != null) {
                                if (d(focusModifier, focusModifierB, i, wr0Var)) {
                                }
                            } else {
                                e32.i("ActiveParent must have a focusedChild");
                                return false;
                            }
                        }
                        return true;
                    }
                    return d(focusModifier, focusModifier3, i, wr0Var);
                }
                e32.i("ActiveParent must have a focusedChild");
                return false;
            }
        } else {
            mutableVectorA = FocusTraversalKt.a(focusModifier);
            if (mutableVectorA.c <= 1) {
                if (mutableVectorA.m()) {
                    obj = null;
                } else {
                    obj = mutableVectorA.a[0];
                }
                focusModifier2 = (FocusModifier) obj;
                if (focusModifier2 != null) {
                    return ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifier2)).booleanValue();
                }
            } else {
                if (i != 4 || i == 6) {
                    Rect rectD3 = FocusTraversalKt.d(focusModifier);
                    float f5 = rectD3.a;
                    float f6 = rectD3.b;
                    rect = new Rect(f5, f6, f5, f6);
                } else if (i == 3 || i == 5) {
                    Rect rectD4 = FocusTraversalKt.d(focusModifier);
                    float f7 = rectD4.c;
                    float f8 = rectD4.d;
                    rect = new Rect(f7, f8, f7, f8);
                } else {
                    e32.i("This function should only be used for 2-D focus search");
                    return false;
                }
                focusModifierC = c(mutableVectorA, rect, i);
                if (focusModifierC != null) {
                    return ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifierC)).booleanValue();
                }
            }
        }
        return false;
    }
}

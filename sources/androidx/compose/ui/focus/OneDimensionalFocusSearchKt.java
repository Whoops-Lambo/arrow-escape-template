package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import defpackage.e32;
import defpackage.j71;
import defpackage.s71;
import defpackage.wr0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OneDimensionalFocusSearchKt {

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

    /* JADX WARN: Code duplicated, block: B:40:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[RETURN] */
    public static final boolean a(FocusModifier focusModifier, wr0 wr0Var) {
        int iOrdinal = focusModifier.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            e.b();
                            return false;
                        }
                        if (d(focusModifier, wr0Var) || ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifier)).booleanValue()) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            FocusModifier focusModifier2 = focusModifier.e;
            if (focusModifier2 == null) {
                e32.i("ActiveParent must have a focusedChild");
                return false;
            }
            int iOrdinal2 = focusModifier2.d.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    if (a(focusModifier2, wr0Var) || ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifier2)).booleanValue()) {
                        return true;
                    }
                    return false;
                }
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        if (iOrdinal2 == 4) {
                            if (a(focusModifier2, wr0Var) || c(focusModifier, focusModifier2, 2, wr0Var)) {
                                return true;
                            }
                            return false;
                        }
                        if (iOrdinal2 != 5) {
                            e.b();
                            return false;
                        }
                    }
                    e32.i("ActiveParent must have a focusedChild");
                    return false;
                }
            }
            return c(focusModifier, focusModifier2, 2, wr0Var);
        }
        return d(focusModifier, wr0Var);
    }

    public static final boolean b(FocusModifier focusModifier, wr0 wr0Var) {
        FocusStateImpl focusStateImpl = focusModifier.d;
        MutableVector mutableVector = focusModifier.c;
        int iOrdinal = focusStateImpl.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifier)).booleanValue();
                        }
                        e.b();
                        return false;
                    }
                }
            }
            FocusModifier focusModifier2 = focusModifier.e;
            if (focusModifier2 != null) {
                return b(focusModifier2, wr0Var) || c(focusModifier, focusModifier2, 1, wr0Var);
            }
            e32.i("ActiveParent must have a focusedChild");
            return false;
        }
        OneDimensionalFocusSearchKt$sort$$inlined$compareBy$1 oneDimensionalFocusSearchKt$sort$$inlined$compareBy$1 = new OneDimensionalFocusSearchKt$sort$$inlined$compareBy$1();
        mutableVector.getClass();
        Arrays.sort(mutableVector.a, 0, mutableVector.c, oneDimensionalFocusSearchKt$sort$$inlined$compareBy$1);
        int i = mutableVector.c;
        if (i > 0) {
            Object[] objArr = mutableVector.a;
            int i2 = 0;
            do {
                FocusModifier focusModifier3 = (FocusModifier) objArr[i2];
                if (!FocusTraversalKt.e(focusModifier3) || !b(focusModifier3, wr0Var)) {
                    i2++;
                }
            } while (i2 < i);
        }
    }

    public static final boolean d(FocusModifier focusModifier, wr0 wr0Var) {
        MutableVector mutableVector = focusModifier.c;
        OneDimensionalFocusSearchKt$sort$$inlined$compareBy$1 oneDimensionalFocusSearchKt$sort$$inlined$compareBy$1 = new OneDimensionalFocusSearchKt$sort$$inlined$compareBy$1();
        mutableVector.getClass();
        Arrays.sort(mutableVector.a, 0, mutableVector.c, oneDimensionalFocusSearchKt$sort$$inlined$compareBy$1);
        MutableVector mutableVector2 = focusModifier.c;
        int i = mutableVector2.c;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = mutableVector2.a;
            do {
                FocusModifier focusModifier2 = (FocusModifier) objArr[i2];
                if (FocusTraversalKt.e(focusModifier2) && a(focusModifier2, wr0Var)) {
                    return true;
                }
                i2--;
            } while (i2 >= 0);
        }
        return false;
    }

    public static final boolean e(FocusModifier focusModifier, FocusModifier focusModifier2, int i, wr0 wr0Var) {
        FocusStateImpl focusStateImpl = focusModifier.d;
        MutableVector mutableVector = focusModifier.c;
        FocusStateImpl focusStateImpl2 = FocusStateImpl.b;
        FocusStateImpl focusStateImpl3 = FocusStateImpl.e;
        if (focusStateImpl != focusStateImpl2 && focusStateImpl != focusStateImpl3) {
            e32.i("This function should only be used within a parent that has focus.");
            return false;
        }
        OneDimensionalFocusSearchKt$sort$$inlined$compareBy$1 oneDimensionalFocusSearchKt$sort$$inlined$compareBy$1 = new OneDimensionalFocusSearchKt$sort$$inlined$compareBy$1();
        mutableVector.getClass();
        Arrays.sort(mutableVector.a, 0, mutableVector.c, oneDimensionalFocusSearchKt$sort$$inlined$compareBy$1);
        if (i == 1) {
            int i2 = new j71(0, mutableVector.c - 1, 1).b;
            if (i2 >= 0) {
                boolean z = false;
                int i3 = 0;
                while (true) {
                    if (z) {
                        FocusModifier focusModifier3 = (FocusModifier) mutableVector.a[i3];
                        if (FocusTraversalKt.e(focusModifier3) && b(focusModifier3, wr0Var)) {
                            return true;
                        }
                    }
                    if (s71.b(mutableVector.a[i3], focusModifier2)) {
                        z = true;
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            if (i == 1 || focusModifier.d == focusStateImpl3 || focusModifier.b == null) {
                return false;
            }
            return ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifier)).booleanValue();
        }
        if (i != 2) {
            e32.i("This function should only be used for 1-D focus search");
            return false;
        }
        int i4 = new j71(0, mutableVector.c - 1, 1).b;
        if (i4 >= 0) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    FocusModifier focusModifier4 = (FocusModifier) mutableVector.a[i4];
                    if (FocusTraversalKt.e(focusModifier4) && a(focusModifier4, wr0Var)) {
                        return true;
                    }
                }
                if (s71.b(mutableVector.a[i4], focusModifier2)) {
                    z2 = true;
                }
                if (i4 == 0) {
                    break;
                }
                i4--;
            }
        }
        if (i == 1) {
            return ((Boolean) ((FocusManagerImpl$moveFocus$1) wr0Var).invoke(focusModifier)).booleanValue();
        }
        return false;
    }

    public static final boolean c(FocusModifier focusModifier, FocusModifier focusModifier2, int i, wr0 wr0Var) {
        if (e(focusModifier, focusModifier2, i, wr0Var)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.a(focusModifier, i, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusModifier, focusModifier2, i, wr0Var));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}

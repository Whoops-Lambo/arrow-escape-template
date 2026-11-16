package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusEventModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FocusEventModifierLocal implements ModifierLocalProvider<FocusEventModifierLocal>, ModifierLocalConsumer {
    public final wr0 a;
    public FocusEventModifierLocal b;
    public final MutableVector c;
    public final MutableVector d;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[4] = 4;
            iArr[3] = 5;
            iArr[5] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void b(FocusModifier focusModifier) {
        this.d.b(focusModifier);
        FocusEventModifierLocal focusEventModifierLocal = this.b;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.b(focusModifier);
        }
    }

    public final void c(MutableVector mutableVector) {
        MutableVector mutableVector2 = this.d;
        mutableVector2.c(mutableVector2.c, mutableVector);
        FocusEventModifierLocal focusEventModifierLocal = this.b;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.c(mutableVector);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    public final void d() {
        Boolean bool;
        FocusStateImpl focusStateImpl;
        MutableVector mutableVector = this.d;
        int i = mutableVector.c;
        FocusStateImpl focusStateImpl2 = FocusStateImpl.f;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                FocusModifier focusModifier = null;
                Boolean bool2 = null;
                if (i > 0) {
                    Object[] objArr = mutableVector.a;
                    FocusModifier focusModifier2 = null;
                    do {
                        FocusModifier focusModifier3 = (FocusModifier) objArr[i2];
                        int iOrdinal = focusModifier3.d.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                            bool2 = Boolean.FALSE;
                            focusModifier2 = focusModifier3;
                        } else if (iOrdinal != 3) {
                            if (iOrdinal == 4) {
                                bool2 = Boolean.FALSE;
                                focusModifier2 = focusModifier3;
                            } else if (iOrdinal == 5) {
                                bool2 = Boolean.FALSE;
                            }
                        } else if (bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i2++;
                    } while (i2 < i);
                    bool = bool2;
                    focusModifier = focusModifier2;
                } else {
                    bool = null;
                }
                if (focusModifier != null && (focusStateImpl = focusModifier.d) != null) {
                    focusStateImpl2 = focusStateImpl;
                } else if (s71.b(bool, Boolean.TRUE)) {
                    focusStateImpl2 = FocusStateImpl.d;
                }
            } else {
                focusStateImpl2 = ((FocusModifier) mutableVector.a[0]).d;
            }
        }
        this.a.invoke(focusStateImpl2);
        FocusEventModifierLocal focusEventModifierLocal = this.b;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.d();
        }
    }

    public final void e(FocusModifier focusModifier) {
        this.d.o(focusModifier);
        FocusEventModifierLocal focusEventModifierLocal = this.b;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.e(focusModifier);
        }
    }

    public final void f(MutableVector mutableVector) {
        this.d.p(mutableVector);
        FocusEventModifierLocal focusEventModifierLocal = this.b;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.f(mutableVector);
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return FocusEventModifierKt.a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        ProvidableModifierLocal providableModifierLocal = FocusEventModifierKt.a;
        FocusEventModifierLocal focusEventModifierLocal = (FocusEventModifierLocal) modifierLocalReadScope.a(providableModifierLocal);
        if (!s71.b(focusEventModifierLocal, this.b)) {
            FocusEventModifierLocal focusEventModifierLocal2 = this.b;
            MutableVector mutableVector = this.d;
            if (focusEventModifierLocal2 != null) {
                focusEventModifierLocal2.c.o(this);
                focusEventModifierLocal2.f(mutableVector);
            }
            this.b = focusEventModifierLocal;
            if (focusEventModifierLocal != null) {
                focusEventModifierLocal.c.b(this);
                focusEventModifierLocal.c(mutableVector);
            }
        }
        this.b = (FocusEventModifierLocal) modifierLocalReadScope.a(providableModifierLocal);
    }

    public FocusEventModifierLocal(wr0 wr0Var) {
        this.a = wr0Var;
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new FocusEventModifierLocal[16];
        mutableVector.c = 0;
        this.c = mutableVector;
        MutableVector mutableVector2 = new MutableVector();
        mutableVector2.a = new FocusModifier[16];
        mutableVector2.c = 0;
        this.d = mutableVector2;
    }
}

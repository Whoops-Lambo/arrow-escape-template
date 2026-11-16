package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.input.focus.FocusAwareInputModifier;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FocusModifier extends InspectorValueInfo implements ModifierLocalConsumer, ModifierLocalProvider<FocusModifier>, OwnerScope, OnPlacedModifier {
    public static final wr0 q = null;
    public FocusModifier b;
    public final MutableVector c;
    public FocusStateImpl d;
    public FocusModifier e;
    public FocusEventModifierLocal f;
    public FocusAwareInputModifier g;
    public ModifierLocalReadScope h;
    public BeyondBoundsLayout i;
    public FocusPropertiesModifier j;
    public final FocusPropertiesImpl k;
    public FocusRequesterModifierLocal l;
    public LayoutNodeWrapper m;
    public boolean n;
    public KeyInputModifier o;
    public final MutableVector p;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier$Companion;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

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
            iArr[2] = 2;
            iArr[1] = 3;
            iArr[4] = 4;
            iArr[3] = 5;
            iArr[5] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    /* JADX INFO: renamed from: getKey */
    public final ProvidableModifierLocal getD() {
        return FocusModifierKt.a;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    /* JADX INFO: renamed from: isValid */
    public final boolean getD() {
        return this.b != null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        MutableVector mutableVector;
        MutableVector mutableVector2;
        int iOrdinal;
        LayoutNodeWrapper layoutNodeWrapper;
        LayoutNode layoutNode;
        Owner owner;
        FocusManager focusManager;
        this.h = modifierLocalReadScope;
        FocusModifier focusModifier = (FocusModifier) modifierLocalReadScope.a(FocusModifierKt.a);
        if (!s71.b(focusModifier, this.b)) {
            if (focusModifier == null && (((iOrdinal = this.d.ordinal()) == 0 || iOrdinal == 2) && (layoutNodeWrapper = this.m) != null && (layoutNode = layoutNodeWrapper.e) != null && (owner = layoutNode.g) != null && (focusManager = owner.getFocusManager()) != null)) {
                focusManager.b(true);
            }
            FocusModifier focusModifier2 = this.b;
            if (focusModifier2 != null && (mutableVector2 = focusModifier2.c) != null) {
                mutableVector2.o(this);
            }
            if (focusModifier != null && (mutableVector = focusModifier.c) != null) {
                mutableVector.b(this);
            }
        }
        this.b = focusModifier;
        FocusEventModifierLocal focusEventModifierLocal = (FocusEventModifierLocal) modifierLocalReadScope.a(FocusEventModifierKt.a);
        if (!s71.b(focusEventModifierLocal, this.f)) {
            FocusEventModifierLocal focusEventModifierLocal2 = this.f;
            if (focusEventModifierLocal2 != null) {
                focusEventModifierLocal2.e(this);
            }
            if (focusEventModifierLocal != null) {
                focusEventModifierLocal.b(this);
            }
        }
        this.f = focusEventModifierLocal;
        FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) modifierLocalReadScope.a(FocusRequesterModifierKt.a);
        if (!s71.b(focusRequesterModifierLocal, this.l)) {
            FocusRequesterModifierLocal focusRequesterModifierLocal2 = this.l;
            if (focusRequesterModifierLocal2 != null) {
                focusRequesterModifierLocal2.d(this);
            }
            if (focusRequesterModifierLocal != null) {
                focusRequesterModifierLocal.b(this);
            }
        }
        this.l = focusRequesterModifierLocal;
        this.g = (FocusAwareInputModifier) modifierLocalReadScope.a(RotaryInputModifierKt.a);
        this.i = (BeyondBoundsLayout) modifierLocalReadScope.a(androidx.compose.ui.layout.BeyondBoundsLayoutKt.a);
        this.o = (KeyInputModifier) modifierLocalReadScope.a(KeyInputModifierKt.a);
        this.j = (FocusPropertiesModifier) modifierLocalReadScope.a(FocusPropertiesKt.a);
        FocusPropertiesKt.a(this);
    }

    public FocusModifier() {
        super(InspectableValueKt.a());
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new FocusModifier[16];
        mutableVector.c = 0;
        this.c = mutableVector;
        this.d = FocusStateImpl.f;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        focusPropertiesImpl.a = true;
        FocusRequester focusRequester = FocusRequester.b;
        focusPropertiesImpl.b = focusRequester;
        focusPropertiesImpl.c = focusRequester;
        focusPropertiesImpl.d = focusRequester;
        focusPropertiesImpl.e = focusRequester;
        focusPropertiesImpl.f = focusRequester;
        focusPropertiesImpl.g = focusRequester;
        focusPropertiesImpl.h = focusRequester;
        focusPropertiesImpl.i = focusRequester;
        this.k = focusPropertiesImpl;
        MutableVector mutableVector2 = new MutableVector();
        mutableVector2.a = new KeyInputModifier[16];
        mutableVector2.c = 0;
        this.p = mutableVector2;
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public final void F(LayoutNodeWrapper layoutNodeWrapper) {
        boolean z;
        layoutNodeWrapper.getClass();
        if (this.m == null) {
            z = true;
        } else {
            z = false;
        }
        this.m = layoutNodeWrapper;
        if (z) {
            FocusPropertiesKt.a(this);
        }
        if (this.n) {
            this.n = false;
            FocusTransactionsKt.f(this);
        }
    }
}

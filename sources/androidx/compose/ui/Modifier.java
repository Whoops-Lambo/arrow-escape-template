package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "Companion", "Element", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Modifier {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements Modifier {
        public static final /* synthetic */ Companion a = new Companion();

        @Override // androidx.compose.ui.Modifier
        public final Object k(Object obj, zr0 zr0Var) {
            return obj;
        }

        @Override // androidx.compose.ui.Modifier
        public final Object m(Object obj, zr0 zr0Var) {
            return obj;
        }

        @Override // androidx.compose.ui.Modifier
        public final boolean r() {
            return true;
        }

        public final String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.Modifier
        public final Modifier N(Modifier modifier) {
            modifier.getClass();
            return modifier;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Element extends Modifier {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.ui.Modifier
        default boolean r() {
            return ((Boolean) ComposedModifierKt$materialize$1.i.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default Object k(Object obj, zr0 zr0Var) {
            return zr0Var.invoke(this, obj);
        }

        @Override // androidx.compose.ui.Modifier
        default Object m(Object obj, zr0 zr0Var) {
            return zr0Var.invoke(obj, this);
        }
    }

    Object k(Object obj, zr0 zr0Var);

    Object m(Object obj, zr0 zr0Var);

    boolean r();

    default Modifier N(Modifier modifier) {
        modifier.getClass();
        if (modifier == Companion.a) {
            return this;
        }
        return new CombinedModifier(this, modifier);
    }
}

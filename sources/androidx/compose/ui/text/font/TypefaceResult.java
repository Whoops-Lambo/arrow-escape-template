package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "Async", "Immutable", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "Landroidx/compose/ui/text/font/TypefaceResult$Async;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface TypefaceResult extends State<Object> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Async implements TypefaceResult, State<Object> {
        public final AsyncFontListLoader a;

        @Override // androidx.compose.ui.text.font.TypefaceResult
        /* JADX INFO: renamed from: a */
        public final boolean getB() {
            return this.a.f;
        }

        @Override // androidx.compose.runtime.State
        /* JADX INFO: renamed from: getValue */
        public final Object getA() {
            return this.a.e.getA();
        }

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.a = asyncFontListLoader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "Landroidx/compose/ui/text/font/TypefaceResult;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Immutable implements TypefaceResult {
        public final Object a;
        public final boolean b;

        @Override // androidx.compose.ui.text.font.TypefaceResult
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getB() {
            return this.b;
        }

        @Override // androidx.compose.runtime.State
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final Object getA() {
            return this.a;
        }

        public Immutable(Object obj, boolean z) {
            obj.getClass();
            this.a = obj;
            this.b = z;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean getB();
}

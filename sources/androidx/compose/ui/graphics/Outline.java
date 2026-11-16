package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "", "Generic", "Rectangle", "Rounded", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/graphics/Outline$Generic;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class Outline {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Generic extends Outline {
        public final AndroidPath a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Generic) {
                return this.a == ((Generic) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public Generic(AndroidPath androidPath) {
            this.a = androidPath;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Rectangle extends Outline {
        public final Rect a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Rectangle) {
                return this.a.equals(((Rectangle) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public Rectangle(Rect rect) {
            this.a = rect;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/graphics/Outline;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Rounded extends Outline {
        public final RoundRect a;
        public final AndroidPath b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Rounded) {
                return this.a.equals(((Rounded) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public Rounded(RoundRect roundRect) {
            boolean z;
            AndroidPath androidPath;
            this.a = roundRect;
            long j = roundRect.h;
            long j2 = roundRect.e;
            long j3 = roundRect.f;
            float fB = CornerRadius.b(j);
            long j4 = roundRect.g;
            boolean z2 = false;
            if (fB == CornerRadius.b(j4) && CornerRadius.b(j4) == CornerRadius.b(j3) && CornerRadius.b(j3) == CornerRadius.b(j2)) {
                z = true;
            } else {
                z = false;
            }
            if (CornerRadius.c(j) == CornerRadius.c(j4) && CornerRadius.c(j4) == CornerRadius.c(j3) && CornerRadius.c(j3) == CornerRadius.c(j2)) {
                z2 = true;
            }
            if (z && z2) {
                androidPath = null;
            } else {
                AndroidPath androidPathA = AndroidPath_androidKt.a();
                androidPathA.e(roundRect);
                androidPath = androidPathA;
            }
            this.b = androidPath;
        }
    }
}

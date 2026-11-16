package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import defpackage.h50;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode;", "", "ArcTo", "Close", "CurveTo", "HorizontalTo", "LineTo", "MoveTo", "QuadTo", "ReflectiveCurveTo", "ReflectiveQuadTo", "RelativeArcTo", "RelativeCurveTo", "RelativeHorizontalTo", "RelativeLineTo", "RelativeMoveTo", "RelativeQuadTo", "RelativeReflectiveCurveTo", "RelativeReflectiveQuadTo", "RelativeVerticalTo", "VerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class PathNode {
    public final boolean a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ArcTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        public ArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(3);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(arcTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(arcTo.d)) && Float.valueOf(this.e).equals(Float.valueOf(arcTo.e)) && this.f == arcTo.f && this.g == arcTo.g && Float.valueOf(this.h).equals(Float.valueOf(arcTo.h)) && Float.valueOf(this.i).equals(Float.valueOf(arcTo.i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        public final int hashCode() {
            int iB = n30.b(this.e, n30.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
            boolean z = this.f;
            ?? r3 = z;
            if (z) {
                r3 = 1;
            }
            int i = (iB + r3) * 31;
            boolean z2 = this.g;
            return Float.hashCode(this.i) + n30.b(this.h, (i + (z2 ? 1 : z2)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.d);
            sb.append(", theta=");
            sb.append(this.e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f);
            sb.append(", isPositiveArc=");
            sb.append(this.g);
            sb.append(", arcStartX=");
            sb.append(this.h);
            sb.append(", arcStartY=");
            return h50.k(sb, this.i, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Close extends PathNode {
        public static final Close c = new Close(3);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class CurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public CurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(curveTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(curveTo.d)) && Float.valueOf(this.e).equals(Float.valueOf(curveTo.e)) && Float.valueOf(this.f).equals(Float.valueOf(curveTo.f)) && Float.valueOf(this.g).equals(Float.valueOf(curveTo.g)) && Float.valueOf(this.h).equals(Float.valueOf(curveTo.h));
        }

        public final int hashCode() {
            return Float.hashCode(this.h) + n30.b(this.g, n30.b(this.f, n30.b(this.e, n30.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurveTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            sb.append(this.f);
            sb.append(", x3=");
            sb.append(this.g);
            sb.append(", y3=");
            return h50.k(sb, this.h, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class HorizontalTo extends PathNode {
        public final float c;

        public HorizontalTo(float f) {
            super(3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.valueOf(this.c).equals(Float.valueOf(((HorizontalTo) obj).c));
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return h50.k(new StringBuilder("HorizontalTo(x="), this.c, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class LineTo extends PathNode {
        public final float c;
        public final float d;

        public LineTo(float f, float f2) {
            super(3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(lineTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(lineTo.d));
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LineTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return h50.k(sb, this.d, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class MoveTo extends PathNode {
        public final float c;
        public final float d;

        public MoveTo(float f, float f2) {
            super(3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(moveTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(moveTo.d));
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return h50.k(sb, this.d, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class QuadTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public QuadTo(float f, float f2, float f3, float f4) {
            super(1);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(quadTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(quadTo.d)) && Float.valueOf(this.e).equals(Float.valueOf(quadTo.e)) && Float.valueOf(this.f).equals(Float.valueOf(quadTo.f));
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + n30.b(this.e, n30.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuadTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            return h50.k(sb, this.f, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ReflectiveCurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public ReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(reflectiveCurveTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(reflectiveCurveTo.d)) && Float.valueOf(this.e).equals(Float.valueOf(reflectiveCurveTo.e)) && Float.valueOf(this.f).equals(Float.valueOf(reflectiveCurveTo.f));
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + n30.b(this.e, n30.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.c);
            sb.append(", y1=");
            sb.append(this.d);
            sb.append(", x2=");
            sb.append(this.e);
            sb.append(", y2=");
            return h50.k(sb, this.f, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ReflectiveQuadTo extends PathNode {
        public final float c;
        public final float d;

        public ReflectiveQuadTo(float f, float f2) {
            super(1);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(reflectiveQuadTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(reflectiveQuadTo.d));
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.c);
            sb.append(", y=");
            return h50.k(sb, this.d, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class RelativeArcTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        public RelativeArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(3);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(relativeArcTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(relativeArcTo.d)) && Float.valueOf(this.e).equals(Float.valueOf(relativeArcTo.e)) && this.f == relativeArcTo.f && this.g == relativeArcTo.g && Float.valueOf(this.h).equals(Float.valueOf(relativeArcTo.h)) && Float.valueOf(this.i).equals(Float.valueOf(relativeArcTo.i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        public final int hashCode() {
            int iB = n30.b(this.e, n30.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
            boolean z = this.f;
            ?? r3 = z;
            if (z) {
                r3 = 1;
            }
            int i = (iB + r3) * 31;
            boolean z2 = this.g;
            return Float.hashCode(this.i) + n30.b(this.h, (i + (z2 ? 1 : z2)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.d);
            sb.append(", theta=");
            sb.append(this.e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f);
            sb.append(", isPositiveArc=");
            sb.append(this.g);
            sb.append(", arcStartDx=");
            sb.append(this.h);
            sb.append(", arcStartDy=");
            return h50.k(sb, this.i, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class RelativeCurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public RelativeCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(relativeCurveTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(relativeCurveTo.d)) && Float.valueOf(this.e).equals(Float.valueOf(relativeCurveTo.e)) && Float.valueOf(this.f).equals(Float.valueOf(relativeCurveTo.f)) && Float.valueOf(this.g).equals(Float.valueOf(relativeCurveTo.g)) && Float.valueOf(this.h).equals(Float.valueOf(relativeCurveTo.h));
        }

        public final int hashCode() {
            return Float.hashCode(this.h) + n30.b(this.g, n30.b(this.f, n30.b(this.e, n30.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            sb.append(this.f);
            sb.append(", dx3=");
            sb.append(this.g);
            sb.append(", dy3=");
            return h50.k(sb, this.h, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class RelativeHorizontalTo extends PathNode {
        public final float c;

        public RelativeHorizontalTo(float f) {
            super(3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.valueOf(this.c).equals(Float.valueOf(((RelativeHorizontalTo) obj).c));
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return h50.k(new StringBuilder("RelativeHorizontalTo(dx="), this.c, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class RelativeLineTo extends PathNode {
        public final float c;
        public final float d;

        public RelativeLineTo(float f, float f2) {
            super(3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(relativeLineTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(relativeLineTo.d));
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return h50.k(sb, this.d, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class RelativeMoveTo extends PathNode {
        public final float c;
        public final float d;

        public RelativeMoveTo(float f, float f2) {
            super(3);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(relativeMoveTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(relativeMoveTo.d));
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return h50.k(sb, this.d, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class RelativeQuadTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public RelativeQuadTo(float f, float f2, float f3, float f4) {
            super(1);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(relativeQuadTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(relativeQuadTo.d)) && Float.valueOf(this.e).equals(Float.valueOf(relativeQuadTo.e)) && Float.valueOf(this.f).equals(Float.valueOf(relativeQuadTo.f));
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + n30.b(this.e, n30.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            return h50.k(sb, this.f, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class RelativeReflectiveCurveTo extends PathNode {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public RelativeReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(2);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(relativeReflectiveCurveTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(relativeReflectiveCurveTo.d)) && Float.valueOf(this.e).equals(Float.valueOf(relativeReflectiveCurveTo.e)) && Float.valueOf(this.f).equals(Float.valueOf(relativeReflectiveCurveTo.f));
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + n30.b(this.e, n30.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.c);
            sb.append(", dy1=");
            sb.append(this.d);
            sb.append(", dx2=");
            sb.append(this.e);
            sb.append(", dy2=");
            return h50.k(sb, this.f, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class RelativeReflectiveQuadTo extends PathNode {
        public final float c;
        public final float d;

        public RelativeReflectiveQuadTo(float f, float f2) {
            super(1);
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.valueOf(this.c).equals(Float.valueOf(relativeReflectiveQuadTo.c)) && Float.valueOf(this.d).equals(Float.valueOf(relativeReflectiveQuadTo.d));
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.c);
            sb.append(", dy=");
            return h50.k(sb, this.d, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class RelativeVerticalTo extends PathNode {
        public final float c;

        public RelativeVerticalTo(float f) {
            super(3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.valueOf(this.c).equals(Float.valueOf(((RelativeVerticalTo) obj).c));
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return h50.k(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class VerticalTo extends PathNode {
        public final float c;

        public VerticalTo(float f) {
            super(3);
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.valueOf(this.c).equals(Float.valueOf(((VerticalTo) obj).c));
        }

        public final int hashCode() {
            return Float.hashCode(this.c);
        }

        public final String toString() {
            return h50.k(new StringBuilder("VerticalTo(y="), this.c, ')');
        }
    }

    public PathNode(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        this.a = z;
        this.b = z2;
    }
}

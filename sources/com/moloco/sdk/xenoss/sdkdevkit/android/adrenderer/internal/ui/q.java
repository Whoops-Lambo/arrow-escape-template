package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
public abstract class q {
    public static final int a = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    public static final class a extends q {
        public static final int e = 0;
        public final boolean b;
        public final int c;
        public final int d;

        public a(boolean z, int i, int i2) {
            super(null);
            this.b = z;
            this.c = i;
            this.d = i2;
        }

        public final int a() {
            return this.d;
        }

        public final boolean b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public /* synthetic */ a(boolean z, int i, int i2, e80 e80Var) {
            this(z, i, i2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    public static final class b extends q {
        public static final int g = 8;

        @NotNull
        public final Painter b;

        @Nullable
        public final String c;
        public final long d;

        @NotNull
        public final Shape e;
        public final long f;

        public final long a() {
            return this.f;
        }

        @NotNull
        public final Shape b() {
            return this.e;
        }

        @Nullable
        public final String c() {
            return this.c;
        }

        public final long d() {
            return this.d;
        }

        @NotNull
        public final Painter e() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Painter painter, String str, long j, Shape shape, long j2) {
            super(null);
            painter.getClass();
            shape.getClass();
            this.b = painter;
            this.c = str;
            this.d = j;
            this.e = shape;
            this.f = j2;
        }

        public /* synthetic */ b(Painter painter, String str, long j, Shape shape, long j2, e80 e80Var) {
            this(painter, str, j, shape, j2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    public static final class c extends q {
        public static final int c = 0;

        @NotNull
        public final String b;

        @NotNull
        public final String a() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String str) {
            super(null);
            str.getClass();
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    public static final class d extends q {
        public static final int l = 8;

        @NotNull
        public final String b;

        @NotNull
        public final Painter c;

        @Nullable
        public final String d;
        public final long e;

        @NotNull
        public final Shape f;
        public final long g;
        public final boolean h;
        public final boolean i;
        public final long j;
        public final long k;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(String str, Painter painter, String str2, long j, Shape shape, long j2, boolean z, boolean z2, long j3, long j4, int i, e80 e80Var) {
            long j5;
            if ((i & 512) != 0) {
                TextUnitType[] textUnitTypeArr = TextUnit.b;
                j5 = TextUnit.c;
            } else {
                j5 = j4;
            }
            this(str, painter, str2, j, shape, j2, z, z2, j3, j5, null);
        }

        public final long a() {
            return this.g;
        }

        @NotNull
        public final Shape b() {
            return this.f;
        }

        @Nullable
        public final String c() {
            return this.d;
        }

        public final long d() {
            return this.k;
        }

        public final long e() {
            return this.j;
        }

        public final long f() {
            return this.e;
        }

        @NotNull
        public final Painter g() {
            return this.c;
        }

        @NotNull
        public final String h() {
            return this.b;
        }

        public final boolean i() {
            return this.h;
        }

        public final boolean j() {
            return this.i;
        }

        public /* synthetic */ d(String str, Painter painter, String str2, long j, Shape shape, long j2, boolean z, boolean z2, long j3, long j4, e80 e80Var) {
            this(str, painter, str2, j, shape, j2, z, z2, j3, j4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Painter painter, String str2, long j, Shape shape, long j2, boolean z, boolean z2, long j3, long j4) {
            super(null);
            str.getClass();
            painter.getClass();
            shape.getClass();
            this.b = str;
            this.c = painter;
            this.d = str2;
            this.e = j;
            this.f = shape;
            this.g = j2;
            this.h = z;
            this.i = z2;
            this.j = j3;
            this.k = j4;
        }
    }

    public /* synthetic */ q(e80 e80Var) {
        this();
    }

    public q() {
    }
}

package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import defpackage.gg0;
import defpackage.jc1;
import defpackage.n30;
import defpackage.nj;
import defpackage.pv1;
import defpackage.s71;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "", "Builder", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ImageVector {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final VectorGroup f;
    public final long g;
    public final int h;
    public final boolean i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "GroupParams", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        public final String a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList i;
        public final GroupParams j;
        public boolean k;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class GroupParams {
            public final String a;
            public final float b;
            public final float c;
            public final float d;
            public final float e;
            public final float f;
            public final float g;
            public final float h;
            public final List i;
            public final List j;

            public GroupParams(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
                str = (i & 1) != 0 ? "" : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & 128) != 0 ? 0.0f : f7;
                if ((i & 256) != 0) {
                    int i2 = VectorKt.a;
                    list = gg0.a;
                }
                ArrayList arrayList = new ArrayList();
                list.getClass();
                this.a = str;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = f7;
                this.i = list;
                this.j = arrayList;
            }
        }

        public final void f() {
            if (this.k) {
                e32.i("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        public Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.a = str;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j;
            this.g = i;
            this.h = z;
            ArrayList arrayList = new ArrayList();
            this.i = arrayList;
            GroupParams groupParams = new GroupParams(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 1023);
            this.j = groupParams;
            arrayList.add(groupParams);
        }

        public final void a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
            list.getClass();
            f();
            this.i.add(new GroupParams(str, f, f2, f3, f4, f5, f6, f7, list, 512));
        }

        public final void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, Brush brush, Brush brush2, String str, List list) {
            list.getClass();
            f();
            ((GroupParams) nj.h(1, this.i)).j.add(new VectorPath(f, f2, f3, f4, f5, f6, f7, i, i2, i3, brush, brush2, str, list));
        }

        public final ImageVector d() {
            f();
            while (this.i.size() > 1) {
                e();
            }
            GroupParams groupParams = this.j;
            ImageVector imageVector = new ImageVector(this.a, this.b, this.c, this.d, this.e, new VectorGroup(groupParams.a, groupParams.b, groupParams.c, groupParams.d, groupParams.e, groupParams.f, groupParams.g, groupParams.h, groupParams.i, groupParams.j), this.f, this.g, this.h);
            this.k = true;
            return imageVector;
        }

        public final void e() {
            f();
            ArrayList arrayList = this.i;
            GroupParams groupParams = (GroupParams) arrayList.remove(arrayList.size() - 1);
            ((GroupParams) nj.h(1, arrayList)).j.add(new VectorGroup(groupParams.a, groupParams.b, groupParams.c, groupParams.d, groupParams.e, groupParams.f, groupParams.g, groupParams.h, groupParams.i, groupParams.j));
        }

        public Builder(String str) {
            this(str, 24.0f, 24.0f, 24.0f, 24.0f, Color.i, 5, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return s71.b(this.a, imageVector.a) && Dp.a(this.b, imageVector.b) && Dp.a(this.c, imageVector.c) && this.d == imageVector.d && this.e == imageVector.e && this.f.equals(imageVector.f) && Color.c(this.g, imageVector.g) && this.h == imageVector.h && this.i == imageVector.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + n30.b(this.e, n30.b(this.d, n30.b(this.c, n30.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = Color.j;
        return Boolean.hashCode(this.i) + jc1.d(this.h, pv1.d(iHashCode, 31, this.g), 31);
    }

    public ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = vectorGroup;
        this.g = j;
        this.h = i;
        this.i = z;
    }
}

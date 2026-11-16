package androidx.collection;

import android.content.res.ColorStateList;
import androidx.collection.internal.ContainerHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.G5;
import defpackage.n8;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ int[] a;
    public /* synthetic */ Object[] b;
    public /* synthetic */ int c;

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.c;
        if (i2 != 0 && i <= this.a[i2 - 1]) {
            d(i, colorStateList);
            return;
        }
        if (i2 >= this.a.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            this.a = Arrays.copyOf(this.a, i6);
            this.b = Arrays.copyOf(this.b, i6);
        }
        this.a[i2] = i;
        this.b[i2] = colorStateList;
        this.c = i2 + 1;
    }

    public final Object c(int i) {
        Object obj;
        int iA = ContainerHelpersKt.a(this.c, i, this.a);
        if (iA < 0 || (obj = this.b[iA]) == SparseArrayCompatKt.a) {
            return null;
        }
        return obj;
    }

    public final void d(int i, Object obj) {
        int iA = ContainerHelpersKt.a(this.c, i, this.a);
        if (iA >= 0) {
            this.b[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.c;
        if (i2 < i3) {
            Object[] objArr = this.b;
            if (objArr[i2] == SparseArrayCompatKt.a) {
                this.a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.a.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.a = Arrays.copyOf(this.a, i7);
            this.b = Arrays.copyOf(this.b, i7);
        }
        int i8 = this.c;
        if (i8 - i2 != 0) {
            int[] iArr = this.a;
            int i9 = i2 + 1;
            n8.O(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.b;
            n8.P(i9, i2, this.c, objArr2, objArr2);
        }
        this.a[i2] = i;
        this.b[i2] = obj;
        this.c++;
    }

    public final String toString() {
        int i = this.c;
        if (i <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.a[i3]);
            sb.append(G5.U);
            Object obj = this.b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public SparseArrayCompat() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.a = new int[i4];
        this.b = new Object[i4];
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final SparseArrayCompat clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.a = (int[]) this.a.clone();
        sparseArrayCompat.b = (Object[]) this.b.clone();
        return sparseArrayCompat;
    }
}

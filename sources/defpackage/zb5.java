package defpackage;

import com.google.android.gms.internal.measurement.zzabr;
import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzj;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zb5 extends zzzj {
    public Object[] a;
    public int b;

    public final int f(zzyl zzylVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(zzylVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final zzyl b(int i) {
        if (i < this.b) {
            return (zzyl) this.a[i + i];
        }
        dr0.b();
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final Object c(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        dr0.b();
        return null;
    }

    public final void e(zzyl zzylVar, Object obj) {
        int iF;
        if (!zzylVar.c && (iF = f(zzylVar)) != -1) {
            zzabr.a(obj, "metadata value");
            this.a[iF + iF + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i + i > length) {
            this.a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 + i2;
        objArr2[i3] = zzylVar;
        zzabr.a(obj, "metadata value");
        objArr2[i3 + 1] = obj;
        this.b++;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(b(i));
            sb.append("': ");
            sb.append(c(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    public final Object d(zzyl zzylVar) {
        int iF = f(zzylVar);
        if (iF != -1) {
            return zzylVar.b.cast(this.a[iF + iF + 1]);
        }
        return null;
    }
}

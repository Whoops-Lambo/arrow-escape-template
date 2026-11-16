package defpackage;

import com.google.android.gms.internal.games_v2.zzhg;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rx4 extends zzhg {
    public static final rx4 g = new rx4(0, null, new Object[0]);
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.games_v2.zzhg, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.f;
            Object[] objArr = this.e;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iT = qb5.t(obj.hashCode());
                    while (true) {
                        int i2 = iT & length;
                        int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iT = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iT2 = qb5.t(obj.hashCode());
                    while (true) {
                        int i4 = iT2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iT2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iT3 = qb5.t(obj.hashCode());
                    while (true) {
                        int i5 = iT3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iT3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhg
    public final hx4 d() {
        return new hx4(this, this.e, this.f);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhg
    public final lx4 f() {
        return new lx4(this, new ox4(this.e, 0, this.f));
    }

    @Override // com.google.android.gms.internal.games_v2.zzhg
    public final ox4 g() {
        return new ox4(this.e, 1, this.f);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    public rx4(int i, Object obj, Object[] objArr) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }
}

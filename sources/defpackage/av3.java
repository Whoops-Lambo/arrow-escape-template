package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class av3 extends zzal {
    public static final av3 g = new av3(0, null, new Object[0]);
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.e;
            if (this.f == 1) {
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
                    int iB = vk3.B(obj.hashCode());
                    while (true) {
                        int i = iB & length;
                        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iB = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iB2 = vk3.B(obj.hashCode());
                    while (true) {
                        int i3 = iB2 & length2;
                        int i4 = sArr[i3] & 65535;
                        if (i4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iB2 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iB3 = vk3.B(obj.hashCode());
                    while (true) {
                        int i5 = iB3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iB3 = i5 + 1;
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final lw3 d() {
        return new lw3(this.e, 1, this.f);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zv3 f() {
        return new zv3(this, this.e, this.f);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final mw3 g() {
        return new mw3(this, new lw3(this.e, 0, this.f));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    public av3(int i, Object obj, Object[] objArr) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }
}

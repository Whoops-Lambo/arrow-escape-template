package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.sr0;
import defpackage.wr0;
import defpackage.zr0;
import java.util.HashSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "ApplyMap", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SnapshotStateObserver {
    public final wr0 a;
    public final zr0 b = new SnapshotStateObserver$applyObserver$1(this);
    public final wr0 c = new SnapshotStateObserver$readObserver$1(this);
    public final MutableVector d;
    public ObserverHandle e;
    public ApplyMap f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ApplyMap<T> {
        public final wr0 a;
        public final IdentityScopeMap b;
        public final HashSet c;
        public Object d;

        public ApplyMap(wr0 wr0Var) {
            wr0Var.getClass();
            this.a = wr0Var;
            this.b = new IdentityScopeMap();
            this.c = new HashSet();
        }
    }

    public final void a() {
        synchronized (this.d) {
            MutableVector mutableVector = this.d;
            int i = mutableVector.c;
            if (i > 0) {
                Object[] objArr = mutableVector.a;
                int i2 = 0;
                do {
                    IdentityScopeMap identityScopeMap = ((ApplyMap) objArr[i2]).b;
                    int length = identityScopeMap.c.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        IdentityArraySet identityArraySet = identityScopeMap.c[i3];
                        if (identityArraySet != null) {
                            identityArraySet.clear();
                        }
                        identityScopeMap.a[i3] = i3;
                        identityScopeMap.b[i3] = null;
                    }
                    identityScopeMap.d = 0;
                    i2++;
                } while (i2 < i);
            }
        }
    }

    public final void b(Object obj) {
        synchronized (this.d) {
            try {
                MutableVector mutableVector = this.d;
                int i = mutableVector.c;
                if (i > 0) {
                    Object[] objArr = mutableVector.a;
                    int i2 = 0;
                    do {
                        IdentityScopeMap identityScopeMap = ((ApplyMap) objArr[i2]).b;
                        int i3 = identityScopeMap.d;
                        int i4 = 0;
                        for (int i5 = 0; i5 < i3; i5++) {
                            int i6 = identityScopeMap.a[i5];
                            IdentityArraySet identityArraySet = identityScopeMap.c[i6];
                            identityArraySet.getClass();
                            int i7 = identityArraySet.a;
                            int i8 = 0;
                            for (int i9 = 0; i9 < i7; i9++) {
                                Object[] objArr2 = identityArraySet.b;
                                Object obj2 = objArr2[i9];
                                if (obj2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                }
                                if (obj2 != obj) {
                                    if (i8 != i9) {
                                        objArr2[i8] = obj2;
                                    }
                                    i8++;
                                }
                            }
                            int i10 = identityArraySet.a;
                            for (int i11 = i8; i11 < i10; i11++) {
                                identityArraySet.b[i11] = null;
                            }
                            identityArraySet.a = i8;
                            if (i8 > 0) {
                                if (i4 != i5) {
                                    int[] iArr = identityScopeMap.a;
                                    int i12 = iArr[i4];
                                    iArr[i4] = i6;
                                    iArr[i5] = i12;
                                }
                                i4++;
                            }
                        }
                        int i13 = identityScopeMap.d;
                        for (int i14 = i4; i14 < i13; i14++) {
                            identityScopeMap.b[identityScopeMap.a[i14]] = null;
                        }
                        identityScopeMap.d = i4;
                        i2++;
                    } while (i2 < i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(wr0 wr0Var) {
        synchronized (this.d) {
            try {
                MutableVector mutableVector = this.d;
                int i = mutableVector.c;
                if (i > 0) {
                    Object[] objArr = mutableVector.a;
                    int i2 = 0;
                    do {
                        IdentityScopeMap identityScopeMap = ((ApplyMap) objArr[i2]).b;
                        int i3 = identityScopeMap.d;
                        int i4 = 0;
                        for (int i5 = 0; i5 < i3; i5++) {
                            int i6 = identityScopeMap.a[i5];
                            IdentityArraySet identityArraySet = identityScopeMap.c[i6];
                            identityArraySet.getClass();
                            int i7 = identityArraySet.a;
                            int i8 = 0;
                            for (int i9 = 0; i9 < i7; i9++) {
                                Object obj = identityArraySet.b[i9];
                                if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                }
                                if (!((Boolean) wr0Var.invoke(obj)).booleanValue()) {
                                    if (i8 != i9) {
                                        identityArraySet.b[i8] = obj;
                                    }
                                    i8++;
                                }
                            }
                            int i10 = identityArraySet.a;
                            for (int i11 = i8; i11 < i10; i11++) {
                                identityArraySet.b[i11] = null;
                            }
                            identityArraySet.a = i8;
                            if (i8 > 0) {
                                if (i4 != i5) {
                                    int[] iArr = identityScopeMap.a;
                                    int i12 = iArr[i4];
                                    iArr[i4] = i6;
                                    iArr[i5] = i12;
                                }
                                i4++;
                            }
                        }
                        int i13 = identityScopeMap.d;
                        for (int i14 = i4; i14 < i13; i14++) {
                            identityScopeMap.b[identityScopeMap.a[i14]] = null;
                        }
                        identityScopeMap.d = i4;
                        i2++;
                    } while (i2 < i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ObserverHandle observerHandle = this.e;
        if (observerHandle != null) {
            ((Snapshot$Companion$registerApplyObserver$2) observerHandle).dispose();
        }
    }

    public SnapshotStateObserver(wr0 wr0Var) {
        this.a = wr0Var;
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new ApplyMap[16];
        mutableVector.c = 0;
        this.d = mutableVector;
    }

    public final void d(Object obj, wr0 wr0Var, sr0 sr0Var) {
        int i;
        ApplyMap applyMap;
        obj.getClass();
        wr0Var.getClass();
        sr0Var.getClass();
        ApplyMap applyMap2 = this.f;
        synchronized (this.d) {
            MutableVector mutableVector = this.d;
            int i2 = mutableVector.c;
            if (i2 > 0) {
                Object[] objArr = mutableVector.a;
                i = 0;
                while (((ApplyMap) objArr[i]).a != wr0Var) {
                    i++;
                    if (i >= i2) {
                        i = -1;
                        break;
                    }
                }
            } else {
                i = -1;
                break;
            }
            if (i == -1) {
                applyMap = new ApplyMap(wr0Var);
                mutableVector.b(applyMap);
            } else {
                applyMap = (ApplyMap) mutableVector.a[i];
            }
            applyMap.b.d(obj);
        }
        Object obj2 = applyMap.d;
        applyMap.d = obj;
        this.f = applyMap;
        Snapshot.Companion.b(sr0Var, this.c);
        this.f = applyMap2;
        applyMap.d = obj2;
    }
}

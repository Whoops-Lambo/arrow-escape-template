package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.StateObject;
import defpackage.as0;
import defpackage.d;
import defpackage.dt1;
import defpackage.e32;
import defpackage.m32;
import defpackage.n8;
import defpackage.s71;
import defpackage.sr0;
import defpackage.wb0;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CompositionImpl implements ControlledComposition {
    public final CompositionContext a;
    public final AbstractApplier b;
    public final AtomicReference c;
    public final Object d;
    public final HashSet e;
    public final SlotTable f;
    public final IdentityScopeMap g;
    public final HashSet h;
    public final IdentityScopeMap i;
    public final ArrayList j;
    public final ArrayList k;
    public final IdentityScopeMap l;
    public IdentityArrayMap m;
    public boolean n;
    public CompositionImpl o;
    public int p;
    public final ComposerImpl q;
    public boolean r;
    public zr0 s;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class RememberEventDispatcher implements RememberManager {
        public final Set a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;

        @Override // androidx.compose.runtime.RememberManager
        public final void a(RememberObserver rememberObserver) {
            ArrayList arrayList = this.b;
            int iLastIndexOf = arrayList.lastIndexOf(rememberObserver);
            if (iLastIndexOf < 0) {
                this.c.add(rememberObserver);
            } else {
                arrayList.remove(iLastIndexOf);
                this.a.remove(rememberObserver);
            }
        }

        public final void d() {
            Set set = this.a;
            if (set.isEmpty()) {
                return;
            }
            android.os.Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    RememberObserver rememberObserver = (RememberObserver) it.next();
                    it.remove();
                    rememberObserver.d();
                }
                android.os.Trace.endSection();
            } catch (Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        }

        public final void e() {
            ArrayList arrayList = this.c;
            boolean zIsEmpty = arrayList.isEmpty();
            Set set = this.a;
            if (!zIsEmpty) {
                android.os.Trace.beginSection("Compose:onForgotten");
                try {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (-1 >= size) {
                            break;
                        }
                        RememberObserver rememberObserver = (RememberObserver) arrayList.get(size);
                        if (!set.contains(rememberObserver)) {
                            rememberObserver.e();
                        }
                    }
                    android.os.Trace.endSection();
                } catch (Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            }
            ArrayList arrayList2 = this.b;
            if (arrayList2.isEmpty()) {
                return;
            }
            android.os.Trace.beginSection("Compose:onRemembered");
            try {
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    RememberObserver rememberObserver2 = (RememberObserver) arrayList2.get(i);
                    set.remove(rememberObserver2);
                    rememberObserver2.a();
                }
                android.os.Trace.endSection();
            } catch (Throwable th2) {
                android.os.Trace.endSection();
                throw th2;
            }
        }

        public RememberEventDispatcher(HashSet hashSet) {
            hashSet.getClass();
            this.a = hashSet;
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        @Override // androidx.compose.runtime.RememberManager
        public final void b(sr0 sr0Var) {
            sr0Var.getClass();
            this.d.add(sr0Var);
        }

        @Override // androidx.compose.runtime.RememberManager
        public final void c(RememberObserver rememberObserver) {
            rememberObserver.getClass();
            ArrayList arrayList = this.c;
            int iLastIndexOf = arrayList.lastIndexOf(rememberObserver);
            if (iLastIndexOf >= 0) {
                arrayList.remove(iLastIndexOf);
                this.a.remove(rememberObserver);
            } else {
                this.b.add(rememberObserver);
            }
        }
    }

    public final void v() {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (s71.b(andSet, CompositionKt.a)) {
            return;
        }
        if (andSet instanceof Set) {
            p((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                e32.i("calling recordModificationsOf and applyChanges concurrently is not supported");
                return;
            } else {
                wb0.d(atomicReference, "corrupt pendingModifications drain: ");
                return;
            }
        }
        for (Set set : (Set[]) andSet) {
            p(set, false);
        }
    }

    public static final void q(CompositionImpl compositionImpl, boolean z, m32 m32Var, Object obj) {
        InvalidationResult invalidationResultW;
        IdentityScopeMap identityScopeMap = compositionImpl.g;
        int iB = identityScopeMap.b(obj);
        if (iB >= 0) {
            IdentityArraySet.AnonymousClass1 anonymousClass1 = new IdentityArraySet.AnonymousClass1();
            while (anonymousClass1.hasNext()) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) anonymousClass1.next();
                if (!compositionImpl.l.c(obj, recomposeScopeImpl)) {
                    CompositionImpl compositionImpl2 = recomposeScopeImpl.b;
                    InvalidationResult invalidationResult = InvalidationResult.a;
                    if (compositionImpl2 == null || (invalidationResultW = compositionImpl2.w(recomposeScopeImpl, obj)) == null) {
                        invalidationResultW = invalidationResult;
                    }
                    if (invalidationResultW != invalidationResult) {
                        if (recomposeScopeImpl.g == null || z) {
                            HashSet hashSet = (HashSet) m32Var.a;
                            if (hashSet == null) {
                                hashSet = new HashSet();
                                m32Var.a = hashSet;
                            }
                            hashSet.add(recomposeScopeImpl);
                        } else {
                            compositionImpl.h.add(recomposeScopeImpl);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getR() {
        return this.r;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean c(IdentityArraySet identityArraySet) {
        IdentityArraySet.AnonymousClass1 anonymousClass1 = new IdentityArraySet.AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            Object next = anonymousClass1.next();
            IdentityScopeMap identityScopeMap = this.g;
            identityScopeMap.getClass();
            next.getClass();
            if (identityScopeMap.b(next) >= 0) {
                return true;
            }
            IdentityScopeMap identityScopeMap2 = this.i;
            identityScopeMap2.getClass();
            if (identityScopeMap2.b(next) >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void d(sr0 sr0Var) {
        ComposerImpl composerImpl = this.q;
        composerImpl.getClass();
        if (composerImpl.C) {
            ComposerKt.c("Preparing a composition while composing is not supported");
            throw null;
        }
        composerImpl.C = true;
        try {
            ((Recomposer$performRecompose$1$1) sr0Var).invoke();
        } finally {
            composerImpl.C = false;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public final void dispose() {
        synchronized (this.d) {
            try {
                if (!this.r) {
                    boolean z = true;
                    this.r = true;
                    ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CompositionKt.b;
                    if (this.f.b <= 0) {
                        z = false;
                    }
                    if (z || !this.e.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.e);
                        if (z) {
                            SlotWriter slotWriterD = this.f.d();
                            try {
                                ComposerKt.e(slotWriterD, rememberEventDispatcher);
                                slotWriterD.f();
                                this.b.i();
                                rememberEventDispatcher.e();
                            } catch (Throwable th) {
                                slotWriterD.f();
                                throw th;
                            }
                        }
                        rememberEventDispatcher.d();
                    }
                    this.q.O();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.a.p(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void e() {
        synchronized (this.d) {
            this.q.u.clear();
            if (!this.e.isEmpty()) {
                new RememberEventDispatcher(this.e).d();
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void f() {
        synchronized (this.d) {
            if (!this.k.isEmpty()) {
                r(this.k);
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean g() {
        boolean z;
        synchronized (this.d) {
            try {
                u();
                try {
                    ComposerImpl composerImpl = this.q;
                    IdentityArrayMap identityArrayMap = this.m;
                    this.m = new IdentityArrayMap();
                    composerImpl.getClass();
                    identityArrayMap.getClass();
                    if (!composerImpl.e.isEmpty()) {
                        ComposerKt.c("Expected applyChanges() to have been called");
                        throw null;
                    }
                    if (identityArrayMap.c <= 0 && composerImpl.r.isEmpty()) {
                        z = false;
                    } else {
                        composerImpl.P(identityArrayMap, null);
                        z = !composerImpl.e.isEmpty();
                    }
                    if (!z) {
                        v();
                    }
                } catch (Throwable th) {
                    if (!this.e.isEmpty()) {
                        new RememberEventDispatcher(this.e).d();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[PHI: r5
  0x00c5: PHI (r5v1 int) = (r5v0 int), (r5v8 int) binds: [B:20:0x005f, B:50:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    @Override // androidx.compose.runtime.ControlledComposition
    public final void h(Object obj) {
        RecomposeScopeImpl recomposeScopeImplW;
        int i;
        int i2;
        Object[] objArr;
        int i3;
        ComposerImpl composerImpl = this.q;
        if (composerImpl.z <= 0 && (recomposeScopeImplW = composerImpl.W()) != null) {
            recomposeScopeImplW.a |= 1;
            this.g.a(obj, recomposeScopeImplW);
            boolean z = obj instanceof DerivedState;
            if (z) {
                IdentityScopeMap identityScopeMap = this.i;
                identityScopeMap.d(obj);
                Iterator it = ((DerivedState) obj).f().iterator();
                while (it.hasNext()) {
                    identityScopeMap.a((StateObject) it.next(), obj);
                }
            }
            if ((recomposeScopeImplW.a & 32) != 0) {
                return;
            }
            IdentityArrayIntMap identityArrayIntMap = recomposeScopeImplW.f;
            if (identityArrayIntMap == null) {
                identityArrayIntMap = new IdentityArrayIntMap();
                identityArrayIntMap.b = new Object[4];
                identityArrayIntMap.c = new int[4];
                recomposeScopeImplW.f = identityArrayIntMap;
            }
            int i4 = recomposeScopeImplW.e;
            int i5 = identityArrayIntMap.a;
            int i6 = -1;
            if (i5 > 0) {
                int i7 = i5 - 1;
                int iIdentityHashCode = System.identityHashCode(obj);
                int i8 = 0;
                while (true) {
                    if (i8 <= i7) {
                        int i9 = (i8 + i7) >>> 1;
                        Object obj2 = identityArrayIntMap.b[i9];
                        int iIdentityHashCode2 = System.identityHashCode(obj2);
                        if (iIdentityHashCode2 >= iIdentityHashCode) {
                            if (iIdentityHashCode2 <= iIdentityHashCode) {
                                if (obj2 != obj) {
                                    i3 = i9 - 1;
                                    while (true) {
                                        if (-1 < i3) {
                                            Object obj3 = identityArrayIntMap.b[i3];
                                            if (obj3 != obj) {
                                                if (System.identityHashCode(obj3) == iIdentityHashCode) {
                                                    i3--;
                                                }
                                            }
                                        }
                                        i9++;
                                        int i10 = identityArrayIntMap.a;
                                        while (true) {
                                            if (i9 >= i10) {
                                                i3 = -(identityArrayIntMap.a + 1);
                                            } else {
                                                Object obj4 = identityArrayIntMap.b[i9];
                                                if (obj4 != obj) {
                                                    if (System.identityHashCode(obj4) != iIdentityHashCode) {
                                                        i3 = -(i9 + 1);
                                                    } else {
                                                        i9++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i6 = i9;
                                break;
                            }
                            i7 = i9 - 1;
                        } else {
                            i8 = i9 + 1;
                        }
                    } else {
                        i3 = -(i8 + 1);
                    }
                    i6 = i3;
                    break;
                }
                if (i6 >= 0) {
                    identityArrayIntMap.c[i6] = i4;
                } else {
                    i = -(i6 + 1);
                    i2 = identityArrayIntMap.a;
                    objArr = identityArrayIntMap.b;
                    if (i2 == objArr.length) {
                        Object[] objArr2 = new Object[objArr.length * 2];
                        int[] iArr = new int[objArr.length * 2];
                        int i11 = i + 1;
                        n8.P(i11, i, i2, objArr, objArr2);
                        n8.O(i11, i, identityArrayIntMap.a, identityArrayIntMap.c, iArr);
                        n8.S(0, i, 6, identityArrayIntMap.b, objArr2);
                        n8.T(i, 6, identityArrayIntMap.c, iArr);
                        identityArrayIntMap.b = objArr2;
                        identityArrayIntMap.c = iArr;
                    } else {
                        int i12 = i + 1;
                        n8.P(i12, i, i2, objArr, objArr);
                        int[] iArr2 = identityArrayIntMap.c;
                        n8.O(i12, i, identityArrayIntMap.a, iArr2, iArr2);
                    }
                    identityArrayIntMap.b[i] = obj;
                    identityArrayIntMap.c[i] = i4;
                    identityArrayIntMap.a++;
                }
            } else {
                i = -(i6 + 1);
                i2 = identityArrayIntMap.a;
                objArr = identityArrayIntMap.b;
                if (i2 == objArr.length) {
                    Object[] objArr3 = new Object[objArr.length * 2];
                    int[] iArr3 = new int[objArr.length * 2];
                    int i13 = i + 1;
                    n8.P(i13, i, i2, objArr, objArr3);
                    n8.O(i13, i, identityArrayIntMap.a, identityArrayIntMap.c, iArr3);
                    n8.S(0, i, 6, identityArrayIntMap.b, objArr3);
                    n8.T(i, 6, identityArrayIntMap.c, iArr3);
                    identityArrayIntMap.b = objArr3;
                    identityArrayIntMap.c = iArr3;
                } else {
                    int i14 = i + 1;
                    n8.P(i14, i, i2, objArr, objArr);
                    int[] iArr4 = identityArrayIntMap.c;
                    n8.O(i14, i, identityArrayIntMap.a, iArr4, iArr4);
                }
                identityArrayIntMap.b[i] = obj;
                identityArrayIntMap.c[i] = i4;
                identityArrayIntMap.a++;
            }
            if (z) {
                IdentityArrayMap identityArrayMap = recomposeScopeImplW.g;
                if (identityArrayMap == null) {
                    identityArrayMap = new IdentityArrayMap();
                    recomposeScopeImplW.g = identityArrayMap;
                }
                identityArrayMap.b(obj, ((DerivedState) obj).e());
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void j() {
        synchronized (this.d) {
            r(this.j);
            v();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean k() {
        return this.q.C;
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean m() {
        boolean z;
        synchronized (this.d) {
            z = this.m.c > 0;
        }
        return z;
    }

    @Override // androidx.compose.runtime.Composition
    public final void n(zr0 zr0Var) {
        if (this.r) {
            e32.i("The composition is disposed");
        } else {
            this.s = zr0Var;
            this.a.a(this, (ComposableLambdaImpl) zr0Var);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void o() {
        synchronized (this.d) {
            try {
                for (Object obj : this.f.c) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(Set set, boolean z) {
        Object obj;
        HashSet hashSet;
        m32 m32Var = new m32();
        Iterator it = set.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof RecomposeScopeImpl) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                CompositionImpl compositionImpl = recomposeScopeImpl.b;
                if (compositionImpl != null) {
                    compositionImpl.w(recomposeScopeImpl, null);
                }
            } else {
                q(this, z, m32Var, next);
                IdentityScopeMap identityScopeMap = this.i;
                int iB = identityScopeMap.b(next);
                if (iB >= 0) {
                    IdentityArraySet.AnonymousClass1 anonymousClass1 = new IdentityArraySet.AnonymousClass1();
                    while (anonymousClass1.hasNext()) {
                        q(this, z, m32Var, (DerivedState) anonymousClass1.next());
                    }
                }
            }
        }
        IdentityScopeMap identityScopeMap2 = this.g;
        if (z) {
            HashSet hashSet2 = this.h;
            if (!hashSet2.isEmpty()) {
                int i = identityScopeMap2.d;
                int i2 = 0;
                int i3 = 0;
                while (i2 < i) {
                    int i4 = identityScopeMap2.a[i2];
                    IdentityArraySet identityArraySet = identityScopeMap2.c[i4];
                    identityArraySet.getClass();
                    int i5 = identityArraySet.a;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < i5) {
                        Object obj2 = identityArraySet.b[i6];
                        if (obj2 == null) {
                            d.w("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            return;
                        }
                        Object obj3 = obj;
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
                        if (!hashSet2.contains(recomposeScopeImpl2) && ((hashSet = (HashSet) m32Var.a) == null || !hashSet.contains(recomposeScopeImpl2))) {
                            if (i7 != i6) {
                                identityArraySet.b[i7] = obj2;
                            }
                            i7++;
                        }
                        i6++;
                        obj = obj3;
                    }
                    Object obj4 = obj;
                    int i8 = identityArraySet.a;
                    for (int i9 = i7; i9 < i8; i9++) {
                        identityArraySet.b[i9] = obj4;
                    }
                    identityArraySet.a = i7;
                    if (i7 > 0) {
                        if (i3 != i2) {
                            int[] iArr = identityScopeMap2.a;
                            int i10 = iArr[i3];
                            iArr[i3] = i4;
                            iArr[i2] = i10;
                        }
                        i3++;
                    }
                    i2++;
                    obj = obj4;
                }
                Object obj5 = obj;
                int i11 = identityScopeMap2.d;
                for (int i12 = i3; i12 < i11; i12++) {
                    identityScopeMap2.b[identityScopeMap2.a[i12]] = obj5;
                }
                identityScopeMap2.d = i3;
                s();
                hashSet2.clear();
                return;
            }
        }
        HashSet hashSet3 = (HashSet) m32Var.a;
        if (hashSet3 != null) {
            int i13 = identityScopeMap2.d;
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = identityScopeMap2.a[i15];
                IdentityArraySet identityArraySet2 = identityScopeMap2.c[i16];
                identityArraySet2.getClass();
                int i17 = identityArraySet2.a;
                int i18 = 0;
                for (int i19 = 0; i19 < i17; i19++) {
                    Object obj6 = identityArraySet2.b[i19];
                    if (obj6 == null) {
                        d.w("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        return;
                    }
                    if (!hashSet3.contains((RecomposeScopeImpl) obj6)) {
                        if (i18 != i19) {
                            identityArraySet2.b[i18] = obj6;
                        }
                        i18++;
                    }
                }
                int i20 = identityArraySet2.a;
                for (int i21 = i18; i21 < i20; i21++) {
                    identityArraySet2.b[i21] = null;
                }
                identityArraySet2.a = i18;
                if (i18 > 0) {
                    if (i14 != i15) {
                        int[] iArr2 = identityScopeMap2.a;
                        int i22 = iArr2[i14];
                        iArr2[i14] = i16;
                        iArr2[i15] = i22;
                    }
                    i14++;
                }
            }
            int i23 = identityScopeMap2.d;
            for (int i24 = i14; i24 < i23; i24++) {
                identityScopeMap2.b[identityScopeMap2.a[i24]] = null;
            }
            identityScopeMap2.d = i14;
            s();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    public final void r(ArrayList arrayList) {
        AbstractApplier abstractApplier;
        boolean z;
        ArrayList arrayList2 = this.k;
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.e);
        try {
            if (arrayList.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    rememberEventDispatcher.d();
                    return;
                }
                return;
            }
            android.os.Trace.beginSection("Compose:applyChanges");
            try {
                SlotWriter slotWriterD = this.f.d();
                try {
                    int size = arrayList.size();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        abstractApplier = this.b;
                        if (i2 >= size) {
                            break;
                        }
                        ((as0) arrayList.get(i2)).invoke(abstractApplier, slotWriterD, rememberEventDispatcher);
                        i2++;
                    }
                    arrayList.clear();
                    slotWriterD.f();
                    abstractApplier.b();
                    android.os.Trace.endSection();
                    rememberEventDispatcher.e();
                    ArrayList arrayList3 = rememberEventDispatcher.d;
                    if (!arrayList3.isEmpty()) {
                        android.os.Trace.beginSection("Compose:sideeffects");
                        try {
                            int size2 = arrayList3.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                ((sr0) arrayList3.get(i3)).invoke();
                            }
                            arrayList3.clear();
                            android.os.Trace.endSection();
                        } catch (Throwable th) {
                            android.os.Trace.endSection();
                            throw th;
                        }
                    }
                    if (this.n) {
                        android.os.Trace.beginSection("Compose:unobserve");
                        try {
                            this.n = false;
                            IdentityScopeMap identityScopeMap = this.g;
                            int i4 = identityScopeMap.d;
                            int i5 = 0;
                            int i6 = 0;
                            while (i5 < i4) {
                                int i7 = identityScopeMap.a[i5];
                                IdentityArraySet identityArraySet = identityScopeMap.c[i7];
                                identityArraySet.getClass();
                                int i8 = identityArraySet.a;
                                int i9 = i;
                                int i10 = i9;
                                while (i9 < i8) {
                                    Object obj = identityArraySet.b[i9];
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                                    if (recomposeScopeImpl.b == null) {
                                        z = false;
                                    } else {
                                        Anchor anchor = recomposeScopeImpl.c;
                                        if (anchor != null ? anchor.a() : false) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        if (i10 != i9) {
                                            identityArraySet.b[i10] = obj;
                                        }
                                        i10++;
                                    }
                                    i9++;
                                }
                                int i11 = identityArraySet.a;
                                for (int i12 = i10; i12 < i11; i12++) {
                                    identityArraySet.b[i12] = null;
                                }
                                identityArraySet.a = i10;
                                if (i10 > 0) {
                                    if (i6 != i5) {
                                        int[] iArr = identityScopeMap.a;
                                        int i13 = iArr[i6];
                                        iArr[i6] = i7;
                                        iArr[i5] = i13;
                                    }
                                    i6++;
                                }
                                i5++;
                                i = 0;
                            }
                            int i14 = identityScopeMap.d;
                            for (int i15 = i6; i15 < i14; i15++) {
                                identityScopeMap.b[identityScopeMap.a[i15]] = null;
                            }
                            identityScopeMap.d = i6;
                            s();
                            android.os.Trace.endSection();
                        } catch (Throwable th2) {
                            android.os.Trace.endSection();
                            throw th2;
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        rememberEventDispatcher.d();
                    }
                } catch (Throwable th3) {
                    slotWriterD.f();
                    throw th3;
                }
            } catch (Throwable th4) {
                android.os.Trace.endSection();
                throw th4;
            }
        } catch (Throwable th5) {
            if (arrayList2.isEmpty()) {
                rememberEventDispatcher.d();
            }
            throw th5;
        }
    }

    public final void s() {
        IdentityScopeMap identityScopeMap = this.i;
        int i = identityScopeMap.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = identityScopeMap.a[i3];
            IdentityArraySet identityArraySet = identityScopeMap.c[i4];
            identityArraySet.getClass();
            int i5 = identityArraySet.a;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = identityArraySet.b[i7];
                if (obj == null) {
                    d.w("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    return;
                }
                IdentityScopeMap identityScopeMap2 = this.g;
                identityScopeMap2.getClass();
                if (identityScopeMap2.b((DerivedState) obj) >= 0) {
                    if (i6 != i7) {
                        identityArraySet.b[i6] = obj;
                    }
                    i6++;
                }
            }
            int i8 = identityArraySet.a;
            for (int i9 = i6; i9 < i8; i9++) {
                identityArraySet.b[i9] = null;
            }
            identityArraySet.a = i6;
            if (i6 > 0) {
                if (i2 != i3) {
                    int[] iArr = identityScopeMap.a;
                    int i10 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i10;
                }
                i2++;
            }
        }
        int i11 = identityScopeMap.d;
        for (int i12 = i2; i12 < i11; i12++) {
            identityScopeMap.b[identityScopeMap.a[i12]] = null;
        }
        identityScopeMap.d = i2;
        Iterator it = this.h.iterator();
        it.getClass();
        while (it.hasNext()) {
            if (((RecomposeScopeImpl) it.next()).g == null) {
                it.remove();
            }
        }
    }

    public final void t(ComposableLambdaImpl composableLambdaImpl) {
        try {
            synchronized (this.d) {
                u();
                ComposerImpl composerImpl = this.q;
                IdentityArrayMap identityArrayMap = this.m;
                this.m = new IdentityArrayMap();
                composerImpl.getClass();
                identityArrayMap.getClass();
                if (!composerImpl.e.isEmpty()) {
                    ComposerKt.c("Expected applyChanges() to have been called");
                    throw null;
                }
                composerImpl.P(identityArrayMap, composableLambdaImpl);
            }
        } catch (Throwable th) {
            if (!this.e.isEmpty()) {
                new RememberEventDispatcher(this.e).d();
            }
            throw th;
        }
    }

    public final void u() {
        AtomicReference atomicReference = this.c;
        Object obj = CompositionKt.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                e32.i("pending composition has not been applied");
                return;
            }
            if (andSet instanceof Set) {
                p((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                wb0.d(atomicReference, "corrupt pendingModifications drain: ");
                return;
            }
            for (Set set : (Set[]) andSet) {
                p(set, true);
            }
        }
    }

    public final InvalidationResult w(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int i = recomposeScopeImpl.a;
        if ((i & 2) != 0) {
            recomposeScopeImpl.a = i | 4;
        }
        Anchor anchor = recomposeScopeImpl.c;
        return (anchor != null && this.f.e(anchor) && anchor.a() && anchor.a() && recomposeScopeImpl.d != null) ? x(recomposeScopeImpl, anchor, obj) : InvalidationResult.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    public final InvalidationResult x(RecomposeScopeImpl recomposeScopeImpl, Anchor anchor, Object obj) {
        synchronized (this.d) {
            try {
                CompositionImpl compositionImpl = this.o;
                if (compositionImpl != null) {
                    SlotTable slotTable = this.f;
                    int i = this.p;
                    slotTable.getClass();
                    anchor.getClass();
                    if (slotTable.f) {
                        ComposerKt.c("Writer is active");
                        throw null;
                    }
                    if (i < 0 || i >= slotTable.b) {
                        ComposerKt.c("Invalid group index");
                        throw null;
                    }
                    if (slotTable.e(anchor)) {
                        int i2 = slotTable.a[(i * 5) + 3] + i;
                        int i3 = anchor.a;
                        if (i > i3 || i3 >= i2) {
                            compositionImpl = null;
                        }
                    } else {
                        compositionImpl = null;
                    }
                } else {
                    compositionImpl = null;
                }
                if (compositionImpl == null) {
                    ComposerImpl composerImpl = this.q;
                    if (composerImpl.C && composerImpl.w0(recomposeScopeImpl, obj)) {
                        return InvalidationResult.d;
                    }
                    IdentityArrayMap identityArrayMap = this.m;
                    if (obj == null) {
                        identityArrayMap.b(recomposeScopeImpl, null);
                    } else {
                        identityArrayMap.getClass();
                        if (identityArrayMap.a(recomposeScopeImpl) >= 0) {
                            int iA = identityArrayMap.a(recomposeScopeImpl);
                            IdentityArraySet identityArraySet = (IdentityArraySet) (iA >= 0 ? identityArrayMap.b[iA] : null);
                            if (identityArraySet != null) {
                                identityArraySet.add(obj);
                            }
                        } else {
                            IdentityArraySet identityArraySet2 = new IdentityArraySet();
                            identityArraySet2.add(obj);
                            identityArrayMap.b(recomposeScopeImpl, identityArraySet2);
                        }
                    }
                }
                if (compositionImpl != null) {
                    return compositionImpl.x(recomposeScopeImpl, anchor, obj);
                }
                this.a.i(this);
                return this.q.C ? InvalidationResult.c : InvalidationResult.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(Object obj) {
        InvalidationResult invalidationResultW;
        IdentityScopeMap identityScopeMap = this.g;
        int iB = identityScopeMap.b(obj);
        if (iB >= 0) {
            IdentityArraySet.AnonymousClass1 anonymousClass1 = new IdentityArraySet.AnonymousClass1();
            while (anonymousClass1.hasNext()) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) anonymousClass1.next();
                CompositionImpl compositionImpl = recomposeScopeImpl.b;
                if (compositionImpl == null || (invalidationResultW = compositionImpl.w(recomposeScopeImpl, obj)) == null) {
                    invalidationResultW = InvalidationResult.a;
                }
                if (invalidationResultW == InvalidationResult.d) {
                    this.l.a(obj, recomposeScopeImpl);
                }
            }
        }
    }

    public CompositionImpl(CompositionContext compositionContext, AbstractApplier abstractApplier) {
        compositionContext.getClass();
        this.a = compositionContext;
        this.b = abstractApplier;
        this.c = new AtomicReference(null);
        this.d = new Object();
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        SlotTable slotTable = new SlotTable();
        this.f = slotTable;
        this.g = new IdentityScopeMap();
        this.h = new HashSet();
        this.i = new IdentityScopeMap();
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.k = arrayList2;
        this.l = new IdentityScopeMap();
        this.m = new IdentityArrayMap();
        ComposerImpl composerImpl = new ComposerImpl(abstractApplier, compositionContext, slotTable, hashSet, arrayList, arrayList2, this);
        compositionContext.m(composerImpl);
        this.q = composerImpl;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CompositionKt.a;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (((MovableContentStateReference) ((dt1) arrayList.get(i)).a).c != this) {
                    break;
                } else {
                    i++;
                }
            } else {
                z = true;
                break;
            }
        }
        ComposerKt.f(z);
        try {
            this.q.Y(arrayList);
        } catch (Throwable th) {
            HashSet hashSet = this.e;
            if (!hashSet.isEmpty()) {
                new RememberEventDispatcher(hashSet).d();
            }
            throw th;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void i(Set set) {
        Object obj;
        boolean z;
        boolean zEquals;
        Object obj2;
        set.getClass();
        do {
            obj = this.c.get();
            z = true;
            if (obj == null) {
                zEquals = true;
            } else {
                zEquals = obj.equals(CompositionKt.a);
            }
            if (zEquals) {
                obj2 = set;
            } else if (obj instanceof Set) {
                obj2 = new Set[]{(Set) obj, set};
            } else if (obj instanceof Object[]) {
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = set;
                obj2 = objArrCopyOf;
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.c).toString());
            }
            AtomicReference atomicReference = this.c;
            while (!atomicReference.compareAndSet(obj, obj2)) {
                if (atomicReference.get() != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (obj == null) {
            synchronized (this.d) {
                v();
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void l(Object obj) {
        obj.getClass();
        synchronized (this.d) {
            y(obj);
            IdentityScopeMap identityScopeMap = this.i;
            int iB = identityScopeMap.b(obj);
            if (iB >= 0) {
                Iterator<T> it = identityScopeMap.e(iB).iterator();
                while (it.hasNext()) {
                    y((DerivedState) it.next());
                }
            }
        }
    }
}

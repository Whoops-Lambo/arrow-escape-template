package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import defpackage.d;
import defpackage.n8;
import defpackage.s71;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "Companion", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TrieNode<E> {
    public static final TrieNode d = new TrieNode(0, new Object[0], null);
    public int a;
    public Object[] b;
    public final MutabilityOwnership c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final TrieNode a(int i, int i2, Object obj) {
        TrieNode trieNodeA;
        int iC = 1 << TrieNodeKt.c(i, i2);
        if (f(iC)) {
            return new TrieNode(this.a | iC, TrieNodeKt.a(g(iC), obj, this.b), null);
        }
        int iG = g(iC);
        Object obj2 = this.b[iG];
        if (obj2 instanceof TrieNode) {
            TrieNode trieNodeP = p(iG);
            if (i2 == 30) {
                trieNodeA = n8.N(trieNodeP.b, obj) ? trieNodeP : new TrieNode(0, TrieNodeKt.a(0, obj, trieNodeP.b), null);
            } else {
                trieNodeA = trieNodeP.a(i, i2 + 5, obj);
            }
            if (trieNodeP != trieNodeA) {
                return r(iG, trieNodeA);
            }
        } else if (!s71.b(obj, obj2)) {
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iG] = i(iG, i, obj, i2, null);
            return new TrieNode(this.a, objArrCopyOf, null);
        }
        return this;
    }

    public final boolean c(int i, int i2, Object obj) {
        int iC = 1 << TrieNodeKt.c(i, i2);
        if (f(iC)) {
            return false;
        }
        int iG = g(iC);
        Object obj2 = this.b[iG];
        if (!(obj2 instanceof TrieNode)) {
            return s71.b(obj, obj2);
        }
        TrieNode trieNodeP = p(iG);
        return i2 == 30 ? n8.N(trieNodeP.b, obj) : trieNodeP.c(i, i2 + 5, obj);
    }

    public final boolean e(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.a != trieNode.a) {
            return false;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (this.b[i] != trieNode.b[i]) {
                return false;
            }
        }
        return true;
    }

    public final TrieNode l(int i, Object obj, int i2, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode trieNodeL;
        int iC = 1 << TrieNodeKt.c(i, i2);
        if (!f(iC)) {
            int iG = g(iC);
            Object obj2 = this.b[iG];
            boolean z = obj2 instanceof TrieNode;
            MutabilityOwnership mutabilityOwnership = this.c;
            if (z) {
                TrieNode trieNodeP = p(iG);
                if (i2 == 30) {
                    int iH0 = n8.h0(obj, trieNodeP.b);
                    if (iH0 != -1) {
                        persistentHashSetBuilder.k(persistentHashSetBuilder.e - 1);
                        MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.b;
                        MutabilityOwnership mutabilityOwnership3 = trieNodeP.c;
                        Object[] objArr = trieNodeP.b;
                        if (mutabilityOwnership3 == mutabilityOwnership2) {
                            trieNodeP.b = TrieNodeKt.b(iH0, objArr);
                            trieNodeL = trieNodeP;
                        } else {
                            trieNodeL = new TrieNode(0, TrieNodeKt.b(iH0, objArr), mutabilityOwnership2);
                        }
                    } else {
                        trieNodeL = trieNodeP;
                    }
                } else {
                    trieNodeL = trieNodeP.l(i, obj, i2 + 5, persistentHashSetBuilder);
                }
                MutabilityOwnership mutabilityOwnership4 = persistentHashSetBuilder.b;
                if (mutabilityOwnership == mutabilityOwnership4 || trieNodeP != trieNodeL) {
                    return o(iG, trieNodeL, mutabilityOwnership4);
                }
            } else if (s71.b(obj, obj2)) {
                persistentHashSetBuilder.k(persistentHashSetBuilder.e - 1);
                MutabilityOwnership mutabilityOwnership5 = persistentHashSetBuilder.b;
                Object[] objArr2 = this.b;
                if (mutabilityOwnership != mutabilityOwnership5) {
                    return new TrieNode(this.a ^ iC, TrieNodeKt.b(iG, objArr2), mutabilityOwnership5);
                }
                this.b = TrieNodeKt.b(iG, objArr2);
                this.a ^= iC;
                return this;
            }
        }
        return this;
    }

    public final TrieNode q(int i, int i2, Object obj) {
        TrieNode trieNodeQ;
        int iC = 1 << TrieNodeKt.c(i, i2);
        if (!f(iC)) {
            int iG = g(iC);
            Object obj2 = this.b[iG];
            if (obj2 instanceof TrieNode) {
                TrieNode trieNodeP = p(iG);
                if (i2 == 30) {
                    int iH0 = n8.h0(obj, trieNodeP.b);
                    trieNodeQ = iH0 != -1 ? new TrieNode(0, TrieNodeKt.b(iH0, trieNodeP.b), null) : trieNodeP;
                } else {
                    trieNodeQ = trieNodeP.q(i, i2 + 5, obj);
                }
                if (trieNodeP != trieNodeQ) {
                    return r(iG, trieNodeQ);
                }
            } else if (s71.b(obj, obj2)) {
                return new TrieNode(this.a ^ iC, TrieNodeKt.b(iG, this.b), null);
            }
        }
        return this;
    }

    public static TrieNode h(int i, Object obj, int i2, Object obj2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode(0, new Object[]{obj, obj2}, mutabilityOwnership);
        }
        int iC = TrieNodeKt.c(i, i3);
        int iC2 = TrieNodeKt.c(i2, i3);
        if (iC != iC2) {
            return new TrieNode((1 << iC) | (1 << iC2), iC < iC2 ? new Object[]{obj, obj2} : new Object[]{obj2, obj}, mutabilityOwnership);
        }
        return new TrieNode(1 << iC, new Object[]{h(i, obj, i2, obj2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    public final int b() {
        int i = this.a;
        Object[] objArr = this.b;
        if (i == 0) {
            return objArr.length;
        }
        int iB = 0;
        for (Object obj : objArr) {
            iB += obj instanceof TrieNode ? ((TrieNode) obj).b() : 1;
        }
        return iB;
    }

    public final boolean f(int i) {
        return (this.a & i) == 0;
    }

    public final int g(int i) {
        return Integer.bitCount(this.a & (i - 1));
    }

    public final TrieNode i(int i, int i2, Object obj, int i3, MutabilityOwnership mutabilityOwnership) {
        Object obj2 = this.b[i];
        return h(obj2 != null ? obj2.hashCode() : 0, obj2, i2, obj, i3 + 5, mutabilityOwnership);
    }

    public final TrieNode k(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        Object objH;
        trieNode.getClass();
        if (this == trieNode) {
            deltaCounter.a = b() + deltaCounter.a;
            return this;
        }
        MutabilityOwnership mutabilityOwnership = this.c;
        if (i > 30) {
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.b;
            Object[] objArr = this.b;
            if (this == trieNode) {
                deltaCounter.a(objArr.length);
                return this;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + trieNode.b.length);
            Object[] objArr2 = trieNode.b;
            int length = this.b.length;
            int i2 = 0;
            for (int i3 = 0; i3 < objArr2.length; i3++) {
                if (!n8.N(this.b, objArr2[i3])) {
                    objArrCopyOf[length + i2] = objArr2[i3];
                    i2++;
                }
            }
            int length2 = i2 + this.b.length;
            deltaCounter.a(objArrCopyOf.length - length2);
            if (length2 != this.b.length) {
                if (length2 != trieNode.b.length) {
                    if (length2 != objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
                    }
                    if (!s71.b(mutabilityOwnership, mutabilityOwnership2)) {
                        return new TrieNode(0, objArrCopyOf, mutabilityOwnership2);
                    }
                    this.b = objArrCopyOf;
                    return this;
                }
            }
            return this;
        }
        int i4 = this.a;
        int i5 = trieNode.a | i4;
        TrieNode trieNode2 = (i5 == i4 && s71.b(mutabilityOwnership, persistentHashSetBuilder.b)) ? this : new TrieNode(i5, new Object[Integer.bitCount(i5)], persistentHashSetBuilder.b);
        int i6 = 0;
        while (i5 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i5);
            int iG = g(iLowestOneBit);
            int iG2 = trieNode.g(iLowestOneBit);
            Object[] objArr3 = trieNode2.b;
            if (f(iLowestOneBit)) {
                objH = trieNode.b[iG2];
            } else {
                boolean zF = trieNode.f(iLowestOneBit);
                Object[] objArr4 = this.b;
                if (zF) {
                    objH = objArr4[iG];
                } else {
                    Object obj = objArr4[iG];
                    Object obj2 = trieNode.b[iG2];
                    boolean z = obj instanceof TrieNode;
                    boolean z2 = obj2 instanceof TrieNode;
                    if (z && z2) {
                        objH = ((TrieNode) obj).k((TrieNode) obj2, i + 5, deltaCounter, persistentHashSetBuilder);
                    } else if (z) {
                        TrieNode trieNode3 = (TrieNode) obj;
                        int i7 = persistentHashSetBuilder.e;
                        objH = trieNode3.j(obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.e == i7) {
                            deltaCounter.a++;
                        }
                    } else if (z2) {
                        TrieNode trieNode4 = (TrieNode) obj2;
                        int i8 = persistentHashSetBuilder.e;
                        objH = trieNode4.j(obj != null ? obj.hashCode() : 0, obj, i + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.e == i8) {
                            deltaCounter.a++;
                        }
                    } else if (s71.b(obj, obj2)) {
                        deltaCounter.a++;
                        objH = obj;
                    } else {
                        objH = h(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, persistentHashSetBuilder.b);
                    }
                }
            }
            objArr3[i6] = objH;
            i6++;
            i5 ^= iLowestOneBit;
        }
        if (!e(trieNode2)) {
            return trieNode.e(trieNode2) ? trieNode : trieNode2;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00f8  */
    public final Object m(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode<E> trieNode2;
        TrieNode trieNode3 = trieNode;
        trieNode3.getClass();
        TrieNode trieNode4 = d;
        if (this == trieNode3) {
            deltaCounter.a(b());
            return trieNode4;
        }
        MutabilityOwnership mutabilityOwnership = this.c;
        int i2 = 0;
        if (i > 30) {
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.b;
            if (this == trieNode3) {
                deltaCounter.a(this.b.length);
                return trieNode4;
            }
            boolean z = mutabilityOwnership2 == mutabilityOwnership;
            Object[] objArr = this.b;
            Object[] objArr2 = z ? objArr : new Object[objArr.length];
            int i3 = 0;
            for (int i4 = 0; i4 < objArr.length; i4++) {
                if (!n8.N(trieNode3.b, objArr[i4])) {
                    objArr2[i3] = objArr[i4];
                    i3++;
                }
            }
            deltaCounter.a(this.b.length - i3);
            if (i3 != 0) {
                if (i3 == 1) {
                    return objArr2[0];
                }
                if (i3 != this.b.length) {
                    return i3 == objArr2.length ? new TrieNode(0, objArr2, mutabilityOwnership2) : new TrieNode(0, Arrays.copyOf(objArr2, i3), mutabilityOwnership2);
                }
                return this;
            }
            return trieNode4;
        }
        int i5 = this.a & trieNode3.a;
        if (i5 != 0) {
            if (s71.b(mutabilityOwnership, persistentHashSetBuilder.b)) {
                trieNode2 = this;
            } else {
                int i6 = this.a;
                Object[] objArr3 = this.b;
                trieNode2 = new TrieNode<>(i6, Arrays.copyOf(objArr3, objArr3.length), persistentHashSetBuilder.b);
            }
            int i7 = this.a;
            while (i5 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i5);
                int iG = g(iLowestOneBit);
                int iG2 = trieNode3.g(iLowestOneBit);
                Object objM = this.b[iG];
                Object obj = trieNode3.b[iG2];
                boolean z2 = objM instanceof TrieNode;
                int i8 = i2;
                boolean z3 = obj instanceof TrieNode;
                if (z2 && z3) {
                    objM = ((TrieNode) objM).m((TrieNode) obj, i + 5, deltaCounter, persistentHashSetBuilder);
                } else if (z2) {
                    TrieNode trieNode5 = (TrieNode) objM;
                    int i9 = persistentHashSetBuilder.e;
                    TrieNode trieNodeL = trieNode5.l(obj != null ? obj.hashCode() : i8, obj, i + 5, persistentHashSetBuilder);
                    if (i9 != persistentHashSetBuilder.e) {
                        deltaCounter.a(1);
                        Object[] objArr4 = trieNodeL.b;
                        if (objArr4.length == 1) {
                            objM = objArr4[i8];
                            if (objM instanceof TrieNode) {
                                objM = trieNodeL;
                            }
                        } else {
                            objM = trieNodeL;
                        }
                    }
                } else if (z3) {
                    if (((TrieNode) obj).c(objM != null ? objM.hashCode() : i8, i + 5, objM)) {
                        deltaCounter.a(1);
                        objM = trieNode4;
                    }
                } else if (s71.b(objM, obj)) {
                    deltaCounter.a(1);
                    objM = trieNode4;
                }
                if (objM == trieNode4) {
                    i7 ^= iLowestOneBit;
                }
                trieNode2.b[iG] = objM;
                i5 ^= iLowestOneBit;
                trieNode3 = trieNode;
                i2 = i8;
            }
            int i10 = i2;
            int iBitCount = Integer.bitCount(i7);
            if (i7 != 0) {
                if (i7 != this.a) {
                    if (iBitCount == 1 && i != 0) {
                        Object obj2 = trieNode2.b[trieNode2.g(i7)];
                        return obj2 instanceof TrieNode ? new TrieNode(i7, new Object[]{obj2}, persistentHashSetBuilder.b) : obj2;
                    }
                    Object[] objArr5 = new Object[iBitCount];
                    Object[] objArr6 = trieNode2.b;
                    for (int i11 = i10; i11 < objArr6.length; i11++) {
                        Object obj3 = objArr6[i11];
                        if (obj3 != trieNode4) {
                            objArr5[i10] = obj3;
                            i10++;
                        }
                    }
                    return new TrieNode(i7, objArr5, persistentHashSetBuilder.b);
                }
                if (!trieNode2.e(this)) {
                    return trieNode2;
                }
            }
            return trieNode4;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    public final Object n(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        int i2;
        trieNode.getClass();
        if (this == trieNode) {
            deltaCounter.a(b());
            return this;
        }
        MutabilityOwnership mutabilityOwnership = this.c;
        TrieNode trieNode2 = d;
        if (i > 30) {
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.b;
            if (this == trieNode) {
                deltaCounter.a(this.b.length);
                return this;
            }
            boolean z = mutabilityOwnership2 == mutabilityOwnership;
            Object[] objArr = this.b;
            if (!z) {
                objArr = new Object[Math.min(objArr.length, trieNode.b.length)];
            }
            Object[] objArr2 = this.b;
            int i3 = 0;
            for (int i4 = 0; i4 < objArr2.length; i4++) {
                if (n8.N(trieNode.b, objArr2[i4])) {
                    objArr[i3] = objArr2[i4];
                    i3++;
                }
            }
            deltaCounter.a(i3);
            if (i3 != 0) {
                if (i3 == 1) {
                    return objArr[0];
                }
                if (i3 != this.b.length) {
                    if (i3 != trieNode.b.length) {
                        return i3 == objArr.length ? new TrieNode(0, objArr, mutabilityOwnership2) : new TrieNode(0, Arrays.copyOf(objArr, i3), mutabilityOwnership2);
                    }
                }
                return this;
            }
            return trieNode2;
        }
        int i5 = this.a & trieNode.a;
        if (i5 != 0) {
            TrieNode<E> trieNode3 = (s71.b(mutabilityOwnership, persistentHashSetBuilder.b) && i5 == this.a) ? this : new TrieNode<>(i5, new Object[Integer.bitCount(i5)], persistentHashSetBuilder.b);
            int i6 = i5;
            int i7 = 0;
            int i8 = 0;
            while (i6 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i6);
                int iG = g(iLowestOneBit);
                int iG2 = trieNode.g(iLowestOneBit);
                Object objN = this.b[iG];
                Object obj = trieNode.b[iG2];
                boolean z2 = objN instanceof TrieNode;
                boolean z3 = obj instanceof TrieNode;
                if (z2 && z3) {
                    objN = ((TrieNode) objN).n((TrieNode) obj, i + 5, deltaCounter, persistentHashSetBuilder);
                } else {
                    if (z2) {
                        if (((TrieNode) objN).c(obj != null ? obj.hashCode() : 0, i + 5, obj)) {
                            deltaCounter.a(1);
                            i2 = 1;
                            objN = obj;
                        } else {
                            objN = trieNode2;
                        }
                    } else if (!z3) {
                        i2 = 1;
                        if (s71.b(objN, obj)) {
                            deltaCounter.a(1);
                        } else {
                            objN = trieNode2;
                        }
                    } else if (((TrieNode) obj).c(objN != null ? objN.hashCode() : 0, i + 5, objN)) {
                        i2 = 1;
                        deltaCounter.a(1);
                    } else {
                        i2 = 1;
                        objN = trieNode2;
                    }
                    if (objN != trieNode2) {
                        i7 |= iLowestOneBit;
                    }
                    trieNode3.b[i8] = objN;
                    i8 += i2;
                    i6 ^= iLowestOneBit;
                }
                i2 = 1;
                if (objN != trieNode2) {
                    i7 |= iLowestOneBit;
                }
                trieNode3.b[i8] = objN;
                i8 += i2;
                i6 ^= iLowestOneBit;
            }
            int iBitCount = Integer.bitCount(i7);
            if (i7 != 0) {
                if (i7 == i5) {
                    if (!trieNode3.e(this)) {
                        return trieNode3.e(trieNode) ? trieNode : trieNode3;
                    }
                    return this;
                }
                if (iBitCount == 1 && i != 0) {
                    Object obj2 = trieNode3.b[trieNode3.g(i7)];
                    return obj2 instanceof TrieNode ? new TrieNode(i7, new Object[]{obj2}, persistentHashSetBuilder.b) : obj2;
                }
                Object[] objArr3 = new Object[iBitCount];
                int i9 = 0;
                for (Object obj3 : trieNode3.b) {
                    if (obj3 != trieNode2) {
                        objArr3[i9] = obj3;
                        i9++;
                    }
                }
                return new TrieNode(i7, objArr3, persistentHashSetBuilder.b);
            }
        }
        return trieNode2;
    }

    public final TrieNode o(int i, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = trieNode.b;
        Object obj = trieNode;
        if (objArr.length == 1) {
            Object obj2 = objArr[0];
            if (!(obj2 instanceof TrieNode)) {
                if (this.b.length == 1) {
                    obj = trieNode;
                    trieNode.a = this.a;
                    return trieNode;
                }
                obj = trieNode;
                obj = obj2;
            }
        }
        obj = trieNode;
        Object[] objArr2 = this.b;
        if (this.c == mutabilityOwnership) {
            objArr2[i] = obj;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        objArrCopyOf[i] = obj;
        return new TrieNode(this.a, objArrCopyOf, mutabilityOwnership);
    }

    public final TrieNode p(int i) {
        Object obj = this.b[i];
        if (obj != null) {
            return (TrieNode) obj;
        }
        d.w("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return null;
    }

    public final TrieNode r(int i, TrieNode trieNode) {
        Object[] objArr = trieNode.b;
        Object obj = trieNode;
        if (objArr.length == 1) {
            Object obj2 = objArr[0];
            if (!(obj2 instanceof TrieNode)) {
                if (this.b.length == 1) {
                    obj = trieNode;
                    trieNode.a = this.a;
                    return trieNode;
                }
                obj = trieNode;
                obj = obj2;
            }
        }
        obj = trieNode;
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        objArrCopyOf[i] = obj;
        return new TrieNode(this.a, objArrCopyOf, null);
    }

    public TrieNode(int i, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.a = i;
        this.b = objArr;
        this.c = mutabilityOwnership;
    }

    public final boolean d(int i, TrieNode trieNode) {
        int iHashCode;
        trieNode.getClass();
        if (this == trieNode) {
            return true;
        }
        if (i > 30) {
            for (Object obj : trieNode.b) {
                if (!n8.N(this.b, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i2 = this.a;
        int i3 = trieNode.a;
        int i4 = i2 & i3;
        if (i4 != i3) {
            return false;
        }
        while (i4 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i4);
            int iG = g(iLowestOneBit);
            int iG2 = trieNode.g(iLowestOneBit);
            Object obj2 = this.b[iG];
            Object obj3 = trieNode.b[iG2];
            boolean z = obj2 instanceof TrieNode;
            boolean z2 = obj3 instanceof TrieNode;
            if (z && z2) {
                if (!((TrieNode) obj2).d(i + 5, (TrieNode) obj3)) {
                    return false;
                }
            } else if (z) {
                TrieNode trieNode2 = (TrieNode) obj2;
                if (obj3 != null) {
                    iHashCode = obj3.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (!trieNode2.c(iHashCode, i + 5, obj3)) {
                    return false;
                }
            } else if (z2 || !s71.b(obj2, obj3)) {
                return false;
            }
            i4 ^= iLowestOneBit;
        }
        return true;
    }

    public final TrieNode j(int i, Object obj, int i2, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode trieNodeJ;
        int iC = 1 << TrieNodeKt.c(i, i2);
        boolean zF = f(iC);
        MutabilityOwnership mutabilityOwnership = this.c;
        if (zF) {
            persistentHashSetBuilder.k(persistentHashSetBuilder.e + 1);
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.b;
            int iG = g(iC);
            Object[] objArr = this.b;
            if (mutabilityOwnership == mutabilityOwnership2) {
                this.b = TrieNodeKt.a(iG, obj, objArr);
                this.a |= iC;
                return this;
            }
            return new TrieNode(this.a | iC, TrieNodeKt.a(iG, obj, objArr), mutabilityOwnership2);
        }
        int iG2 = g(iC);
        Object obj2 = this.b[iG2];
        if (obj2 instanceof TrieNode) {
            TrieNode trieNodeP = p(iG2);
            if (i2 == 30) {
                if (n8.N(trieNodeP.b, obj)) {
                    trieNodeJ = trieNodeP;
                } else {
                    persistentHashSetBuilder.k(persistentHashSetBuilder.e + 1);
                    MutabilityOwnership mutabilityOwnership3 = trieNodeP.c;
                    MutabilityOwnership mutabilityOwnership4 = persistentHashSetBuilder.b;
                    Object[] objArr2 = trieNodeP.b;
                    if (mutabilityOwnership3 == mutabilityOwnership4) {
                        trieNodeP.b = TrieNodeKt.a(0, obj, objArr2);
                        trieNodeJ = trieNodeP;
                    } else {
                        trieNodeJ = new TrieNode(0, TrieNodeKt.a(0, obj, objArr2), persistentHashSetBuilder.b);
                    }
                }
            } else {
                trieNodeJ = trieNodeP.j(i, obj, i2 + 5, persistentHashSetBuilder);
            }
            if (trieNodeP != trieNodeJ) {
                return o(iG2, trieNodeJ, persistentHashSetBuilder.b);
            }
        } else if (!s71.b(obj, obj2)) {
            persistentHashSetBuilder.k(persistentHashSetBuilder.e + 1);
            MutabilityOwnership mutabilityOwnership5 = persistentHashSetBuilder.b;
            Object[] objArr3 = this.b;
            if (mutabilityOwnership == mutabilityOwnership5) {
                objArr3[iG2] = i(iG2, i, obj, i2, mutabilityOwnership5);
                return this;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr3, objArr3.length);
            objArrCopyOf[iG2] = i(iG2, i, obj, i2, mutabilityOwnership5);
            return new TrieNode(this.a, objArrCopyOf, mutabilityOwnership5);
        }
        return this;
    }
}

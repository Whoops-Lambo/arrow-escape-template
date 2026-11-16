package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import defpackage.d;
import defpackage.e32;
import defpackage.h71;
import defpackage.n8;
import defpackage.s71;
import defpackage.tb5;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "Companion", "ModificationResult", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TrieNode<K, V> {
    public static final TrieNode e = new TrieNode(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final MutabilityOwnership c;
    public Object[] d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean d(int i, int i2, Object obj) {
        int iD = 1 << TrieNodeKt.d(i, i2);
        if (h(iD)) {
            return s71.b(obj, this.d[f(iD)]);
        }
        if (!i(iD)) {
            return false;
        }
        TrieNode trieNodeS = s(t(iD));
        return i2 == 30 ? trieNodeS.c(obj) : trieNodeS.d(i, i2 + 5, obj);
    }

    public final Object g(int i, int i2, Object obj) {
        int iD = 1 << TrieNodeKt.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (s71.b(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iD)) {
            return null;
        }
        TrieNode trieNodeS = s(t(iD));
        if (i2 != 30) {
            return trieNodeS.g(i, i2 + 5, obj);
        }
        h71 h71VarA = tb5.A(2, tb5.D(0, trieNodeS.d.length));
        int i3 = h71VarA.a;
        int i4 = h71VarA.b;
        int i5 = h71VarA.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!s71.b(obj, trieNodeS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return trieNodeS.x(i3);
    }

    public final TrieNode n(int i, Object obj, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode trieNodeN;
        int iD = 1 << TrieNodeKt.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (s71.b(obj, this.d[iF])) {
                return p(iF, iD, persistentHashMapBuilder);
            }
        } else if (i(iD)) {
            int iT = t(iD);
            TrieNode trieNodeS = s(iT);
            if (i2 == 30) {
                h71 h71VarA = tb5.A(2, tb5.D(0, trieNodeS.d.length));
                int i3 = h71VarA.a;
                int i4 = h71VarA.b;
                int i5 = h71VarA.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!s71.b(obj, trieNodeS.d[i3])) {
                            if (i3 == i4) {
                                trieNodeN = trieNodeS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            trieNodeN = trieNodeS.k(i3, persistentHashMapBuilder);
                            break;
                        }
                    }
                } else {
                    trieNodeN = trieNodeS;
                    break;
                }
            } else {
                trieNodeN = trieNodeS.n(i, obj, i2 + 5, persistentHashMapBuilder);
            }
            return q(trieNodeS, trieNodeN, iT, iD, persistentHashMapBuilder.b);
        }
        return this;
    }

    public final TrieNode o(int i, Object obj, Object obj2, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        PersistentHashMapBuilder persistentHashMapBuilder2;
        TrieNode trieNodeO;
        int iD = 1 << TrieNodeKt.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            return (s71.b(obj, this.d[iF]) && s71.b(obj2, x(iF))) ? p(iF, iD, persistentHashMapBuilder) : this;
        }
        if (!i(iD)) {
            return this;
        }
        int iT = t(iD);
        TrieNode trieNodeS = s(iT);
        if (i2 == 30) {
            h71 h71VarA = tb5.A(2, tb5.D(0, trieNodeS.d.length));
            int i3 = h71VarA.a;
            int i4 = h71VarA.b;
            int i5 = h71VarA.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!s71.b(obj, trieNodeS.d[i3]) || !s71.b(obj2, trieNodeS.x(i3))) {
                        if (i3 == i4) {
                            trieNodeO = trieNodeS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        trieNodeO = trieNodeS.k(i3, persistentHashMapBuilder);
                        break;
                    }
                }
            } else {
                trieNodeO = trieNodeS;
                break;
            }
            persistentHashMapBuilder2 = persistentHashMapBuilder;
        } else {
            persistentHashMapBuilder2 = persistentHashMapBuilder;
            trieNodeO = trieNodeS.o(i, obj, obj2, i2 + 5, persistentHashMapBuilder2);
        }
        return q(trieNodeS, trieNodeO, iT, iD, persistentHashMapBuilder2.b);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ModificationResult<K, V> {
        public TrieNode a;
        public final int b;

        public ModificationResult(TrieNode trieNode, int i) {
            this.a = trieNode;
            this.b = i;
        }
    }

    public static TrieNode j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode(0, 0, new Object[]{obj, obj2, obj3, obj4}, mutabilityOwnership);
        }
        int iD = TrieNodeKt.d(i, i3);
        int iD2 = TrieNodeKt.d(i2, i3);
        if (iD != iD2) {
            return new TrieNode((1 << iD) | (1 << iD2), 0, iD < iD2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, mutabilityOwnership);
        }
        return new TrieNode(0, 1 << iD, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, MutabilityOwnership mutabilityOwnership) {
        Object obj3 = this.d[i];
        TrieNode trieNodeJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, mutabilityOwnership);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        n8.S(0, i, 6, objArr, objArr2);
        n8.P(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = trieNodeJ;
        n8.P(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        h71 h71VarA = tb5.A(2, tb5.D(0, this.d.length));
        int i = h71VarA.a;
        int i2 = h71VarA.b;
        int i3 = h71VarA.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!s71.b(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.b == trieNode.b && this.a == trieNode.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == trieNode.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final TrieNode k(int i, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.f(persistentHashMapBuilder.f - 1);
        persistentHashMapBuilder.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != persistentHashMapBuilder.b) {
            return new TrieNode(0, 0, TrieNodeKt.b(i, objArr), persistentHashMapBuilder.b);
        }
        this.d = TrieNodeKt.b(i, objArr);
        return this;
    }

    public final TrieNode m(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode trieNode2;
        Object[] objArr;
        TrieNode trieNodeJ;
        trieNode.getClass();
        if (this == trieNode) {
            deltaCounter.a(b());
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            MutabilityOwnership mutabilityOwnership = persistentHashMapBuilder.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + trieNode.d.length);
            int length = this.d.length;
            h71 h71VarA = tb5.A(2, tb5.D(0, trieNode.d.length));
            int i3 = h71VarA.a;
            int i4 = h71VarA.b;
            int i5 = h71VarA.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(trieNode.d[i3])) {
                        deltaCounter.a++;
                    } else {
                        Object[] objArr3 = trieNode.d;
                        objArrCopyOf[length] = objArr3[i3];
                        objArrCopyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != trieNode.d.length) {
                    return length == objArrCopyOf.length ? new TrieNode(0, 0, objArrCopyOf, mutabilityOwnership) : new TrieNode(0, 0, Arrays.copyOf(objArrCopyOf, length), mutabilityOwnership);
                }
            }
            return this;
        }
        int i6 = this.b | trieNode.b;
        int i7 = this.a;
        int i8 = trieNode.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (s71.b(this.d[f(iLowestOneBit)], trieNode.d[trieNode.f(iLowestOneBit)])) {
                i11 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i11) != 0) {
            e32.i("Check failed.");
            return null;
        }
        if (s71.b(this.c, persistentHashMapBuilder.b) && this.a == i11 && this.b == i6) {
            trieNode2 = this;
        } else {
            trieNode2 = new TrieNode(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        }
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = trieNode2.d;
            int length2 = (objArr4.length - 1) - i13;
            if (i(iLowestOneBit2)) {
                trieNodeJ = s(t(iLowestOneBit2));
                if (trieNode.i(iLowestOneBit2)) {
                    trieNodeJ = trieNodeJ.m(trieNode.s(trieNode.t(iLowestOneBit2)), i + 5, deltaCounter, persistentHashMapBuilder);
                    objArr = objArr4;
                } else if (trieNode.h(iLowestOneBit2)) {
                    int iF = trieNode.f(iLowestOneBit2);
                    Object obj = trieNode.d[iF];
                    Object objX = trieNode.x(iF);
                    int i14 = persistentHashMapBuilder.f;
                    objArr = objArr4;
                    trieNodeJ = trieNodeJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, persistentHashMapBuilder);
                    if (persistentHashMapBuilder.f == i14) {
                        deltaCounter.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (trieNode.i(iLowestOneBit2)) {
                    TrieNode trieNodeS = trieNode.s(trieNode.t(iLowestOneBit2));
                    if (h(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.d[iF2];
                        int i15 = i + 5;
                        if (trieNodeS.d(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                            deltaCounter.a++;
                            trieNodeJ = trieNodeS;
                        } else {
                            trieNodeJ = trieNodeS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i15, persistentHashMapBuilder);
                        }
                    } else {
                        trieNodeJ = trieNodeS;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.d[iF3];
                    Object objX2 = x(iF3);
                    int iF4 = trieNode.f(iLowestOneBit2);
                    Object obj4 = trieNode.d[iF4];
                    trieNodeJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, trieNode.x(iF4), i + 5, persistentHashMapBuilder.b);
                }
            }
            objArr[length2] = trieNodeJ;
            i13++;
            i12 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i16 = 0;
        while (i11 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i11);
            int i17 = i16 * 2;
            if (trieNode.h(iLowestOneBit3)) {
                int iF5 = trieNode.f(iLowestOneBit3);
                Object[] objArr5 = trieNode2.d;
                objArr5[i17] = trieNode.d[iF5];
                objArr5[i17 + 1] = trieNode.x(iF5);
                if (h(iLowestOneBit3)) {
                    deltaCounter.a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = trieNode2.d;
                objArr6[i17] = this.d[iF6];
                objArr6[i17 + 1] = x(iF6);
            }
            i16++;
            i11 ^= iLowestOneBit3;
        }
        if (!e(trieNode2)) {
            return trieNode.e(trieNode2) ? trieNode : trieNode2;
        }
        return this;
    }

    public final TrieNode p(int i, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.f(persistentHashMapBuilder.f - 1);
        persistentHashMapBuilder.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != persistentHashMapBuilder.b) {
            return new TrieNode(i2 ^ this.a, this.b, TrieNodeKt.b(i, objArr), persistentHashMapBuilder.b);
        }
        this.d = TrieNodeKt.b(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final TrieNode q(TrieNode trieNode, TrieNode trieNode2, int i, int i2, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.c;
        if (trieNode2 != null) {
            return (mutabilityOwnership2 == mutabilityOwnership || trieNode != trieNode2) ? r(i, trieNode2, mutabilityOwnership) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (mutabilityOwnership2 != mutabilityOwnership) {
            return new TrieNode(this.a, this.b ^ i2, TrieNodeKt.c(i, objArr), mutabilityOwnership);
        }
        this.d = TrieNodeKt.c(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final TrieNode r(int i, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && trieNode.d.length == 2 && trieNode.b == 0) {
            trieNode.a = this.b;
            return trieNode;
        }
        if (this.c == mutabilityOwnership) {
            objArr[i] = trieNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = trieNode;
        return new TrieNode(this.a, this.b, objArrCopyOf, mutabilityOwnership);
    }

    public final TrieNode s(int i) {
        Object obj = this.d[i];
        if (obj != null) {
            return (TrieNode) obj;
        }
        d.w("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return null;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    public final TrieNode w(int i, int i2, TrieNode trieNode) {
        Object[] objArr = trieNode.d;
        if (objArr.length != 2 || trieNode.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = trieNode;
            return new TrieNode(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            trieNode.a = this.b;
            return trieNode;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        n8.P(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        n8.P(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new TrieNode(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }

    public TrieNode(int i, int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.a = i;
        this.b = i2;
        this.c = mutabilityOwnership;
        this.d = objArr;
    }

    public final TrieNode l(int i, Object obj, Object obj2, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        PersistentHashMapBuilder persistentHashMapBuilder2;
        TrieNode trieNodeL;
        int iD = 1 << TrieNodeKt.d(i, i2);
        boolean zH = h(iD);
        MutabilityOwnership mutabilityOwnership = this.c;
        if (zH) {
            int iF = f(iD);
            if (s71.b(obj, this.d[iF])) {
                persistentHashMapBuilder.d = x(iF);
                if (x(iF) == obj2) {
                    return this;
                }
                if (mutabilityOwnership == persistentHashMapBuilder.b) {
                    this.d[iF + 1] = obj2;
                    return this;
                }
                persistentHashMapBuilder.e++;
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = obj2;
                return new TrieNode(this.a, this.b, objArrCopyOf, persistentHashMapBuilder.b);
            }
            persistentHashMapBuilder.f(persistentHashMapBuilder.f + 1);
            MutabilityOwnership mutabilityOwnership2 = persistentHashMapBuilder.b;
            if (mutabilityOwnership == mutabilityOwnership2) {
                this.d = a(iF, iD, i, obj, obj2, i2, mutabilityOwnership2);
                this.a ^= iD;
                this.b |= iD;
                return this;
            }
            return new TrieNode(this.a ^ iD, this.b | iD, a(iF, iD, i, obj, obj2, i2, mutabilityOwnership2), mutabilityOwnership2);
        }
        if (i(iD)) {
            int iT = t(iD);
            TrieNode trieNodeS = s(iT);
            if (i2 == 30) {
                h71 h71VarA = tb5.A(2, tb5.D(0, trieNodeS.d.length));
                int i3 = h71VarA.a;
                int i4 = h71VarA.b;
                int i5 = h71VarA.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (s71.b(obj, trieNodeS.d[i3])) {
                            persistentHashMapBuilder.d = trieNodeS.x(i3);
                            if (trieNodeS.c == persistentHashMapBuilder.b) {
                                trieNodeS.d[i3 + 1] = obj2;
                                trieNodeL = trieNodeS;
                                break;
                            }
                            persistentHashMapBuilder.e++;
                            Object[] objArr2 = trieNodeS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            trieNodeL = new TrieNode(0, 0, objArrCopyOf2, persistentHashMapBuilder.b);
                            break;
                        }
                        if (i3 != i4) {
                            i3 += i5;
                        } else {
                            persistentHashMapBuilder.f(persistentHashMapBuilder.f + 1);
                            trieNodeL = new TrieNode(0, 0, TrieNodeKt.a(trieNodeS.d, 0, obj, obj2), persistentHashMapBuilder.b);
                            break;
                        }
                    }
                } else {
                    persistentHashMapBuilder.f(persistentHashMapBuilder.f + 1);
                    trieNodeL = new TrieNode(0, 0, TrieNodeKt.a(trieNodeS.d, 0, obj, obj2), persistentHashMapBuilder.b);
                    break;
                }
                persistentHashMapBuilder2 = persistentHashMapBuilder;
            } else {
                persistentHashMapBuilder2 = persistentHashMapBuilder;
                trieNodeL = trieNodeS.l(i, obj, obj2, i2 + 5, persistentHashMapBuilder2);
            }
            if (trieNodeS == trieNodeL) {
                return this;
            }
            return r(iT, trieNodeL, persistentHashMapBuilder2.b);
        }
        persistentHashMapBuilder.f(persistentHashMapBuilder.f + 1);
        MutabilityOwnership mutabilityOwnership3 = persistentHashMapBuilder.b;
        int iF2 = f(iD);
        Object[] objArr3 = this.d;
        if (mutabilityOwnership == mutabilityOwnership3) {
            this.d = TrieNodeKt.a(objArr3, iF2, obj, obj2);
            this.a |= iD;
            return this;
        }
        return new TrieNode(this.a | iD, this.b, TrieNodeKt.a(objArr3, iF2, obj, obj2), mutabilityOwnership3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r13.a = w(r11, r4, r13.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult u(int r12, java.lang.Object r13, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links r14, int r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.u(int, java.lang.Object, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links, int):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode$ModificationResult");
    }

    public final TrieNode v(int i, int i2, Object obj) {
        TrieNode trieNodeV;
        int iD = 1 << TrieNodeKt.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (s71.b(obj, this.d[iF])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new TrieNode(this.a ^ iD, this.b, TrieNodeKt.b(iF, objArr), null);
                }
            } else {
                return this;
            }
        } else if (i(iD)) {
            int iT = t(iD);
            TrieNode trieNodeS = s(iT);
            if (i2 == 30) {
                h71 h71VarA = tb5.A(2, tb5.D(0, trieNodeS.d.length));
                int i3 = h71VarA.a;
                int i4 = h71VarA.b;
                int i5 = h71VarA.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (s71.b(obj, trieNodeS.d[i3])) {
                            Object[] objArr2 = trieNodeS.d;
                            if (objArr2.length == 2) {
                                trieNodeV = null;
                                break;
                            }
                            trieNodeV = new TrieNode(0, 0, TrieNodeKt.b(i3, objArr2), null);
                            break;
                        }
                        if (i3 != i4) {
                            i3 += i5;
                        } else {
                            trieNodeV = trieNodeS;
                            break;
                        }
                    }
                } else {
                    trieNodeV = trieNodeS;
                    break;
                }
            } else {
                trieNodeV = trieNodeS.v(i, i2 + 5, obj);
            }
            if (trieNodeV == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new TrieNode(this.a, this.b ^ iD, TrieNodeKt.c(iT, objArr3), null);
                }
            } else {
                if (trieNodeS != trieNodeV) {
                    return w(iT, iD, trieNodeV);
                }
                return this;
            }
        } else {
            return this;
        }
        return null;
    }
}

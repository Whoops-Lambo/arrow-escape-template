package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0d, reason: invalid class name and case insensitive filesystem */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@Metadata
public final class C16490d implements AnonymousClass12 {
    public static byte[] A0D;
    public static String[] A0E = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
    public static final C2X A0F;
    public static final String A0G;
    public long A00;
    public C2i A01;
    public final C2h A02;
    public final C2U A03;
    public final C2U A04;
    public final List<Rect> A05;
    public final Map<String, Set<String>> A06;
    public final Map<String, C2S> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{26, 24, 9, 46, 20, 16, 13, 17, 24, 51, 28, 16, 24, 85, 83, 83, 83, 84, 127, 125, 108, 78, 113, 107, 113, 122, 116, 125, 72, 125, 106, 123, 125, 118, 108, 121, 127, 125, 56, 123, 121, 116, 116, 125, 124, 56, 119, 118, 56, 109, 118, 117, 125, 121, 107, 109, 106, 125, 124, 56, 104, 121, 106, 125, 118, 108, 56, 110, 113, 125, 111, 104, 119, 113, 118, 108, 34, 56, 54, 61, 62, 51, 48, 61, 3, 52, 50, 37, 105, 98, 97, 108, 111, 98, 88, 103, 125, 103, 108, 98, 107, 92, 107, 109, 122, 64, 75, 89, 125, 77, 79, 64, 22, 13, 20, 20, 88, 14, 17, 29, 15, 88, 8, 10, 23, 8, 29, 10, 12, 1, 88, 30, 23, 10, 88, 10, 29, 21, 23, 14, 29, 28, 88, 17, 12, 29, 21, 88, 124, 102, 103, 65, 118, 112, 103, 82, 69, 71, 73, 83, 84, 69, 82, 69, 68, 99, 72, 73, 76, 68, 105, 78, 84, 69, 82, 78, 65, 76, 107, 69, 89, 83, 98, 89, 112, 65, 82, 69, 78, 84, 59, 39, 46, 60, 26, 45, 56, 39, 58, 60, 98, 125, 113, 99, 100, 123, 125, 122, 96, 80, 117, 96, 117, 96, 127, 115, 97, 102, 121, 100, 98, 68, 115, 117, 98, 101};
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:27:0x008c->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0036  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A03(C16882l<?, ?> c16882l, C16882l<?, ?> c16882l2, C2S c2s, Rect rect, Rect rect2) {
        boolean z;
        Map<String, C2W> mapA08;
        String str;
        C2W c2w;
        Set<String> set;
        Iterator<T> it;
        boolean z2;
        C2W c2w2;
        boolean z3;
        boolean zA06;
        String[] strArr;
        Set<String> set2 = this.A06.get(c16882l.A02);
        Set<String> set3 = set2;
        if (set3 == null) {
            z = true;
            if (z) {
                c2s.A08().clear();
                c2s.A0D(null);
                return;
            }
            c2s.A08().keySet().retainAll(set2);
            mapA08 = c2s.A08();
            str = c16882l2.A02;
            c2w = mapA08.get(str);
            if (c2w == null) {
                c2w = new C2W();
                mapA08.put(str, c2w);
            }
            c2w.A04(rect, rect2);
            set = set2;
            if (!(set instanceof Collection)) {
                it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    }
                    c2w2 = c2s.A08().get((String) it.next());
                    if (c2w2 != null) {
                        zA06 = c2w2.A06();
                        strArr = A0E;
                        if (strArr[3].charAt(4) != strArr[7].charAt(4)) {
                            String[] strArr2 = A0E;
                            strArr2[0] = "D5TVMH4lAih8aapWFFHd2ylae5LlQ4YN";
                            strArr2[2] = "lFvZbZ8NbaQtB0OKaMpwXE9CvNszffld";
                            if (zA06) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        z2 = false;
                        break;
                    }
                }
            } else {
                it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    }
                    c2w2 = c2s.A08().get((String) it.next());
                    if (c2w2 != null) {
                        zA06 = c2w2.A06();
                        strArr = A0E;
                        if (strArr[3].charAt(4) != strArr[7].charAt(4)) {
                            String[] strArr3 = A0E;
                            strArr3[0] = "D5TVMH4lAih8aapWFFHd2ylae5LlQ4YN";
                            strArr3[2] = "lFvZbZ8NbaQtB0OKaMpwXE9CvNszffld";
                            if (zA06) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2) {
                A06(c2s, true);
                return;
            } else {
                c2s.A0D(null);
                return;
            }
        }
        boolean zIsEmpty = set3.isEmpty();
        String[] strArr4 = A0E;
        if (strArr4[3].charAt(4) != strArr4[7].charAt(4)) {
            String[] strArr5 = A0E;
            strArr5[5] = "s8VhNokbqltQRTQnsEfyybb2mXQFYXw5";
            strArr5[4] = "mw2ehwyovZcSjlYUCROlvuH9NDPtYudb";
            if (zIsEmpty) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c2s.A08().clear();
                c2s.A0D(null);
                return;
            }
            c2s.A08().keySet().retainAll(set2);
            mapA08 = c2s.A08();
            str = c16882l2.A02;
            c2w = mapA08.get(str);
            if (c2w == null) {
                c2w = new C2W();
                mapA08.put(str, c2w);
            }
            c2w.A04(rect, rect2);
            set = set2;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    }
                    c2w2 = c2s.A08().get((String) it.next());
                    if (c2w2 != null) {
                        zA06 = c2w2.A06();
                        strArr = A0E;
                        if (strArr[3].charAt(4) != strArr[7].charAt(4)) {
                            String[] strArr6 = A0E;
                            strArr6[0] = "D5TVMH4lAih8aapWFFHd2ylae5LlQ4YN";
                            strArr6[2] = "lFvZbZ8NbaQtB0OKaMpwXE9CvNszffld";
                            if (zA06) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        z2 = false;
                        break;
                    }
                }
            } else {
                z2 = true;
            }
            if (z2) {
                A06(c2s, true);
                return;
            } else {
                c2s.A0D(null);
                return;
            }
        }
        throw new RuntimeException();
    }

    static {
        A02();
        A0F = new C2X(null);
        String simpleName = C16490d.class.getSimpleName();
        C1h.A08(simpleName, A01(0, 18, 38));
        A0G = simpleName;
    }

    public C16490d(C2h c2h, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = c2h;
        this.A0A = z;
        this.A08 = z2;
        this.A0B = z3;
        this.A0C = z4;
        this.A09 = z5;
        this.A07 = new HashMap();
        this.A04 = new C2U();
        this.A03 = new C2U();
        this.A05 = new ArrayList(1);
        this.A06 = new HashMap();
    }

    public /* synthetic */ C16490d(C2h c2h, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, AbstractC16781i abstractC16781i) {
        this(c2h, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) == 0 ? z5 : false);
    }

    private final C2S A00(C16882l<?, ?> c16882l, Rect rect, Rect rect2) {
        C2S c2sA00 = this.A07.get(c16882l.A02);
        if (this.A04.A05(c16882l)) {
            if (c2sA00 == null) {
                c2sA00 = C2S.A09.A00(A0A());
                this.A07.put(c16882l.A02, c2sA00);
            } else {
                c2sA00.A0B(EnumC16842a.A05);
            }
        }
        if (c2sA00 != null) {
            c2sA00.A02().set(rect2);
            c2sA00.A07().add(new Rect(rect));
            if (A0B()) {
                c2sA00.A04().A04(rect, rect2);
                A07(this, c2sA00, false, 2, null);
            }
        }
        return c2sA00;
    }

    private final void A04(C2U c2u) {
        Collection<C16882l<?, ?>> collectionA03 = c2u.A03();
        if (AnonymousClass14.A0C && collectionA03.isEmpty()) {
            return;
        }
        Iterator<C16882l<?, ?>> it = collectionA03.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0E;
            if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
            strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
            if (zHasNext) {
                C16882l<?, ?> next = it.next();
                C2S c2s = this.A07.get(next.A02);
                if (c2s != null) {
                    c2s.A0B(EnumC16842a.A04);
                    if (A0B()) {
                        c2s.A09();
                    }
                    c2s.A07().clear();
                    if (A0F.A00(next, this.A0C)) {
                        next.A03(this);
                    }
                    if (this.A0A) {
                        this.A07.remove(next.A02);
                    }
                } else if (0 != 0) {
                    String str = A01(112, 36, 35) + next.A02;
                    throw new NullPointerException(A01(190, 10, 19));
                }
            } else {
                return;
            }
        }
    }

    private final void A05(C2U c2u) {
        Collection<C16882l<?, ?>> collectionA02 = c2u.A02();
        if (AnonymousClass14.A0C && collectionA02.isEmpty()) {
            return;
        }
        for (C16882l<?, ?> c16882l : collectionA02) {
            if (A0F.A00(c16882l, this.A0B)) {
                c16882l.A03(this);
            }
        }
    }

    private final void A06(C2S c2s, boolean z) {
        if (c2s.A06() == null && z) {
            c2s.A0D(Long.valueOf(A0A()));
        }
    }

    public static /* synthetic */ void A07(C16490d c16490d, C2S c2s, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = c2s.A04().A06();
        }
        c16490d.A06(c2s, z);
    }

    private final void A08(List<? extends C16882l<?, ?>> list) {
        C2V c2vA05;
        for (C16882l<?, ?> c16882l : list) {
            C2S viewProperties = this.A07.get(c16882l.A02);
            if (viewProperties != null && c16882l.A04 && c16882l.A01 != null && c16882l.A01 != EnumC16842a.A04) {
                if (A0B() && A09(c16882l)) {
                    c2vA05 = viewProperties.A05();
                } else {
                    c2vA05 = null;
                }
                if (A0B()) {
                    viewProperties.A09();
                }
                c16882l.A03(this);
                if (c2vA05 != null) {
                    viewProperties.A0C(c2vA05);
                }
            }
        }
    }

    private final boolean A09(C16882l<?, ?> c16882l) {
        return this.A04.A06(c16882l) || this.A03.A06(c16882l);
    }

    public final long A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void A4W(C16882l<?, ?> c16882l, Rect rect, Rect rect2, boolean z) {
        C1h.A09(c16882l, A01(200, 13, 79));
        C1h.A09(rect, A01(88, 17, 85));
        C1h.A09(rect2, A01(78, 10, 10));
        A00(c16882l, rect, rect2);
        C16882l<?, ?> c16882l2 = c16882l.A05;
        if (c16882l2 != C16882l.A0C && c16882l2 != null) {
            boolean zA05 = this.A03.A05(c16882l2);
            C2S c2sA00 = this.A07.get(c16882l2.A02);
            if (zA05) {
                if (c2sA00 != null) {
                    c2sA00.A07().clear();
                    String[] strArr = A0E;
                    if (strArr[3].charAt(4) == strArr[7].charAt(4)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0E;
                    strArr2[3] = "ThdFmDLD2og3MtO6vZtdp594SLTHelFJ";
                    strArr2[7] = "kyKuH54tu6FztwQgD6qcMybB37t8iKu5";
                    if (!this.A08 || c16882l2.A04()) {
                        c2sA00.A0B(EnumC16842a.A05);
                    }
                } else {
                    c2sA00 = C2S.A09.A00(A0A());
                    c2sA00.A02().set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    this.A07.put(c16882l2.A02, c2sA00);
                }
                if (z) {
                    Rect rectA02 = c2sA00.A02();
                    int i = rect2.left;
                    int i2 = rect2.top;
                    int i3 = rect2.right;
                    int i4 = rect2.bottom;
                    String[] strArr3 = A0E;
                    if (strArr3[3].charAt(4) == strArr3[7].charAt(4)) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A0E;
                    strArr4[3] = "LAtwwYb2Cx3kiXSlxsLQlbz81NiNJWgq";
                    strArr4[7] = "V0gF9PVnhrlrGgQG7idfNHnYkxfb2DzZ";
                    rectA02.set(i, i2, i3, i4);
                }
            } else if (z && c2sA00 != null) {
                c2sA00.A02().set(Math.min(rect2.left, c2sA00.A02().left), Math.min(rect2.top, c2sA00.A02().top), Math.max(rect2.right, c2sA00.A02().right), Math.max(rect2.bottom, c2sA00.A02().bottom));
            }
            if (c2sA00 == null) {
                return;
            }
            c2sA00.A07().add(new Rect(rect));
            if (A0B()) {
                A03(c16882l2, c16882l, c2sA00, rect, rect2);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void A58(long j, List<Rect> list, Map<String, ? extends Set<String>> map) {
        C1h.A09(list, A01(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 13, 77));
        C1h.A09(map, A01(155, 35, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        this.A00 = j;
        this.A05.clear();
        this.A06.clear();
        if (A0B()) {
            Iterator<Map.Entry<String, ? extends Set<String>>> it = map.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                String[] strArr = A0E;
                if (strArr[3].charAt(4) == strArr[7].charAt(4)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[5] = "hW9Ud0kH0MYddiX1prwZ5JVxrdIYY7d5";
                strArr2[4] = "I05a0JEVfDMyg3gXXEVUvzj1iKGKY3Wx";
                if (!zHasNext) {
                    break;
                }
                Map.Entry<String, ? extends Set<String>> next = it.next();
                this.A06.put(next.getKey(), new HashSet(next.getValue()));
            }
        }
        if (AnonymousClass14.A0C) {
            if (!list.isEmpty()) {
                Iterator<Rect> it2 = list.iterator();
                while (it2.hasNext()) {
                    this.A05.add(new Rect(it2.next()));
                }
            }
            Collection<C16882l<?, ?>> collectionA03 = this.A04.A03();
            if (!collectionA03.isEmpty()) {
                Iterator<C16882l<?, ?>> it3 = collectionA03.iterator();
                while (true) {
                    boolean zHasNext2 = it3.hasNext();
                    String[] strArr3 = A0E;
                    if (strArr3[3].charAt(4) == strArr3[7].charAt(4)) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A0E;
                    strArr4[3] = "hXFlcaV9BODLzOEo9OETNHYcAQ59ToNe";
                    strArr4[7] = "XICJTt8wkIS85lWtdutLjy5IJqe83DnJ";
                    if (!zHasNext2) {
                        break;
                    }
                    this.A07.remove(it3.next().A02);
                }
            }
            Collection<C16882l<?, ?>> collectionA04 = this.A03.A03();
            if (!collectionA04.isEmpty()) {
                Iterator<C16882l<?, ?>> it4 = collectionA04.iterator();
                while (it4.hasNext()) {
                    this.A07.remove(it4.next().A02);
                }
            }
            if (!this.A07.isEmpty()) {
                Iterator<C2S> it5 = this.A07.values().iterator();
                while (it5.hasNext()) {
                    it5.next().A07().clear();
                }
            }
        } else {
            Iterator<Rect> it6 = list.iterator();
            while (it6.hasNext()) {
                this.A05.add(new Rect(it6.next()));
            }
            Iterator<C16882l<?, ?>> it7 = this.A04.A03().iterator();
            while (it7.hasNext()) {
                this.A07.remove(it7.next().A02);
            }
            for (C16882l<?, ?> c16882l : this.A03.A03()) {
                Map<String, C2S> map2 = this.A07;
                String str = c16882l.A02;
                String[] strArr5 = A0E;
                if (strArr5[1].length() == strArr5[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr6 = A0E;
                strArr6[3] = "Z9H7qhO0WKEzok23ZzBA8pKB3E4aUNIB";
                strArr6[7] = "l84XffDRBag9hyBmBmqNdi5J0zXdj8r8";
                map2.remove(str);
            }
            Iterator<C2S> it8 = this.A07.values().iterator();
            while (it8.hasNext()) {
                it8.next().A07().clear();
            }
        }
        this.A04.A04();
        this.A03.A04();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void A6y(List<? extends C16882l<?, ?>> list) {
        List<? extends C16882l<?, ?>> list2 = list;
        if (!(list2 == null || list2.isEmpty())) {
            A08(list);
        }
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            final String string = toString();
            final C16490d c16490d = this;
            final List<Rect> list3 = this.A05;
            final Collection<C16882l<?, ?>> collectionA02 = this.A04.A02();
            final Collection<C16882l<?, ?>> collectionA03 = this.A03.A02();
            new Object(string, c16490d, list3, collectionA02, collectionA03) { // from class: com.facebook.ads.redexgen.X.2P
                public static byte[] A05;
                public final C2Z A00;
                public final String A01;
                public final Collection<C16882l<?, ?>> A02;
                public final Collection<C16882l<?, ?>> A03;
                public final List<Rect> A04;

                static {
                    A01();
                }

                public static String A00(int i, int i2, int i3) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                    for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 120);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A05 = new byte[]{18, 12, 32, 56, 55, 28, 44, 59, 46, 46, 55, 18, 61, 46, 54, 60, 77, 62, 79, 66, 75, 81, 44, 75, 48, 64, 79, 66, 66, 75, 38, 81, 66, 74, 80, 17, 4, 2, 19, 18, 13, 8, -5, 10, 13, 2, 9, 14};
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    C1h.A09(string, A00(0, 3, 47));
                    C1h.A09(c16490d, A00(40, 8, 34));
                    C1h.A09(list3, A00(35, 5, 39));
                    C1h.A09(collectionA02, A00(3, 13, 81));
                    C1h.A09(collectionA03, A00(16, 19, 101));
                    this.A01 = string;
                    this.A00 = c16490d;
                    this.A02 = collectionA02;
                    this.A03 = collectionA03;
                    this.A04 = new ArrayList(list3);
                }
            };
            throw new NullPointerException(A01(105, 7, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    @Deprecated
    public final void A8o(C16882l<?, ?> c16882l, Rect rect) {
        C1h.A09(c16882l, A01(200, 13, 79));
        C1h.A09(rect, A01(148, 7, 72));
        if (!this.A07.containsKey(c16882l.A02)) {
            return;
        }
        rect.setEmpty();
        C2S c2s = this.A07.get(c16882l.A02);
        C1h.A06(c2s);
        Iterator<Rect> it = c2s.A07().iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    public final EnumC16842a AA7(C16882l<?, ?> c16882l) {
        C1h.A09(c16882l, A01(200, 13, 79));
        if (!this.A07.containsKey(c16882l.A02)) {
            EnumC16842a enumC16842a = EnumC16842a.A03;
            String[] strArr = A0E;
            if (strArr[0].charAt(8) != strArr[2].charAt(8)) {
                String[] strArr2 = A0E;
                strArr2[1] = Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET;
                strArr2[6] = "30nawOYzj1b3MgtvDNEQ2qq";
                return enumC16842a;
            }
        } else {
            C2S c2s = this.A07.get(c16882l.A02);
            C1h.A06(c2s);
            EnumC16842a enumC16842aA03 = c2s.A03();
            if (c16882l.A04) {
                if (c16882l.A00 == EnumC16892m.A04) {
                    EnumC16842a viewState = EnumC16842a.A04;
                    return viewState;
                }
                EnumC16842a viewState2 = EnumC16842a.A05;
                if (enumC16842aA03 == viewState2 && !c16882l.A04()) {
                    EnumC16842a viewState3 = EnumC16842a.A03;
                    return viewState3;
                }
            } else if (this.A0C && c16882l.A00 == EnumC16892m.A04) {
                EnumC16842a enumC16842a2 = EnumC16842a.A04;
                String[] strArr3 = A0E;
                if (strArr3[5].charAt(28) == strArr3[4].charAt(28)) {
                    String[] strArr4 = A0E;
                    strArr4[0] = "wX1d9i5r47CMqOssFBfxD0DZEST0WQ39";
                    strArr4[2] = "DaZ7QptbZSiyzTGS0lhH88JCrmqbW12u";
                    return enumC16842a2;
                }
            } else if (this.A0B) {
                EnumC16842a viewState4 = EnumC16842a.A05;
                if (enumC16842aA03 == viewState4 && !c16882l.A04()) {
                    EnumC16842a viewState5 = EnumC16842a.A03;
                    return viewState5;
                }
            }
            return enumC16842aA03;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    @Deprecated
    public final void AAA(Rect rect) {
        C1h.A09(rect, A01(148, 7, 72));
        rect.setEmpty();
        Iterator<Rect> it = this.A05.iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Z
    public final float AAB(C16882l<?, ?> c16882l) {
        C1h.A09(c16882l, A01(200, 13, 79));
        C2S c2s = this.A07.get(c16882l.A02);
        if (c2s == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        Rect rect = c2s.A02();
        if (rect.top == Integer.MIN_VALUE || rect.left == Integer.MIN_VALUE || rect.right == Integer.MIN_VALUE || rect.bottom == Integer.MIN_VALUE) {
            if (0 == 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            String str = A01(18, 60, 67) + c16882l.A02;
            throw new NullPointerException(A01(190, 10, 19));
        }
        int iHeight = rect.height() * rect.width();
        int totalVisibleArea = 0;
        for (Rect rect2 : c2s.A07()) {
            int totalPossibleArea = rect2.height();
            totalVisibleArea += totalPossibleArea * rect2.width();
        }
        return totalVisibleArea / iHeight;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void ALC(C2i c2i) {
        this.A01 = c2i;
    }
}

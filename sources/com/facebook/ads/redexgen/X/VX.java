package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@ElementTypesAreNonnullByDefault
public abstract class VX {
    public static byte[] A00;
    public static String[] A01 = {"68wwMGwwuUFZ7g", "YuqMrs0q8bp4a12qikFmL3Ppo7qMUl3U", "tgXT0NDQP1B5LdYDzd7ljLMJZIXRCBfq", "JYvrHCuVxf2igyaT3pTroE58b5otJbLk", "k4SPxrqQauFxqAecpvPyvyDf59kAhf", "SefJ0DPWhaxjxk", "uhVLOlB5oqEr7Urqve8EGpxWAEvJEWcG", "2koSenUzO6vra0m8ZZVJjXkgvntAKCJF"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> A03(SortedSet<E> unfiltered, InterfaceC2431Wt<? super E> predicate) {
        if (!(unfiltered instanceof C9S)) {
            return new C4Q((SortedSet) AbstractC2432Wu.A04(unfiltered), (InterfaceC2431Wt) AbstractC2432Wu.A04(predicate));
        }
        C9S c9s = (C9S) unfiltered;
        return new C4Q((SortedSet) c9s.A01, AbstractC2425Wn.A00(c9s.A00, predicate));
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 20);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <E> Set<E> A07(Set<E> unfiltered, InterfaceC2431Wt<? super E> predicate) {
        if (unfiltered instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) unfiltered;
            if (A01[6].charAt(19) != 'E') {
                throw new RuntimeException();
            }
            A01[3] = "0sbmWUWyQlmvjyhdy5fYSVjXpZvLd7HM";
            return A03(sortedSet, predicate);
        }
        if (!(unfiltered instanceof C9S)) {
            return new C9S((Set) AbstractC2432Wu.A04(unfiltered), (InterfaceC2431Wt) AbstractC2432Wu.A04(predicate));
        }
        C9S c9s = (C9S) unfiltered;
        return new C9S((Set) c9s.A01, AbstractC2425Wn.A00(c9s.A00, predicate));
    }

    public static void A08() {
        A00 = new byte[]{-63, -56, -63, -55, -63, -54, -48, -81, -63, -48, -77, -91, -76, 113, -106, -120, -105, 85};
    }

    static {
        A08();
    }

    public static int A00(Set<?> s) {
        int i = 0;
        Iterator<?> it = s.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A01;
            String str = strArr[7];
            String str2 = strArr[2];
            int iCharAt = str.charAt(27);
            int hashCode = str2.charAt(27);
            if (iCharAt == hashCode) {
                throw new RuntimeException();
            }
            A01[4] = "p1ZlUJQp6TLQJ3IHiykje0duJvjLZP";
            if (zHasNext) {
                Object next = it.next();
                int hashCode2 = next != null ? next.hashCode() : 0;
                i = ~(~(i + hashCode2));
            } else {
                return i;
            }
        }
    }

    public static <E> VY<E> A01(final Set<? extends E> set1, final Set<? extends E> set2) {
        AbstractC2432Wu.A05(set1, A04(10, 4, 44));
        AbstractC2432Wu.A05(set2, A04(14, 4, 15));
        return new C9U(set1, set2);
    }

    public static <E> VY<E> A02(final Set<E> set1, final Set<?> set2) {
        AbstractC2432Wu.A05(set1, A04(10, 4, 44));
        AbstractC2432Wu.A05(set2, A04(14, 4, 15));
        return new C9T(set1, set2);
    }

    public static <E> HashSet<E> A05() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> A06(int expectedSize) {
        return new HashSet<>(AbstractC2397Vj.A00(expectedSize));
    }

    public static boolean A09(@CheckForNull Set<?> s, Object object) {
        if (s == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> s2 = (Set) object;
        try {
            return s.size() == s2.size() && s.containsAll(s2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean A0A(Set<?> set, Collection<?> collection) {
        AbstractC2432Wu.A04(collection);
        if (0 != 0) {
            throw new NullPointerException(A04(0, 10, 72));
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return AbstractC2401Vn.A0E(set.iterator(), collection);
        }
        return A0B(set, collection.iterator());
    }

    public static boolean A0B(Set<?> set, Iterator<?> iterator) {
        boolean z = false;
        while (changed) {
            boolean changed = set.remove(iterator.next());
            z |= changed;
        }
        return z;
    }
}

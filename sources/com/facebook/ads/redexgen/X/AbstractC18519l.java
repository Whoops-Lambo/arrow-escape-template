package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC18519l<E> extends AbstractC2407Vt<E> implements List<E>, RandomAccess {
    public static byte[] A00 = null;
    public static String[] A01 = {"fA1fnNssArdKpNGuPvEGSzi7pOUZHm7v", "qns5CkO3MVDTshXVoTiVucy5w98kVhX8", "FBilluItLEFIj11sI", "xhOoaGlUfdtuNUXUR7COCy2p48irks40", "B9QowLQGlwGuP7x5xkpjNnYcMu4XR0jN", "IeItZmW1RXx", "W7RLvvUGiTAKxasjeCPHrioAHehOTeSb", "bhxfXmBriQ73PypRFft5YTIqbznKEvYb"};
    public static final C9R<Object> A02;
    public static final long serialVersionUID = -889275714;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <E> AbstractC18519l<E> A05(Collection<? extends E> elements) {
        if (!(elements instanceof AbstractC2407Vt)) {
            return A08(elements.toArray());
        }
        AbstractC18519l<E> abstractC18519lA0J = ((AbstractC2407Vt) elements).A0J();
        return abstractC18519lA0J.A0K() ? A06(abstractC18519lA0J.toArray()) : abstractC18519lA0J;
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
            String[] strArr = A01;
            if (strArr[1].charAt(21) == strArr[0].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "dhQRA9x0T6ID6JuO896L24zk9QRH59k7";
            strArr2[7] = "7htLPED1qaLsB4bVZYo3T5RxRWmBeLII";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-74, -44, -58, -127, -76, -58, -45, -54, -62, -51, -54, -37, -58, -59, -89, -48, -45, -50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    static {
        A0B();
        A02 = new C17033a(C4Y.A02, 0);
    }

    public static <E> C17314e<E> A01() {
        return new C17314e<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    private final AbstractC18519l<E> A02(final int fromIndex, int toIndex) {
        final int i = toIndex - fromIndex;
        return new AbstractC18519l<E>(fromIndex, i) { // from class: com.facebook.ads.redexgen.X.4d
            public final transient int A00;
            public final transient int A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            {
                this.A01 = fromIndex;
                this.A00 = i;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC2407Vt
            public final int A0G() {
                return this.A02.A0H() + this.A01 + this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC2407Vt
            public final int A0H() {
                return this.A02.A0H() + this.A01;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC2407Vt
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC2407Vt
            @CheckForNull
            public final Object[] A0L() {
                return this.A02.A0L();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC18519l, java.util.List
            /* JADX INFO: renamed from: A0M */
            public final AbstractC18519l<E> subList(int fromIndex2, int toIndex2) {
                AbstractC2432Wu.A0B(fromIndex2, toIndex2, this.A00);
                return this.A02.subList(this.A01 + fromIndex2, this.A01 + toIndex2);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // java.util.List
            public final E get(int index) {
                AbstractC2432Wu.A00(index, this.A00);
                return this.A02.get(this.A01 + index);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC18519l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC18519l, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator() {
                return listIterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC18519l, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
                return super.listIterator(index);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.A00;
            }
        };
    }

    public static <E> AbstractC18519l<E> A03() {
        return (AbstractC18519l<E>) C4Y.A02;
    }

    public static <E> AbstractC18519l<E> A04(E e1) {
        return A08(e1);
    }

    public static <E> AbstractC18519l<E> A06(Object[] elements) {
        return A09(elements, elements.length);
    }

    public static <E> AbstractC18519l<E> A07(E[] elements) {
        if (elements.length == 0) {
            return A03();
        }
        return A08((Object[]) elements.clone());
    }

    public static <E> AbstractC18519l<E> A08(Object... elements) {
        return A06(AbstractC2392Vd.A03(elements));
    }

    public static <E> AbstractC18519l<E> A09(Object[] elements, int length) {
        if (length == 0) {
            return A03();
        }
        return new C4Y(elements, length);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2407Vt
    public int A0I(Object[] dst, int offset) {
        int size = size();
        for (int i = 0; i < size; i++) {
            int i2 = offset + i;
            dst[i2] = get(i);
        }
        return offset + size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2407Vt
    @Deprecated
    public final AbstractC18519l<E> A0J() {
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC18519l<E> subList(int fromIndex, int toIndex) {
        AbstractC2432Wu.A0B(fromIndex, toIndex, size());
        int i = toIndex - fromIndex;
        int length = size();
        if (i == length) {
            return this;
        }
        if (i == 0) {
            return A03();
        }
        return A02(fromIndex, toIndex);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final VV<E> iterator() {
        return listIterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final C9R<E> listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* JADX INFO: renamed from: A0P, reason: merged with bridge method [inline-methods] */
    public C9R<E> listIterator(int i) {
        AbstractC2432Wu.A01(i, size());
        if (isEmpty()) {
            return (C9R<E>) A02;
        }
        return new C17033a(this, i);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int index, Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2407Vt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object object) {
        return indexOf(object) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        return AbstractC2400Vm.A06(this, obj);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    public int indexOf(@CheckForNull Object object) {
        if (object == null) {
            return -1;
        }
        return AbstractC2400Vm.A00(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object object) {
        if (object == null) {
            return -1;
        }
        return AbstractC2400Vm.A01(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A0A(0, 18, 13));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final E remove(int index) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final E set(int index, E element) {
        throw new UnsupportedOperationException();
    }
}

package com.ironsource;

import defpackage.du;
import defpackage.gg0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface H5<T> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a<T> implements H5<T> {

        @NotNull
        private final ArrayList<T> a;

        @NotNull
        private final ArrayList<T> b;

        @Override // com.ironsource.H5
        public boolean contains(T t) {
            return this.a.contains(t) || this.b.contains(t);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.b.size() + this.a.size();
        }

        @Override // com.ironsource.H5
        @NotNull
        public List<T> value() {
            return du.o0(this.b, this.a);
        }

        public a(@NotNull ArrayList<T> arrayList, @NotNull ArrayList<T> arrayList2) {
            arrayList.getClass();
            arrayList2.getClass();
            this.a = arrayList;
            this.b = arrayList2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b<T> implements H5<T> {

        @NotNull
        private final H5<T> a;

        @NotNull
        private final Comparator<T> b;

        @Override // com.ironsource.H5
        public boolean contains(T t) {
            return this.a.contains(t);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.a.size();
        }

        @Override // com.ironsource.H5
        @NotNull
        public List<T> value() {
            return du.s0(this.a.value(), this.b);
        }

        public b(@NotNull H5<T> h5, @NotNull Comparator<T> comparator) {
            h5.getClass();
            comparator.getClass();
            this.a = h5;
            this.b = comparator;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c<T> implements H5<T> {
        private final int a;

        @NotNull
        private final List<T> b;

        @NotNull
        public final List<T> a() {
            int size = this.b.size();
            int i = this.a;
            if (size <= i) {
                return gg0.a;
            }
            List<T> list = this.b;
            return list.subList(i, list.size());
        }

        @NotNull
        public final List<T> b() {
            List<T> list = this.b;
            int size = list.size();
            int i = this.a;
            if (size > i) {
                size = i;
            }
            return list.subList(0, size);
        }

        @Override // com.ironsource.H5
        public boolean contains(T t) {
            return this.b.contains(t);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.b.size();
        }

        @Override // com.ironsource.H5
        @NotNull
        public List<T> value() {
            return this.b;
        }

        public c(@NotNull H5<T> h5, int i) {
            h5.getClass();
            this.a = i;
            this.b = h5.value();
        }
    }

    boolean contains(T t);

    int size();

    @NotNull
    List<T> value();
}

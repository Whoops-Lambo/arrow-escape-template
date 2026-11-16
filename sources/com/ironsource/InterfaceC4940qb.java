package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.qb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4940qb<T> {

    /* JADX INFO: renamed from: com.ironsource.qb$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a<T> implements InterfaceC4940qb<T> {

        @NotNull
        private final IronSourceError a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s71.b(this.a, ((a) obj).a);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i, Object obj) {
            if ((i & 1) != 0) {
                ironSourceError = aVar.a;
            }
            return aVar.a(ironSourceError);
        }

        @NotNull
        public final IronSourceError b() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.a + ")";
        }

        public a(@NotNull IronSourceError ironSourceError) {
            ironSourceError.getClass();
            this.a = ironSourceError;
        }

        @NotNull
        public final a<T> a(@NotNull IronSourceError ironSourceError) {
            ironSourceError.getClass();
            return new a<>(ironSourceError);
        }

        @NotNull
        public final IronSourceError a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.qb$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b<T> implements InterfaceC4940qb<T> {
        private final T a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s71.b(this.a, ((b) obj).a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = bVar.a;
            }
            return bVar.a(obj);
        }

        public final T b() {
            return this.a;
        }

        public int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.a + ")";
        }

        public b(T t) {
            this.a = t;
        }

        @NotNull
        public final b<T> a(T t) {
            return new b<>(t);
        }

        public final T a() {
            return this.a;
        }
    }
}

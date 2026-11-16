package com.ironsource;

import defpackage.f22;
import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.f7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4739f7 {

    /* JADX INFO: renamed from: com.ironsource.f7$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements f22 {
        private WeakReference<T> a;

        public a(T t) {
            this.a = new WeakReference<>(t);
        }

        public final void a(WeakReference<T> weakReference) {
            weakReference.getClass();
            this.a = weakReference;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // defpackage.e22
        public T getValue(Object obj, KProperty<?> kProperty) {
            obj.getClass();
            kProperty.getClass();
            return this.a.get();
        }

        @Override // defpackage.f22
        public void setValue(Object obj, KProperty<?> kProperty, T t) {
            obj.getClass();
            kProperty.getClass();
            this.a = new WeakReference<>(t);
        }

        public final WeakReference<T> a() {
            return this.a;
        }
    }

    public static /* synthetic */ f22 a(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    @NotNull
    public static final <T> f22 a(@Nullable T t) {
        return new a(t);
    }
}

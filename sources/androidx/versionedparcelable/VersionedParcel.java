package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.pv1;
import defpackage.vq2;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RestrictTo
public abstract class VersionedParcel {
    public final ArrayMap a;
    public final ArrayMap b;
    public final ArrayMap c;

    public abstract void a();

    public abstract VersionedParcel b();

    public abstract boolean g();

    public abstract byte[] h();

    public abstract CharSequence i();

    public abstract boolean j(int i);

    public abstract int k();

    public abstract Parcelable m();

    public abstract String n();

    public abstract void p(int i);

    public void q(boolean z, boolean z2) {
    }

    public abstract void r(boolean z);

    public abstract void s(byte[] bArr);

    public abstract void t(CharSequence charSequence);

    public abstract void u(int i);

    public abstract void w(Parcelable parcelable);

    public abstract void x(String str);

    public final void y(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            x(null);
            return;
        }
        try {
            x(c(versionedParcelable.getClass()).getName());
            VersionedParcel versionedParcelB = b();
            try {
                e(versionedParcelable.getClass()).invoke(null, versionedParcelable, versionedParcelB);
                versionedParcelB.a();
            } catch (ClassNotFoundException e) {
                vq2.n("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                vq2.n("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                vq2.n("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                vq2.n("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            vq2.n(versionedParcelable.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    /* JADX INFO: renamed from: androidx.versionedparcelable.VersionedParcel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes5.dex */
    class AnonymousClass1 extends ObjectInputStream {
        @Override // java.io.ObjectInputStream
        public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    public final Method d(String str) throws NoSuchMethodException {
        ArrayMap arrayMap = this.a;
        Method method = (Method) arrayMap.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        arrayMap.put(str, declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return this instanceof VersionedParcelStream;
    }

    public VersionedParcel(ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        this.a = arrayMap;
        this.b = arrayMap2;
        this.c = arrayMap3;
    }

    public final Class c(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        ArrayMap arrayMap = this.c;
        Class cls2 = (Class) arrayMap.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(pv1.w(cls.getPackage().getName(), UserDetailsUtils.UserDetailsLiterals.DOT, cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
            arrayMap.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        ArrayMap arrayMap = this.b;
        Method method = (Method) arrayMap.get(name);
        if (method == null) {
            Class clsC = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = clsC.getDeclaredMethod("write", cls, VersionedParcel.class);
            arrayMap.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final int l(int i, int i2) {
        if (!j(i2)) {
            return i;
        }
        return k();
    }

    public final VersionedParcelable o() {
        String strN = n();
        if (strN == null) {
            return null;
        }
        try {
            return (VersionedParcelable) d(strN).invoke(null, b());
        } catch (ClassNotFoundException e) {
            vq2.n("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            vq2.n("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            vq2.n("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                vq2.n("VersionedParcel encountered InvocationTargetException", e4);
                return null;
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public final void v(int i, int i2) {
        p(i2);
        u(i);
    }
}

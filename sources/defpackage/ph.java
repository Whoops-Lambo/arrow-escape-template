package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ph implements dy, ez, Serializable {

    @Nullable
    private final dy completion;

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // defpackage.ez
    @Nullable
    public ez getCallerFrame() {
        dy dyVar = this.completion;
        if (dyVar instanceof ez) {
            return (ez) dyVar;
        }
        return null;
    }

    @Nullable
    public final dy getCompletion() {
        return this.completion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.dy
    public final void resumeWith(@NotNull Object obj) {
        ?? r2 = this;
        while (true) {
            ph phVar = (ph) r2;
            dy dyVar = phVar.completion;
            dyVar.getClass();
            try {
                obj = phVar.invokeSuspend(obj);
                if (obj == dz.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new j52(th);
            }
            phVar.releaseIntercepted();
            if (!(dyVar instanceof ph)) {
                dyVar.resumeWith(obj);
                return;
            }
            r2 = dyVar;
        }
    }

    @NotNull
    public String toString() throws IllegalAccessException, InvocationTargetException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public ph(dy dyVar) {
        this.completion = dyVar;
    }

    @NotNull
    public dy create(@NotNull dy dyVar) {
        dyVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public StackTraceElement getStackTraceElement() throws IllegalAccessException, InvocationTargetException {
        int i;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Object objInvoke3;
        Integer num;
        int iIntValue;
        t50 t50Var = (t50) getClass().getAnnotation(t50.class);
        String str = null;
        if (t50Var == null || t50Var.v() < 1) {
            return null;
        }
        int i2 = -1;
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            i = iIntValue - 1;
        } catch (Exception unused) {
            i = -1;
        }
        if (i >= 0) {
            i2 = t50Var.l()[i];
        }
        ls lsVar = vk3.a;
        ls lsVar2 = vk3.b;
        if (lsVar2 == null) {
            try {
                ls lsVar3 = new ls(18, Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                vk3.b = lsVar3;
                lsVar2 = lsVar3;
            } catch (Exception unused2) {
                vk3.b = lsVar;
                lsVar2 = lsVar;
            }
        }
        if (lsVar2 != lsVar && (method = (Method) lsVar2.b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) lsVar2.c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) lsVar2.d;
            if (method3 != null) {
                objInvoke3 = method3.invoke(objInvoke2, null);
            } else {
                objInvoke3 = null;
            }
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = t50Var.c();
        } else {
            strC = str + '/' + t50Var.c();
        }
        return new StackTraceElement(strC, t50Var.m(), t50Var.f(), i2);
    }

    @NotNull
    public dy create(@Nullable Object obj, @NotNull dy dyVar) {
        dyVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}

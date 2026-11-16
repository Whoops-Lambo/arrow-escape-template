package defpackage;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;
import com.singular.sdk.internal.UserDetailsUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xv implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new b81("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new b81(pv1.n("Could not instantiate ", str, UserDetailsUtils.UserDetailsLiterals.DOT), e);
                } catch (InstantiationException e2) {
                    throw new b81(pv1.n("Could not instantiate ", str, UserDetailsUtils.UserDetailsLiterals.DOT), e2);
                } catch (NoSuchMethodException e3) {
                    throw new b81(n30.y("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new b81(n30.y("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return FirebaseInstallations.lambda$new$0((FirebaseApp) obj);
        }
    }
}

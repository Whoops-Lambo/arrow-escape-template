package defpackage;

import com.ironsource.C4664b4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zf1 {
    public static volatile int a;
    public static final up1 b = new up1(1);
    public static final up1 c = new up1(0);
    public static volatile up1 d;
    public static final String[] e;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            property.equalsIgnoreCase("true");
        }
        e = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = zf1.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        up1 up1Var = null;
        if (property != null && !property.isEmpty()) {
            try {
                uu.I("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                up1Var = (up1) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                uu.J("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e2);
            } catch (ClassNotFoundException e3) {
                e = e3;
                uu.J("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e4) {
                e = e4;
                uu.J("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e5) {
                e = e5;
                uu.J("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e6) {
                e = e6;
                uu.J("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e7) {
                e = e7;
                uu.J("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (up1Var != null) {
            arrayList.add(up1Var);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(up1.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: yf1
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(up1.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((up1) it.next());
            } catch (ServiceConfigurationError e8) {
                uu.I("A SLF4J service provider failed to instantiate:\n" + e8.getMessage());
            }
        }
        return arrayList;
    }

    public static xf1 b(String str) {
        up1 up1Var;
        p11 p11Var;
        if (a == 0) {
            synchronized (zf1.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = a;
        if (i == 1) {
            up1Var = b;
        } else {
            if (i == 2) {
                e32.i("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (i == 3) {
                up1Var = d;
            } else {
                if (i != 4) {
                    e32.i("Unreachable code");
                    return null;
                }
                up1Var = c;
            }
        }
        switch (up1Var.a) {
            case 0:
                p11Var = (k92) up1Var.b;
                break;
            default:
                p11Var = (el2) up1Var.b;
                break;
        }
        return p11Var.c(str);
    }

    public static void d() {
        up1 up1Var = b;
        synchronized (up1Var) {
            try {
                ((el2) up1Var.b).a = true;
                el2 el2Var = (el2) up1Var.b;
                el2Var.getClass();
                ArrayList arrayList = new ArrayList(el2Var.b.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    dl2 dl2Var = (dl2) obj;
                    dl2Var.b = b(dl2Var.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((el2) b.b).c;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(128);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, 128) != 0) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                fl2 fl2Var = (fl2) obj2;
                if (fl2Var != null) {
                    dl2 dl2Var2 = fl2Var.b;
                    String str = dl2Var2.a;
                    if (dl2Var2.b == null) {
                        e32.i("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(dl2Var2.b instanceof tp1)) {
                        if (!dl2Var2.b()) {
                            uu.I(str);
                        } else if (dl2Var2.i(fl2Var.a) && dl2Var2.b()) {
                            try {
                                dl2Var2.d.invoke(dl2Var2.b, fl2Var);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i4 = i2 + 1;
                if (i2 == 0) {
                    if (fl2Var.b.b()) {
                        uu.I("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        uu.I("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        uu.I("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(fl2Var.b.b instanceof tp1)) {
                        uu.I("The following set of substitute loggers may have been accessed");
                        uu.I("during the initialization phase. Logging calls during this");
                        uu.I("phase were not honored. However, subsequent logging calls to these");
                        uu.I("loggers will work as normally expected.");
                        uu.I("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i4;
            }
            arrayList2.clear();
        }
        el2 el2Var2 = (el2) b.b;
        el2Var2.b.clear();
        el2Var2.c.clear();
    }

    public static final void c() {
        Enumeration<URL> resources;
        try {
            ArrayList arrayListA = a();
            f(arrayListA);
            if (!arrayListA.isEmpty()) {
                d = (up1) arrayListA.get(0);
                d.getClass();
                a = 3;
                if (!arrayListA.isEmpty() && arrayListA.size() > 1) {
                    uu.I("Actual provider is of type [" + arrayListA.get(0) + C4664b4.j.e);
                }
            } else {
                a = 4;
                uu.I("No SLF4J providers were found.");
                uu.I("Defaulting to no-operation (NOP) logger implementation");
                uu.I("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = zf1.class.getClassLoader();
                    if (classLoader == null) {
                        resources = ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
                    } else {
                        resources = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    }
                    while (resources.hasMoreElements()) {
                        linkedHashSet.add(resources.nextElement());
                    }
                } catch (IOException e2) {
                    uu.J("Error getting resources from path", e2);
                }
                e(linkedHashSet);
            }
            d();
            if (a == 3) {
                try {
                    switch (d.a) {
                        case 0:
                            boolean z = false;
                            for (String str : e) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (!z) {
                                uu.I("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(e).toString());
                                uu.I("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                                return;
                            }
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (NoSuchFieldError unused) {
                } catch (Throwable th) {
                    uu.J("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e3) {
            a = 2;
            uu.J("Failed to instantiate SLF4J LoggerFactory", e3);
            dr0.l("Unexpected initialization failure", e3);
        }
    }

    public static void e(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        uu.I("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            uu.I("Ignoring binding found at [" + ((URL) it.next()) + C4664b4.j.e);
        }
        uu.I("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void f(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            uu.I("Class path contains multiple SLF4J providers.");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                uu.I("Found provider [" + ((up1) obj) + C4664b4.j.e);
            }
            uu.I("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}

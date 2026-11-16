package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.WrappedDrawable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public class DrawableUtils {
    public static final int[] a = {R.attr.state_checked};
    public static final int[] b = new int[0];
    public static final Rect c = new Rect();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Api18Impl {
        public static final boolean a;
        public static final Method b;
        public static final Field c;
        public static final Field d;
        public static final Field e;
        public static final Field f;

        /* JADX WARN: Code duplicated, block: B:25:0x004a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            b = method;
                            c = field;
                            d = field2;
                            e = field3;
                            f = field4;
                            a = true;
                            return;
                        }
                        b = null;
                        c = null;
                        d = null;
                        e = null;
                        f = null;
                        a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            b = method;
                            c = field;
                            d = field2;
                            e = field3;
                            f = field4;
                            a = true;
                            return;
                        }
                        b = null;
                        c = null;
                        d = null;
                        e = null;
                        f = null;
                        a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            b = method;
                            c = field;
                            d = field2;
                            e = field3;
                            f = field4;
                            a = true;
                            return;
                        }
                        b = null;
                        c = null;
                        d = null;
                        e = null;
                        f = null;
                        a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        a = true;
                        return;
                    }
                    b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        a = true;
                        return;
                    }
                    b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        a = true;
                        return;
                    }
                    b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z) {
                b = method;
                c = field;
                d = field2;
                e = field3;
                f = field4;
                a = true;
                return;
            }
            b = null;
            c = null;
            d = null;
            e = null;
            f = null;
            a = false;
        }
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        Object objB;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsA = Api29Impl.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        if (drawable instanceof WrappedDrawable) {
            objB = drawable;
            objB = ((WrappedDrawable) drawable).b();
        }
        if (i >= 29) {
            boolean z = Api18Impl.a;
        } else if (Api18Impl.a) {
            try {
                Object objInvoke = Api18Impl.b.invoke(objB, null);
                if (objInvoke != null) {
                    return new Rect(Api18Impl.c.getInt(objInvoke), Api18Impl.d.getInt(objInvoke), Api18Impl.e.getInt(objInvoke), Api18Impl.f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return c;
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(b);
            } else {
                drawable.setState(a);
            }
            drawable.setState(state);
        }
    }
}

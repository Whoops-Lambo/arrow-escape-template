package androidx.compose.ui.graphics;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/CanvasUtils;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CanvasUtils {
    public static Method a;
    public static Method b;
    public static boolean c;

    public static void a(android.graphics.Canvas canvas, boolean z) {
        Method method;
        canvas.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            CanvasZHelper.a.a(canvas, z);
            return;
        }
        if (!c) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    a = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new Class[0]);
                    b = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    a = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    b = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            c = true;
        }
        if (z) {
            try {
                Method method4 = a;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = b) != null) {
            method.invoke(canvas, null);
        }
    }
}
